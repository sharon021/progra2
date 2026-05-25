package grafosCiudades;

public class Ambulancia extends Vehiculos {
    private boolean sirenaActiva;

    // El constructor debe recibir los datos de Vehiculo y pasárselos con 'super'
    public Ambulancia(String patente, double velocidad) {
        super(patente, "Ambulancia", velocidad); // Ponemos "Ambulancia" fijo como tipo
        this.sirenaActiva = false; // Arranca apagada
    }

    // RF09: Método especial solicitado en los requerimientos
    public void activarSirena() {
        this.sirenaActiva = true;
        System.out.println("🚨 ¡Sirena de la Ambulancia [" + getPatente() + "] ACTIVADA! Abriendo paso en el tráfico.");
    }

    public boolean isSirenaActiva() { return sirenaActiva; }

    @Override
    public String toString() {
        return "Ambulancia [Patente=" + getPatente() + ", Sirena=" + (sirenaActiva ? "ACTIVA" : "APAGADA") + "]";
    }
}
