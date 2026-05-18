package centralDeEmergencia;

public interface IColaDePrioridadDeEmergencia<T> {
    void insertar(T datoInsertar, int prioridadDato);
    T eliminar();
    boolean estaLleno();
    boolean estaVacio();
    T verFrente();
}
