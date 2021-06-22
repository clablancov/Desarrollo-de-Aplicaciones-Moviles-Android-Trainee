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
    private String descripcion;
    public int monto;
    
    //Constructores
    public Servicio(){
        this.descripcion = "Asesorias TI";
        this.monto = 20500;
    }
    public Servicio(String descripcion, int monto){
        this.descripcion = descripcion;
        this.monto = monto;
    }
    //Setters and getters
    public void setdescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setmonto(int monto){
        this.monto = monto;
    }
    
    public String getdescripcion(){
        return this.descripcion;
    }
    public int getmonto(){
        return this.monto;
    }
}
