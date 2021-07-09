/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personamintic;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author danie
 */
public class PersonaMintic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonClass inst_persona = new PersonClass();
        Date fecha_actual = new Date();
        DateFormat formato_corto_fecha = new SimpleDateFormat("dd/MM/yyyy");
        inst_persona.setFecha_nacimiento(formato_corto_fecha.format(fecha_actual));
        inst_persona.setNombre_persona("Daniel");
        inst_persona.setCedula(1038985631);
        inst_persona.setNacionalidad("Colombiano");
        inst_persona.setOcupacion("Ingeniero de control");
        inst_persona.setCiudad("Medellin");
        inst_persona.setTelefono(310754593);
        inst_persona.setSede_mintic("Universidad de caldas");
        
        
        System.out.println("    Nombre: " + inst_persona.getNombre_persona()
                +"\n    Fecha de nacimiento: " + inst_persona.getFecha_nacimiento()
                +"\n    Numero de cedula: "+inst_persona.getCedula()
                +"\n    Nacionalidad: " + inst_persona.getNacionalidad()
                +"\n    Ocupación: " + inst_persona.getOcupacion()
                +"\n    Ciudad: " + inst_persona.getCiudad()
                +"\n    Telefono: " + inst_persona.getTelefono()
                +"\n    Sede de estudio Misión TIC: " + inst_persona.getSede_mintic());
    }
    
}
