/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosuerte;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class NumeroSuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int dia, mes, anno, suma, nroSuerte = 0;
        
        System.out.println("Ingrese Fecha de Nacimiento");
        System.out.println("Dia");
        dia = leer.nextInt();
        System.out.println("Mes");
        mes = leer.nextInt();
        System.out.println("Año");
        anno = leer.nextInt();
        
        suma = anno + mes + dia;
        while(suma > 0){
            nroSuerte += suma % 10;
            suma = suma / 10;
        }
        System.out.println("El numero de la suerte es " + nroSuerte);
        
    }
    
}
