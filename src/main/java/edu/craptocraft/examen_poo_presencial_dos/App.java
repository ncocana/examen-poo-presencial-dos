package edu.craptocraft.examen_poo_presencial_dos;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.examen_poo_presencial_dos.Personas.Persona;
import edu.craptocraft.examen_poo_presencial_dos.Plazas.Adjudicacion;
import edu.craptocraft.examen_poo_presencial_dos.Plazas.Plazas;

public class App 
{
    public static void main( String[] args )
    {
        Adjudicacion adjudicacion = new Adjudicacion();
        List<Plazas> plazasList = new ArrayList<>();
        List<Persona> personasList = new ArrayList<>();

        adjudicacion.simularAdjudicacion(plazasList, personasList);
        adjudicacion.adjudicarPlazas(plazasList, personasList);
        adjudicacion.mostrarAdjudicaciones(plazasList);
    }
}
