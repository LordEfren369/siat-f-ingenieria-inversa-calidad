package OAD;

import Configuracion.ConexionMYSQL;
import Modelos.Pedido;
import Modelos.PedidoDetalle;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OAD_Pedido {

    //Obtener el ultimo folio y poder mostrar el siguiente en el text field correspondiente
    public int obtenerSiguienteFolio() {
        int siguiente = 1;
        String sql = "SELECT IFNULL(MAX(folio),0)+1 AS nextFolio FROM pedido";
        try (Connection con = new ConexionMYSQL().getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                siguiente = rs.getInt("nextFolio");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return siguiente;
    }

    public boolean agregarPedido(Pedido pedido, List<PedidoDetalle> detalles) {
        String sqlPedido = "INSERT INTO pedido (fecha, idCliente, total) VALUES (?, ?, ?)"; //los datos del pedido unicamente es la fecha, el id del cliente y el total
        String sqlDetalle = "INSERT INTO pedido_detalle (folio, idProducto, cantidad, precioUnitario, subtotal) VALUES (?, ?, ?, ?, ?)"; //datos del detalle del pedido
        String sqlStock = "UPDATE producto SET existencias = existencias - ? WHERE idProducto = ? AND existencias >= ?"; //cada que hacemos una venta, modificamos las existencias del producto vendido (descontamos la cantidad vendida)

        try (Connection conn = new ConexionMYSQL().getConexion()) {
            conn.setAutoCommit(false);

            int folioGenerado;

            try (PreparedStatement ps = conn.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS)) {

                java.sql.Date hoy = new java.sql.Date(System.currentTimeMillis()); //Fecha 
                ps.setDate(1, hoy); //se coloca la del dia de hoy 
                ps.setInt(2, pedido.getIdCliente());
                ps.setDouble(3, pedido.getTotal());
                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();
                if (!rs.next()) {
                    throw new SQLException("No se generó folio del pedido");
                }
                folioGenerado = rs.getInt(1);
            }

            //Insertamos los detalles del pedido y actualizamos el stock de los productos
            try (PreparedStatement psDet = conn.prepareStatement(sqlDetalle); PreparedStatement psStock = conn.prepareStatement(sqlStock)) {

                for (PedidoDetalle det : detalles) {

                    // Validar la existencia del producto
                    if (det.getCantidad() > det.getExistencia()) {
                        throw new SQLException("Stock insuficiente para: " + det.getProductoNombre());
                    }

                    double subtotal = det.getPrecioUnitario() * det.getCantidad();

                    // Insertamos detalle
                    psDet.setInt(1, folioGenerado);
                    psDet.setInt(2, det.getIdProducto());
                    psDet.setInt(3, det.getCantidad());
                    psDet.setDouble(4, det.getPrecioUnitario());
                    psDet.setDouble(5, subtotal);
                    psDet.executeUpdate();

                    // Actualizamos el stock
                    psStock.setInt(1, det.getCantidad());
                    psStock.setInt(2, det.getIdProducto());
                    psStock.setInt(3, det.getCantidad());
                    if (psStock.executeUpdate() == 0) {
                        throw new SQLException("No hay stock suficiente (producto ID " + det.getIdProducto() + ")");
                    }
                }
            }

            conn.commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //OAD para obtener todos los pedidos
    public List<Object[]> obtenerPedidos() {
        List<Object[]> lista = new ArrayList<>();

        //Se usa JOIN porque los datos de los pedidos vienen de varias tablas (tabla de pedido, detalle del pedido, cliente)
        String sql = "SELECT p.folio, p.fecha, c.nombre_cliente AS nombreCliente, "
                + "c.nombre_negocio AS nombreNegocio, "
                + "(SELECT SUM(pd.cantidad) FROM pedido_detalle pd WHERE pd.folio = p.folio) AS cantidadProductos, "
                + "p.total "
                + "FROM pedido p "
                + "INNER JOIN cliente c ON p.idCliente = c.idCliente "
                + "ORDER BY p.folio DESC"; // Pedidos más recientes arriba

        try (Connection conn = new ConexionMYSQL().getConexion(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("folio");
                fila[1] = rs.getDate("fecha");
                fila[2] = rs.getString("nombreCliente");
                fila[3] = rs.getString("nombreNegocio");
                fila[4] = rs.getInt("cantidadProductos");
                fila[5] = rs.getDouble("total");
                lista.add(fila);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    //OAD para obtener los pedidos del mes actual para el reporte PDF
    public List<Pedido> obtenerPedidosMesActual() {
        List<Pedido> lista = new ArrayList<>();

        String sql = "SELECT p.folio, p.fecha, c.nombre_cliente AS clienteNombre, p.total "
                + "FROM pedido p "
                + "INNER JOIN cliente c ON p.idCliente = c.idCliente "
                + "WHERE MONTH(p.fecha) = MONTH(CURDATE()) "
                + "AND YEAR(p.fecha) = YEAR(CURDATE()) "
                + "ORDER BY p.fecha DESC";

        try {
            Connection con = new ConexionMYSQL().getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido p = new Pedido(
                        rs.getInt("folio"),
                        rs.getString("fecha"),
                        rs.getString("clienteNombre"),
                        rs.getDouble("total")
                );
                lista.add(p);
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error al obtener pedidos del mes actual: " + e);
        }

        return lista;
    }
}
