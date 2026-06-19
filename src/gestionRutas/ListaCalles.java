package gestionRutas;

public class ListaCalles {

    private NodoCalle primero;

    public ListaCalles() {
        this.primero = null;
    }

    //Agregar al final
    public void agregar(Calle calle) {

        NodoCalle nuevo = new NodoCalle(calle);

        if (primero == null) {
            primero = nuevo;
            return;
        }

        NodoCalle aux = primero;

        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }

        aux.setSiguiente(nuevo);
    }

    //Buscar por nombre de calle
    public Calle buscar(String nombre) {

        NodoCalle aux = primero;

        while (aux != null) {

            if (aux.getCalle().getNombre().equals(nombre)) {
                return aux.getCalle();
            }

            aux = aux.getSiguiente();
        }

        return null;
    }

    //Eliminar por nombre
    public boolean eliminar(String nombre) {

        if (primero == null) {
            return false;
        }

        // Caso:eliminar el primero
        if (primero.getCalle().getNombre().equals(nombre)) {
            primero = primero.getSiguiente();
            return true;
        }

        NodoCalle anterior = primero;
        NodoCalle actual = primero.getSiguiente();

        while (actual != null) {

            if (actual.getCalle().getNombre().equals(nombre)) {

                anterior.setSiguiente(actual.getSiguiente());
                return true;
            }

            anterior = actual;
            actual = actual.getSiguiente();
        }

        return false;
    }
    
    // Inserta al inicio de la lista para hacer el camino en orden origen a destino
    public void agregarAlFrente(Calle calle) {
    NodoCalle nuevo = new NodoCalle(calle);
    nuevo.setSiguiente(primero);
    primero = nuevo;
    }

    public int tamanio() {
    int contador = 0;
    NodoCalle aux = primero;
    while (aux != null) {
        contador++;
        aux = aux.getSiguiente();
        }
    return contador;
    }

public boolean estaVacio() {
    return primero == null;
}

    public NodoCalle getPrimero() {
        return primero;
    }

    public void setPrimero(NodoCalle primero) {
        this.primero = primero;
    }
}
