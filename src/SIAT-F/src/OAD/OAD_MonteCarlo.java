package OAD;

import Configuracion.ConexionMYSQL;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OAD_MonteCarlo {

    public List<Integer> obtenerVentasHistoricas(int idProducto, String periodo) {
        List<Integer> ventas = new ArrayList<>();

        // Aqui entra a un case en especifico dependiendo el periodo elegido por el usuario
        String sql = "";
        switch (periodo.toLowerCase()) {
            case "semanal":
                sql = "SELECT SUM(pd.cantidad) AS ventas " //Suma todas las cantidades del mismo producto en un pedido
                        + "FROM pedido_detalle pd "
                        + "INNER JOIN pedido p ON pd.folio = p.folio "
                        + "WHERE pd.idProducto = ? "
                        + "AND p.fecha >= DATE_SUB(CURDATE(), INTERVAL 1 WEEK) " //Toma todas las ventas de la ultima semana, mes, trimestre, etc. Segun lo seleccionado
                        + "GROUP BY pd.folio"; //Agrupa por ticket para obtener la venta total del producto en ese pedido
                break;

            case "mensual":
                sql = "SELECT SUM(pd.cantidad) AS ventas "
                        + "FROM pedido_detalle pd "
                        + "INNER JOIN pedido p ON pd.folio = p.folio "
                        + "WHERE pd.idProducto = ? "
                        + "AND p.fecha >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH) "
                        + "GROUP BY pd.folio";
                break;

            case "trimestral":
                sql = "SELECT SUM(pd.cantidad) AS ventas "
                        + "FROM pedido_detalle pd "
                        + "INNER JOIN pedido p ON pd.folio = p.folio "
                        + "WHERE pd.idProducto = ? "
                        + "AND p.fecha >= DATE_SUB(CURDATE(), INTERVAL 3 MONTH) "
                        + "GROUP BY pd.folio";
                break;

            case "semestral":
                sql = "SELECT SUM(pd.cantidad) AS ventas "
                        + "FROM pedido_detalle pd "
                        + "INNER JOIN pedido p ON pd.folio = p.folio "
                        + "WHERE pd.idProducto = ? "
                        + "AND p.fecha >= DATE_SUB(CURDATE(), INTERVAL 6 MONTH) "
                        + "GROUP BY pd.folio";
                break;

            case "anual":
                sql = "SELECT SUM(pd.cantidad) AS ventas "
                        + "FROM pedido_detalle pd "
                        + "INNER JOIN pedido p ON pd.folio = p.folio "
                        + "WHERE pd.idProducto = ? "
                        + "AND p.fecha >= DATE_SUB(CURDATE(), INTERVAL 1 YEAR) "
                        + "GROUP BY pd.folio";
                break;

            default:
                throw new IllegalArgumentException("Periodo no válido");
        }

        try (Connection conn = new ConexionMYSQL().getConexion(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idProducto);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    ventas.add(rs.getInt("ventas"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ventas;
    }

    //Metodo para calcular estadisticos
    public Map<String, Double> calcularEstadisticos(List<Integer> ventas) {
        Map<String, Double> estad = new HashMap<>();
        if (ventas.isEmpty()) {
            return estad;
        }

        double sum = 0;
        int min = ventas.get(0);
        int max = ventas.get(0);

        for (int v : ventas) { //suma todas las ventas
            sum += v;
            if (v < min) { //se obtiene el minimo
                min = v;
            }
            if (v > max) { //se obtiene el maximo
                max = v;
            }
        }

        double promedio = sum / ventas.size(); //calcula el promedio

        //se calcula la desviacion estandar
        double varianza = 0;
        for (int v : ventas) {
            varianza += Math.pow(v - promedio, 2);
        }
        varianza /= ventas.size();
        double desviacion = Math.sqrt(varianza);

        estad.put("promedio", promedio); //Con la lista de ventas historicas calcula el promedio, desviacion, min y max
        estad.put("desviacion", desviacion);
        estad.put("minimo", (double) min);
        estad.put("maximo", (double) max);

        return estad;
    }

    //Metodo para simular ventas
    public List<Double> simularVentas(List<Integer> ventasHistoricas, int nSimulaciones) {
        //Si no hay ventas históricas, no se puede simular
        if (ventasHistoricas == null || ventasHistoricas.isEmpty()) {
            return new ArrayList<>();
        }

        Map<String, Double> estad = calcularEstadisticos(ventasHistoricas);

        // Validar estadísticas
        if (!estad.containsKey("promedio") || !estad.containsKey("desviacion")) {
            return new ArrayList<>();
        }

        double promedio = estad.get("promedio");
        double desviacion = estad.get("desviacion");

        Random rand = new Random();
        List<Double> simulaciones = new ArrayList<>();

        for (int i = 0; i < nSimulaciones; i++) { //a traves del for generamos numeros aleatorios 

            double sim = promedio + desviacion * rand.nextGaussian();

            if (sim < 0) {
                sim = 0;
            }

            simulaciones.add(sim);
        }

        return simulaciones;

    }

    //Metodo para obtener los datos estadisticos simulados
    public Map<String, Double> estadisticosSimulacion(List<Double> simulaciones) {
        Map<String, Double> estad = new HashMap<>();
        if (simulaciones.isEmpty()) {
            return estad;
        }

        //con base a las ventas simuladas se calcula el promedio, min y max
        double sum = 0;
        double min = simulaciones.get(0);
        double max = simulaciones.get(0);

        for (double v : simulaciones) {
            sum += v;
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }

        double promedio = sum / simulaciones.size();

        double desviacion = 0;
        for (double v : simulaciones) {
            desviacion += Math.pow(v - promedio, 2);
        }
        desviacion = Math.sqrt(desviacion / simulaciones.size());

        estad.put("promedio", promedio);
        estad.put("minimo", min);
        estad.put("maximo", max);

        return estad;
    }

}
