/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author clabl
 */
public class Factura {
    int folio;
    Calendar fechaEmision;
    Calendar fechaVencimiento;
    int cantidad;
    int montoNeto;
    double iva;
    double valorIva;
    double total;
    
    public Factura(int folio){
        this.folio = folio;
        this.valorIva = 0.19;
        this.fechaEmision = new GregorianCalendar();
        this.fechaVencimiento = new GregorianCalendar();
    }
    
    public void setNetoCantidad(int montoServicio, int cantidad){
        this.montoNeto = montoServicio * cantidad;
        this.cantidad = cantidad;
    }
    
    public void calculaIva(){
        this.iva = montoNeto * valorIva;
    }
    
    public void calculaTotal(){
        this.total = montoNeto + iva;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void setIva(double valorIva){
        this.valorIva = valorIva;
        System.out.println("Iva Modificado");
    }
    
    public void emiteFactura(){
        System.out.println("===FACTURA NRO." + this.folio);
        System.out.println("Fecha Emision: " + this.fechaEmision.get(Calendar.DATE) + "-" + this.fechaEmision.get(Calendar.MONTH) + "-" + this.fechaEmision.get(Calendar.YEAR));
        System.out.println("Fecha Vencimiento: " + this.fechaVencimiento.get(Calendar.DATE) + "-" + this.fechaVencimiento.get(Calendar.MONTH) + "-" + this.fechaVencimiento.get(Calendar.YEAR));
        System.out.println("Valor Neto: $" + montoNeto);
        System.out.println("Valor IVA: $" + this.iva);
        System.out.println("Valor Total: $" + this.total);
        System.out.println("Gracias por la compra!!!!");
    }
}
