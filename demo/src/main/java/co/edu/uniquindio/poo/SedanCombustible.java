package co.edu.uniquindio.poo;

public class SedanCombustible extends UrbanoCombustible {

    // Constructor de la clase SedanCombustible
    public SedanCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula,
            boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentenPermanenciaCarril) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula,
                velocidadCrucero, sensorColision, sensorTraficoCruzado, asistentenPermanenciaCarril);
    }

    // Sobrescritura del método toString para proporcionar una representación en texto del objeto
    @Override
    public String toString() {
        return "SedanCombustible []";
    }
}
