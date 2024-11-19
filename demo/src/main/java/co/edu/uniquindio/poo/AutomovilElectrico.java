package co.edu.uniquindio.poo;

// Definición de la clase AutomovilElectrico que extiende de VehiculoElectrico
public class AutomovilElectrico extends VehiculoElectrico {

    // Atributos específicos del AutomovilElectrico
    private int capacidadMaletero;          // Capacidad del maletero en litros
    private boolean abs;                    // Indica si tiene sistema de frenos antibloqueo (ABS)
    private boolean bolsaDeAire;            // Indica si tiene bolsas de aire
    private int numeroPuertas;              // Número de puertas del automóvil
    private int numeroPasajeros;            // Capacidad de pasajeros
    private boolean camaraReversa;          // Indica si tiene cámara de reversa
    private boolean aireAcondicionado;      // Indica si tiene aire acondicionado

    // Constructor de la clase AutomovilElectrico
    AutomovilElectrico(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, int autonomiacargacompleta, String tiempodecarga,
            int capacidadMaletero, boolean abs, boolean bolsaDeAire, int numeroPuertas, int numeroPasajeros,
            boolean camaraReversa, boolean aireAcondicionado) {
        // Llama al constructor de la clase base (VehiculoElectrico) e inicializa sus atributos
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, autonomiacargacompleta,
                tiempodecarga, matricula);

        // Inicializa los atributos específicos del AutomovilElectrico
        this.capacidadMaletero = capacidadMaletero;
        this.abs = abs;
        this.bolsaDeAire = bolsaDeAire;
        this.numeroPuertas = numeroPuertas;
        this.numeroPasajeros = numeroPasajeros;
        this.camaraReversa = camaraReversa;
        this.aireAcondicionado = aireAcondicionado;
    }

    // Métodos getter y setter para capacidadMaletero
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    // Métodos getter y setter para abs
    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    // Métodos getter y setter para bolsaDeAire
    public boolean isBolsaDeAire() {
        return bolsaDeAire;
    }

    public void setBolsaDeAire(boolean bolsaDeAire) {
        this.bolsaDeAire = bolsaDeAire;
    }

    // Métodos getter y setter para numeroPuertas
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // Métodos getter y setter para numeroPasajeros
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    // Métodos getter y setter para camaraReversa
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    // Métodos getter y setter para aireAcondicionado
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    // Sobrescribe el método toString() para proporcionar una representación en formato de cadena del objeto AutomovilElectrico
    @Override
    public String toString() {
        return "AutomovilElectrico [capacidadMaletero=" + capacidadMaletero + ", abs=" + abs + ", bolsaDeAire="
                + bolsaDeAire + ", numeroPuertas=" + numeroPuertas + ", numeroPasajeros=" + numeroPasajeros
                + ", camaraReversa=" + camaraReversa + ", aireAcondicionado=" + aireAcondicionado + "]";
    }
}
