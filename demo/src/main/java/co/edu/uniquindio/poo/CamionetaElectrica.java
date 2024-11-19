package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

// La clase CamionetaElectrica extiende la clase UrbanoElectrico, indicando que hereda sus propiedades y métodos
public class CamionetaElectrica extends UrbanoElectrico {
    // Atributo específico de la clase CamionetaElectrica
    private boolean cuatroxcuatro; // Indica si la camioneta tiene tracción en las cuatro ruedas

    // Constructor de la clase CamionetaElectrica que inicializa los atributos heredados y el específico
    public CamionetaElectrica(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, int autonomiacargacompleta,
            String tiempodecarga, boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentenPermanenciaCarril, boolean cuatroxcuatro) {
        // Llama al constructor de la clase padre (UrbanoElectrico) para inicializar sus atributos
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula,
                autonomiacargacompleta, tiempodecarga, velocidadCrucero, sensorColision, sensorTraficoCruzado,
                asistentenPermanenciaCarril);
        // Inicializa el atributo específico de CamionetaElectrica
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

    // Método toString que devuelve una representación en forma de cadena del objeto CamionetaElectrica
    @Override
    public String toString() {
        return "CamionetaElectrica [cuatroxcuatro=" + cuatroxcuatro + "]"; // Representación de la camioneta eléctrica con su atributo
    }
}