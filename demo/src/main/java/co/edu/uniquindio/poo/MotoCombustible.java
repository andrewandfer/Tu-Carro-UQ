package co.edu.uniquindio.poo;

// La clase MotoCombustible representa una moto que utiliza combustible.
// Extiende la clase VehiculoCombustible, heredando sus características.
public class MotoCombustible extends VehiculoCombustible {

    // Constructor de la clase MotoCombustible.
    // Inicializa una moto con los parámetros especificados, incluyendo el tipo de combustible.
    public MotoCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula) {
        // Llama al constructor de la clase base (VehiculoCombustible)
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
    }

    // Método toString que devuelve una representación en cadena del objeto MotoCombustible.
    @Override
    public String toString() {
        return "MotoCombustible []"; // Representación simplificada de la moto
    }
}