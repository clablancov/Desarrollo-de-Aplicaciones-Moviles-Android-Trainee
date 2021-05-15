/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author clabl
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sout = System.out........
        System.out.println("olakease");
        System.out.println("titititititiititti");

        //tipo dato - nombre variable
        byte numero1 = 127, $numero1 = 126;
        short numero2 = 12345, $numero2 = 12345;
        int numero3 = 123456, $numero3 = 123456, suma;
        long numero4 = 1234567890, $numero4 = 1234567890;
        float numero5 = 2.5f, $numero5 = 2.5f;
        double numero6 = 2.5, $numero6 = 2.5;
        char letra1 = 'a', _letra1 = 'b';
        suma = numero3 + $numero3;
        String palabra1 = "Holi", _palabra1 = "quease";

        System.out.println("La variable 1 es " + numero1 + " y el $numero1 es " + $numero1);
        System.out.println("La variable 2 es " + numero2 + " y el $numero1 es " + $numero2);
        System.out.println("La variable 3 es " + numero3 + " y el $numero1 es " + $numero3);
        System.out.println("La variable 4 es " + numero4 + " y el $numero1 es " + $numero4);
        System.out.println("La variable 5 es " + numero5 + " y el $numero1 es " + $numero5);
        System.out.println("La variable 6 es " + numero6 + " y el $numero1 es " + $numero6);
        System.out.println("La variable char letra 1 es " + letra1 + " y el $numero1 es " + _letra1);
        System.out.println("La variable string palabra es " + palabra1 + " y el $numero1 es " + _palabra1);
        System.out.println(suma);
        
    }

}
