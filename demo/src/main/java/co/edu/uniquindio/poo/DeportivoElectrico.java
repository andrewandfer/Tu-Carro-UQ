package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase DeportivoElectrico extiende la clase VehiculoElectrico, lo que indica que hereda sus propiedades y métodos
public class DeportivoElectrico extends VehiculoElectrico {

    // Atributos específicos de la clase DeportivoElectrico
    private int numeroPasajeros; // Número de pasajeros que puede transportar el vehículo
    private int numeroPuertas; // Número de puertas del vehículo
    private boolean bolsasAire; // Indica si el vehículo tiene bolsas de aire
    private double caballosFueza; // Potencia del motor en caballos de fuerza
    private double tiempo100KmH; // Tiempo que tarda el vehículo en alcanzar 100 km/h

    // Constructor de la clase DeportivoElectrico que inicializa los atributos heredados y los específicos
    DeportivoElectrico(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, int autonomiacargacompleta, String tiempodecarga,
            int numeroPasajeros, int numeroPuertas, boolean bolsasAire, double caballosFueza, double tiempo100KmH) {
        // Llama al constructor de la clase base VehiculoElectrico
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision,
              autonomiacargacompleta, tiempodecarga, matricula);
        // Inicializa los atributos específicos de DeportivoElectrico
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.bolsasAire = bolsasAire;
        this.caballosFueza = caballosFueza;
        this.tiempo100KmH = tiempo100KmH;
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

    public boolean getBolsasAire() {
        return bolsasAire; // Devuelve si el vehículo tiene bolsas de aire
    }

    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire; // Establece si el vehículo tiene bolsas de aire
    }

    public double getCaballosFueza() {
        return caballosFueza; // Devuelve la potencia en caballos de fuerza
    }

    public void setCaballosFueza(double caballosFueza) {
        this.caballosFueza = caballosFueza; // Establece la potencia en caballos de fuerza
    }

    public double getTiempo100KmH() {
        return tiempo100KmH; // Devuelve el tiempo para alcanzar 100 km/h
    }

    public void setTiempo100KmH(double tiempo100KmH) {
        this.tiempo100KmH = tiempo100KmH; // Establece el tiempo para alcanzar 100 km/h
    }
}