package edu.craptocraft.examen_poo_presencial_dos.Plazas;

import edu.craptocraft.examen_poo_presencial_dos.Personas.Docente;
import edu.craptocraft.examen_poo_presencial_dos.Personas.Persona;
import edu.craptocraft.examen_poo_presencial_dos.Personas.Sanitario;

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

    public void setAdjudicada(boolean value) {
        this.adjudicada = value;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona newPersona) {
        this.persona = newPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------------------------------------")
        .append("\nID Plaza: ").append(this.getId())
        .append("\nTipo: ").append(this.getTipo());

        if (this.getAdjudicada()) {
            Persona personaAdjudicada = this.getPersona();
            sb.append("\nAdjudicada: ADJUDICADA")
            .append("\nID Persona: ").append(personaAdjudicada.getId())
            .append("\nNombre: ").append(personaAdjudicada.getNombre())
            .append("\nApellido1: ").append(personaAdjudicada.getPrimerApellido())
            .append("\nApellido2: ").append(personaAdjudicada.getSegundoApellido());
            if (personaAdjudicada instanceof Docente) {
                Docente docente = (Docente) personaAdjudicada;
                sb.append("\nTitulación: ").append(docente.getTitulacion())
                .append("\nPuntos: ").append(docente.getNumPuntos());
            }
            if (personaAdjudicada instanceof Sanitario) {
                Sanitario sanitario = (Sanitario) personaAdjudicada;
                sb.append("\nEspecialidad: ").append(sanitario.getEspacializacion())
                .append("\nDias de experiencia: ").append(sanitario.getNumDias());
            }
        } else {
            sb.append("\nAdjudicada: NO ADJUDICADA");
        }

        return sb.toString();
    }
    
}
