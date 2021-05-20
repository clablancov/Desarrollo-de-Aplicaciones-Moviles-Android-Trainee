/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, modulo;
        System.out.println("Ingrese numero limite");
        numero = leer.nextInt();
        
        for(int i=1; i <= numero; i++){
            modulo = i % 2;
            if (modulo == 0){
                System.out.println("Numero " + i + " es un numero par");
            }
        }
        
        System.out.println("FIN======================");
        
        System.out.println("Mostrar los numeros del 1 al 100");
        
        for(int i = 1; i <=100; i++){
            System.out.println("Numero " + i);
        }
        System.out.println("Mostrar los numeros del 100 al 1");
        
        for(int i = 100; i >= 1; i--){
            System.out.println("Numero " + i);
        }
    }
    
}
