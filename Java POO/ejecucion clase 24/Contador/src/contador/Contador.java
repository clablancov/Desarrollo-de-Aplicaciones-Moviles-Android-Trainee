/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int flag = 0, numero = 0;
        System.out.println("Desea dar valor a contador o que inicialice automaticamente? (1=SI, 2=NO)");
        
        flag = leer.nextInt();
        ControlContador cont1;
        if(flag == 1){
            System.out.println("Que valor desea Dar a Contador?");
            numero = leer.nextInt();
            cont1 = new ControlContador(numero);
        }
        else{
            cont1 = new ControlContador();
        }
        
        System.out.println("Aumentamos en 1 el valor de contador");
        cont1.incrementador();
        System.out.println("El valor nuevo de contador es " + cont1.getcont());
        
        System.out.println("Disminuimos en 1 el valor de contador");
        cont1.decrementador();
        System.out.println("El valor nuevo de contador es " + cont1.getcont());
        
        System.out.println("Cambiemos el valor de cntador !!");
        
        System.out.println("Ingrese nuevo numero");
        numero = leer.nextInt();
        
        cont1.setcont(numero);
        System.out.println("El valor nuevo de contador es " + cont1.getcont());
        
        System.out.println("Crear interfaz grafica!! Adios!!");
    }
    
}
