package grafosCiudades;

public class Interseccion {

    private String id;
    private ColaVehiculos colaVehiculos;
    private ListaCalles callesConectadas;

    public Interseccion(String id) {
        this.id = id;
        this.colaVehiculos = new ColaVehiculos();
        this.callesConectadas = new ListaCalles();
    }

    public void agregarVehiculo(Vehiculos vehiculo) {
        colaVehiculos.encolar(vehiculo);
    }

    public Vehiculos liberarVehiculo() {
        return colaVehiculos.desencolar();
    }

    public void agregarCalle(Calle calle) {
        callesConectadas.agregar(calle);
    }
    public Calle buscarCalleHacia(Interseccion destino) 
    {
        NodoCalle actual = callesConectadas.getPrimero();

        while (actual != null) {

            Calle calle = actual.getCalle();

            if (calle.getDestino().getId().equals(destino.getId())) {
                return calle;
            }

            actual = actual.getSiguiente();
        }

        return null;

       
    }
    

    // Getters y Setters

    public String getId() {
        return id;
    }

    public ColaVehiculos getColaVehiculos() {
        return colaVehiculos;
    }

    public ListaCalles getCallesConectadas() {
        return callesConectadas;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setColaVehiculos(ColaVehiculos colaVehiculos) {
        this.colaVehiculos = colaVehiculos;
    }

    public void setCallesConectadas(ListaCalles callesConectadas) {
        this.callesConectadas = callesConectadas;
    }

    @Override
    public String toString() {
        return "Interseccion{" +
                "id='" + id + '\'' +
                '}';
    }
}