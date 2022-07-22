
package com.yoprogramo.proyectoportfolio;

import java.util.List;

/**
 *
 * @author crisl
 */
public class Administrador extends Usuario {
    
    //atributos
    private List <Educacion> listaEducacion;
    private List <Proyecto> listaProyecto;
    private List <Habilidad> listaHabilidad;

    //constructores
    public Administrador() {
    }

    public Administrador(List<Educacion> listaEducacion, List<Proyecto> listaProyecto, List<Habilidad> listaHabilidad, int userId, String nombre, String apellido, String correo, String contraseña, String certificado, String descripción, String foto, String fotoBanner, boolean logInStatus) {
        super(userId, nombre, apellido, correo, contraseña, certificado, descripción, foto, fotoBanner, logInStatus);
        this.listaEducacion = listaEducacion;
        this.listaProyecto = listaProyecto;
        this.listaHabilidad = listaHabilidad;
    }

    //getters and setters
    public List<Educacion> getListaEducacion() {
        return listaEducacion;
    }

    public void setListaEducacion(List<Educacion> listaEducacion) {
        this.listaEducacion = listaEducacion;
    }

    public List<Proyecto> getListaProyecto() {
        return listaProyecto;
    }

    public void setListaProyecto(List<Proyecto> listaProyecto) {
        this.listaProyecto = listaProyecto;
    }

    public List<Habilidad> getListaHabilidad() {
        return listaHabilidad;
    }

    public void setListaHabilidad(List<Habilidad> listaHabilidad) {
        this.listaHabilidad = listaHabilidad;
    }

    //toString
    @Override
    public String toString() {
        return "Administrador{" + "listaEducacion=" + listaEducacion + ", listaProyecto=" + listaProyecto + ", listaHabilidad=" + listaHabilidad + '}';
    }
    
}
