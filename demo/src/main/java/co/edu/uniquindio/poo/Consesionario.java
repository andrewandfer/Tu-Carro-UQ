package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

import java.util.Collection; // Importa la interfaz Collection para manejar colecciones genéricas
import java.util.LinkedList; // Importa LinkedList para usar listas enlazadas

// Clase que representa un concesionario de vehículos
public class Consesionario {

    private String nombre; // Nombre del concesionario
    private int id; // Identificador del concesionario
    private Collection<Vehiculo> vehiculos; // Colección de vehículos disponibles en el concesionario
    private Collection<Administrador> administradores; // Colección de administradores del concesionario
    private Collection<Empleado> empleados; // Colección de empleados del concesionario
    private Collection<Cliente> clientes; // Colección de clientes del concesionario

    // Constructor que inicializa el nombre y el id del concesionario, así como las colecciones
    public Consesionario(String nombre, int id) {
        this.nombre = nombre; // Asigna el nombre del concesionario
        this.id = id; // Asigna el id del concesionario
        vehiculos = new LinkedList<>(); // Inicializa la lista de vehículos como una LinkedList
        administradores = new LinkedList<>(); // Inicializa la lista de administradores
        empleados = new LinkedList<>(); // Inicializa la lista de empleados
        clientes = new LinkedList<>(); // Inicializa la lista de clientes
    }

    /**
    public static void main(String[] args) {
        // Crear un vehículo de tipo PickUp
        Vehiculo pickUp = crearVehiculo("PickUp", "Ford", "F-150", 2023, "Rojo", 25000.00, 200, 60.0, 1000.0);
        System.out.println("PickUp: " + pickUp.getMarca() + " " + pickUp.getModelo());

        // Crear un vehículo de tipo Camión
        Vehiculo camion = crearVehiculo("Camión", "Volvo", "FH16", 2022, "Azul", 100000.00, 120, 150.0, 40000.0);
        System.out.println("Camión: " + camion.getMarca() + " " + camion.getModelo());
    }

    // Método para crear vehículos
    public static Vehiculo crearVehiculo(String tipo, String marca, String modelo, int año, String color, double precio,
            int velocidadMaxima, double capacidadTanque, double atributoAdicional) {
        Vehiculo vehiculo = null;

        switch (tipo) {
            case "PickUp":
                vehiculo = new PickUpElectrico(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Camión":
                vehiculo = new CamionElectrico(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Camioneta":
                vehiculo = new CamionetaElectrica(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Van":
                vehiculo = new VanElectrica(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Moto":
                vehiculo = new MotoElectrica(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Bus":
                vehiculo = new Bus(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Deportivo":
                vehiculo = new Deportivo(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Sedan":
                vehiculo = new Sedan(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            default:
                System.out.println("Tipo de vehículo inválido.");
        }

        return vehiculo;
    }*/

    // Métodos getters y setters para acceder y modificar los atributos del concesionario
    public String getNombre() {
        return nombre; // Devuelve el nombre del concesionario
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el nombre del concesionario
    }

    public int getId() {
        return id; // Devuelve el id del concesionario
    }

    public void setId(int id) {
        this.id = id; // Establece el id del concesionario
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos; // Devuelve la colección de vehículos
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos; // Establece la colección de vehículos
    }

    public Collection<Administrador> getAdministradores() {
        return administradores; // Devuelve la colección de administradores
    }

    public void setAdministradores(Collection<Administrador> administradores) {
        this.administradores = administradores; // Establece la colección de administradores
    }

    public Collection<Empleado> getEmpleados() {
        return empleados; // Devuelve la colección de empleados
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados; // Establece la colección de empleados
    }

    public Collection<Cliente> getClientes() {
        return clientes; // Devuelve la colección de clientes
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes; // Establece la colección de clientes
    }

    // Método toString que devuelve una representación en forma de cadena del objeto Consesionario
    @Override
    public String toString() {
        return "Consesionario [nombre=" + nombre + ", id=" + id + ", vehiculos=" + vehiculos + ", administradores="
                + administradores + ", empleados=" + empleados + ", clientes=" + clientes + "]";
    }

