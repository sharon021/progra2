package grafosCiudades;

public class ListaIntersecciones {

    private NodoInterseccion primero;

    // Constructor
    public ListaIntersecciones() {
        this.primero = null;
    }

    // Agregar al final
    public void agregar(Interseccion interseccion) {

        NodoInterseccion nuevo = new NodoInterseccion(interseccion);

        if (primero == null) {
            primero = nuevo;
            return;
        }

        NodoInterseccion aux = primero;

        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }

        aux.setSiguiente(nuevo);
    }

    // Buscar por ID
    public Interseccion buscar(String id) {

        NodoInterseccion aux = primero;

        while (aux != null) {

            if (aux.getInterseccion().getId().equals(id)) {
                return aux.getInterseccion();
            }

            aux = aux.getSiguiente();
        }

        return null;
    }

    // Eliminar por ID
    public boolean eliminar(String id) {

        if (primero == null) {
            return false;
        }

        // Caso especial: eliminar primero
        if (primero.getInterseccion().getId().equals(id)) {
            primero = primero.getSiguiente();
            return true;
        }

        NodoInterseccion anterior = primero;
        NodoInterseccion actual = primero.getSiguiente();

        while (actual != null) {

            if (actual.getInterseccion().getId().equals(id)) {
                anterior.setSiguiente(actual.getSiguiente());
                return true;
            }

            anterior = actual;
            actual = actual.getSiguiente();
        }

        return false;
    }

    // Getters y Setters
    public NodoInterseccion getPrimero() {
        return primero;
    }

    public void setPrimero(NodoInterseccion primero) {
        this.primero = primero;
    }
}