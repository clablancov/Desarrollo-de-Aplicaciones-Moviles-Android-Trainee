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
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cliente
        Cliente cliente1 = new Cliente("Befetec", "76374017-k", 0.0, 3);
        //calcula descuento
        cliente1.calculaDscto();
        
        //Servicio - dejamos el generico
        Servicio serv1 = new Servicio();
        
        //Factura a emitir
        
        Factura fact1 = new Factura(102);
        fact1.setNetoCantidad(serv1.monto, 4);
        fact1.calculaIva();
        fact1.calculaTotal();
        fact1.emiteFactura();
        
        
        
        
    }
    
}
