package co.edu.uniquindio.poo;

// Definición de la clase Administrador que extiende de Persona
public class Administrador extends Persona{
    
    // Constructor de la clase Administrador
    // Llama al constructor de la clase base (Persona) y pasa los parámetros
    public Administrador(String nombre, int id, int telefono, String correo) {
        super(nombre, id, telefono, correo);
    }

    // Sobrescribe el método toString() para proporcionar una representación en formato de cadena del objeto Administrador
    @Override
    public String toString() {
        return "Administrador []";
    }
}
