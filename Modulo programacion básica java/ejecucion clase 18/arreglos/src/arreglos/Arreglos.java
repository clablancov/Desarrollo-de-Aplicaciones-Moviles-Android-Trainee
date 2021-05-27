/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int suma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese numero");
            numeros[i] = leer.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("se ingreso en la posicion " + i + " el valor " + numeros[i]);
            suma += numeros[i];
        }
        
        System.out.println("La suma de estos numeros ingresados es de " + suma);
    }
    
}
