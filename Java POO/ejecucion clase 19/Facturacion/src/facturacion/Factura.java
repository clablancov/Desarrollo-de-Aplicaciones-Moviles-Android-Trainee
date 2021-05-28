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
public class Factura {
    int folio;
    String fechaEmision;
    String fechaVencimiento;
    int cantidad;
    int unidad;
    double iva;
    double valorIva = 1.19;
    double total;
    
    public void calculaIva(int montoNeto){
        this.iva = montoNeto * valorIva;
    }
    
    public void calculaTotal(int montoNeto){
        this.total = montoNeto + iva;
    }
    
    public double getTotal(){
        return total;
    }
}
