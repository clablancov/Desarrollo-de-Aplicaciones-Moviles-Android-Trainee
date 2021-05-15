/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiovariables;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Cambiovariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int var1, var2;
        
        //mostramos las variables iniciales
        System.out.println("Ingrese la primera variable ");
        var1 = leer.nextInt();
        System.out.println("Ingrese la segunda variable");
        var2 = leer.nextInt();
        
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        
        System.out.println("la primera variable quedo con " + var1);
        System.out.println("la segunda variable quedo con " + var2);
    }
    
}
