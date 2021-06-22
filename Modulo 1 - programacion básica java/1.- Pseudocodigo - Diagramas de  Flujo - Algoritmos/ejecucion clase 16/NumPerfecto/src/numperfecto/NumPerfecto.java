/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numperfecto;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class NumPerfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        long numero, modulo, suma = 0;
        
        System.out.println("Ingrese numero a evaluar");
        numero = leer.nextLong();
        
        for(long i = 1; i < numero; i++){
            modulo = numero % i;
            if(modulo == 0){
                suma = suma + i;
            }
        }
        
        if (suma == numero){
            System.out.println("El numero " + numero + " es PERFECTO!");
        }
        else { 
            System.out.println("El numero " + numero + " NO ES PERFECTO!");
        }
    }
    
}
