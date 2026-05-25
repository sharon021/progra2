package src.grafoCiudad;

public class NodoVehiculos {

    private Vehiculos vehiculo;
    private NodoVehiculos siguiente;

    // Constructor
    public NodoVehiculos(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
        this.siguiente = null; // Al crearse, no apunta a nadie todavía
    }

    // Getters y Setters
    public Vehiculos getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculos vehiculo) { this.vehiculo = vehiculo; }

    public NodoVehiculos getSiguiente() { return siguiente; }
    public void setSiguiente(NodoVehiculos siguiente) { this.siguiente = siguiente; }
    
}
