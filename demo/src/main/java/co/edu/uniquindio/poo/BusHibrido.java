package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase BusHibrido extiende la clase AutomovilHibrido, indicando que hereda sus propiedades y métodos
public class BusHibrido extends AutomovilHibrido {
    // Atributos específicos de la clase BusHibrido
    private int numeroEjes;                 // Número de ejes del bus híbrido
    private int numeroSalidasEmergencia;    // Número de salidas de emergencia del bus híbrido

    // Constructor de la clase BusHibrido que inicializa los atributos heredados y los específicos
    public BusHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            Transmision transmision, String matricula, TipoHibrido tipoHibrido, int capacidadMaletero,
            boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, boolean camaraReversa, 
            int numeroEjes, int numeroSalidasEmergencia) {
        // Llama al constructor de la clase padre (AutomovilHibrido) para inicializar sus atributos
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido,
                capacidadMaletero, bolsaDeAire, numeroPuerta, numeroPasajeros, camaraReversa);
        // Inicializa los atributos específicos de BusHibrido
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

    // Método toString que devuelve una representación en forma de cadena del objeto BusHibrido
    @Override
    public String toString() {
        return "BusHibrido [numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia + "]"; 
        // Representación del bus híbrido con sus atributos
    }
}