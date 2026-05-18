package src.centralDeEmergencia;

import centralDeEmergencia.IColaDePrioridadDeEmergencia;
import centralDeEmergencia.NodoEmergencia;

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
            while (actual.getSiguiente() != null && actual.getSiguiente().getPrioridad() >= prioridad) {
                actual = actual.getSiguiente();
            }
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }
        cantidad++;
    }

    @Override
    public Emergencia eliminar() {
        if (estaVacio()) {
            System.out.println("Error: Cola de emergencia vacía.");
            return null;
        }
        Emergencia datoExtraido = frente.getDato();
        frente = frente.getSiguiente();
        cantidad--;
        return datoExtraido;
    }

    @Override
    public Emergencia verFrente() {
        if (estaVacio()) {
            System.out.println("Error: Cola vacía.");
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
}