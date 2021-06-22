/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectrodomesticos;

/**
 *
 * @author clabl
 */
public class Electrodomestico {
    private int voltaje;
    private String serialnumber, marca, procedencia;
    private double peso, amperaje, potencia;
    
    public Electrodomestico(){
        voltaje = 220;
        serialnumber = "Sin Datos";
        marca = "generico";
        procedencia = "Chile";
        peso = 1.0;
        amperaje = 0.0;
        potencia = 1.0;
    }
    
    public Electrodomestico(int voltaje, String serialnumber, String marca, String procedencia, double peso, double amperaje, double potencia){
        this.amperaje = amperaje;
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.procedencia = procedencia;
        this.serialnumber = serialnumber;
        this.voltaje = voltaje;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(double amperaje) {
        this.amperaje = amperaje;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String imprimeinfo() {
        return "Electrodomestico{" + "voltaje=" + voltaje + ", serialnumber=" + serialnumber + ", marca=" + marca + ", procedencia=" + procedencia + ", peso=" + peso + ", amperaje=" + amperaje + ", potencia=" + potencia + '}';
    }
    
    
}
