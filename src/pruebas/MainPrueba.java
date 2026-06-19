package pruebas;

import centroDeEmergencia.CentralDeEmergencia;
import ciudad.Ciudad;
import ciudadInteligente.CiudadInteligente;
import gestionDispositivos.AdministradorDispositivo;
import gestionDispositivos.Camara;
import gestionDispositivos.Dispositivo;
import gestionDispositivos.Semaforo;
import gestionRutas.Calle;
import gestionRutas.GrafoCiudad;
import gestionRutas.Interseccion;
import gestionRutas.ListaCalles;
import gestionRutas.NodoCalle;
import unidadesDeEmergencia.Ambulancia;
import unidadesDeEmergencia.CamionDeBomberos;
import unidadesDeEmergencia.Patrullero;
import unidadesDeEmergencia.Vehiculos;

public class MainPrueba {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" SISTEMA CIUDAD INTELIGENTE");
        System.out.println("====================================");

        GrafoCiudad grafo = new GrafoCiudad();
        CentralDeEmergencia central = new CentralDeEmergencia();
        AdministradorDispositivo adminDispositivos = new AdministradorDispositivo();
        Ciudad ciudad = new Ciudad("Ciudad Inteligente");

        CiudadInteligente sistema = new CiudadInteligente(
                grafo,
                central,
                adminDispositivos,
                ciudad
        );

        sistema.iniciarSistema();
        sistema.generarReporte();

        System.out.println("\nEMERGENCIAS REGISTRADAS: ");

        central.registrarEmergencia("Semaforo roto", "Av. Rivadavia y Acoyte", 2);
        central.registrarEmergencia("Incendio", "Hospital Municipal", 10);
        central.registrarEmergencia("Accidente de transito", "Plaza Central", 7);

        central.mostrarCantidadEmergencias();
        central.mostrarProximaEmergencia();

        System.out.println("\nDespachando emergencias por prioridad:");

        central.atenderEmergencia();
        central.atenderEmergencia();
        central.atenderEmergencia();
        central.atenderEmergencia();

        System.out.println("\nGRAFO CIUDAD: ");

        Interseccion centralEmergencias = new Interseccion("Central de Emergencias");
        Interseccion hospital = new Interseccion("Hospital Municipal");
        Interseccion plazaCentral = new Interseccion("Plaza Central");

        grafo.agregarInterseccion(centralEmergencias);
        grafo.agregarInterseccion(hospital);
        grafo.agregarInterseccion(plazaCentral);

        grafo.conectarIntersecciones(centralEmergencias,hospital,"Av. San Martin",2.5,8);

        grafo.conectarIntersecciones(hospital,plazaCentral,"Av. Belgrano",1.8,5);

        System.out.println("Intersecciones cargadas:");
        System.out.println(centralEmergencias);
        System.out.println(hospital);
        System.out.println(plazaCentral);

        System.out.println("\nCalles conectadas desde Central de Emergencias:");

        ListaCalles callesCentral = centralEmergencias.getCallesConectadas();
        NodoCalle actual = callesCentral.getPrimero();

        while (actual != null) {
            Calle calle = actual.getCalle();

            System.out.println(calle.getOrigen().getId()+ " a "+ calle.getDestino().getId()+ " por "+ calle.getNombre()+ " | Distancia: "+ calle.getDistancia()+ " km | Tiempo estimado: "+ calle.getTiempoEstimado()+ " min");
            actual = actual.getSiguiente();
        }

        System.out.println("\nCalculando ruta de emergencia:");

        ListaCalles ruta = grafo.calcularRutaMinima(centralEmergencias, hospital);
        NodoCalle nodoRuta = ruta.getPrimero();

        if (nodoRuta == null) {
            System.out.println("No se encontro una ruta disponible.");
        } else {
            while (nodoRuta != null) {
                Calle calle = nodoRuta.getCalle();

                System.out.println("Ruta encontrada desde "+ calle.getOrigen().getId()+ " hasta "+ calle.getDestino().getId());

                System.out.println("Calle utilizada: " + calle.getNombre());
                System.out.println("Distancia: " + calle.getDistancia() + " km");
                System.out.println("Tiempo estimado: " + calle.getTiempoEstimado() + " minutos");

                nodoRuta = nodoRuta.getSiguiente();
            }
        }

        System.out.println("\nVEHICULOS DE EMERGENCIA");

        Ambulancia ambulancia = new Ambulancia("AMB-101", 120);
        Patrullero patrullero = new Patrullero("PAT-202", 140);
        CamionDeBomberos bomberos = new CamionDeBomberos("BOM-303", 90, 5000);

        centralEmergencias.agregarVehiculo(ambulancia);
        centralEmergencias.agregarVehiculo(patrullero);
        centralEmergencias.agregarVehiculo(bomberos);

        ambulancia.activarSirena();
        patrullero.activarEmergencia();
        bomberos.activarManguera();

        System.out.println("\nUnidades despachadas:");

        while (!centralEmergencias.getColaVehiculos().estaVacia()) {
            Vehiculos unidad = (Vehiculos) centralEmergencias.liberarVehiculo();
            System.out.println(unidad);
        }

        System.out.println("\nDISPOSITIVOS");

        Camara camara = new Camara("CAM-01", "APAGADO");
        Semaforo semaforo = new Semaforo("SEM-01", "APAGADO", "ROJO");

        adminDispositivos.agregarDispositivo(camara.getCodigo(), camara);
        adminDispositivos.agregarDispositivo(semaforo.getCodigo(), semaforo);

        System.out.println("\nBuscando dispositivo CAM-01:");

        Dispositivo dispositivoBuscado = adminDispositivos.buscarDispositivo("CAM-01");

        if (dispositivoBuscado != null) {
            System.out.println(
                    "Dispositivo encontrado: "
                            + dispositivoBuscado.getCodigo()
                            + " | Estado: "
                            + dispositivoBuscado.getEstado()
            );
        } else {
            System.out.println("No se encontro el dispositivo.");
        }

        System.out.println("\nActualizando estado de SEM-01:");

        adminDispositivos.actualizarEstado("SEM-01", "ENCENDIDO");

        semaforo.cambiarColor("VERDE");

        System.out.println(
                "Semaforo "
                        + semaforo.getCodigo()
                        + " en color "
                        + semaforo.getColorActual()
        );

        System.out.println("\nIniciando grabacion de CAM-01:");

        camara.iniciarGrabacion();

        System.out.println("Camara "+ camara.getCodigo()+ " grabando: "+ camara.isGrabando());

    }
}