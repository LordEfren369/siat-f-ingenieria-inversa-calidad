package Configuracion;

import java.sql.*;

public class ConexionMYSQL {

    // establecer una conexión a una base de datos MySQL en Java. 
    private Connection conexion;

    public ConexionMYSQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo cargar el Driver JDBC-ODBC " + ex);
        }
        try {
            String usuario = "root";
            String password = "Alma12";
            String basededatos = "siatf";

            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + basededatos, usuario, password);
        } catch (SQLException ex) {
            System.out.println("Error al realizar la conexion: " + ex);
        }
    }

    public Connection getConexion() {
        return conexion;
    }
}
