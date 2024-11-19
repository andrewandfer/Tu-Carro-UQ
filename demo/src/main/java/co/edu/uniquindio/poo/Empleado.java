package co.edu.uniquindio.poo;

import java.util.LinkedList;

// La clase Empleado representa a un empleado que hereda de la clase Persona.
// Cada empleado puede tener una lista de vehículos asociados.
public class Empleado extends Persona {
    public LinkedList<Vehiculo> vehiculos; // Lista de vehículos que posee el empleado

    // Constructor de la clase Empleado.
    // Inicializa el empleado con su nombre, ID, teléfono y correo.
    public Empleado(String nombre, int id, int telefono, String correo) {
        super(nombre, id, telefono, correo); // Llama al constructor de la clase base (Persona)
        vehiculos = new LinkedList<>(); // Inicializa la lista de vehículos
    }

    // Método getter para obtener la lista de vehículos del empleado.
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos; // Devuelve la lista de vehículos
    }

    // Método setter para establecer la lista de vehículos del empleado.
    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos; // Establece la lista de vehículos
    }

    // Método toString que devuelve una representación en cadena del objeto Empleado.
    @Override
    public String toString() {
        return "Empleado []"; // Representación simplificada del empleado
    }

    // ------------------------------------------------Vehiculo---------------------------------------------------//

    // Método para agregar un vehículo a la lista del empleado.
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo); // Añade el vehículo a la lista
    }

    // Método para eliminar un vehículo de la lista del empleado.
    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo); // Elimina el vehículo de la lista
    }
}