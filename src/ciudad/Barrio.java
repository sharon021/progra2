package ciudad;


public class Barrio {
    private final String nombre;
    private NodoCiudad primeraManzana; // Ahora usa NodoCiudad

    public Barrio(String nombre) {
        this.nombre = nombre;
        this.primeraManzana = null;
    }

    public void agregarManzana(Manzana m) {
        NodoCiudad nuevoNodo = new NodoCiudad(m);
        if (primeraManzana == null) {
            primeraManzana = nuevoNodo;
        } else {
            NodoCiudad actual = primeraManzana;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public String getNombre() 
    { 
        return nombre; 

    }
    public NodoCiudad getPrimeraManzana() 
    { 
        return primeraManzana; 

    }
}