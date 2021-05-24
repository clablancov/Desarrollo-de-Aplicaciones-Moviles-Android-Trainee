/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedionotas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Promedionotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contador = 0, flag = 0;
        double sumatoria = 0, nota, promedio;
        
        do{
            System.out.println("Ingrese Nota");
            nota = leer.nextDouble();
            sumatoria = sumatoria + nota;
            contador++;
            do{
                System.out.println("Desea ingresar otra nota? (1=SI, 2=NO)");
                flag = leer.nextInt();
            }while(flag > 2 || flag < 1);
        }while (flag == 1);
        
        promedio = sumatoria / contador;
        DecimalFormat df = new DecimalFormat();
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("El promedio de notas es " + df.format(promedio));
    }
    
}
