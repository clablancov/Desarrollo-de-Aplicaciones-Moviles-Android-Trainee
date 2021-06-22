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
public class Lavadora extends Electrodomestico{
    private int kilos;
    private String modelo;
    private boolean secadora, frontal;

    public Lavadora(int kilos, String modelo, boolean secadora, boolean frontal) {
        this.kilos = kilos;
        this.modelo = modelo;
        this.secadora = secadora;
        this.frontal = frontal;
    }

    public Lavadora(int kilos, String modelo, boolean secadora, boolean frontal, int voltaje, String serialnumber, String marca, String procedencia, double peso, double amperaje, double potencia) {
        super(voltaje, serialnumber, marca, procedencia, peso, amperaje, potencia);
        this.kilos = kilos;
        this.modelo = modelo;
        this.secadora = secadora;
        this.frontal = frontal;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isSecadora() {
        return secadora;
    }

    public void setSecadora(boolean secadora) {
        this.secadora = secadora;
    }

    public boolean isFrontal() {
        return frontal;
    }

    public void setFrontal(boolean frontal) {
        this.frontal = frontal;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "kilos=" + kilos + ", modelo=" + modelo + ", secadora=" + secadora + ", frontal=" + frontal + '}';
    }
    
}
