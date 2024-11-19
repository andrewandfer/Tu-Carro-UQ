package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsesionarioTest {

    private Consesionario consesionario;

    @BeforeEach
    public void setUp() {
        consesionario = new Consesionario("Concesionario Prueba", 1);
    }

    @Test
    public void testAgregarAdministrador() {
        Administrador admin = new Administrador("juan",1230,31457689,"juan@gmail.com");
        consesionario.agregarAdministrador(admin);
        assertTrue(consesionario.verificarAdministrador(1230));
    }

    @Test
    public void testEliminarAdministrador() {
        Administrador admin = new Administrador("juan",1230,31457689,"juan@gmail.com");
        consesionario.agregarAdministrador(admin);
        consesionario.eliminarAdministrador(admin);
        assertFalse(consesionario.verificarAdministrador(1230));
    }

    @Test
    public void testAgregarEmpleado() {
        Empleado empleado = new Empleado("Maria", 12345,321456788, "empleado1@example.com");
        consesionario.agregarEmpleado(empleado);
        assertTrue(consesionario.verificarEmpleado(12345));
    }

    @Test
    public void testEliminarEmpleado() {
        Empleado empleado = new Empleado("Maria", 12345,321456788, "empleado1@example.com");
        consesionario.agregarEmpleado(empleado);
        consesionario.eliminarEmpleado(12345);
        assertFalse(consesionario.verificarEmpleado(12345));
    }

    @Test
    public void testActualizarEmpleado() {
        Empleado empleado = new Empleado("Mari0", 123459,321456789, "empleado1@example.com");
        consesionario.agregarEmpleado(empleado);
        Empleado empleadoActualizado = new Empleado("PEDRO", 123459,321456789, "empleado2@example.com");
        consesionario.actualizarEmpleado(123459, empleadoActualizado);
        assertEquals("PEDRO", empleado.getNombre());
        assertEquals(321456789, empleado.getTelefono());
        assertEquals("empleado2@example.com", empleado.getCorreo());
    }

    @Test
    public void testAgregarCliente() {
        Cliente cliente = new Cliente("juana", 1234510,321456789, "juana@pedrito.com");
        consesionario.agregarCliente(cliente);
        assertTrue(consesionario.verificarCliente(1234510));
    }

    @Test
    public void testEliminarCliente() {
        Cliente cliente = new Cliente("juana", 1234510,321456789, "juana@pedrito.com");
        consesionario.agregarCliente(cliente);
        consesionario.eliminarCliente(1234510);
        assertFalse(consesionario.verificarCliente(1234510));
    }

    @Test
    public void testActualizarCliente() {
        Cliente cliente = new Cliente("mahamed", 1234511,321456790, "mahamed@pedrito.com");
        consesionario.agregarCliente(cliente);
        Cliente clienteActualizado = new Cliente("mohamed", 1234512,321456792, "juana@pedrito.com");
        consesionario.actualizarCliente(1234511, clienteActualizado);
        assertEquals("mohamed", cliente.getNombre());
        assertEquals(321456792, cliente.getTelefono());
        assertEquals("juana@pedrito.com", cliente.getCorreo());
    }

    @Test
    public void testAgregarVehiculo() {
        Vehiculo auto = new CamionElectrico("Volvo", Estado.NUEVO, 2023, 6, 120, 5.0, Transmision.AUTOMATICA, "XYZ123", 500, "8 horas", "20 toneladas", true, true, true, "2 ejes", "Carga", Uso.COMERCIAL);
        consesionario.agregarVehiculo(auto);
        assertTrue(consesionario.verificarVehiculo("XYZ123"));
    }

    @Test
    public void testEliminarVehiculo() {
        Vehiculo vehiculo = new CamionElectrico("Volvo", Estado.NUEVO, 2023, 6, 120, 5.0, Transmision.AUTOMATICA, "XYZ123", 500, "8 horas", "20 toneladas", true, true, true, "2 ejes", "Carga", Uso.COMERCIAL);
        consesionario.agregarVehiculo(vehiculo);
        consesionario.eliminarVehiculo("XYZ123");
        assertFalse(consesionario.verificarVehiculo("XYZ123"));
    }

    @Test
    public void testActualizarVehiculo() {
        Vehiculo vehiculo = new CamionElectrico("Volvo", Estado.NUEVO, 2023, 6, 120, 5.0, Transmision.AUTOMATICA, "XYZ123", 500, "8 horas", "20 toneladas", true, true, true, "2 ejes", "Carga", Uso.COMERCIAL);
        consesionario.agregarVehiculo(vehiculo);
        Vehiculo vehiculoActualizado = new CamionElectrico("Mazda", Estado.USADO, 2023, 6, 120, 5.0, Transmision.AUTOMATICA, "XYZ123", 500, "8 horas", "20 toneladas", true, true, true, "2 ejes", "Carga", Uso.COMERCIAL);
        consesionario.actualizarVehiculo("XYZ123", vehiculoActualizado);
        assertEquals("Mazda", vehiculo.getMarca());
        assertEquals(2023, vehiculo.getModelo());
        assertEquals("XYZ123", vehiculo.getMatricula());
    }

}
