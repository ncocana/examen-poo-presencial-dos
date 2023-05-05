package edu.craptocraft.examen_poo_presencial_dos.Personas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DocenteTest {

    @Test
    public void test_ConstructorAndGetters() {
        int id = 1;
        String nombre = "John";
        String primerApellido = "Doe";
        String segundoApellido = "Smith";
        String titulacion = "PhD";
        double numPuntos = 10.0;
        Docente docente = new Docente(id, nombre, primerApellido, segundoApellido, titulacion, numPuntos);
        assertEquals(id, docente.getId());
        assertEquals(nombre, docente.getNombre());
        assertEquals(primerApellido, docente.getPrimerApellido());
        assertEquals(segundoApellido, docente.getSegundoApellido());
        assertEquals(titulacion, docente.getTitulacion());
        assertEquals(numPuntos, docente.getNumPuntos(), 0.0);
    }

    @Test
    public void test_SetTitulacion() {
        Persona docente = new Docente(1, "John", "Doe", "Smith", "PhD", 10.0);
        String newTitulacion = "MSc";
        ((Docente) docente).setTitulacion(newTitulacion);
        assertEquals(newTitulacion, ((Docente) docente).getTitulacion());
    }

    @Test
    public void test_SetNumPuntos() {
        Persona docente = new Docente(1, "John", "Doe", "Smith", "PhD", 10.0);
        double puntosToAdd = 5.0;
        ((Docente) docente).setNumPuntos(puntosToAdd);
        assertEquals(15.0, ((Docente) docente).getNumPuntos(), 0.0);
    }
}
