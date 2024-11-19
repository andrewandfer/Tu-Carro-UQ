package co.edu.uniquindio.poo;

// Clase AutomovilHibrido que extiende de VehiculoHibrido
public class AutomovilHibrido extends VehiculoHibrido {

    // Atributos específicos del AutomovilHibrido
    private int capacidadMaletero;          // Capacidad del maletero
    private boolean bolsaDeAire;            // Indica si tiene bolsa de aire
    private int numeroPuerta;               // Número de puertas
    private int numeroPasajeros;            // Número de pasajeros
    private boolean camaraReversa;          // Indica si tiene cámara de reversa

    // Constructor de la clase AutomovilHibrido
    public AutomovilHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
                            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido,
                            int capacidadMaletero, boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, 
                            boolean camaraReversa) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
        this.capacidadMaletero = capacidadMaletero;
        this.bolsaDeAire = bolsaDeAire;
        this.numeroPuerta = numeroPuerta;
        this.numeroPasajeros = numeroPasajeros;
        this.camaraReversa = camaraReversa;
    }

    // Métodos getter y setter para capacidadMaletero
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
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

    // Sobrescribe el método toString() para proporcionar una representación en formato de cadena del objeto AutomovilHibrido
    @Override
    public String toString() {
        return "AutomovilHibrido [capacidadMaletero=" + capacidadMaletero + ", bolsaDeAire=" + bolsaDeAire
                + ", numeroPuerta=" + numeroPuerta + ", numeroPasajeros=" + numeroPasajeros + ", camaraReversa="
                + camaraReversa + "]";
    }
}
