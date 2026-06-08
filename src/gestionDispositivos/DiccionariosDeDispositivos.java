package gestionDispositivos;


public class DiccionariosDeDispositivos {
    private final NodoDiccionario[] tabla;
    private final int TAMANIO = 10;

    public DiccionariosDeDispositivos() {
        this.tabla = new NodoDiccionario[TAMANIO];
    }

    // RENOMBRADA: Ahora se llama funcionDiccionario como me pediste
    private int funcionDiccionario(String clave) {
        return Math.abs(clave.hashCode()) % TAMANIO;
    }

    public void insertar(String clave, Dispositivo valor) {
        // Usamos el nuevo nombre de la función para calcular el índice
        int indice = funcionDiccionario(clave);
        NodoDiccionario nuevo = new NodoDiccionario(clave, valor);

        if (tabla[indice] == null) {
            tabla[indice] = nuevo;
        } else {
            NodoDiccionario actual = tabla[indice];
            while (actual.getSiguiente() != null) {
                // EL EQUALS ACÁ: Compara si la clave ya existe letra por letra
                if (actual.getClave().equals(clave)) {
                    actual.setValor(valor); // Si ya existe, reemplaza el valor viejo
                    return;
                }
                actual = actual.getSiguiente();
            }
            // Segunda verificación con .equals() para el último nodo de la lista
            if (actual.getClave().equals(clave)) {
                actual.setValor(valor);
            } else {
                actual.setSiguiente(nuevo); // Si es un ID totalmente nuevo, se engancha al final
            }
        }
    }

    public Dispositivo buscar(String clave) {
        int indice = funcionDiccionario(clave);
        NodoDiccionario actual = tabla[indice];

        while (actual != null) {
           
            if (actual.getClave().equals(clave)) {
                return actual.getValor(); // Si coincide perfectamente, te devuelve el dispositivo
            }
            actual = actual.getSiguiente(); 
        }
        return null; 
    }

    public void eliminar(String clave) {

        int indice = funcionDiccionario(clave);
        NodoDiccionario actual = tabla[indice];
        NodoDiccionario anterior = null;

        while (actual != null) {
           
            if (actual.getClave().equals(clave)) {
                if (anterior == null) {
                    tabla[indice] = actual.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }
}
