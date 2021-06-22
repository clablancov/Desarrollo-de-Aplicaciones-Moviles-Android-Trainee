/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author clabl
 */
public class Servicio {
    public String descripcion;
    public int monto;
    
    public Servicio(){
        this.descripcion = "Asesorias TI";
        this.monto = 20500;
    }
    public Servicio(String descripcion, int monto){
        this.descripcion = descripcion;
        this.monto = monto;
    }
}
