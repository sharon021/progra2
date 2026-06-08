package centroDeEmergencia;

public class OrdenDePrioridadDeEmergencia {

    private NodoEmergencia[] elementos;
    private int tamanio;

    public OrdenDePrioridadDeEmergencia(int capacidad) {
        elementos = new NodoEmergencia[capacidad];
        tamanio = 0;
    }

    public void insertar(Emergencia emergencia, int prioridad) {

        if (tamanio == elementos.length) {
            System.out.println("Cola llena");
            return;
        }

        NodoEmergencia nuevo = new NodoEmergencia(emergencia, prioridad);

        elementos[tamanio] = nuevo;

        reordenarArriba(tamanio);

        tamanio++;
    }

    public Emergencia eliminarMayorPrioridad() {

        if (tamanio == 0) {
            return null;
        }

        Emergencia resultado = elementos[0].getDato();

        elementos[0] = elementos[tamanio - 1];
        elementos[tamanio - 1] = null;

        tamanio--;

        reordenarAbajo(0);

        return resultado;
    }

    private void reordenarArriba(int indice) {

        while (indice > 0) {

            int padre = (indice - 1) / 2;

            if (elementos[indice].getPrioridad() >
                elementos[padre].getPrioridad()) {

                NodoEmergencia aux = elementos[indice];
                elementos[indice] = elementos[padre];
                elementos[padre] = aux;

                indice = padre;
            } else {
                break;
            }
        }
    }

    private void reordenarAbajo(int indice) {

        while (true) {

            int hijoIzq = 2 * indice + 1;
            int hijoDer = 2 * indice + 2;

            int mayor = indice;

            if (hijoIzq < tamanio &&
                elementos[hijoIzq].getPrioridad() >
                elementos[mayor].getPrioridad()) {

                mayor = hijoIzq;
            }

            if (hijoDer < tamanio &&
                elementos[hijoDer].getPrioridad() >
                elementos[mayor].getPrioridad()) {

                mayor = hijoDer;
            }

            if (mayor == indice) {
                break;
            }

            NodoEmergencia aux = elementos[indice];
            elementos[indice] = elementos[mayor];
            elementos[mayor] = aux;

            indice = mayor;
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public boolean estaVacia() {
        return tamanio == 0;
    }
}