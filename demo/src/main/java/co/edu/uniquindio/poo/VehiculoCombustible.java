package co.edu.uniquindio.poo;

public class VehiculoCombustible extends Vehiculo {

    private Combustible combustible;

    // Constructor de la clase VehiculoCombustible
    public VehiculoCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.combustible = combustible;
    }

    // Getter para obtener el tipo de combustible
    public Combustible getCombustible() {
        return combustible;
    }

    // Setter para establecer el tipo de combustible
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    // Sobreescribimos el método toString para proporcionar una representación en texto del objeto
    @Override
    public String toString() {
        return "VehiculoCombustible [Combustible=" + combustible + "]";
    }
}
