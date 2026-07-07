package OAD;

import Configuracion.ConexionMYSQL;
import Modelos.Categoria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OAD_Categoria {

    public boolean agregarCategoria(Categoria c) {
        boolean r = false;
        String sql = "INSERT INTO categoria (nombre) VALUES (?)";
        try {
            Connection con = new ConexionMYSQL().getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.executeUpdate();
            ps.close();
            con.close();
            r = true;
        } catch (Exception ex) {
            System.out.println("Error al agregar categoria: " + ex);
        }
        return r;
    }

    public List<Categoria> obtenerCategorias() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT * FROM categoria ORDER BY nombre";

        try {
            Connection con = new ConexionMYSQL().getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Categoria(rs.getInt("id"), rs.getString("nombre")));
            }

        } catch (Exception e) {
            System.out.println("Error al obtener categorias");
        }

        return lista;
    }
}
