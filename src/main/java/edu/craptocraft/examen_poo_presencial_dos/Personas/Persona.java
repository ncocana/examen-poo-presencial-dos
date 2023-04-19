package edu.craptocraft.examen_poo_presencial_dos.Personas;

public abstract class Persona {
    
    private int id = 0;
    private String nombre = "";
    private String primerApellido = "";
    private String segundoApellido = "";
    private static int contador = 0;

    protected Persona(int id, String nombre, String primerApellido, String segundoApellido) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String newPrimerApellido) {
        this.primerApellido = newPrimerApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String newSegundoApellido) {
        this.segundoApellido = newSegundoApellido;
    }

    public int getContador() {
        return contador;
    }

    public static void setContador() {
        contador++;
    }

}
