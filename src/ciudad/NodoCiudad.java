package ciudad;

public class NodoCiudad {
    private Object contenido; 
    private NodoCiudad siguiente;

    public NodoCiudad(Object contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }

    public Object getContenido() { 
        return contenido; }
    public void setContenido(Object contenido) { this.contenido = contenido; }
    public NodoCiudad getSiguiente() { return siguiente; }
    public void setSiguiente(NodoCiudad siguiente) { this.siguiente = siguiente; }
}