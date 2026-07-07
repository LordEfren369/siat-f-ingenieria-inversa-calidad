package OAD;

import Configuracion.ConexionMYSQL;
import java.sql.*;

public class OAD_Estadisticas {

    //OAD para obtener las Ventas del mes y mostrarlas en el Dashboard del Admin (Tarjetas)
    public double obtenerVentasDelMes() {
        double total = 0;

        //IFNULL sirve para comprobar si el valor es NULL y, si lo es, sustituirlo por 0 (es decir, que no salga NULL en la tarjeta del dashboard
        //CURDATE devuelve la fecha actual, y el Where solo trae los registros donde la fecha sea del MISMO mes y del MISMO año que la fecha actual.
        String sql = """ 
            SELECT IFNULL(SUM(total), 0) AS ventas FROM pedido WHERE MONTH(fecha) = MONTH(CURDATE()) AND YEAR(fecha) = YEAR(CURDATE());""";

        try (Connection con = new ConexionMYSQL().getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                total = rs.getDouble("ventas");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;
    }

    //OAD para obtener la ganancia del mes y mostrarla en el Dashboard del Admin (Tarjeta)
    public double obtenerGananciaDelMes() {
        double total = 0;

        //Basicamente hace la operacion de ganancia por producto = precio venta - costo y se multiplica por la cantidad vendida y todo lo suma para obtener la ganancia total
        String sql = """
            SELECT
                IFNULL(SUM((pd.precioUnitario - p2.precio_costo) * pd.cantidad), 0) AS ganancia 
            FROM pedido_detalle pd
            JOIN producto p2 ON pd.idProducto = p2.idProducto
            JOIN pedido p ON pd.folio = p.folio
            WHERE MONTH(p.fecha) = MONTH(CURDATE())
              AND YEAR(p.fecha) = YEAR(CURDATE());
        """;

        try (Connection con = new ConexionMYSQL().getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                total = rs.getDouble("ganancia");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;
    }

    //OAD para obtener el numero de productos en Inventario y poder mostrarlo en el Dashboard del Admin (Tarjeta)
    public int obtenerCantidadProductos() {
        int total = 0;

        String sql = "SELECT COUNT(idProducto) AS productos FROM producto;";

        try (Connection con = new ConexionMYSQL().getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                total = rs.getInt("productos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;
    }
}
