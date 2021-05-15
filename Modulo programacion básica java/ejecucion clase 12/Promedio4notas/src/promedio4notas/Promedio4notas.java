/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio4notas;

import java.util.Scanner;
/**
 *
 * @author clabl
 */
public class Promedio4notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        double nota1 = 2.5, nota2 = 7.0, nota3 = 5.6, nota4 = 6.2;
        double suma;
        System.out.println("Ingrese nota");
        nota1 = leer.nextDouble();
        System.out.println("Ingrese nota");
        nota2 = leer.nextDouble();
        System.out.println("Ingrese nota");
        nota3 = leer.nextDouble();
        System.out.println("Ingrese nota");
        nota4 = leer.nextDouble();
        suma = nota1 + nota2 + nota3 + nota4;
        double promedio = suma / 4;
        
        System.out.println("el promedio es " + promedio);
    }
    
}
