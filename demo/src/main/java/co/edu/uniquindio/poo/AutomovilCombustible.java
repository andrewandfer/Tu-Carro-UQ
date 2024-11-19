package co.edu.uniquindio.poo;

// Clase AutomovilCombustible que extiende de VehiculoCombustible
public class AutomovilCombustible extends VehiculoCombustible {

    // Atributos específicos del AutomovilCombustible
    private int capacidadMaletero;          // Capacidad del maletero
    private boolean abs;                    // Sistema de frenos antibloqueo
    private boolean bolsaDeAire;            // Indica si tiene bolsa de aire
    private int numeroPuerta;               // Número de puertas
    private int numeroPasajeros;            // Número de pasajeros
    private boolean camaraReversa;          // Indica si tiene cámara de reversa
    private boolean aireAcondicionado;      // Indica si tiene aire acondicionado

    // Constructor de la clase AutomovilCombustible
    public AutomovilCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, int capacidadMaletero,
            boolean abs, boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, boolean camaraReversa,
            boolean aireAcondicionado) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.capacidadMaletero = capacidadMaletero;
        this.abs = abs;
        this.bolsaDeAire = bolsaDeAire;
        this.numeroPuerta = numeroPuerta;
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

    // Métodos getter y setter para numeroPuerta
    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
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

    // Sobrescribe el método toString() para proporcionar una representación en formato de cadena del objeto AutomovilCombustible
    @Override
    public String toString() {
        return "AutomovilCombustible [capacidadMaletero=" + capacidadMaletero + ", abs=" + abs + ", bolsaDeAire="
                + bolsaDeAire + ", numeroPuerta=" + numeroPuerta + ", numeroPasajeros=" + numeroPasajeros
                + ", camaraReversa=" + camaraReversa + ", aireAcondicionado=" + aireAcondicionado + "]";
    }
}
