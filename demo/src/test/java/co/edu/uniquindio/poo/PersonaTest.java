package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testConstructorAndGetters() {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", 1096785, 314867645, "juan@example.com");

        // Verificar que el constructor y los métodos getters funcionan correctamente
        assertEquals("Juan", persona.getNombre());
        assertEquals(1096785, persona.getId());
        assertEquals(314867645, persona.getTelefono());
        assertEquals("juan@example.com", persona.getCorreo());
    }

    @Test
    public void testSetNombre() {
        Persona persona = new Persona("Juan", 1096785, 314867645, "juan@example.com");
        persona.setNombre("Pedro");
        assertEquals("Pedro", persona.getNombre());
    }

    @Test
    public void testSetId() {
        Persona persona = new Persona("Juan", 1096785, 314867645, "juan@example.com");
        persona.setId(456);
        assertEquals(456, persona.getId());
    }

    @Test
    public void testSetTelefono() {
        Persona persona = new Persona("Juan", 1096785, 314867645, "juan@example.com");
        persona.setTelefono(314867645);
        assertEquals(314867645, persona.getTelefono());
    }

    @Test
    public void testSetCorreo() {
        Persona persona = new Persona("Juan", 1096785, 314867645, "juan@example.com");
        persona.setCorreo("pedro@example.com");
        assertEquals("pedro@example.com", persona.getCorreo());
    }

    @Test
    public void testToString() {
        Persona persona = new Persona("Juan", 1096785, 314867645, "juan@example.com");
        String expected = "Persona [nombre=Juan, id=1096785, telefono=314867645, correo=juan@example.com]";
        assertEquals(expected, persona.toString());
    }
}
