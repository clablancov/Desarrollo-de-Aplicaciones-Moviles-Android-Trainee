/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero = 0, numeroMayor = 0;
        
        System.out.println("====Analizador de numero mayor====");
        System.out.println("Ingrese primer numero");
        numero = leer.nextInt();
        
        numeroMayor = numero > numeroMayor ? numero : numeroMayor;
        
        System.out.println("Ingrese Segundo Numero");
        numero = leer.nextInt();
        
        numeroMayor = numero > numeroMayor ? numero : numeroMayor;
        System.out.println("Ingrese Tercer Numero");
        numero = leer.nextInt();
        
        numeroMayor = numero > numeroMayor ? numero : numeroMayor;
        
        System.out.println("El numero mayor ingresado es: " + numeroMayor);
        System.out.println("================================================");
        
    }
    
}
