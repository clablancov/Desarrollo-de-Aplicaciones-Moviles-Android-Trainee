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
    public int antiguedad;
    
    public Cliente(){
        this.razonSocial = "Cliente Generico";
        this.rut = "1-9";
        this.dscto = 0.0;
        this.antiguedad = 0;
        
    }
    public Cliente(String razonSocial, String rut, double dscto, int antiguedad){
        this.razonSocial = razonSocial;
        this.rut = rut;
        this.dscto = dscto;
        this.antiguedad = antiguedad;
        
    }
    
    public void setRut(String rut){
        this.rut = rut;
    }
    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }
    public void setDscto(double dscto){
        this.dscto = dscto;
    }
    public void setAntiguedad(double dscto){
        this.dscto = dscto;
    }
    
    public void calculaDscto(){
        this.dscto = this.antiguedad * 1.2;
        System.out.println("Descuento calculado, quedo en "+ this.dscto);
    }
}
