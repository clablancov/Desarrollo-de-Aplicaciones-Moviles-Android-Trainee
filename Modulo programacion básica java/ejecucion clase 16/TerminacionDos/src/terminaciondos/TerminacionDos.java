/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminaciondos;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class TerminacionDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, modulo, cont = 0;
        do {            
            System.out.println("Ingrese Numero");
            numero = leer.nextInt();
            
            System.out.println("Se ingreso el numero " + numero);
            modulo = numero;
            do{
                modulo = modulo % 10;
                if (modulo == 2){
                    cont++;
                }
            }while(modulo > 9);
            if(numero < 0){
                System.out.println("Se ingreso un numero NEGATIVO, el programa se cancelará!");
            }
            
        } while (numero >= 0);
        
        System.out.println("La cantidad de numeros ingresados que terminan en 2 es de " + cont);
    }
    
}
