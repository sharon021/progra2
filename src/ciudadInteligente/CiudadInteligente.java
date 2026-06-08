package ciudadInteligente;

import centroDeEmergencia.CentralDeEmergencia;
import ciudad.Ciudad;
import gestionDispositivos.AdministradorDispositivo;
import grafosCiudades.GrafoCiudad;

public class CiudadInteligente {

    private GrafoCiudad grafoCiudad;
    private CentralDeEmergencia centralEmergencias;
    private AdministradorDispositivo administradorDeDispositivos;
    private Ciudad ciudad;

    public CiudadInteligente(
            GrafoCiudad grafoCiudad,
            CentralDeEmergencia centralEmergencias,
            AdministradorDispositivo administradorDeDispositivos,
            Ciudad ciudad) {

        this.grafoCiudad = grafoCiudad;
        this.centralEmergencias = centralEmergencias;
        this.administradorDeDispositivos = administradorDeDispositivos;
        this.ciudad = ciudad;
    }

    public void iniciarSistema() {
        System.out.println("Sistema iniciado");
    }

    public void generarReporte() {
        System.out.println("===== REPORTE =====");
        System.out.println("Ciudad: " + ciudad.getNombre());
    }

    public GrafoCiudad getGrafoCiudad() {
        return grafoCiudad;
    }

    public void setGrafoCiudad(GrafoCiudad grafoCiudad) {
        this.grafoCiudad = grafoCiudad;
    }

    public CentralDeEmergencia getCentralEmergencias() {
        return centralEmergencias;
    }

    public void setCentralEmergencias(CentralDeEmergencia centralEmergencias) {
        this.centralEmergencias = centralEmergencias;
    }

    public AdministradorDispositivo getAdministradorDeDispositivos() {
        return administradorDeDispositivos;
    }

    public void setAdministradorDeDispositivos(
            AdministradorDispositivo administradorDeDispositivos) {
        this.administradorDeDispositivos = administradorDeDispositivos;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}