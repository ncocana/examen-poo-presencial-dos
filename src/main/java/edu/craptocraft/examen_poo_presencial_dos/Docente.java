package edu.craptocraft.examen_poo_presencial_dos;

public class Docente {
    
    private String titulacion = "";
    private double numPuntos = 0d;

    public Docente(String titulacion, double numPuntos) {
        this.titulacion = titulacion;
        this.numPuntos = numPuntos;
    }

    public String getTitulacion() {
        return this.titulacion;
    }

    public void setTitulacion(String newTitulacion) {
        this.titulacion = newTitulacion;
    }

    public double getNumPuntos() {
        return this.numPuntos;
    }

    public void setNumPuntos(double puntos) {
        this.numPuntos += puntos;
    }

}
