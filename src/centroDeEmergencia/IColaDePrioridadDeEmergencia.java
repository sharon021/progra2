package centroDeEmergencia;

public interface IColaDePrioridadDeEmergencia {
    void insertar(Emergencia dato, int prioridad);
    boolean estaVacio();
    Emergencia verFrente();
    Emergencia extraerMayorPrioridad();
}