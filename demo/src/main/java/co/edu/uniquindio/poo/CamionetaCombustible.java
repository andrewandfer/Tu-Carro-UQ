package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase CamionetaCombustible extiende la clase UrbanoCombustible, indicando que hereda sus propiedades y métodos
public class CamionetaCombustible extends UrbanoCombustible {
    // Atributo específico de la clase CamionetaCombustible
    private boolean cuatroxcuatro; // Indica si la camioneta tiene tracción en las cuatro ruedas

    // Constructor de la clase CamionetaCombustible que inicializa los atributos heredados y el específico
    public CamionetaCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, boolean velocidadCrucero,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentenPermanenciaCarril,
            boolean cuatroxcuatro) {
        // Llama al constructor de la clase padre (UrbanoCombustible) para inicializar sus atributos
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula,
                velocidadCrucero, sensorColision, sensorTraficoCruzado, asistentenPermanenciaCarril);
        // Inicializa el atributo específico de CamionetaCombustible
        this.cuatroxcuatro = cuatroxcuatro;
    }

    // Método getter para obtener el estado de la tracción en las cuatro ruedas
    public boolean isCuatroxcuatro() {
        return cuatroxcuatro; // Devuelve si la camioneta tiene tracción en las cuatro ruedas
    }

    // Método setter para establecer el estado de la tracción en las cuatro ruedas
    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro; // Establece si la camioneta tiene tracción en las cuatro ruedas
    }

    // Método toString que devuelve una representación en forma de cadena del objeto CamionetaCombustible
    @Override
    public String toString() {
        return "CamionetaCombustible [cuatroxcuatro=" + cuatroxcuatro + "]"; // Representación de la camioneta con su atributo
    }
}