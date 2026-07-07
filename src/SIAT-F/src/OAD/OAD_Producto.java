package OAD;

import Configuracion.ConexionMYSQL;
import Modelos.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class OAD_Producto {

    //OAD para agregar un nuevo producto
    public boolean agregarProducto(Producto p) {
        boolean respuesta = false;
        String sql = "INSERT INTO producto (codigo, nombre, categoria_id, precio_costo, precio_venta, existencias) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection con = new ConexionMYSQL().getConexion();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getCategoria_id());
            ps.setDouble(4, p.getPrecioCosto());
            ps.setDouble(5, p.getPrecioVenta());
            ps.setInt(6, p.getExistencias());

            ps.executeUpdate();
            ps.close();
            con.close();
            respuesta = true;
        } catch (Exception ex) {
            System.out.println("Error al agregar producto: " + ex);
        }
        return respuesta;
    }

    //OAD para obtener el siguiente ID y que se muestren en el campo correspondiente
    public int obtenerSiguienteID() {
        int siguiente = 1;

        try {
            Connection con = new ConexionMYSQL().getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "SELECT IFNULL(MAX(idProducto), 0) + 1 AS nextId FROM producto"
            );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                siguiente = rs.getInt("nextId");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return siguiente;
    }

    //OAD para buscar productos en especifico segun su codigo o nombre 
    public List<Producto> buscarProductos(String texto) {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT p.idProducto, p.codigo, p.nombre, p.categoria_id, "
                + "c.nombre AS categoriaNombre, p.precio_costo, p.precio_venta, p.existencias "
                + "FROM producto p "
                + "INNER JOIN categoria c ON p.categoria_id = c.id "
                + "WHERE p.codigo LIKE ? OR p.nombre LIKE ? OR c.nombre LIKE ?";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            String like = "%" + texto + "%";
            ps.setString(1, like);
            ps.setString(2, like);
            ps.setString(3, like);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("codigo"),
                        rs.getString("nombre"),
                        rs.getInt("categoria_id"),
                        rs.getString("categoriaNombre"),
                        rs.getDouble("precio_costo"),
                        rs.getDouble("precio_venta"),
                        rs.getInt("existencias")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error en búsqueda de producto: " + e);
        }
        return lista;
    }

    //OAD para obtener todos los productos en BD y poder mostrarlos en el jTable
        //Se usa Join porque en mi tabla producto unicamente guardo el id de la categoria, mas no el nombre, entonces se usa un JOIN para obtener su respectivo nombre y poder mostrarlo.
    public List<Producto> obtenerProductos() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT p.idProducto, p.codigo, p.nombre, p.categoria_id, c.nombre AS categoriaNombre, "
                + "p.precio_costo, p.precio_venta, p.existencias "
                + "FROM producto p "
                + "INNER JOIN categoria c ON p.categoria_id = c.id "
                + "ORDER BY p.nombre";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("codigo"),
                        rs.getString("nombre"),
                        rs.getInt("categoria_id"),
                        rs.getString("categoriaNombre"),
                        rs.getDouble("precio_costo"),
                        rs.getDouble("precio_venta"),
                        rs.getInt("existencias")
                ));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Error en obtener productos: " + e);
        }
        return lista;
    }
    
    //Mismo metodo para obtener los productos en BD pero sin mostrar el precio Costo, pues el Vendedor no tendra acceso a dicho dato
    public List<Producto> obtenerProductosVendedor() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT p.idProducto, p.codigo, p.nombre, p.categoria_id, c.nombre AS categoriaNombre, "
                + "p.precio_venta, p.existencias "
                + "FROM producto p "
                + "INNER JOIN categoria c ON p.categoria_id = c.id "
                + "ORDER BY p.nombre";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("codigo"),
                        rs.getString("nombre"),
                        rs.getInt("categoria_id"),
                        rs.getString("categoriaNombre"),
                        rs.getDouble("precio_venta"),
                        rs.getInt("existencias")
                ));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Error en obtener productos: " + e);
        }
        return lista;
    }

    //OAD para eliminar productos
    public boolean eliminarProducto(int id) {
        boolean respuesta = false;
        String sql = "DELETE FROM producto WHERE idProducto = ?";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            respuesta = true;

            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar producto: " + e);
        }

        return respuesta;
    }

    //Para obtener un producto segun su ID y se llene los campos con su información y poder actualizar.
    public Producto obtenerProductoPorId(int idProducto) {
        Producto p = null;

        String sql = "SELECT p.idProducto, p.codigo, p.nombre, p.categoria_id, c.nombre AS categoriaNombre, "
                + "p.precio_costo, p.precio_venta, p.existencias "
                + "FROM producto p "
                + "INNER JOIN categoria c ON p.categoria_id = c.id "
                + "WHERE p.idProducto = ?";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("codigo"),
                        rs.getString("nombre"),
                        rs.getInt("categoria_id"),
                        rs.getString("categoriaNombre"),
                        rs.getDouble("precio_costo"),
                        rs.getDouble("precio_venta"),
                        rs.getInt("existencias")
                );
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al obtener producto por ID: " + e);
        }

        return p;
    }

    //OAD para actualizar productos
    public boolean actualizarProducto(Producto p) {
        boolean resp = false;

        String sql = "UPDATE producto SET codigo = ?, nombre = ?, categoria_id = ?, "
                + "precio_costo = ?, precio_venta = ?, existencias = ? WHERE idProducto = ?";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getCategoria_id());
            ps.setDouble(4, p.getPrecioCosto());
            ps.setDouble(5, p.getPrecioVenta());
            ps.setInt(6, p.getExistencias());
            ps.setInt(7, p.getIdProducto());

            ps.executeUpdate();
            conn.close();
            resp = true;

        } catch (Exception e) {
            System.out.println("Error al actualizar producto: " + e);
        }

        return resp;
    }
}
