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
public class Cliente {
    public String razonSocial;
    public String rut;
    public double dscto;
    
    public String getRazonSocial(){
        this.razonSocial = "Cliente Regalon";
        return this.razonSocial;
    }
    
    public void setRut(String rut){
        this.rut = rut;
    }
}
