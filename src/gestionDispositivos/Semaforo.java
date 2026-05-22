package gestionDispositivos;

public class Semaforo extends Dispositivo {
    private String colorActual;

    public Semaforo(String codigo, String estado, String colorActual) {
        super(codigo, estado);
        this.colorActual = colorActual;
    }

    public void cambiarColor(String nuevoColor) {
        this.colorActual = nuevoColor;
    }

    public String getColorActual() { return colorActual; }
    public void setColorActual(String colorActual) { this.colorActual = colorActual; }

    
}
