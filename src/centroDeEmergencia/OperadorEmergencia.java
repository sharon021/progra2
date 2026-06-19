package centroDeEmergencia;

public class OperadorEmergencia {
    private String nombre;

    public OperadorEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void procesarReporte(ReporteEmergencia reporte,CentralDeEmergencia central) {

            System.out.println("Operador: " + nombre);
            System.out.println("Reporte recibido de: " + reporte.getNombreReportante());
            System.out.println("Tipo de emergencia: " + reporte.getTipoEmergencia());
            System.out.println("Ubicacion: " + reporte.getUbicacion());
            System.out.println("Vehiculo involucrado: " + reporte.getVehiculoInvolucrado());
            central.registrarEmergencia(reporte.getTipoEmergencia(),reporte.getUbicacion());
            System.out.println("Reporte enviado a la Central de Emergencias.");
        
    }
}