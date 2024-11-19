package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase DeportivoCombustible extiende la clase VehiculoCombustible, lo que indica que hereda sus propiedades y métodos
public class DeportivoCombustible extends VehiculoCombustible {

    // Atributos específicos de la clase DeportivoCombustible
    private int numeroPasajeros; // Número de pasajeros que puede transportar el vehículo
    private int numeroPuertas; // Número de puertas del vehículo
    private boolean bolsasAire; // Indica si el vehículo tiene bolsas de aire
    private int caballosFueza; // Potencia del motor en caballos de fuerza
    private double tiempo100KmHr; // Tiempo que tarda el vehículo en alcanzar 100 km/h

    // Constructor de la clase DeportivoCombustible que inicializa los atributos heredados y los específicos
    public DeportivoCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, int numeroPasajeros,
            int numeroPuertas, boolean bolsasAire, int caballosFueza, double tiempo100KmHr) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        // Inicializa los atributos específicos de DeportivoCombustible
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.bolsasAire = bolsasAire;
        this.caballosFueza = caballosFueza;
        this.tiempo100KmHr = tiempo100KmHr;
    }

    // Métodos getter y setter para acceder y modificar los atributos

    public int getNumeroPasajeros() {
        return numeroPasajeros; // Devuelve el número de pasajeros
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros; // Establece el número de pasajeros
    }

    public int getNumeroPuertas() {
        return numeroPuertas; // Devuelve el número de puertas
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas; // Establece el número de puertas
    }

    public boolean isBolsasAire() {
        return bolsasAire; // Devuelve si el vehículo tiene bolsas de aire
    }

    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire; // Establece si el vehículo tiene bolsas de aire
    }

    public int getCaballosFueza() {
        return caballosFueza; // Devuelve la potencia en caballos de fuerza
    }

    public void setCaballosFueza(int caballosFueza) {
        this.caballosFueza = caballosFueza; // Establece la potencia en caballos de fuerza
    }

    public double getTiempo100KmHr() {
        return tiempo100KmHr; // Devuelve el tiempo para alcanzar 100 km/h
    }

    public void setTiempo100KmHr(double tiempo100KmHr) {
        this.tiempo100KmHr = tiempo100KmHr; // Establece el tiempo para alcanzar 100 km/h
    }

    // Método toString que devuelve una representación en forma de cadena del objeto DeportivoCombustible
    @Override
    public String toString() {
        return "DeportivoCombustible [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", bolsasAire=" + bolsasAire + ", caballosFueza=" + caballosFueza + ", tiempo100KmHr=" + tiempo100KmHr
                + "]"; // Devuelve una cadena con los atributos del deportivo
    }
}