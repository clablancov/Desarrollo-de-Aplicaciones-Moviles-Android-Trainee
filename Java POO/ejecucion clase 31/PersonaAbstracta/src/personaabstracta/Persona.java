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
public abstract class Persona {
    private String nombre, apellido, direccion, email, telefono;
    private int edad;

    public Persona(String nombre, String apellido, String direccion, String email, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract String mostrarDatos();
    
    public abstract void llamar();
    
    public abstract void enviarCorreo();
}
