package OAD;

import Configuracion.ConexionMYSQL;
import Modelos.Cliente;
import java.sql.*;
import java.util.*;

public class OAD_Cliente {

    //OAD para agregar un nuevo cliente a BD
    public boolean agregarCliente(Cliente c) {
        String sql = "INSERT INTO cliente (nombre_cliente, nombre_negocio, ciudad, calle, colonia, numero, telefono) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        boolean ok = false;

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, c.getNombreCliente());
            ps.setString(2, c.getNombreNegocio());
            ps.setString(3, c.getCiudad());
            ps.setString(4, c.getCalle());
            ps.setString(5, c.getColonia());
            ps.setString(6, c.getNumero());
            ps.setString(7, c.getTelefono());

            ps.executeUpdate();
            ok = true;

            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al agregar cliente: " + e);
        }

        return ok;
    }

    //OAD para obtener el ultimo ID registrado y poder colocar su consecutivo
    public int obtenerSiguienteID() {
        int siguiente = 1;

        try {
            Connection con = new ConexionMYSQL().getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "SELECT IFNULL(MAX(idCliente), 0) + 1 AS nextId FROM cliente"
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

    //OAD para obtener una lista de todos los clientes y poder mostrarlos en un jTable
    public List<Cliente> obtenerClientes() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente ORDER BY nombre_cliente";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Cliente(
                        rs.getInt("idCliente"),
                        rs.getString("nombre_cliente"),
                        rs.getString("nombre_negocio"),
                        rs.getString("ciudad"),
                        rs.getString("calle"),
                        rs.getString("colonia"),
                        rs.getString("numero"),
                        rs.getString("telefono")
                ));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Error obteniendo clientes: " + e);
        }
        return lista;
    }

    //OAD para poder eliminar un cliente segun su ID
    public boolean eliminarCliente(int id) {
        boolean respuesta = false;
        String sql = "DELETE FROM cliente WHERE idCliente = ?";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            respuesta = true;

            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar cliente: " + e);
        }

        return respuesta;
    }

    //OAD para actualizar datos de un cliente
    public boolean actualizarCliente(Cliente c) {
        boolean resp = false;

        String sql = "UPDATE cliente SET nombre_cliente = ?, nombre_negocio = ?,  ciudad = ?, "
                + "calle = ?, colonia = ?, numero = ?, telefono = ? WHERE idCliente = ?";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, c.getNombreCliente());
            ps.setString(2, c.getNombreNegocio());
            ps.setString(3, c.getCiudad());
            ps.setString(4, c.getCalle());
            ps.setString(5, c.getColonia());
            ps.setString(6, c.getNumero());
            ps.setString(7, c.getTelefono());
            ps.setInt(8, c.getIdCliente());  // tu getter sigue igual

            ps.executeUpdate();
            conn.close();
            resp = true;

        } catch (Exception e) {
            System.out.println("Error al actualizar datos del cliente: " + e);
        }

        return resp;
    }

    //Para poder obtener un cliente por su ID y poder actualizar sus datos
    public Cliente obtenerClientePorId(int id) {
        Cliente c = null;

        String sql = "SELECT idCliente, nombre_cliente, nombre_negocio, ciudad, calle, colonia, numero, telefono "
                + "FROM cliente WHERE idCliente = ?";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c = new Cliente(
                        rs.getInt("idCliente"),
                        rs.getString("nombre_cliente"),
                        rs.getString("nombre_negocio"),
                        rs.getString("ciudad"),
                        rs.getString("calle"),
                        rs.getString("colonia"),
                        rs.getString("numero"),
                        rs.getString("telefono")
                );
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error al obtener cliente por ID: " + e);
        }

        return c;
    }

    // Para el buscador, muestra los registros que coinciden con el nombre del cliente o negocio
    public List<Cliente> buscarClientes(String texto) {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE nombre_cliente LIKE ? OR nombre_negocio LIKE ?";

        try {
            Connection conn = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            String like = "%" + texto + "%";
            ps.setString(1, like);
            ps.setString(2, like);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Cliente(
                        rs.getInt("idCliente"),
                        rs.getString("nombre_cliente"),
                        rs.getString("nombre_negocio"),
                        rs.getString("ciudad"),
                        rs.getString("calle"),
                        rs.getString("colonia"),
                        rs.getString("numero"),
                        rs.getString("telefono")
                ));
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error en búsqueda de cliente: " + e);
        }

        return lista;
    }
}
