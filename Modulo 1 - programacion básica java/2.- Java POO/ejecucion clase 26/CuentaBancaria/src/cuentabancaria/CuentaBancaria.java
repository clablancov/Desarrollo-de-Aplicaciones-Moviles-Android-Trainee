/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre, cta;
        double saldo, deposito;
        int flag = 2, aux = 0, op = 0, op2 = 0;
        //INICIAMOS EL ARRAYLIST cuenta, para alojar objetos de la Clase Cuenta
        ArrayList<Cuenta> cuenta = new ArrayList<Cuenta>();
        
        //Como es sin base de datos, inicializamos los objetos de los clientes desde un inicio, para despues manipularlos
        System.out.println("Ingrese datos de cliente");
        do{
            System.out.println("Nombre Cliente:");
            nombre = leer.nextLine();
            System.out.println("Numero de cuenta");
            cta = leer.nextLine();
            System.out.println("Saldo");
            saldo = leer.nextDouble();
            //Aqui se guarda el objeto creado de la clase cuenta
            cuenta.add(new Cuenta(nombre, cta, saldo));
            System.out.println("Desea ingresar otro cliente (1=SI, 2=NO)");
            flag = leer.nextInt();
            leer.nextLine(); // para solucionar el salto de opcion si se ingresa un nuevo cliente!
        }while(flag == 1); // Se pueden ingresar los que se deseen
        //Menu con sus operaciones
        System.out.println("======MENU========");
        do{
            System.out.println("1.- Realizar deposito");
            System.out.println("2.- Realizar giro");
            System.out.println("3.- Consultar saldo");
            System.out.println("4.- Realizar transferencia");
            System.out.println("5.- Actualizar Datos");
            System.out.println("6.- Salir");

            System.out.println("Escoja una opcion");
            flag = leer.nextInt();
            if(flag != 6){ // este punto se realiza solo cuando la opcion del menu no sea salir
                System.out.println("Escoja la cuenta a manipular: ");
                for(int i = 0; i < cuenta.size(); i++){
                    System.out.println(i + ".- " + cuenta.get(i).getnombreCliente());
                }
                do {
                    op = leer.nextInt();
                    if(op > cuenta.size()){
                        System.out.println("Cliente no existe, favor elegir cliente de la lista");
                    }
                }while (op > cuenta.size());
                
                leer.nextLine(); // para solucionar el salto de opcion si se ingresa un nuevo cliente!
            }
            // Operaciones de la opcion del menu
            switch(flag){
                case 1: // DEPOSITO
                    System.out.println("Ingrese monto de deposito");
                    deposito = leer.nextDouble();
                    cuenta.get(op).deposito(deposito);
                    System.out.println("deposito realizado!");
                    break;
                case 2: // GIRO
                    System.out.println("Saldo cuenta: $" + cuenta.get(op).getsaldo());
                    System.out.println("Ingrese monto del giro");
                    double giro = leer.nextDouble();
                    boolean act = cuenta.get(op).giro(giro);
                    if(act){ // VALIDA QUE EXISTA EL DINERO SUFICIENTE 
                        System.out.println("giro realizado!");
                    }
                    else {
                        System.out.println("Saldo Insuficiente, Saldo en cuenta es de $" + cuenta.get(op).getsaldo());
                    }
                    break;
                case 3: // CONSULTA SALDO
                    System.out.println("Saldo en cuenta es $" + cuenta.get(op).getsaldo());
                    break;
                    
                case 4: // TRANSFERENCIA, UTILIZANDO LOS METODOS DEPOSITO Y GIRO
                    System.out.println("Escoja la cuenta a transferir: "); // ESCOGER CUENTA DE DESTINO DE LA TRANSFERENCIA
                    for(int i = 0; i < cuenta.size(); i++){
                        System.out.println(i + ".- " + cuenta.get(i).getnombreCliente());
                    }
                    do {
                        op2 = leer.nextInt();
                        if(op2 > cuenta.size()){
                            System.out.println("Cliente no existe, favor elegir cliente de la lista");
                        }
                        if(op2 == op){
                            System.out.println("No se puede transferir a si mismo, favor de elegir otro cliente de la lista");
                        }
                    }while (op2 > cuenta.size() && op2 != op); // DEBE SELECCIONAR UN CLEINTE DE LA LISTA, PERO NO PUEDE SER EL MISMO
                    
                    System.out.println("Ingrese monto a transferir");
                    double trans = leer.nextDouble();
                    act = cuenta.get(op).giro(trans); // SE REALIZA EL GIRO EN LA CUENTA DE ORIGEN
                    if(act){ // SI CUENTA CON SALDO SUFICIENTE, REALIZA EL DEPOSITO EN CUENTA DESTINO
                        cuenta.get(op2).deposito(trans); // DEPOSITO EN CUENTA DESTINO
                        System.out.println("TRANFERENCIA DE $" + trans + " Realizada con exito a cuenta de " + cuenta.get(op2).getnombreCliente());
                    }
                    else {
                        System.out.println("SALDO INSUFICIENTE EN CUENTA ORIGEN!");
                    }
                    break;
                    
                case 5: // ACTUALIZACION DE DATOS
                    System.out.println("Ingrese nuevo nombre");
                    nombre = leer.nextLine();
                    System.out.println("Ingrese nuevo numero de cuenta");
                    cta = leer.nextLine();
                    
                    cuenta.get(op).setnombreCliente(nombre);
                    cuenta.get(op).setnroCuenta(cta);
                    System.out.println("Cambios aplicados correctamente!!");
                    
                    break;
                    
                case 6: // SALIR
                    System.out.println("Hasta Luego!!");
                    break;
                    
                default:
                    System.out.println("OPCION INVALIDA!!!!");
                    break;
            }
            
        }while(flag != 6);
    }
    
}
