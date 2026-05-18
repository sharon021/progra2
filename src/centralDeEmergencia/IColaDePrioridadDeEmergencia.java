package centralDeEmergencia;

public interface IColaDePrioridadDeEmergencia {
    void insertar(Emergencia dato, int prioridad);
    Emergencia eliminar();
    boolean estaVacio();
    Emergencia verFrente();
}
