/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = 0, numero2 = 0, flag = 0, resultado = 0;
        char operador;
        System.out.println("Calculadora");
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();
        resultado = numero;
        do {            
            System.out.println("Ingrese operador");
            operador = leer.next().charAt(0);
            System.out.println("Ingrese un numero");
            numero2 = leer.nextInt();
            
            switch (operador){
                case '+':
                    resultado = resultado + numero2;
                    break;
                case '-':
                    resultado = resultado - numero2;
                    break;
                case '*':
                    resultado = resultado * numero2;
                    break;
                case '/':
                    resultado = resultado / numero2;
                    break;
                default:
                    System.out.println("Operador incorrecto, no se ejecutara ninguna operación");
                    break;
            }
            do{
                System.out.println("Desea ingresar otro numero? (1=SI, 2=NO)");
                flag = leer.nextInt();
            }while(flag > 2 || flag < 1);
            
        } while (flag == 1);
        
        System.out.println("El resultado de la operación es " + resultado);
    }
    
}
