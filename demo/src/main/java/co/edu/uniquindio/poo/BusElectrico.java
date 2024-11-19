package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase BusElectrico extiende la clase AutomovilElectrico, indicando que hereda sus propiedades y métodos
public class BusElectrico extends AutomovilElectrico {
    // Atributos específicos de la clase BusElectrico
    public int numeroEjes;                  // Número de ejes del bus eléctrico
    public int numeroSalidasEmergencia;     // Número de salidas de emergencia del bus eléctrico

    // Constructor de la clase BusElectrico que inicializa los atributos heredados y los específicos
    BusElectrico(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, int autonomiacargacompleta, 
            String tiempodecarga, int capacidadMaletero, boolean abs, boolean bolsaDeAire, 
            int numeroPuertas, int numeroPasajeros, boolean camaraReversa, boolean aireAcondicionado, 
            int numeroEjes, int numeroSalidasEmergencia) {
        // Llama al constructor de la clase padre (AutomovilElectrico) para inicializar sus atributos
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, 
                autonomiacargacompleta, tiempodecarga, capacidadMaletero, abs, bolsaDeAire, 
                numeroPuertas, numeroPasajeros, camaraReversa, aireAcondicionado);
        // Inicializa los atributos específicos de BusElectrico
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
}