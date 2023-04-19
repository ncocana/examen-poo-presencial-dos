package edu.craptocraft.examen_poo_presencial_dos.Personas;

public class Sanitario extends Persona {
    
    private String especializacion = "";
    private int numDias = 0;

    public Sanitario(int id, String nombre, String primerApellido, String segundoApellido, String especializacion, int numDias) {
        super(id, nombre, primerApellido, segundoApellido);
        this.especializacion = especializacion;
        this.numDias = numDias;
    }

    public String getEspacializacion() {
        return this.especializacion;
    }

    private void setEspecializacion(String newEspecializacion) {
        this.especializacion = newEspecializacion;
    }

    public int getNumDias() {
        return this.numDias;
    }

    private void setNumDias(int newNumDias) {
        this.numDias = newNumDias;
    }

}
