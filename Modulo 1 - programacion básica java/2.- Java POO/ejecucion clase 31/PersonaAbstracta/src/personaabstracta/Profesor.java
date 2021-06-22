/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaabstracta;

/**
 *
 * @author clabl
 */
public class Profesor extends Persona{
    private String jefatura, mencion;
    private int hh;

    public Profesor(String jefatura, int hh, String nombre, String apellido, String direccion, String email, String telefono, int edad, String mencion) {
        super(nombre, apellido, direccion, email, telefono, edad);
        this.jefatura = jefatura;
        this.hh = hh;
        this.mencion = mencion;
    }

    @Override
    public String mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llamar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enviarCorreo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
