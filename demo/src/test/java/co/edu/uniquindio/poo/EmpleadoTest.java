package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;

public class EmpleadoTest {

    private Empleado empleado;
    private Vehiculo vehiculo1;
    @BeforeEach
    public void setUp() {
        empleado = new Empleado("Maria", 12345, 321456788, "maria@example.com");
        empleado.vehiculos = new LinkedList<>(); // Inicializar la lista de vehículos
        vehiculo1 = new CamionElectrico("Volvo", Estado.NUEVO, 2023, 6, 120, 5.0, Transmision.AUTOMATICA, "XYZ123", 500, "8 horas", "20 toneladas", true, true, true, "2 ejes", "Carga", Uso.COMERCIAL);
        new CamionElectrico("Sedan", Estado.NUEVO, 2024, 6, 120, 6.0, Transmision.MANUAL, "XYZ234", 510, "9 horas", "20 toneladas", true, true, true, "2 ejes", "Carga", Uso.COMERCIAL);

    }

    @Test
    public void testConstructorAndGetters() {
        // Verificar que el constructor y los métodos getters funcionan correctamente
        assertEquals("Maria", empleado.getNombre());
        assertEquals(12345, empleado.getId());
        assertEquals(321456788, empleado.getTelefono());
        assertEquals("maria@example.com", empleado.getCorreo());
    }

    @Test
    public void testSetNombre() {
        empleado.setNombre("Maria");
        assertEquals("Maria", empleado.getNombre());
    }

    @Test
    public void testSetId() {
        empleado.setId(12345);
        assertEquals(12345, empleado.getId());
    }

    @Test
    public void testSetTelefono() {
        empleado.setTelefono(321456788);
        assertEquals(321456788, empleado.getTelefono());
    }

    @Test
    public void testSetCorreo() {
        empleado.setCorreo("maria@example.com");
        assertEquals("maria@example.com", empleado.getCorreo());
    }

    @Test
    public void testAgregarVehiculo() {
        empleado.agregarVehiculo(vehiculo1);
        assertTrue(empleado.getVehiculos().contains(vehiculo1));
    }

    @Test
    public void testEliminarVehiculo() {
        empleado.agregarVehiculo(vehiculo1);
        empleado.eliminarVehiculo(vehiculo1);
        assertFalse(empleado.getVehiculos().contains(vehiculo1));
    }


    @Test
    public void testToString() {
        String expected = "Empleado []";
        assertEquals(expected, empleado.toString());
    }
}
