package co.edu.uniquindio.poo;

// La clase MotoHibrida representa una moto que utiliza un sistema híbrido.
// Extiende la clase VehiculoHibrido, heredando sus características.
public class MotoHibrida extends VehiculoHibrido {

    // Constructor de la clase MotoHibrida.
    // Inicializa una moto híbrida con los parámetros especificados.
    public MotoHibrida(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, int autonomiacargacompleta,
            String tiempodecarga, String matricula, TipoHibrido tipoHibrido) {
        // Llama al constructor de la clase base (VehiculoHibrido)
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
    }
}