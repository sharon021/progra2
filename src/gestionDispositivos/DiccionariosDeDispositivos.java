package gestionDispositivos;

public class DiccionariosDeDispositivos {

    private NodoDiccionario primero;

    public DiccionariosDeDispositivos() {
        this.primero = null;
    }

    public void insertar(String clave, Dispositivo valor) {

        NodoDiccionario actual = primero;

        while (actual != null) {
            if (actual.getClave().equals(clave)) {
                actual.setValor(valor);
                return;
            }
            actual = actual.getSiguiente();
        }

        NodoDiccionario nuevo = new NodoDiccionario(clave, valor);
        nuevo.setSiguiente(primero);
        primero = nuevo;
    }

    public Dispositivo buscar(String clave) {

        NodoDiccionario actual = primero;

        while (actual != null) {
            if (actual.getClave().equals(clave)) {
                return actual.getValor();
            }
            actual = actual.getSiguiente();
        }

        return null;
    }

    public void eliminar(String clave) {

        if (primero == null) {
            return;
        }

        if (primero.getClave().equals(clave)) {
            primero = primero.getSiguiente();
            return;
        }

        NodoDiccionario anterior = primero;
        NodoDiccionario actual = primero.getSiguiente();

        while (actual != null) {
            if (actual.getClave().equals(clave)) {
                anterior.setSiguiente(actual.getSiguiente());
                return;
            }

            anterior = actual;
            actual = actual.getSiguiente();
        }
    }

    public boolean estaVacio() {
        return primero == null;
    }
}