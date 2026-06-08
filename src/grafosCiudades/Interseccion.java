package grafosCiudades;

import java.util.ArrayList;
import java.util.List;

public class Interseccion {

    private String id;
    private ColaVehiculos colaVehiculos;
    private ListaCalles callesConectadas;

    // Constructor
    public Interseccion(String id) {
        this.id = id;
        this.colaVehiculos = new ColaVehiculos();
        this.callesConectadas = new ArrayList<>();
    }

    // Métodos
    public void agregarVehiculo(Vehiculos vehiculo) {
        colaVehiculos.encolar(vehiculo);
    }

    public Vehiculos liberarVehiculo() {
        return colaVehiculos.desencolar();
    }

    public void agregarCalle(Calle calle) {
        callesConectadas.add(calle);
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ColaVehiculos getColaVehiculos() {
        return colaVehiculos;
    }

    public void setColaVehiculos(ColaVehiculos colaVehiculos) {
        this.colaVehiculos = colaVehiculos;
    }

    public List<Calle> getCallesConectadas() {
        return callesConectadas;
    }

    public void setCallesConectadas(List<Calle> callesConectadas) {
        this.callesConectadas = callesConectadas;
    }

    @Override
    public String toString() {
        return "Interseccion{" +
                "id='" + id + '\'' +
                ", callesConectadas=" + callesConectadas.size() +
                '}';
    }
}