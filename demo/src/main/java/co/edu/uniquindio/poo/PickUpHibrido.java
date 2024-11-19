package co.edu.uniquindio.poo;

public class PickUpHibrido extends VehiculoHibrido {

    private String capacidadCarga;
    private boolean aireAcondicionado;
    private boolean Abs;
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean camaraReversa;
    private boolean bolsasAire;
    private boolean cuatroxcuatro;

    // Constructor de la clase PickUpHibrido
    public PickUpHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            Transmision transmision, String matricula, TipoHibrido tipoHibrido, String capacidadCarga,
            boolean aireAcondicionado, boolean abs, int numeroPasajeros, int numeroPuertas, boolean camaraReversa,
            boolean bolsasAire, boolean cuatroxcuatro) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        Abs = abs;
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
        this.cuatroxcuatro = cuatroxcuatro;
    }

    // Getter para obtener la capacidad de carga
    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    // Setter para establecer la capacidad de carga
    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Getter para obtener si tiene aire acondicionado
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    // Setter para establecer si tiene aire acondicionado
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    // Getter para obtener si tiene sistema ABS
    public boolean isAbs() {
        return Abs;
    }

    // Setter para establecer si tiene sistema ABS
    public void setAbs(boolean abs) {
        Abs = abs;
    }

    // Getter para obtener el número de pasajeros
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    // Setter para establecer el número de pasajeros
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    // Getter para obtener el número de puertas
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    // Setter para establecer el número de puertas
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // Getter para obtener si tiene cámara de reversa
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    // Setter para establecer si tiene cámara de reversa
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    // Getter para obtener si tiene bolsas de aire
    public boolean isBolsasAire() {
        return bolsasAire;
    }

    // Setter para establecer si tiene bolsas de aire
    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    // Getter para obtener si es tracción 4x4
    public boolean isCuatroxcuatro() {
        return cuatroxcuatro;
    }

    // Setter para establecer si es tracción 4x4
    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    // Sobrescritura del método toString para proporcionar una representación en texto del objeto
    @Override
    public String toString() {
        return "PickUpHibrido [capacidadCarga=" + capacidadCarga + ", aireAcondicionado=" + aireAcondicionado + ", Abs="
                + Abs + ", numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", camaraReversa="
                + camaraReversa + ", bolsasAire=" + bolsasAire + ", cuatroxcuatro=" + cuatroxcuatro + "]";
    }
}
