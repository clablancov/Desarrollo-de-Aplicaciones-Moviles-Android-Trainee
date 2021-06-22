/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteria;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Paqueteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double precio;
        System.out.println("PAQUETERIA!");
        System.out.println("Ingrese Peso del paquete");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese Zona (1=America del Norte, 2=America Central, 3=America del Sur, 4=Europa, 5=Asia)");
        int zona = leer.nextInt();
        
        if(peso > 5.1){
            System.out.println("Peso excede el permitido por politicas de transporte! no es posible realizar el despacho");
        }
        else{
            switch(zona){
                case 1:
                   precio =  peso * 110;
                   break;
                case 2:
                   precio =  peso * 100;
                   break;
                case 3:
                   precio =  peso * 120;
                   break;
                case 4:
                   precio =  peso * 240;
                   break;
                case 5:
                   precio =  peso * 270;
                   break;
                default:
                    System.out.println("la zona ingresada no esta en nuestros registros");
                    precio = 0;
                    break;
            }
            System.out.println("El precio por el envio es de $" + precio);
        }
    }
    
}
