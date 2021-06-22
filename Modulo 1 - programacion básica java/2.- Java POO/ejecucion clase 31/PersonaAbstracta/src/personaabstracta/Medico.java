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
public class Medico extends Persona{
    private String rolColmed, especialidad;

    public Medico(String rolColmed, String especialidad, String nombre, String apellido, String direccion, String email, String telefono, int edad) {
        super(nombre, apellido, direccion, email, telefono, edad);
        this.rolColmed = rolColmed;
        this.especialidad = especialidad;
    }

    public String getRolColmed() {
        return rolColmed;
    }

    public void setRolColmed(String rolColmed) {
        this.rolColmed = rolColmed;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
