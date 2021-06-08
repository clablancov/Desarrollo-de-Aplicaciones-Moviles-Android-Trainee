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
public class Minicomponente extends Electrodomestico{
    private boolean portatil;
    private int parlantes, watts;
    private double bluetooth;

    public Minicomponente(boolean portatil, int parlantes, int watts, double bluetooth) {
        this.portatil = portatil;
        this.parlantes = parlantes;
        this.watts = watts;
        this.bluetooth = bluetooth;
    }

    public Minicomponente(boolean portatil, int parlantes, int watts, double bluetooth, int voltaje, String serialnumber, String marca, String procedencia, double peso, double amperaje, double potencia) {
        super(voltaje, serialnumber, marca, procedencia, peso, amperaje, potencia);
        this.portatil = portatil;
        this.parlantes = parlantes;
        this.watts = watts;
        this.bluetooth = bluetooth;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }

    public int getParlantes() {
        return parlantes;
    }

    public void setParlantes(int parlantes) {
        this.parlantes = parlantes;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public double getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(double bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Minicomponente{" + "portatil=" + portatil + ", parlantes=" + parlantes + ", watts=" + watts + ", bluetooth=" + bluetooth + '}';
    }
    
}
