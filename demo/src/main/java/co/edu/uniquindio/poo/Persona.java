package co.edu.uniquindio.poo;

// La clase Persona representa a una persona con información básica como nombre, ID, teléfono y correo.
public class Persona {

    private String nombre;   // Nombre de la persona
    private int id;         // Identificación única de la persona
    private int telefono;    // Número de teléfono de la persona
    private String correo;   // Correo electrónico de la persona

    // Constructor de la clase Persona.
    // Inicializa una nueva persona con el nombre, ID, teléfono y correo especificados.
    public Persona(String nombre, int id, int telefono, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Método getter para obtener el nombre de la persona.
    public String getNombre() {
        return nombre; // Devuelve el nombre
    }

    // Método setter para establecer el nombre de la persona.
    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el nombre
    }

    // Método getter para obtener el ID de la persona.
    public int getId() {
        return id; // Devuelve el ID
    }

    // Método setter para establecer el ID de la persona.
    public void setId(int id) {
        this.id = id; // Establece el ID
    }

    // Método getter para obtener el número de teléfono de la persona.
    public int getTelefono() {
        return telefono; // Devuelve el teléfono
    }

    // Método setter para establecer el número de teléfono de la persona.
    public void setTelefono(int telefono) {
        this.telefono = telefono; // Establece el teléfono
    }

    // Método getter para obtener el correo electrónico de la persona.
    public String getCorreo() {
        return correo; // Devuelve el correo
    }

    // Método setter para establecer el correo electrónico de la persona.
    public void setCorreo(String correo) {
        this.correo = correo; // Establece el correo
    }

    // Método toString que devuelve una representación en cadena del objeto Persona.
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", id=" + id + ", telefono=" + telefono + ", correo=" + correo + "]"; // Representa la persona
    }
}