package ciudad;

public class Zona {
    private final String nombre;
    private NodoCiudad primerBarrio; // Ahora usa NodoCiudad

    public Zona(String nombre) {
        this.nombre = nombre;
        this.primerBarrio = null;
    }

    public void agregarBarrio(Barrio b) {
        NodoCiudad nuevoNodo = new NodoCiudad(b);
        if (primerBarrio == null) 
            {
            primerBarrio = nuevoNodo;
        } 
        else {
            NodoCiudad actual = primerBarrio;
            while (actual.getSiguiente() != null) 
                {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public String getNombre() 
    { 
        return nombre; 
    }
    public NodoCiudad getPrimerBarrio() 
    { 
        return primerBarrio; 

    }
}