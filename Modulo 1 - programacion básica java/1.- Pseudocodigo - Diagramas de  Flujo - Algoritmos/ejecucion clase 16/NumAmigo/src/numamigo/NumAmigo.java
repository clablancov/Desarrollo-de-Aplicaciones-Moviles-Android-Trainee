/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numamigo;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class NumAmigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, sumdiv1 = 0, sumdiv2 = 0, modulo;
        System.out.println("Ingrese Primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese Segundo numero");
        num2 = leer.nextInt();
        
        for(int i = 1; i < num1; i++){
            modulo = num1 % i;
            if(modulo == 0){
                sumdiv1 = sumdiv1 + i;
            }
        }
        for(int i = 1; i < num2; i++){
            modulo = num2 % i;
            if(modulo == 0){
                sumdiv2 = sumdiv2 + i;
            }
        }
        
        if((sumdiv1 == num2) && (sumdiv2 == num1)){
            System.out.println("Los numeros " + num1 + " y " + num2 + " SON AMIGOS ");
        }
        else{
            System.out.println("Los numeros " + num1 + " y " + num2 + " SON ENEMIGOS A MUERTE!");
        }
    }
    
}
