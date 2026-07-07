package Modelos;

public class Pedido {
    private int folio;
    private String fecha;
    private int idCliente;
    private String clienteNombre;
    private double total;

    //Constructor para agregar los datos principales del pedido (El folio se genera automaticamente en BD.La fecha la llena la base de datos)
    public Pedido(int idCliente, double total) {
        this.idCliente = idCliente;
        this.total = total;
    }

    //Constructor para poder generar el PDF de los pedidos del mes
    public Pedido(int folio, String fecha,  String clienteNombre, double total) {
        this.folio = folio;
        this.fecha = fecha;
        this.clienteNombre = clienteNombre;
        this.total = total;
    }
    
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
