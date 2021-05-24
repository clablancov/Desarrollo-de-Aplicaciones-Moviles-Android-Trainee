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
        int numero, numMayor = 0, flag = 0;
        do {            
            System.out.println("ingrese numero");
            numero = leer.nextInt();
            
            numMayor = numero > numMayor ? numero : numMayor;
            
            do{
                System.out.println("Desea ingresar otra nota? (1=SI, 2=NO)");
                flag = leer.nextInt();
            }while(flag > 2 || flag < 1);
        } while (flag == 1);
        
        System.out.println("El numero mayor ingresado es " + numMayor);
    }
    
}
