/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author clabl
 */
public class Cuenta {
    private String nombreCliente, nroCuenta;
    private double saldo;
    //Constructor Generico, asigna valores por defecto a atributos
    public Cuenta(){
        this.nombreCliente = "Generico";
        this.nroCuenta = "000000000";
        this.saldo = 0;
    }
    // Constructor con parametros, a designar en los atributos
    public Cuenta(String nombreCliente, String nroCuenta, double saldo){
        this.nombreCliente = nombreCliente;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    // GETTERS AND SETTERS de los atributos
    public void setnombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public String getnombreCliente(){
        return this.nombreCliente;
    }
    public void setnroCuenta(String nroCuenta){
        this.nroCuenta = nroCuenta;
    }
    public String getnroCuenta(){
        return this.nroCuenta;
    }
    public void setsaldo(double saldo){
        if(saldo > 0){
            this.saldo = saldo;
        }
    }
    public double getsaldo(){
        return this.saldo;
    }
    // Suma el deposito a la cuenta del cliente
    public void deposito(double deposito){
        this.saldo += deposito;
    }
    
    //crea giro de dinero de la cuenta, valida que la cuenta tenga saldo suficiente
    public boolean giro (double giro){
        boolean flag = true;
        if(giro <= this.saldo){
            this.saldo -= giro;
        }
        else {
            flag = false;
        }
        
        return flag;
    }
}
