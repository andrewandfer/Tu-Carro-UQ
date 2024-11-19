package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase CamionetaHibrida extiende la clase UrbanoHibrido, indicando que hereda sus propiedades y métodos
public class CamionetaHibrida extends UrbanoHibrido {
    // Atributo específico de la clase CamionetaHibrida
    private boolean cuatroxcuatro; // Indica si la camioneta tiene tracción en las cuatro ruedas

    // Constructor de la clase CamionetaHibrida que inicializa los atributos heredados y el específico
    public CamionetaHibrida(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido,
            int capacidadMaletero, boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, boolean camaraReversa,
            boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentenPermanenciaCarril, boolean cuatroxcuatro) {
        // Llama al constructor de la clase padre (UrbanoHibrido) para inicializar sus atributos
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido,
                capacidadMaletero, bolsaDeAire, numeroPuerta, numeroPasajeros, camaraReversa, velocidadCrucero,
                sensorColision, sensorTraficoCruzado, asistentenPermanenciaCarril);
        // Inicializa el atributo específico de CamionetaHibrida
        this.cuatroxcuatro = cuatroxcuatro;
    }

    // Método getter para obtener el estado de la tracción en las cuatro ruedas
    public boolean isCuatroxcuatro() {
        return cuatroxcuatro; // Devuelve si la camioneta tiene tracción en las cuatro ruedas
    }

    // Método setter para establecer el estado de la tracción en las cuatro ruedas
    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro; // Establece si la camioneta tiene tracción en las cuatro ruedas
    }

    // Método toString que devuelve una representación en forma de cadena del objeto CamionetaHibrida
    @Override
    public String toString() {
        return "CamionetaHibrida [cuatroxcuatro=" + cuatroxcuatro + "]"; // Representación de la camioneta híbrida con su atributo
    }
}