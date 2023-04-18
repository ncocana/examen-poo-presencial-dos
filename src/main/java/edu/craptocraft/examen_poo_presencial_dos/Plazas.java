package edu.craptocraft.examen_poo_presencial_dos;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Plazas {

    private int id = 0;
    private String tipo = "";
    private boolean adjudicada = false;
    private Persona persona = null;

    public Plazas(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String newTipo) {
        this.tipo = newTipo;
    }

    public boolean getAdjudicada() {
        return this.adjudicada;
    }

    public void setAdjudicada() {
        this.adjudicada = true;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona newPersona) {
        this.persona = newPersona;
    }

    public void adjudicarPlazas(List<Plazas> plazasList, List<Persona> personasList) {
        
        // Sort the plazas by order.
        List<Plazas> sortedPlazas = plazasList.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        // Iterate through the plazas.
        for (Plazas plaza : sortedPlazas) {
            double mejorPuntuacion = 0d;
            Persona mejorEspecialista = null;

            // Find the best specialist for the current plaza.
            for (Persona persona : personasList) {
                persona.setEspecialidad();

                // Docent especialist.
                if (persona.getEspecialidad().equals("D")) {
                    if (persona.getDocente().getNumPuntos() > mejorPuntuacion) {
                        mejorPuntuacion = persona.getDocente().getNumPuntos();
                    }
                }

                // Sanitary especialist.
                if (persona.getEspecialidad().equals("S")) {
                    if (persona.getSanitario().getNumDias() > mejorPuntuacion) {
                        mejorPuntuacion = persona.getSanitario().getNumDias();
                    }
                }
            }

            // Assign the specialist to the plaza if found.
            if (mejorPuntuacion != 0d) {
                plaza.setPersona(mejorEspecialista);
                plaza.setAdjudicada();
            }
        }
    }
    
}
