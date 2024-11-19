package co.edu.uniquindio.poo; // Declaración del paquete en el que se encuentra la clase

// La clase BusCombustible extiende la clase VehiculoCombustible, indicando que hereda sus propiedades y métodos
public class BusCombustible extends VehiculoCombustible {
    // Atributos específicos de la clase BusCombustible
    private int numeroEjes;                // Número de ejes del bus
    private int numeroSalidasEmergencia;   // Número de salidas de emergencia del bus

    // Constructor de la clase BusCombustible que inicializa los atributos heredados y los específicos
    public BusCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, int numeroEjes,
            int numeroSalidasEmergencia) {
        // Llama al constructor de la clase padre (VehiculoCombustible) para inicializar sus atributos
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        // Inicializa los atributos específicos de BusCombustible
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    // Método getter para obtener el número de ejes
    public int getNumeroEjes() {
        return numeroEjes;
    }

    // Método setter para establecer el número de ejes
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    // Método getter para obtener el número de salidas de emergencia
    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    // Método setter para establecer el número de salidas de emergencia
    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    // Método toString que devuelve una representación en forma de cadena del objeto BusCombustible
    @Override
    public String toString() {
        return "BusCombustible [numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia
                + "]"; // Representación del bus con sus atributos
    }
}