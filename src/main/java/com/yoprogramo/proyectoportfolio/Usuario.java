
package com.yoprogramo.proyectoportfolio;

/**
 *
 * @author crisl
 */
public abstract class Usuario {
    
//atributos
    protected int userId;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contraseña;
    protected String certificado;
    protected String descripción;
    protected String foto;
    protected String fotoBanner;
    protected boolean logInStatus;

//constructores
    public Usuario() {
    }

    public Usuario(int userId, String nombre, String apellido, String correo, String contraseña, String certificado, String descripción, String foto, String fotoBanner, boolean logInStatus) {
        this.userId = userId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.certificado = certificado;
        this.descripción = descripción;
        this.foto = foto;
        this.fotoBanner = fotoBanner;
        this.logInStatus = logInStatus;
    }

//getters and setters    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFotoBanner() {
        return fotoBanner;
    }

    public void setFotoBanner(String fotoBanner) {
        this.fotoBanner = fotoBanner;
    }

    public boolean getLogInStatus() {
        return logInStatus;
    }

    public void setLogInStatus(boolean logInStatus) {
        this.logInStatus = logInStatus;
    }

//toString
    @Override
    public String toString() {
        return "Usuario{" + "userId=" + userId + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", certificado=" + certificado + ", descripci\u00f3n=" + descripción + ", foto=" + foto + ", fotoBanner=" + fotoBanner + ", logInStatus=" + logInStatus + '}';
    }

//metodos propios
    public boolean verifyLogIn () {
        return true;
    };
    
    public void mostrarBtnEdit () {
        
    };
    
    public void editarTarjeta () {
        
    };
    
    public void editarBanner () {
    
    };
    
    public void editarDescripcion () {
    
    };
    
}
