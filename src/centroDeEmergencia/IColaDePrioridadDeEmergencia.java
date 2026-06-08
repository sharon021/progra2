package centroDeEmergencia;

public interface IColaDePrioridadDeEmergencia {
   public void insertar(Emergencia dato, int prioridad);
    public Emergencia eliminar();
    public boolean estaVacio();
    public Emergencia verFrente();
}
