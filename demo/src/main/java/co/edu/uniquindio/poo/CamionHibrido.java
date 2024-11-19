package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase CamionHibrido extiende la clase VehiculoHibrido, indicando que hereda sus propiedades y métodos
public class CamionHibrido extends VehiculoHibrido {
    // Atributos específicos de la clase CamionHibrido
    private double capacidadCarga; // Capacidad de carga del camión híbrido
    private boolean aireAcondicionado; // Indica si el camión tiene aire acondicionado
    private boolean abs; // Indica si el camión tiene sistema de frenos antibloqueo (ABS)
    private boolean frenosAire; // Indica si el camión tiene frenos de aire
    private int numeroEjes; // Número de ejes del camión
    private String tipoCamion; // Tipo de camión (por ejemplo, plataforma, cisterna, etc.)
    private Uso uso; // Uso previsto del camión (por ejemplo, comercial, privado, etc.)

    // Constructor de la clase CamionHibrido que inicializa los atributos heredados y los específicos
    CamionHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido,
            double capacidadCarga, boolean aireAcondicionado, boolean abs, boolean frenosAire, int numeroEjes,
            String tipoCamion, Uso uso) {
        // Llama al constructor de la clase padre (VehiculoHibrido) para inicializar sus atributos
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
        // Inicializa los atributos específicos de CamionHibrido
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
        this.frenosAire = frenosAire;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
        this.uso = uso;
    }

    // Métodos getter y setter para acceder y modificar los atributos

    public double getCapacidadCarga() {
        return capacidadCarga; // Devuelve la capacidad de carga
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga; // Establece la capacidad de carga
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado; // Devuelve si el camión tiene aire acondicionado
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado; // Establece si el camión tiene aire acondicionado
    }

    public boolean isAbs() {
        return abs; // Devuelve si el camión tiene ABS
    }

    public void setAbs(boolean abs) {
        this.abs = abs; // Establece si el camión tiene ABS
    }

    public boolean isFrenosAire() {
        return frenosAire; // Devuelve si el camión tiene frenos de aire
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire; // Establece si el camión tiene frenos de aire
    }

    public int getNumeroEjes() {
        return numeroEjes; // Devuelve el número de ejes
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes; // Establece el número de ejes
    }

    public String getTipoCamion() {
        return tipoCamion; // Devuelve el tipo de camión
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion; // Establece el tipo de camión
    }

    public Uso getUso() {
        return uso; // Devuelve el uso del camión
    }

    public void setUso(Uso uso) {
        this.uso = uso; // Establece el uso del camión
    }
}