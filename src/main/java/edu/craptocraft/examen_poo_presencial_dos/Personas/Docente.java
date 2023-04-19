package edu.craptocraft.examen_poo_presencial_dos.Personas;

public class Docente extends Persona {
    
    private String titulacion = "";
    private double numPuntos = 0d;

    public Docente(int id, String nombre, String primerApellido, String segundoApellido, String titulacion, double numPuntos) {
        super(id, nombre, primerApellido, segundoApellido);
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
