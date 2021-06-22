/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int flag = 1, opcion, abono = 0, giro = 0;
        
        int saldo = 1000000;
        System.out.println("========== C A J E R R O B O N =================");
        System.out.println("Bienvenido Elija una opción:");
        do {           
            System.out.println("(1) - CONSULTAR SALDO");
            System.out.println("(2) - REALIZAR ABONO");
            System.out.println("(3) - REALIZAR GIRO");
            System.out.println("(4) - CERRAR PROGRAMA");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("El saldo en cuenta es de " + saldo);
                break;
                case 2:
                    System.out.println("Ingrese monto del abono");
                    abono = leer.nextInt();
                    saldo = saldo + abono;
                    System.out.println("== A B O N O    A U T O R I Z A D O ===");
                    System.out.println("El saldo actualizado es de $" + saldo);
                break;
                case 3:
                    do{
                       System.out.println("Ingrese monto del giro");
                        giro = leer.nextInt();
                        if (giro <= saldo){
                            saldo = saldo - giro;
                            System.out.println("== G I R O    A U T O R I Z A D O ===");
                            System.out.println("El saldo actualizado es de $" + saldo);
                        }
                        else {
                            System.out.println("Saldo Insuficiente!! el giro debe ser igual o menor a $" + saldo);
                        } 
                    }while(giro > saldo);
                    
                break;
                case 4:
                    flag = 2;
                break;
                default:
                    System.out.println("Opción Incorrecta!");
                    break;
            }
            
            do{
                if(flag < 2){
                    System.out.println("Desea realizar otra operación? (1=SI, 2=NO)");
                    flag = leer.nextInt();
                }
            }while(flag > 2 || flag < 1);
        } while (flag == 1);
        
    }
    
}
