
package com.yoprogramo.proyectoportfolio;

/**
 *
 * @author crisl
 */
public class Habilidad {
    
//atributos    
    private int id;
    private String nombre;

//constructores    
    public Habilidad() {
    }

    public Habilidad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

//toString   
    @Override
    public String toString() {
        return "Habilidad{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
//metodos propios
    public void editarHabilidad () {
    
    };
    
    public void liminarHabilidad () {
    
    };
    
    public void agregarHabilidad () {
    
    };    
    
}