    // ------------------------------------------------Administrador---------------------------------------------------//
    // Métodos para gestionar administradores
    public boolean verificarAdministrador(int id) {
        for (Administrador administrador : administradores) {
            if (administrador.getId() == id) {
                return true; // Retorna verdadero si el administrador existe
            }
        }
        return false; // Retorna falso si no se encuentra el administrador
    }

    public void agregarAdministrador(Administrador administrador) {
        if (!verificarAdministrador(administrador.getId())) {
            administradores.add(administrador); // Agrega el administrador si no existe
        }
    }

    public void eliminarAdministrador(Administrador administrador) {
        if (verificarAdministrador(administrador.getId())) {
            administradores.remove(administrador); // Elimina el administrador si existe
        }
    }

    // ------------------------------------------------Empleado---------------------------------------------------//
    // Métodos para gestionar empleados
    public boolean agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getId())) {
            empleados.add(empleado); // Agrega el empleado si no existe
            return true;
        }
        return false; // Retorna falso si el empleado ya existe
    }

    public boolean eliminarEmpleado(int id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                empleados.remove(empleado); // Elimina el empleado si existe
                return true;
            }
        }
        return false; // Retorna falso si no se encuentra el empleado
    }

    public boolean actualizarEmpleado(int id, Empleado actualizado) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                // Actualiza los datos del empleado
                empleado.setId(actualizado.getId());
                empleado.setNombre(actualizado.getNombre());
                empleado.setTelefono(actualizado.getTelefono());
                empleado.setCorreo(actualizado.getCorreo());
                return true; // Retorna verdadero si se actualizó con éxito
            }
        }
        return false; // Retorna falso si no se encontró el empleado
    }

    public boolean verificarEmpleado(int id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                return true; // Retorna verdadero si el empleado existe
            }
        }
        return false; // Retorna falso si no se encuentra el empleado
    }

    // ------------------------------------------------Clientes---------------------------------------------------//
    // Métodos para gestionar clientes
    public boolean agregarCliente(Cliente cliente) {
        if (!verificarCliente(cliente.getId())) {
            clientes.add(cliente); // Agrega el cliente si no existe
            return true;
        }
        return false; // Retorna falso si el cliente ya existe
    }

    public boolean eliminarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente); // Elimina el cliente si existe
                return true;
            }
        }
        return false; // Retorna falso si no se encuentra el cliente
    }

    public boolean actualizarCliente(int id, Cliente actualizado) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                // Actualiza los datos del cliente
                cliente.setId(actualizado.getId());
                cliente.setNombre(actualizado.getNombre());
                cliente.setTelefono(actualizado.getTelefono());
                cliente.setCorreo(actualizado.getCorreo());
                return true; // Retorna verdadero si se actualizó con éxito
            }
        }
        return false; // Retorna falso si no se encontró el cliente
    }

    public boolean verificarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return true; // Retorna verdadero si el cliente existe
            }
        }
        return false; // Retorna falso si no se encuentra el cliente
    }

    // ------------------------------------------------Vehiculos---------------------------------------------------//
    // Métodos para gestionar vehículos
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (!verificarVehiculo(vehiculo.getMatricula())) {
            vehiculos.add(vehiculo); // Agrega el vehículo si no existe
            return true;
        }
        return false; // Retorna falso si el vehículo ya existe
    }

    public boolean eliminarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculos.remove(vehiculo); // Elimina el vehículo si existe
                return true;
            }
        }
        return false; // Retorna falso si no se encuentra el vehículo
    }

    public boolean actualizarVehiculo(String matricula, Vehiculo actualizado) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                // Actualiza los datos del vehículo
                vehiculo.setModelo(actualizado.getModelo());
                vehiculo.setMarca(actualizado.getMarca());
                vehiculo.setMatricula(actualizado.getMatricula());
                vehiculo.setEstado(actualizado.getEstado());
                vehiculo.setCambios(actualizado.getCambios());
                vehiculo.setVelocidadmaxima(actualizado.getVelocidadmaxima());
                vehiculo.setCilindraje(actualizado.getCilindraje());
                vehiculo.setTransmision(actualizado.getTransmision());
                return true; // Retorna verdadero si se actualizó con éxito
            }
        }
        return false; // Retorna falso si no se encontró el vehículo
    }

    public boolean verificarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return true; // Retorna verdadero si el vehículo existe
            }
        }
        return false; // Retorna falso si no se encuentra el vehículo
    }
}