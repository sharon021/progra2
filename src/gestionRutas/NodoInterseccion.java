package gestionRutas;

public class NodoInterseccion {

    private Interseccion interseccion;
    private NodoInterseccion siguiente;

    // Constructor
    public NodoInterseccion(Interseccion interseccion) {
        this.interseccion = interseccion;
        this.siguiente = null;
    }

    // Getters y Setters
    public Interseccion getInterseccion() {
        return interseccion;
    }

    public void setInterseccion(Interseccion interseccion) {
        this.interseccion = interseccion;
    }

    public NodoInterseccion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoInterseccion siguiente) {
        this.siguiente = siguiente;
    }
}