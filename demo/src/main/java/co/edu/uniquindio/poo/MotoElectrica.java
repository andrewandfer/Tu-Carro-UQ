package co.edu.uniquindio.poo;

// La clase MotoElectrica representa una moto que utiliza energía eléctrica.
// Extiende la clase VehiculoElectrico, heredando sus características.
public class MotoElectrica extends VehiculoElectrico {

    // Constructor de la clase MotoElectrica.
    // Inicializa una moto eléctrica con los parámetros especificados, incluyendo características de batería.
    public MotoElectrica(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, int autonomiacargacompleta, 
            String tiempodecarga) {
        // Llama al constructor de la clase base (VehiculoElectrico)
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision,
              autonomiacargacompleta, tiempodecarga, matricula);
    }

    // Método toString que devuelve una representación en cadena del objeto MotoElectrica.
    @Override
    public String toString() {
        return "MotoElectrica []"; // Representación simplificada de la moto eléctrica
    }
}