package com.example.checkapartment.modelo.Apartment;

import java.io.Serializable;

public class Apartment implements Serializable {
    private String proyecto, torre, depto, direccion, foto;

    public Apartment(String proyecto, String torre, String depto, String direccion, String foto) {
        this.proyecto = proyecto;
        this.torre = torre;
        this.depto = depto;
        this.direccion = direccion;
        this.foto = foto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
