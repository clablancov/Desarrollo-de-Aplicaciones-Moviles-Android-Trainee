/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciasif;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Sentenciasif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero9;
        //Ver si un numero es divisible por 9
        System.out.println("Ingrese numero a evaluar");
        numero9 = leer.nextInt();
        if((numero9 % 9) == 0){
            System.out.println("El numero " + numero9 + " es divisible por 9");
        }
        else{
            System.out.println("El numero " + numero9 + " NO es divisible por 9");
        }
        
        // ver si precio sobrepasa presupuesto
        
        int precio, diferencia;
        
        System.out.println("Ingrese valor del producto a evaluar");
        precio = leer.nextInt();
        //presupuesto se emula como rescate de datos de BD
        int presupuesto = 400000;
        
        if(precio >= presupuesto){
            System.out.println("Valor producto sobrepasa presupuesto asignado");
            diferencia = precio - presupuesto;
            System.out.println("Se excede el presupuesto en $" + diferencia);
        }
        else{
            System.out.println("Valor esta dentro del presupuesto asignado");
            diferencia = presupuesto - precio;
            System.out.println("Queda $" + diferencia + " del presupuesto");
        }
        
        //se calcula gramaje de paracetamol segun peso del paciente
        double peso, paracetamol, dosis;
        
        System.out.println("Escribir peso del paciente");
        peso = leer.nextInt();
        
        //se calcula que son 25.5 gramos por peso
        if(peso > 0){
            paracetamol = peso * 25.5;
            if (paracetamol <=1500){
                dosis = paracetamol / 3;
                System.out.println("Se recomienda tomar 3 dosis de paracetamol de " + dosis + "grs.");
            }
            else{
                System.out.println("El valor sobrepasa el valor diario máximo recomendado, recetar otro medicamento");
            }
        }
        else{
            System.out.println("Valor incorrecto de peso, el programa se cerrará");
        }
        
    }
    
}
