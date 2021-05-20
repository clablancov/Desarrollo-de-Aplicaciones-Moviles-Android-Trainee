/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejercicio 1");
        int mes;
        System.out.println("Transformar numeros a meses");
        do{
            System.out.println("Ingrese mes:");
            mes = leer.nextInt();
        }while (mes < 0 || mes > 12);
        
        switch(mes){
            case 1:
                System.out.println("El mes es ENERO");
                break;
            case 2:
                System.out.println("El mes es FEBRERO");
                break;
            case 3:
                System.out.println("El mes es MARZO");
                break;
            case 4:
                System.out.println("El mes es ABRIL");
                break;
            case 5:
                System.out.println("El mes es MAYO");
                break;
            case 6:
                System.out.println("El mes es JUNIO");
                break;
            case 7:
                System.out.println("El mes es JULIO");
                break;
            case 8:
                System.out.println("El mes es AGOSTO");
                break;
            case 9:
                System.out.println("El mes es SEPTIEMBRE");
                break;
            case 10:
                System.out.println("El mes es OCTUBRE");
                break;
            case 11:
                System.out.println("El mes es NOVIEMBRE");
                break;
            case 12:
                System.out.println("El mes es DICIEMBRE");
                break;
        }
        System.out.println("========================================");
        System.out.println("Ejercicio 2");
        System.out.println("Definir que tarjeta de credito es");
        int tarjeta;
        do{
            System.out.println("Ingrese los primero 4 numeros de su tarjeta de credito");
            tarjeta = leer.nextInt();
        }while(tarjeta < 4210 || tarjeta > 8790);
        
        switch(tarjeta){
            case 4210:
                System.out.println("Su tarjeta es VISA");
                break;
            case 5592:
                System.out.println("Su tarjeta es MASTERCARD");
                break;
            case 6380:
                System.out.println("Su tarjeta es DINNERS CLUB");
                break;
            case 8790:
                System.out.println("Su tarjeta es RIPLEY");
                break;
            default:
                System.out.println("No tenemos registros de su emisor de tarjeta!");
                break;
        }
        
        
    }
    
}
