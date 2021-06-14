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
public class PersonaAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Medico med = new Medico("12345", "Cirujano", "Claudio", "Blanco", "Un algun lugar del mundo", "cla.blancov@gmail.com", "963712810", 33);
        Profesor prof = new Profesor("4 medio", 45, "Barbara", "Blanco", "enunlugardelmundo #123", "b.blanco@colegio.cl", "963712810", 40, "Lenguaje e Historia");
        
        med.enviarCorreo();
        prof.enviarCorreo();
    }
    
}
