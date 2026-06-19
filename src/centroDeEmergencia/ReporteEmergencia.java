package centroDeEmergencia;

public class ReporteEmergencia {
    private String nombreReportante;
    private String tipoEmergencia;
    private String ubicacion;
    private String vehiculoInvolucrado;
   

    public ReporteEmergencia(
            String nombreReportante,
            String tipoEmergencia,
            String ubicacion,
            String vehiculoInvolucrado,
            int prioridad) {

        this.nombreReportante = nombreReportante;
        this.tipoEmergencia = tipoEmergencia;
        this.ubicacion = ubicacion;
        this.vehiculoInvolucrado = vehiculoInvolucrado;
       
    }

    public String getNombreReportante() {
        return nombreReportante;
    }

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getVehiculoInvolucrado() {
        return vehiculoInvolucrado;
    }

    
    
}
