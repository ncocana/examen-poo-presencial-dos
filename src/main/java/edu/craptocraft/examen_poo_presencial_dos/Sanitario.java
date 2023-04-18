package edu.craptocraft.examen_poo_presencial_dos;

public class Sanitario {
    
    private String especializacion = "";
    private int numDias = 0;

    public Sanitario(String especializacion, int numDias) {
        this.especializacion = especializacion;
        this.numDias = numDias;
    }

    public String getEspacializacion() {
        return this.especializacion;
    }

    public void setEspecializacion(String newEspecializacion) {
        this.especializacion = newEspecializacion;
    }

    public int getNumDias() {
        return this.numDias;
    }

    public void setNumDias(int newNumDias) {
        this.numDias = newNumDias;
    }

}
