package centroDeEmergencia;
public class Emergencia {
    private String tipoEmergencia;
    private String ubicacionEmergencia;

    public Emergencia(String tipoEmergencia, String ubicacionEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
        this.ubicacionEmergencia = ubicacionEmergencia;
    }

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public String getUbicacionEmergencia() {
        return ubicacionEmergencia;
    }

    public void setUbicacionEmergencia(String ubicacionEmergencia) {
        this.ubicacionEmergencia = ubicacionEmergencia;
    }
    @Override
    public String toString() {
        return "Emergencia: " + tipoEmergencia +
               " | Ubicacion: " + ubicacionEmergencia;
    }
}