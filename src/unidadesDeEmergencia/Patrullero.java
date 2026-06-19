package unidadesDeEmergencia;

public class Patrullero extends Vehiculos {
    private boolean emergenciaActiva;

    public Patrullero(String patente, double velocidad) {
        super(patente, "Patrullero", velocidad);
        this.emergenciaActiva = false;
    }
    public void activarEmergencia() 
    {
        this.emergenciaActiva = true;
        System.out.println("Emergencia policial activada. Unidad: "+ getPatente());
    }

    public boolean isEmergenciaActiva() { return emergenciaActiva; }

    @Override
    public String toString() 
    {
        return "Patrullero - Patente: " + getPatente()+ " | Emergencia activa: " + (emergenciaActiva ? "Si" : "No");
    }
}
