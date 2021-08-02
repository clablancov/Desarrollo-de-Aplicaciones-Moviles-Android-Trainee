package com.example.gastosmensuales;

public class registro_gastos {
    private String servicio, fecha;
    private int monto;

    public registro_gastos(String servicio, String fecha, int monto) {
        this.servicio = servicio;
        this.fecha = fecha;
        this.monto = monto;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
