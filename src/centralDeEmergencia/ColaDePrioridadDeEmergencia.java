package centralDeEmergencia;

import centralDeEmergencia.IColaDePrioridadDeEmergencia;

public class ColaDePrioridadDeEmergencia<T> implements IColaDePrioridadDeEmergencia<T> {

    private static class Elemento{
        String dato;
        int prioridad;
        Elemento(String dato, int prioridad){
            this.dato = dato;
            this.prioridad = prioridad;
        }
    }

    private Elemento[] datos;
    private int cantidad;
    private final int MAX;

    public ColaDePrioridadDeEmergencia(int tamaño) {
        this.MAX = tamaño;
        this.datos = new Elemento[MAX];
        this.cantidad = 0;
    }

    @Override
    public void insertar(String datoInsertar, int prioridadDato){
        if (cantidad < MAX) {
        int i = cantidad - 1;
        while (i >= 0 && datos[i].prioridad < prioridadDato) {
            datos[i + 1] = datos[i];
            i--;
        }
        datos[i + 1] = new Elemento(datoInsertar, prioridadDato);
        cantidad++;
        } else {
            System.out.println("Error: Cola de emergencia llena.");
        }
}

    @Override
    public String eliminar() {
        if (cantidad > 0) {
            String datoExtraido = datos[0].dato;
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
            }
            datos[cantidad - 1] = null;
            cantidad--;
            return datoExtraido;
        }
        System.out.println("Error: Cola vacía.");
        return null;
    }

    @Override
    public boolean estaLleno() {
        return cantidad == MAX;
    }

    @Override
    public boolean estaVacio() {
        return cantidad == 0;
    }

    @Override
    public String verFrente() {
        return datos[0].dato;
    }
}
