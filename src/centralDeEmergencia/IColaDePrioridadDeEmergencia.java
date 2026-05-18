package centralDeEmergencia;

public interface IColaDePrioridadDeEmergencia<T> {
    void insertar(String datoInsertar, int prioridadDato);
    String eliminar();
    boolean estaLleno();
    boolean estaVacio();
    String verFrente();
}
