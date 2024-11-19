package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;
    private Vehiculo vehiculo1;
    @BeforeEach
    public void setUp() {
        cliente = new Cliente("felipe", 987065, 314654321, "felipe@example.com");
        vehiculo1 = new Vehiculo("Toyota", Estado.NUEVO, 2022, 5, 180.0, 1.6, Transmision.MANUAL, "ZDB123");
        new Vehiculo("Honda", Estado.USADO, 2020, 6, 200.0, 2.0, Transmision.AUTOMATICA, "  YTR314");
    }

    @Test
    public void testAgregarVehiculo() {
        cliente.agregarVehiculo(vehiculo1);
        assertTrue(cliente.getVehiculos().contains(vehiculo1));
    }

    @Test
    public void testEliminarVehiculo() {
        cliente.agregarVehiculo(vehiculo1);
        cliente.eliminarVehiculo(vehiculo1);
        assertFalse(cliente.getVehiculos().contains(vehiculo1));
    }

    @Test
    public void testToString() {
        String expected = "Cliente []";
        assertEquals(expected, cliente.toString());
    }
}
