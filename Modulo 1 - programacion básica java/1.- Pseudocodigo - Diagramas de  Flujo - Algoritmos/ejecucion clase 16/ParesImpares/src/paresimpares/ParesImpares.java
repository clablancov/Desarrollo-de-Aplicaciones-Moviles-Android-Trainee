/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresimpares;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class ParesImpares {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, modulo, contPar = 0, sumaPar = 0, contImpar = 0, multiImpar = 1, flag = 0;
        do {            
            System.out.println("ingrese numero");
            numero = leer.nextInt();
            modulo = numero % 2;
            
            if(modulo == 0){
                contPar++;
                sumaPar = sumaPar + numero;
            }
            else{
                contImpar++;
                multiImpar = multiImpar * numero;
            }
            
            do{
                System.out.println("Desea ingresar otra nota? (1=SI, 2=NO)");
                flag = leer.nextInt();
            }while(flag > 2 || flag < 1);
        } while (flag == 1);
        
        System.out.println("La suma de numeros pares ingresados es de " + sumaPar);
        System.out.println("La Multiplicación de numeros impares ingresados es de " + multiImpar);
        
        if(contPar > contImpar){
            System.out.println("Se ingresaron mas Numero PARES!!!");
            System.out.println("Los numeros Pares ingresados fueron de " + contPar);
            System.out.println("Los numeros Impares ingresados fueron de " + contImpar);
        }
        else{
            System.out.println("Se ingresaron mas Numero IMPARES!!!");
            System.out.println("Los numeros Pares ingresados fueron de " + contPar);
            System.out.println("Los numeros Impares ingresados fueron de " + contImpar);
        }
    }
    
}
