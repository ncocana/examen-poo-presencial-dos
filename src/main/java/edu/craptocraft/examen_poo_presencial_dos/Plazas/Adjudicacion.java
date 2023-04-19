package edu.craptocraft.examen_poo_presencial_dos.Plazas;

import java.util.List;

import edu.craptocraft.examen_poo_presencial_dos.Personas.Docente;
import edu.craptocraft.examen_poo_presencial_dos.Personas.Persona;
import edu.craptocraft.examen_poo_presencial_dos.Personas.Sanitario;

public class Adjudicacion {
    
    public void adjudicarPlazas(List<Plazas> plazasList, List<Persona> personasList) {
        
        // Iterate through the sorted plazas.
        for (Plazas plaza : plazasList) {
            double mejorPuntuacion = 0d;
            Persona mejorCandidato = null;

            // Find the best candidate for the current plaza.
            for (Persona personaFromList : personasList) {

                // Docent especialist.
                if (personaFromList instanceof Docente && ((Docente) personaFromList).getNumPuntos() > mejorPuntuacion) {
                        mejorPuntuacion = ((Docente) personaFromList).getNumPuntos();
                        mejorCandidato = personaFromList;
                }

                // Sanitary especialist.
                if (personaFromList instanceof Sanitario && ((Sanitario) personaFromList).getNumDias() > mejorPuntuacion) {
                        mejorPuntuacion = ((Sanitario) personaFromList).getNumDias();
                        mejorCandidato = personaFromList;
                }
            }

            // Assign the specialist to the plaza if found.
            if (mejorCandidato != null && mejorPuntuacion != 0d) {
                plaza.setPersona(mejorCandidato);
                plaza.setAdjudicada(true);
                personasList.remove(mejorCandidato);
            }
        }
    }

    public void mostrarAdjudicaciones(List<Plazas> plazasList) {
        System.out.println("\n============================================");
        System.out.println("La última adjudicación de plazas ha producido");
        System.out.println("los siguientes resultados para DOCENTES");
        System.out.println("============================================\n");

        for (Plazas plaza : plazasList) {
            if (plaza.getTipo().equals("D")) {
                System.out.println(plaza.toString());
            }
        }

        System.out.println("\n=============================================");
        System.out.println("La última adjudicación de plazas ha producido");
        System.out.println("los siguientes resultados para SANITARIOS");
        System.out.println("=============================================\n");

        for (Plazas plaza : plazasList) {
            if (plaza.getTipo().equals("S")) {
                System.out.println(plaza.toString());
            }
        }
    }

    public void simularAdjudicacion(List<Plazas> plazasList, List<Persona> personasList) {

        Plazas plazaPalma = new Plazas(0,"D");
		Plazas plazaCiutadella = new Plazas(1,"S");
		Plazas plazaInca = new Plazas(2,"D");
		Plazas plazaMahon = new Plazas(3,"S");
		Plazas plazaMuro = new Plazas(4,"D");
		Plazas plazaLlubi = new Plazas(5,"S");
		Plazas plazaSineu = new Plazas(6,"D");
		Plazas plazaSaPobla = new Plazas(7,"S");
		Plazas plazaFormentera = new Plazas(8,"D");
		Plazas plazaMarratxi = new Plazas(9,"S");
		
		plazasList.add(plazaPalma);
		plazasList.add(plazaCiutadella);
		plazasList.add(plazaInca);
		plazasList.add(plazaMahon);
		plazasList.add(plazaMuro);
		plazasList.add(plazaLlubi);
		plazasList.add(plazaSineu);
		plazasList.add(plazaSaPobla);
		plazasList.add(plazaFormentera);
		plazasList.add(plazaMarratxi);

        Persona personaUno = new Sanitario(1, "Noa", "Cocaña", "Macías", "Psiquiatría", 5);
        Persona personaDos = new Sanitario(2, "Jose", "Apellido1", "Apellido2", "Cardiología", 10);
        Persona personaTres = new Sanitario(3, "Amin", "Apellido1", "Apellido2", "Nutrición", 15);
        Persona personaCuatro = new Docente(4, "Amin", "Apellido1", "Apellido2", "Grado", 15);
        Persona personaCinco = new Docente(5, "Adrian", "Apellido1", "Apellido2", "Master", 10);
        Persona personaSeis = new Docente(6, "Abel", "Apellido1", "Apellido2", "Doctorado", 5);

        personasList.add(personaUno);
        personasList.add(personaDos);
        personasList.add(personaTres);
        personasList.add(personaCuatro);
        personasList.add(personaCinco);
        personasList.add(personaSeis);

    }

}
