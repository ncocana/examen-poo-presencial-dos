package edu.craptocraft.examen_poo_presencial_dos.Plazas;

import edu.craptocraft.examen_poo_presencial_dos.Personas.Docente;
import edu.craptocraft.examen_poo_presencial_dos.Personas.Persona;
import edu.craptocraft.examen_poo_presencial_dos.Personas.Sanitario;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlazasTest {

    @Test
    public void testConstructorAndGetters() {
        int id = 1;
        String tipo = "tipo1";
        Plazas plaza = new Plazas(id, tipo);
        assertEquals(id, plaza.getId());
        assertEquals(tipo, plaza.getTipo());
        assertFalse(plaza.getAdjudicada());
        assertNull(plaza.getPersona());
    }

    @Test
    public void testSettersAndGetters() {
        Plazas plaza = new Plazas(1, "tipo1");
        Persona persona = new Docente(1, "nombre", "apellido1", "apellido2", "titulacion", 10);
        plaza.setAdjudicada(true);
        plaza.setPersona(persona);
        assertTrue(plaza.getAdjudicada());
        assertEquals(persona, plaza.getPersona());
    }

    @Test
    public void testToStringNoAdjudicada() {
        Plazas plaza = new Plazas(1, "tipo1");
        String expected = "\n------------------------------------\n" +
                "ID Plaza: 1\n" +
                "Tipo: tipo1\n" +
                "Adjudicada: NO ADJUDICADA";
        assertEquals(expected, plaza.toString());
    }

    @Test
    public void testToStringDocenteAdjudicada() {
        Plazas plaza = new Plazas(1, "tipo1");
        Persona persona = new Docente(1, "nombre", "apellido1", "apellido2", "titulacion", 10);
        plaza.setAdjudicada(true);
        plaza.setPersona(persona);
        String expected = "\n------------------------------------\n" +
                "ID Plaza: 1\n" +
                "Tipo: tipo1\n" +
                "Adjudicada: ADJUDICADA\n" +
                "ID Persona: 1\n" +
                "Nombre: nombre\n" +
                "Apellido1: apellido1\n" +
                "Apellido2: apellido2\n" +
                "Titulación: titulacion\n" +
                "Puntos: 10.0";
        assertEquals(expected, plaza.toString());
    }

    @Test
    public void testToStringSanitarioAdjudicada() {
        Plazas plaza = new Plazas(1, "tipo1");
        Persona persona = new Sanitario(1, "nombre", "apellido1", "apellido2", "especializacion", 20);
        plaza.setAdjudicada(true);
        plaza.setPersona(persona);
        String expected = "\n------------------------------------\n" +
                "ID Plaza: 1\n" +
                "Tipo: tipo1\n" +
                "Adjudicada: ADJUDICADA\n" +
                "ID Persona: 1\n" +
                "Nombre: nombre\n" +
                "Apellido1: apellido1\n" +
                "Apellido2: apellido2\n" +
                "Especialidad: especializacion\n" +
                "Dias de experiencia: 20";
        assertEquals(expected, plaza.toString());
    }

}
