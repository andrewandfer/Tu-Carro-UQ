package co.edu.uniquindio.poo;

public class VehiculoHibrido extends Vehiculo {
    private TipoHibrido tipoHibrido;

    // Constructor de la clase VehiculoHibrido
    VehiculoHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.tipoHibrido = tipoHibrido;
    }

    // Getter para obtener el tipo de híbrido
    public TipoHibrido getTipoHibrido() {
        return tipoHibrido;
    }

    // Setter para establecer el tipo de híbrido
    public void setTipoHibrido(TipoHibrido tipoHibrido) {
        this.tipoHibrido = tipoHibrido;
    }
}
