/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos.iterativos;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class MultiplosIterativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, modulo;
        
        System.out.println("Ingrese numero a evaluar");
        numero = leer.nextInt();
        
        for(int i = 1; i <= 100; i++){
            modulo = i % numero;
            
            if (modulo == 0){
                System.out.println("El numero " + numero + " es multiplo de " + i);
            }
        }
    }
    
}
