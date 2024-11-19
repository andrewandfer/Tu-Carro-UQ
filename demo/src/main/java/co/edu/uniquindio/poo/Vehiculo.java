package co.edu.uniquindio.poo;

public class Vehiculo {
    private String marca;
    private Estado estado;
    private int modelo;
    private int cambios;
    private double velocidadmaxima;
    private double cilindraje;
    private Transmision transmision;
    private String matricula;

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, Estado estado, int modelo, int cambios, double velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula) {
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadmaxima = velocidadmaxima;
        this.cilindraje = cilindraje;
        this.transmision = transmision;
        this.matricula = matricula;
    }

    // Getter para obtener la marca del vehículo
    public String getMarca() {
        return marca;
    }

    // Setter para establecer la marca del vehículo
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para obtener el estado del vehículo
    public Estado getEstado() {
        return estado;
    }

    // Setter para establecer el estado del vehículo
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // Getter para obtener el modelo del vehículo
    public int getModelo() {
        return modelo;
    }

    // Setter para establecer el modelo del vehículo
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    // Getter para obtener los cambios del vehículo
    public int getCambios() {
        return cambios;
    }

    // Setter para establecer los cambios del vehículo
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    // Getter para obtener la velocidad máxima del vehículo
    public double getVelocidadmaxima() {
        return velocidadmaxima;
    }

    // Setter para establecer la velocidad máxima del vehículo
    public void setVelocidadmaxima(double velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }

    // Getter para obtener el cilindraje del vehículo
    public double getCilindraje() {
        return cilindraje;
    }

    // Setter para establecer el cilindraje del vehículo
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    // Getter para obtener la transmisión del vehículo
    public Transmision getTransmision() {
        return transmision;
    }

    // Setter para establecer la transmisión del vehículo
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    // Getter para obtener la matrícula del vehículo
    public String getMatricula() {
        return matricula;
    }

    // Setter para establecer la matrícula del vehículo
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Sobrescritura del método toString para proporcionar una representación en texto del objeto
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", estado=" + estado + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadmaxima=" + velocidadmaxima + ", cilindraje=" + cilindraje + ", transmision=" + transmision
                + ", matricula=" + matricula + "]";
    }
}
