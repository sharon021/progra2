package grafosCiudades;

public class ColaIntersecciones {
    private NodoInterseccion frente;
    private NodoInterseccion fin;
    public ColaIntersecciones() {
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Interseccion interseccion) {
        NodoInterseccion nuevo = new NodoInterseccion(interseccion);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public Interseccion desencolar() {
        if (estaVacia()) {
            System.out.println("Cola de intersecciones vacia");
            return null;
        }
        Interseccion resultado = frente.getInterseccion();
        frente = frente.getSiguiente();
        if (frente == null) fin = null;
        return resultado;
    }
}
