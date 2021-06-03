/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validafecha;

import java.util.Date;

/**
 *
 * @author clabl
 */
public class ValidaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f = new Fecha();
        Calendar fecha = f.getFecha();
        boolean res = f.fechaCorrecta(fecha);
        if(res){
            System.out.println("Fecha Correcta!!! " + fecha);
        }
        else {
            System.out.println("Fecha Incorrecta!!!!" + fecha);
        }
        
        System.out.println("Fecha Actual: " + fecha);
        System.out.println("Le sumamos 1 dia");
        fecha = f.diaSiguiente(fecha);
        
        System.out.println("Fecha Actualizada: " + fecha);
    }
    
}
