package grafosCiudades;

public class GrafoCiudad {

    private ListaIntersecciones vertices;
    private ListaCalles aristas;

    public GrafoCiudad() {
        this.vertices = new ListaIntersecciones();
        this.aristas = new ListaCalles();
    }

    public void agregarInterseccion(Interseccion interseccion) {
        vertices.agregar(interseccion);
    }

    public void agregarCalle(Calle calle) {
        aristas.agregar(calle);
    }

    public void conectarIntersecciones(Interseccion origen,
                                       Interseccion destino,
                                       String nombre,
                                       double distancia,
                                       double tiempoEstimado) {

        Calle calle = new Calle(
                nombre,
                distancia,
                tiempoEstimado,
                origen,
                destino
        );

        origen.agregarCalle(calle);
        aristas.agregar(calle);
    }

    public ListaCalles buscarRuta(Interseccion origen,
                                  Interseccion destino) {

        // Implementación futura
        return null;
    }

    public ListaCalles calcularRutaMinima(Interseccion origen,
                                          Interseccion destino) {

        // Implementación futura
        return null;
    }

    public ListaIntersecciones getVertices() {
        return vertices;
    }

    public void setVertices(ListaIntersecciones vertices) {
        this.vertices = vertices;
    }

    public ListaCalles getAristas() {
        return aristas;
    }

    public void setAristas(ListaCalles aristas) {
        this.aristas = aristas;
    }
}