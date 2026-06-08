package centroDeEmergencia;

public interface IColaDePrioridadDeEmergencia {
    void insertar(Emergencia dato, int prioridad);
    Emergencia extraerMayorPrioridad();
    Emergencia verFrente();
    boolean estaVacio();
}