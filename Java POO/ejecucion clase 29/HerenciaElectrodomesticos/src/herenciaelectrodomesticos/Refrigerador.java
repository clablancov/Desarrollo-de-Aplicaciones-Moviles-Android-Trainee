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
public class Refrigerador extends Electrodomestico{
    private int puertas;
    private String modelo, eficiencia;
    private boolean dispensador;

    public Refrigerador(int puertas, String modelo, String eficiencia, boolean dispensador, int voltaje, String serialnumber, String marca, String procedencia, double peso, double amperaje, double potencia) {
        super(voltaje, serialnumber, marca, procedencia, peso, amperaje, potencia);
        this.puertas = puertas;
        this.modelo = modelo;
        this.eficiencia = eficiencia;
        this.dispensador = dispensador;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    public boolean isDispensador() {
        return dispensador;
    }

    public void setDispensador(boolean dispensador) {
        this.dispensador = dispensador;
    }

    
    public String imprimeinfo() {
        return "Refrigerador{" + "puertas=" + puertas + ", modelo=" + modelo + ", eficiencia=" + eficiencia + ", dispensador=" + dispensador + '}';
    }
}
