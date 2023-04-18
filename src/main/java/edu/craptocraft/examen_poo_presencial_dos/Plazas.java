package edu.craptocraft.examen_poo_presencial_dos;

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

        // Iterate through the sorted plazas.
        for (Plazas plaza : sortedPlazas) {
            double mejorPuntuacion = 0d;
            Persona mejorEspecialista = null;

            // Find the best specialist for the current plaza.
            for (Persona personaFromList : personasList) {
                personaFromList.setEspecialidad();

                // Docent especialist.
                if (personaFromList.getEspecialidad().equals("D") && (personaFromList.getDocente().getNumPuntos() > mejorPuntuacion)) {
                        mejorPuntuacion = personaFromList.getDocente().getNumPuntos();
                    
                }

                // Sanitary especialist.
                if (personaFromList.getEspecialidad().equals("S") && (personaFromList.getSanitario().getNumDias() > mejorPuntuacion)) {
                        mejorPuntuacion = personaFromList.getSanitario().getNumDias();
                    
                }
            }

            // Assign the specialist to the plaza if found.
            if (mejorPuntuacion != 0d) {
                plaza.setPersona(mejorEspecialista);
                plaza.setAdjudicada();
            }
        }
    }

    public void mostrarAdjudicaciones(Plazas plazaAdjudicada) {
        if (plazaAdjudicada.getTipo().equals("D") && plazaAdjudicada.getPersona() != null) {
            System.out.println("\n\tID Plaza: " + plazaAdjudicada.getId() + 
                                "\n\tTipo: " + plazaAdjudicada.getTipo() + 
                                "\n\tAdjudicada: " + plazaAdjudicada.getAdjudicada() + 
                                "\n\tID Persona: " + plazaAdjudicada.getPersona().getId() + 
                                "\n\tNombre: " + plazaAdjudicada.getPersona().getId() + 
                                "\n\tPrimer apellido: " + plazaAdjudicada.getPersona().getPrimerApellido() + 
                                "\n\tSegundo apellido: " + plazaAdjudicada.getPersona().getSegundoApellido() + 
                                "\n\tTitulación: " + plazaAdjudicada.getPersona().getDocente().getTitulacion() + 
                                "\n\tPuntos: " + plazaAdjudicada.getPersona().getDocente().getNumPuntos());
        }

        if (plazaAdjudicada.getTipo().equals("S") && plazaAdjudicada.getPersona() != null) {
            System.out.println("\n\tID Plaza: " + plazaAdjudicada.getId() + 
                                "\n\tTipo: " + plazaAdjudicada.getTipo() + 
                                "\n\tAdjudicada: " + plazaAdjudicada.getAdjudicada() + 
                                "\n\tID Persona: " + plazaAdjudicada.getPersona().getId() + 
                                "\n\tNombre: " + plazaAdjudicada.getPersona().getNombre() + 
                                "\n\tPrimer apellido: " + plazaAdjudicada.getPersona().getPrimerApellido() + 
                                "\n\tSegundo apellido: " + plazaAdjudicada.getPersona().getSegundoApellido() + 
                                "\n\tEspecialidad: " + plazaAdjudicada.getPersona().getSanitario().getEspacializacion() + 
                                "\n\tDias de experiencia: " + plazaAdjudicada.getPersona().getSanitario().getNumDias());
        }

        if (plazaAdjudicada.getPersona() == null) {
            System.out.println("\n\tID Plaza: " + plazaAdjudicada.getId() + 
                                "\n\tTipo: " + plazaAdjudicada.getTipo() + 
                                "\n\tAdjudicada: " + plazaAdjudicada.getAdjudicada());
        }
    }
    
}
