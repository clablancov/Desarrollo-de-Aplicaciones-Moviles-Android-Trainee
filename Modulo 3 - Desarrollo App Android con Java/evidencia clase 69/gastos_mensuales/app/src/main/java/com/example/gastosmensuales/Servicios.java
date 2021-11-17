package com.example.gastosmensuales;

public class Servicios {
    private int id;
    private String nombre, descripcion;

    public Servicios(){

    }
    public Servicios(int id, String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
