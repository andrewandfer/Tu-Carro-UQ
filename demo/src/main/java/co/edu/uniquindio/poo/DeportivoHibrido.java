package co.edu.uniquindio.poo;

// La clase DeportivoHibrido representa un vehículo híbrido deportivo.
// Extiende la clase VehiculoHibrido e incluye atributos específicos
// para los vehículos deportivos.
public class DeportivoHibrido extends VehiculoHibrido {
    // Atributos específicos del vehículo deportivo
    private int numeroPasajeros; // Número de pasajeros que puede transportar
    private int numeroPuertas;    // Número de puertas del vehículo
    private boolean bolsasAire;   // Indica si el vehículo tiene bolsas de aire
    private int caballosFuerza;   // Potencia del vehículo en caballos de fuerza
    private double tiempo100KmH;   // Tiempo en segundos para alcanzar 100 km/h

    // Constructor de la clase DeportivoHibrido.
    // Inicializa los atributos del vehículo, incluyendo los específicos del deportivo.
    DeportivoHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido, 
            int numeroPasajeros, int numeroPuertas, boolean bolsasAire, int caballosFuerza, 
            double tiempo100KmH) {
        // Llama al constructor de la clase base (VehiculoHibrido)
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
        // Inicializa los atributos específicos del deportivo
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.bolsasAire = bolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempo100KmH = tiempo100KmH;
    }

    // Métodos getters y setters para los atributos

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
        return bolsasAire; // Devuelve true si el vehículo tiene bolsas de aire
    }

    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire; // Establece si el vehículo tiene bolsas de aire
    }

    public int getCaballosFuerza() {
        return caballosFuerza; // Devuelve el número de caballos de fuerza
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza; // Establece el número de caballos de fuerza
    }

    public double getTiempo100KmH() {
        return tiempo100KmH; // Devuelve el tiempo para alcanzar 100 km/h
    }

    public void setTiempo100KmH(double tiempo100KmH) {
        this.tiempo100KmH = tiempo100KmH; // Establece el tiempo para alcanzar 100 km/h
    }
}