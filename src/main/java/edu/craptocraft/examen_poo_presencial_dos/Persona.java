package edu.craptocraft.examen_poo_presencial_dos;

public class Persona {
    
    private int id = 0;
    private String nombre = "";
    private String primerApellido = "";
    private String segundoApellido = "";
    private static int contador = 0;
    private Docente docente = null;
    private Sanitario sanitario = null;
    private String especialidad = "";

    public Persona(int id, String nombre, String primerApellido, String segundoApellido) {
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

    public Docente getDocente() {
        return this.docente;
    }

    public void setDocente(Docente newDocente) {
        this.docente = newDocente;
    }

    public Sanitario getSanitario() {
        return this.sanitario;
    }

    public void setSanitario(Sanitario newSanitario) {
        this.sanitario = newSanitario;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad() {
        if (this.getSanitario() != null && this.getDocente() == null) {
            this.especialidad = "S";
        }

        if (this.getSanitario() == null && this.getDocente() != null) {
            this.especialidad = "D";
        }
    }

}
