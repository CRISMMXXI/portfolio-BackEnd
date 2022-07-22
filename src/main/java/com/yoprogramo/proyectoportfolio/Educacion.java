
package com.yoprogramo.proyectoportfolio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author crisl
 */
public class Educacion {
    
//atributos
private int id;
private String nombre;
private String titulo;
private String descripcion;
private Date fechaTermino;
private String foto;
private Calendar calendar = new GregorianCalendar();

//constructores
    public Educacion() {
    }

    public Educacion(int id, String nombre, String titulo, String descripcion, Date fechaTermino, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaTermino = fechaTermino;
        this.foto = foto;
    }

 //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaTermino() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        String fechaFormateada = sdf.format(fechaTermino);
        return fechaFormateada;
    }

    public void setFechaTermino(int dia, int mes, int anio) {
        calendar.set(anio, mes, dia);
        this.fechaTermino = calendar.getTime();
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

//toString
    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", nombre=" + nombre + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fechaTermino=" + fechaTermino + ", foto=" + foto + '}';
    }

//metodos propios
    public void agregarEstudio () {
    
    };
    
    public void eliminarEstudio () {
    
    };
    
    public void editarEstudio () {
    
    };
    
    public void InsertarEdicion () {
    
    };

}
