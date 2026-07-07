package Modelos;

public class PedidoDetalle {
    private int id;
    private int folio;
    private int idProducto;
    private String productoNombre;
    private int existencia;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    //Para poder agregar el detalle de un pedido a la BD
    public PedidoDetalle(int idProducto, String productoNombre, int existencia, int cantidad, double precioUnitario) {
        this.idProducto = idProducto;
        this.productoNombre = productoNombre;
        this.existencia = existencia;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}
