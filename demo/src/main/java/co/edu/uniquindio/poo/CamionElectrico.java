package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase CamionElectrico extiende la clase VehiculoElectrico, indicando que hereda sus propiedades y métodos
public class CamionElectrico extends VehiculoElectrico {
    // Atributos específicos de la clase CamionElectrico
    private String capacidadCarga; // Capacidad de carga del camión eléctrico
    private boolean aireAcondicionado; // Indica si el camión tiene aire acondicionado
    private boolean abs; // Indica si el camión tiene sistema de frenos antibloqueo (ABS)
    private boolean frenosAire; // Indica si el camión tiene frenos de aire
    private String numeroEjes; // Número de ejes del camión
    private String tipoCamiondint; // Tipo de camión (por ejemplo, plataforma, cisterna, etc.)
    private Uso uso; // Uso previsto del camión (por ejemplo, comercial, privado, etc.)

    // Constructor de la clase CamionElectrico que inicializa los atributos heredados y los específicos
    public CamionElectrico(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, int autonomiacargacompleta, 
            String tiempodecarga, String capacidadCarga, boolean aireAcondicionado, boolean abs, 
            boolean frenosAire, String numeroEjes, String tipoCamiondint, Uso uso) {
        // Llama al constructor de la clase padre (VehiculoElectrico) para inicializar sus atributos
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, 
              autonomiacargacompleta, tiempodecarga, matricula);
        
        // Inicializa los atributos específicos de CamionElectrico
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
        this.capacidadCarga = capacidadCarga;
        this.frenosAire = frenosAire;
        this.numeroEjes = numeroEjes;
        this.tipoCamiondint = tipoCamiondint;
        this.uso = uso;
    }

    // Métodos getter y setter para acceder y modificar los atributos

    public String getCapacidadCarga() {
        return capacidadCarga; // Devuelve la capacidad de carga
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga; // Establece la capacidad de carga
    }

    public boolean getAireAcondicionado() {
        return aireAcondicionado; // Devuelve si el camión tiene aire acondicionado
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado; // Establece si el camión tiene aire acondicionado
    }

    public boolean getAbs() {
        return abs; // Devuelve si el camión tiene ABS
    }

    public void setAbs(boolean abs) {
        this.abs = abs; // Establece si el camión tiene ABS
    }

    public boolean getFrenosAire() {
        return frenosAire; // Devuelve si el camión tiene frenos de aire
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire; // Establece si el camión tiene frenos de aire
    }

    public String getNumeroEjes() {
        return numeroEjes; // Devuelve el número de ejes
    }

    public void setNumeroEjes(String numeroEjes) {
        this.numeroEjes = numeroEjes; // Establece el número de ejes
    }

    public String getTipoCamiondint() {
        return tipoCamiondint; // Devuelve el tipo de camión
    }

    public void setTipoCamiondint(String tipoCamiondint) {
        this.tipoCamiondint = tipoCamiondint; // Establece el tipo de camión
    }

    public Uso getUso() {
        return uso; // Devuelve el uso del camión
    }

    public void setEstado(Uso uso) {
        this.uso = uso; // Establece el uso del camión
    }

    // Método toString que devuelve una representación en forma de cadena del objeto CamionElectrico
    @Override
    public String toString() {
        return "CamionElectrico [capacidadCarga=" + capacidadCarga + ", aireAcondicionado=" + aireAcondicionado
                + ", abs=" + abs + ", frenosAire=" + frenosAire + ", numeroEjes=" + numeroEjes + ", tipoCamiondint="
                + tipoCamiondint + "]"; // Representación del camión eléctrico con sus atributos
    }
}