package co.edu.uniquindio.poo; // Declaración del paquete donde se encuentra la clase

import java.util.LinkedList; // Importa la clase LinkedList para usar listas enlazadas

// La clase Cliente extiende la clase Persona, indicando que hereda sus propiedades y métodos
public class Cliente extends Persona {
    // Lista de vehículos que posee el cliente
    public LinkedList<Vehiculo> vehiculos;

    // Constructor de la clase Cliente que inicializa los atributos heredados y la lista de vehículos
    public Cliente(String nombre, int id, int telefono, String correo) {
        super(nombre, id, telefono, correo); // Llama al constructor de la clase padre (Persona)
        vehiculos = new LinkedList<>(); // Inicializa la lista de vehículos como una LinkedList
    }

    // Método getter para obtener la lista de vehículos
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos; // Devuelve la lista de vehículos del cliente
    }

    // Método setter para establecer la lista de vehículos
    public void setVehiculosgetVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos; // Establece la lista de vehículos
    }

    // Método toString que devuelve una representación en forma de cadena del objeto Cliente
    @Override
    public String toString() {
        return "Cliente []"; // Devuelve una representación básica del cliente, se puede mejorar para incluir más información
    }

    // Método para agregar un vehículo a la lista del cliente
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo); // Añade el vehículo a la lista de vehículos
    }

    // Método para eliminar un vehículo de la lista del cliente
    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo); // Elimina el vehículo de la lista de vehículos
    }
}