package Modelos;

public class VentaCategoria {

    private String categoria;
    private double total;

    public VentaCategoria(String categoria, double total) {
        this.categoria = categoria;
        this.total = total;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getTotal() {
        return total;
    }
}
