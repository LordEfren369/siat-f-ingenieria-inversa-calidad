package OAD;

import Configuracion.ConexionMYSQL;
import Modelos.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class OAD_Usuario {

    //OAD para poder agregar un usuario nuevo
    public boolean agregarUsuario(Usuario u) {
        boolean respuesta = false;

        String sql = "INSERT INTO usuario (usuario, contraseña, tipoPerfil) VALUES (?, ?, ?)"; //se ocupan los 3 datos necesarios

        try {
            Connection conexionMYSQL = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conexionMYSQL.prepareStatement(sql);

            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getContraseña());
            ps.setString(3, u.getTipoPerfil());

            ps.executeUpdate();
            ps.close();
            conexionMYSQL.close();
            respuesta = true;
        } catch (Exception ex) {
            System.out.println("No fue posible agregar al usuario: " + ex);
        }
        return respuesta;
    }

    //OAD para poder obtener todos los usuarios en BD y mostrarlos en un jTable
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario ORDER BY usuario";

        try {
            Connection conexionMYSQL = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conexionMYSQL.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String usuario = rs.getString("usuario");
                String contraseña = rs.getString("contraseña");
                String tipoPerfil = rs.getString("tipoPerfil");

                Usuario u = new Usuario(usuario, contraseña, tipoPerfil);
                listaUsuarios.add(u);
            }
        } catch (Exception ex) {
            listaUsuarios = null;
            JOptionPane.showMessageDialog(null, "Error al consultar usuarios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return listaUsuarios;
    }

    //OAD para poder validar en el LOGIN si las credenciales estan correctas y poder acceder al sistema
    public Usuario validarUsuario(String usuario, String contraseña) {
        Usuario u = null;
        String sql = "SELECT usuario, contraseña, tipoPerfil FROM usuario WHERE usuario = ? AND contraseña = ?";

        try {
            Connection conexion = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String usr = rs.getString("usuario");
                String pass = rs.getString("contraseña");
                String tipo = rs.getString("tipoPerfil");

                u = new Usuario(usr, pass, tipo);
            }
        } catch (Exception e) {
            System.out.println("Error al validar usuario: " + e);
        }
        return u;
    }

    //OAD para eliminar un usuario 
    public boolean eliminarUsuario(String usuario) {
        boolean respuesta = false;

        String sql = "DELETE FROM usuario WHERE usuario = ?";

        try {
            Connection conexion = new ConexionMYSQL().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, usuario);

            ps.executeUpdate();
            respuesta = true;

            ps.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error al eliminar usuario: " + ex);
        }

        return respuesta;
    }

}
