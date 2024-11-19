package co.edu.uniquindio.poo;

public class VehiculoElectrico extends Vehiculo {

    private int autonomiacargacompleta;
    private String tiempodecarga;

    // Constructor de la clase VehiculoElectrico
    public VehiculoElectrico(String marca, Estado estado, int modelo, int cambios, double velocidadmaxima,
            double cilindraje, Transmision transmision, int autonomiacargacompleta, String tiempodecarga,
            String matricula) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.autonomiacargacompleta = autonomiacargacompleta;
        this.tiempodecarga = tiempodecarga;
    }

    // Getter para obtener la autonomía con carga completa
    public int getAutonomiacargacompleta() {
        return autonomiacargacompleta;
    }

    // Setter para establecer la autonomía con carga completa
    public void setAutonomiacargacompleta(int autonomiacargacompleta) {
        this.autonomiacargacompleta = autonomiacargacompleta;
    }

    // Getter para obtener el tiempo de carga
    public String getTiempodecarga() {
        return tiempodecarga;
    }

    // Setter para establecer el tiempo de carga
    public void setTiempodecarga(String tiempodecarga) {
        this.tiempodecarga = tiempodecarga;
    }
}
