/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author clabl
 */
public class Libro {
    private String titulo, autor;
    private int ejemplares, prestados;
    
    public Libro(){
        this.titulo = "titulo Libro";
        this.autor = "Autor";
        this.ejemplares = 0;
        this.prestados = 0;
    }
    
    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    
    //GETTERS AND SETTERS
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getEjemplares(){
        return this.ejemplares;
    }
    
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }
    public int getPrestados(){
        return this.prestados;
    }
    
    public void setPrestados(int prestados){
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        boolean flag = true;
        if (this.prestados < this.ejemplares && this.prestados > 0 ){
            this.prestados ++;
        }
        else {
            flag = false;
        }
        return flag;
    }
    
    public boolean devolucion(){
        boolean flag = true;
        
        if(this.prestados < this.ejemplares  && this.prestados > 0){
            this.prestados--;
        }
        else{
            flag = false;
        }
        
        return flag;
    }
    
    public String detalle(){
        String ejemplar = getTitulo() + "- Autor: " + getAutor() + "(Stock: " + getEjemplares() + " // Disponibles: " + (getEjemplares() - getPrestados()) + ")";
        return ejemplar;
    }
}
