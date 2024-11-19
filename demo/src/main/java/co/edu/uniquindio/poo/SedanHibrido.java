package co.edu.uniquindio.poo;

public class SedanHibrido extends UrbanoHibrido {

    // Constructor de la clase SedanHibrido
    public SedanHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            Transmision transmision, String matricula, TipoHibrido tipoHibrido, int capacidadMaletero,
            boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, boolean camaraReversa, boolean velocidadCrucero,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentenPermanenciaCarril) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido,
                capacidadMaletero, bolsaDeAire, numeroPuerta, numeroPasajeros, camaraReversa, velocidadCrucero,
                sensorColision, sensorTraficoCruzado, asistentenPermanenciaCarril);
    }

    // Sobrescritura del método toString para proporcionar una representación en texto del objeto
    @Override
    public String toString() {
        return "SedanHibrido []";
    }
}
