/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clabl
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String titulo, autor;
        int flag = 2, ejemplares, prestados, op = 0;
        boolean act;
        
        ArrayList<Libro> libro = new ArrayList<Libro>();
        
        do{
            System.out.println("Titulo Libro:");
            titulo = leer.nextLine();
            System.out.println("Autor:");
            autor = leer.nextLine();
            System.out.println("ejemplares en stock:");
            ejemplares = leer.nextInt();
            System.out.println("ejemplares prestados:");
            prestados = leer.nextInt();
            //Aqui se guarda el objeto creado de la clase cuenta
            libro.add(new Libro(titulo, autor, ejemplares, prestados));
            System.out.println("Desea ingresar otro libro (1=SI, 2=NO)");
            flag = leer.nextInt();
            leer.nextLine(); // para solucionar el salto de opcion si se ingresa un nuevo cliente!
        }while(flag == 1); // Se pueden ingresar los que se deseen
        
        //Menu con sus operaciones
        System.out.println("======MENU========");
        do {            
            System.out.println("1.- Realizar prestamo");
            System.out.println("2.- Realizar devolucion");
            System.out.println("3.- Actualizar Datos Libro");
            System.out.println("4.- Salir");
            
            System.out.println("Escoja una opcion");
            flag = leer.nextInt();
            
            if(flag != 4){ // este punto se realiza solo cuando la opcion del menu no sea salir
                System.out.println("Escoja la cuenta a manipular: ");
                for(int i = 0; i < libro.size(); i++){
                    System.out.println(i + ".- " + libro.get(i).detalle()); // c1.getnombvreCliente();
                }
                do {
                    op = leer.nextInt();
                    if(op > libro.size()){
                        System.out.println("LIBRO NO EXISTE!!");
                    }
                }while (op > libro.size());
                
                leer.nextLine(); // para solucionar el salto de opcion si se ingresa un nuevo cliente!
            }
            
            switch(flag){
                case 1: // PRESTAMO
                    act = libro.get(op).prestamo();
                    if(act){
                        System.out.println("Prestamo realizado con exito!");
                    }
                    else{
                        System.out.println("Prestamo no realizado. NO queda stock disponible");
                    }
                    break;
                    
                case 2: // DEVOLUCION
                    act = libro.get(op).devolucion();
                    if(act){
                        System.out.println("Devolución realizada con exito!!");
                    }
                    else{
                        System.out.println("No se pudo realizar la devolución, no hay nada que devolver.");
                    }
                    break;
                    
                case 3:
                    // ACTUALIZACION DE DATOS
                    System.out.println("Ingrese nuevo titulo");
                    titulo = leer.nextLine();
                    System.out.println("Ingrese nuevo autor");
                    autor = leer.nextLine();
                    System.out.println("Ingrese stock");
                    ejemplares = leer.nextInt();
                    System.out.println("Ingrese libros en circulación");
                    prestados = leer.nextInt();
                    
                    libro.get(op).setTitulo(titulo);
                    libro.get(op).setAutor(autor);
                    libro.get(op).setEjemplares(ejemplares);
                    libro.get(op).setPrestados(prestados);
                    System.out.println("Cambios aplicados correctamente!!");
                    break;
                    
                case 4:
                    System.out.println("Hasta Luego!!");
                    break;
                    
                default:
                    System.out.println("OPCION INVALIDA!!!!");
                    break;
            }
        } while (flag != 4);
    }
    
}
