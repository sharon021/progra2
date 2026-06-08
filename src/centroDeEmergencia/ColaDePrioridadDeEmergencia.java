package centroDeEmergencia;

public class ColaDePrioridadDeEmergencia implements IColaDePrioridadDeEmergencia {

    private NodoEmergencia frente;
    private int cantidad;

    public ColaDePrioridadDeEmergencia() {
        this.frente = null;
        this.cantidad = 0;
    }

    @Override
    public void insertar(Emergencia dato, int prioridad) {

        NodoEmergencia nuevo = new NodoEmergencia(dato, prioridad);

        if (frente == null || prioridad > frente.getPrioridad()) {

            nuevo.setSiguiente(frente);
            frente = nuevo;

        } else {

            NodoEmergencia actual = frente;

            while (actual.getSiguiente() != null &&
                   actual.getSiguiente().getPrioridad() >= prioridad) {

                actual = actual.getSiguiente();
            }

            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }

        cantidad++;
    }

    @Override
    public Emergencia extraerMayorPrioridad() {

        if (estaVacio()) {
            System.out.println("Error: Cola de emergencia vacia.");
            return null;
        }

        Emergencia emergenciaExtraida = frente.getDato();

        frente = frente.getSiguiente();

        cantidad--;

        return emergenciaExtraida;
    }

    @Override
    public Emergencia verFrente() {

        if (estaVacio()) {
            System.out.println("Error: Cola de emergencia vacia.");
            return null;
        }

        return frente.getDato();
    }

    @Override
    public boolean estaVacio() {
        return cantidad == 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void vaciar() {
        frente = null;
        cantidad = 0;
    }

    
    
}