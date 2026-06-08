package ciudad;


public class Ciudad {
    private  String nombre;
    private NodoCiudad primeraZona; // Ahora usa NodoCiudad

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.primeraZona = null;
    }

    public void agregarZona(Zona z) {
        NodoCiudad nuevoNodo = new NodoCiudad(z);
        if (primeraZona == null) {
            primeraZona = nuevoNodo;
        } else {
            NodoCiudad actual = primeraZona;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public String getNombre() { return nombre; }
    public NodoCiudad getPrimeraZona() { return primeraZona; }
}