package Modelos;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String nombreNegocio;
    private String ciudad;
    private String calle;
    private String colonia;
    private String numero;
    private String telefono;

    //Constructor para poder actualizar los datos de los clientes y obtener su información (mostrarlos en la tabla a traves del OAD)
    public Cliente(int idCliente, String nombreCliente, String nombreNegocio, String ciudad, String calle, String colonia, String numero, String telefono) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.nombreNegocio = nombreNegocio;
        this.ciudad = ciudad;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
        this.telefono = telefono;
    }

    //Constructor para agregar un nuevo cliente (va sin ID porque este va autoincrementando a traves de la BD)
    public Cliente(String nombreCliente, String nombreNegocio, String ciudad, String calle, String colonia, String numero, String telefono) {
        this.nombreCliente = nombreCliente;
        this.nombreNegocio = nombreNegocio;
        this.ciudad = ciudad;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
        this.telefono = telefono;
    }

    //Constructor que sirve unicamente para mostrar el nombre los clientes en el Combo Box para agregar un nuevo pedidos
    public Cliente(int idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
