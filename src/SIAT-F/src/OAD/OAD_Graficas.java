package OAD;

import Configuracion.ConexionMYSQL;
import Modelos.VentaCategoria;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class OAD_Graficas {

    //Para crear la gráfica de barras
    public List<VentaCategoria> obtenerVentasPorCategoriaMesActual() {
        List<VentaCategoria> lista = new ArrayList<>();

        //Se ocupa JOIN porque los datos necesarios no estan en una sola tabla; por ejemplo aqui ocupas datos de la tabla de producto, categoria y pedido detalle.
        //pd-> pedido detalle     pe->pedido    p->producto    c->categoria
        String sql = "SELECT c.nombre AS categoria, SUM(pd.subtotal) AS total_categoria "
                + "FROM pedido_detalle pd "
                + "JOIN pedido pe ON pd.folio = pe.folio "
                + "JOIN producto p ON pd.idProducto = p.idProducto "
                + "JOIN categoria c ON p.categoria_id = c.id "
                + "WHERE MONTH(pe.fecha) = MONTH(CURDATE()) "
                + "AND YEAR(pe.fecha) = YEAR(CURDATE()) "
                + "GROUP BY c.nombre";

        try (Connection con = new ConexionMYSQL().getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new VentaCategoria(
                        rs.getString("categoria"),
                        rs.getDouble("total_categoria")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    //Para la grafica circular de los productos más vendidos del Mes
    //pd-> pedido detalle     pe->pedido    p->producto   
    public List<VentaCategoria> obtenerTop10ProductosMesActual() {
        List<VentaCategoria> lista = new ArrayList<>();

        String sql = "SELECT p.nombre AS nombre, SUM(pd.cantidad) AS total_vendido "
                + "FROM pedido_detalle pd "
                + "JOIN pedido pe ON pd.folio = pe.folio "
                + "JOIN producto p ON pd.idProducto = p.idProducto "
                + "WHERE MONTH(pe.fecha) = MONTH(CURDATE()) "
                + "AND YEAR(pe.fecha) = YEAR(CURDATE()) "
                + "GROUP BY p.nombre "
                + "ORDER BY total_vendido DESC "
                + "LIMIT 10";

        try (Connection con = new ConexionMYSQL().getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new VentaCategoria(
                        rs.getString("nombre"),
                        rs.getDouble("total_vendido")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    //Para la grafica circular de las zonas con más ventas en el mes actual 
    // pe->pedido    c->cliente
    public List<VentaCategoria> obtenerTop10ZonasMesActual() {
        List<VentaCategoria> lista = new ArrayList<>();

        String sql = "SELECT c.ciudad, SUM(pe.total) AS total_zona "
                + "FROM pedido pe "
                + "JOIN cliente c ON pe.idCliente = c.idCliente "
                + "WHERE MONTH(pe.fecha) = MONTH(CURDATE()) "
                + "AND YEAR(pe.fecha) = YEAR(CURDATE()) "
                + "GROUP BY c.ciudad "
                + "ORDER BY total_zona DESC "
                + "LIMIT 10";

        try (Connection con = new ConexionMYSQL().getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new VentaCategoria(
                        rs.getString("ciudad"),
                        rs.getDouble("total_zona")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
