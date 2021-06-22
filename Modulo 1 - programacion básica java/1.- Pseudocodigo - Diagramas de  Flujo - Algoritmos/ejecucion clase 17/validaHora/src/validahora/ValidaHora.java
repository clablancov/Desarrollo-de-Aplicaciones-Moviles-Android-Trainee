/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validahora;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class ValidaHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int hora, minutos, segundos, flag = 0;
        
        System.out.println("Ingresar Hora");
        hora = leer.nextInt();
        System.out.println("Ingresar Minutos");
        minutos = leer.nextInt();
        System.out.println("Ingresar Segundos");
        segundos = leer.nextInt();
        
        do {            
            if(hora >= 0 && hora < 24){
                //System.out.println("Hora Correcta");
                flag = 0;
            }
            else{
                System.out.println("ERROR!! Debe ingresar nuevamente el campo hora");
                hora = leer.nextInt();
                flag = 1;
            }
            if(minutos >= 0 && minutos <= 59){
                //System.out.println("Minutos Correctos");
                flag = 0;
            }
            else {
                System.out.println("ERROR!! Debe ingresar nuevamente el campo minutos");
                minutos = leer.nextInt();
                flag = 1;
            }
            if(segundos >= 0 && segundos <= 59){
                //System.out.println("Minutos Correctos");
                flag = 0;
            }
            else {
                System.out.println("ERROR!! Debe ingresar nuevamente el campo segundos");
                segundos = leer.nextInt();
                flag = 1;
            }
        } while (flag > 0);
        
        System.out.println("La hora correcta ingresada es: " + hora + ":" + minutos + ":" + segundos);
    }
    
}
