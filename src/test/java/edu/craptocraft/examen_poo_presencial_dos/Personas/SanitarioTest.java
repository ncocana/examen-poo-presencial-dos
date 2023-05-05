package edu.craptocraft.examen_poo_presencial_dos.Personas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SanitarioTest {
    
    @Test
    public void test_ConstructorAndGetters() {
        int id = 1;
        String nombre = "John";
        String primerApellido = "Doe";
        String segundoApellido = "Smith";
        String especializacion = "Cardiología";
        int numDias = 5;
        Sanitario sanitario = new Sanitario(id, nombre, primerApellido, segundoApellido, especializacion, numDias);
        assertEquals(id, sanitario.getId());
        assertEquals(nombre, sanitario.getNombre());
        assertEquals(primerApellido, sanitario.getPrimerApellido());
        assertEquals(segundoApellido, sanitario.getSegundoApellido());
        assertEquals(especializacion, sanitario.getEspacializacion());
        assertEquals(numDias, sanitario.getNumDias());
    }

    @Test
    public void test_SetEspecializacion() {
        Persona sanitario = new Sanitario(1, "John", "Doe", "Smith", "Cardiología", 5);
        String newEspecializacion = "Oftalmología";
        ((Sanitario) sanitario).setEspecializacion(newEspecializacion);
        assertEquals(newEspecializacion, ((Sanitario) sanitario).getEspacializacion());
    }

    @Test
    public void test_SetNumDias() {
        Persona sanitario = new Sanitario(1, "John", "Doe", "Smith", "Cardiología", 5);
        int newNumDias = 10;
        ((Sanitario) sanitario).setNumDias(newNumDias);
        assertEquals(newNumDias, ((Sanitario) sanitario).getNumDias());
    }

}
