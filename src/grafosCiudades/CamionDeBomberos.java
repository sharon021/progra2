package grafosCiudades;

public class CamionDeBomberos extends Vehiculos {
    private double capacidadAgua; // en litros

    public CamionDeBomberos(String patente, double velocidad, double capacidadAgua) {
        super(patente, "Camión de Bomberos", velocidad);
        this.capacidadAgua = capacidadAgua;
    }

    // RF09: Método especial
    public void activarManguera() {
        System.out.println("¡Camión de Bomberos " + getPatente() + " esta desplegando las mangueras de alta presión con " + capacidadAgua + "L de agua!");
    }

    public double getCapacidadAgua() { return capacidadAgua; }
    public void setCapacidadAgua(double capacidadAgua) { this.capacidadAgua = capacidadAgua; }

    @Override
    public String toString() 
    {
        return "Camion de Bomberos - Patente: " + getPatente()+ " | Capacidad de agua: " + capacidadAgua + " litros";
    }
    
}
