package centralDeEmergencia;

public class NodoEmergencia {
    private Emergencia dato;
    private int prioridad;
    private NodoEmergencia siguiente;

    public NodoEmergencia(Emergencia dato, int prioridad) {
        this.dato = dato;
        this.prioridad = prioridad;
        this.siguiente = null;
    }

    public Emergencia getDato() {
        return dato;
    }

    public void setDato(Emergencia dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public NodoEmergencia getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEmergencia siguiente) {
        this.siguiente = siguiente;
    }
}
