/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author clabl
 */
public class ControlContador {
    public int cont;
    
    public ControlContador(){
        this.cont = 0;
    }
    
    public ControlContador(int cont){
        if(cont >= 0){
            this.cont = cont;
        }
        else{
            this.cont = 0;
            System.out.println("El valor de contador no puede ser menor que 0, se ha inicializado en 0");
        }
    }
    
    public int getcont(){
        return this.cont;
    }
    
    public void setcont(int cont){
        if(cont >= 0){
            this.cont = cont;
        }
        else{
            System.out.println("El valor ingresado no puede ser menor que 0 (" + cont +"), por lo tanto, no se actualizo el valor, quedando en " + this.cont);
        }
    }
    
    public void incrementador(){
        this.cont++;
    }
    
    public void decrementador(){
        if(this.cont == 0){
            System.out.println("El valor de contador es 0, no puede ser decrementando su valor!");           
        }
        else{
            this.cont--;
        }
    }
}
