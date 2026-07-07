package Modelos;

public class Producto {

    private int idProducto;
    private String codigo;
    private String nombre;
    private int categoria_id;
    private double precioCosto;
    private double precioVenta;
    private int existencias;
    private String categoriaNombre;

    //Constructor para poder actualizar
    public Producto(int idProducto, String codigo, String nombre, int categoria_id,
            double precioCosto, double precioVenta, int existencias) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria_id = categoria_id;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.existencias = existencias;
    }

    //constructor para agregar un nuevo producto. Va sin Id, porque ese es auto incrementable en BD
    public Producto(String codigo, String nombre, int categoria_id, double precioCosto, double precioVenta, int existencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria_id = categoria_id;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.existencias = existencias;
    }

    //Para el OAD de obtener productos por Categoria y para obtener productos por ID
    public Producto(int idProducto, String codigo, String nombre, int categoriaId,
            String categoriaNombre, double precioCosto, double precioVenta, int existencias) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria_id = categoria_id;
        this.categoriaNombre = categoriaNombre;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.existencias = existencias;
    }

    //Para el OAD de obtener productos por Categoria y para obtener productos por ID
    public Producto(int idProducto, String codigo, String nombre, int categoriaId,
            String categoriaNombre, double precioVenta, int existencias) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria_id = categoria_id;
        this.categoriaNombre = categoriaNombre;
        this.precioVenta = precioVenta;
        this.existencias = existencias;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria) {
        this.categoria_id = categoria_id;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getCategoriaNombre() {
        return categoriaNombre;
    }

    public void setCategoriaNombre(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }

    @Override
    public String toString() {
        return nombre; //para solo mostrar el nombre en el combo
    }
}
