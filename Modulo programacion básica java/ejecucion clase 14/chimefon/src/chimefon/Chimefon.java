/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chimefon;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Chimefon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int minutos = 0,  costollamada = 0;
        double costototal = 0, impuesto = 0;
        
        System.out.println("===========CHISMEFON==============");
        //no permite numeros negativos
        do{
            System.out.println("Ingrese cantidad de minutos hablados");
            minutos = leer.nextInt();
            if(minutos < 0){
                System.out.println("MINUTOS DEBE SER MAYOR A 0!!!");
            }
        }while(minutos < 0);
        int dia = 0;
        
        //otra opcion no dejara avanzar el programa
        do{
            System.out.println("Día hábil o Domingo? [1=AM, 2=PM, 3=DOMINGO]");
            dia = leer.nextInt();
            if(dia > 3 || dia <= 0){
                System.out.println("OPCION INCORRECTA!!");
            }
        }while(dia > 3 || dia <= 0);
        
        if (minutos < 5) {
            costollamada = 100 * minutos;
        }
        else if(minutos >= 5 && minutos < 8){
            costollamada = 5 * 100;
            costollamada = costollamada + ((minutos - 5) * 80);
        }
        else if (minutos >=8 && minutos < 10){
            costollamada = 5 * 100;
            costollamada = costollamada + (3 * 80);
            costollamada = costollamada + ((minutos - 8) * 70);
        }
        else if (minutos >= 10) {
            costollamada = 5 * 100;
            costollamada = costollamada + (3 * 80);
            costollamada = costollamada + (2 * 70);
            costollamada = costollamada + ((minutos - 10) * 50);
        }
        
        switch (dia) {
            case 1:
                impuesto = costollamada * 0.15;
                break;
            case 2:
                impuesto = costollamada * 0.1;
                break;
            default:
                impuesto = costollamada * 0.03;
                break;
        }
        
        costototal = costollamada + impuesto;
        
        System.out.println("El costo de la llamada de " + minutos + " minutos es de $" + costototal);
    }
    
}
