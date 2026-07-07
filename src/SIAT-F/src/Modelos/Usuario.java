package Modelos;

public class Usuario {
    private String usuario;
    private String contraseña;
    private String tipoPerfil;

    //constructor para poder agregar un nuevo usuario (se ocupan los 3 datos)
    public Usuario(String usuario, String contraseña, String tipoPerfil) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipoPerfil = tipoPerfil;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(String tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }
}
