package co.edu.uniquindio.poo;

public class SedanElectrico extends UrbanoElectrico {

    // Constructor de la clase SedanElectrico
    public SedanElectrico(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            Transmision transmision, String matricula, int autonomiacargacompleta, String tiempodecarga,
            boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentenPermanenciaCarril) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula,
                autonomiacargacompleta, tiempodecarga, velocidadCrucero, sensorColision, sensorTraficoCruzado,
                asistentenPermanenciaCarril);
    }

    // Sobrescritura del método toString para proporcionar una representación en texto del objeto
    @Override
    public String toString() {
        return "SedanElectrico []";
    }
}
