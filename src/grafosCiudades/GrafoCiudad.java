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

    public void conectarIntersecciones(Interseccion origen,Interseccion destino,String nombre,double distancia,double tiempoEstimado) {

        Calle calle = new Calle(nombre,distancia,tiempoEstimado,origen,destino);

        origen.agregarCalle(calle);
        aristas.agregar(calle);
    }

    public ListaCalles buscarRuta(Interseccion origen,Interseccion destino) 
    {
        ListaCalles ruta = new ListaCalles();

        if (origen == null || destino == null) 
            {
            return ruta;
            }

        Calle calleDirecta = origen.buscarCalleHacia(destino);

        if (calleDirecta != null) 
            {
                ruta.agregar(calleDirecta);
            } 
        else {
                System.out.println("No se encontro una ruta directa.");
            }

        return ruta;

    }

    public ListaCalles calcularRutaMinima(Interseccion origen,Interseccion destino) {

        return buscarRuta(origen, destino);
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