package pruebas;

import centroDeEmergencia.CentralDeEmergencia;
import centroDeEmergencia.OperadorEmergencia;
import centroDeEmergencia.ReporteEmergencia;
import ciudad.Ciudad;
import ciudadInteligente.CiudadInteligente;
import gestionDispositivos.AdministradorDispositivo;
import gestionDispositivos.Camara;
import gestionDispositivos.Semaforo;
import gestionRutas.Calle;
import gestionRutas.GrafoCiudad;
import gestionRutas.Interseccion;
import gestionRutas.ListaCalles;
import gestionRutas.NodoCalle;
import unidadesDeEmergencia.Ambulancia;
import unidadesDeEmergencia.Vehiculos;

public class TestCiudadInteligente {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" PRUEBA INTEGRAL CIUDAD INTELIGENTE");
        System.out.println("====================================");

        GrafoCiudad grafo = new GrafoCiudad();
        CentralDeEmergencia central = new CentralDeEmergencia();
        AdministradorDispositivo admin = new AdministradorDispositivo();
        Ciudad ciudad = new Ciudad("Ciudad Inteligente");

        CiudadInteligente sistema = new CiudadInteligente(grafo,central,admin,ciudad);

        sistema.iniciarSistema();

        System.out.println("\n=== REPORTE DE CIUDADANO ===");

        ReporteEmergencia reporte = new ReporteEmergencia(
                "Juan Perez",
                "Choque",
                "Hospital Municipal",
                "Auto patente ABC123",
                8
        );

        OperadorEmergencia operador =new OperadorEmergencia("Operador 01");

        operador.procesarReporte(reporte, central);

        System.out.println("\n=== EMERGENCIA EN CENTRAL ===");
        central.mostrarProximaEmergencia();

        System.out.println("\n=== CARGA DE RUTA ===");

        Interseccion base = new Interseccion("Central de Emergencias");
        Interseccion hospital = new Interseccion("Hospital Municipal");

        grafo.agregarInterseccion(base);
        grafo.agregarInterseccion(hospital);

        grafo.conectarIntersecciones(
                base,
                hospital,
                "Av. San Martin",
                2.5,
                8
        );

        ListaCalles ruta =grafo.calcularRutaMinima(base, hospital);

        NodoCalle actual =ruta.getPrimero();

        if (actual == null) {

            System.out.println("No se encontro una ruta disponible.");

        } else {

            while (actual != null) {

                Calle calle =actual.getCalle();

                System.out.println("Ruta mas rapida: " + calle.getOrigen().getId()+ " -> "+ calle.getDestino().getId()+ " por "+ calle.getNombre() + " | Tiempo: "+ calle.getTiempoEstimado() + " min");

                actual =actual.getSiguiente();
            }
        }

        System.out.println("\n=== DISPOSITIVOS EN LA RUTA ===");

        Semaforo semaforo =
                new Semaforo("SEM-01", "APAGADO", "ROJO");

        Camara camara =
                new Camara("CAM-01", "APAGADO");

        admin.agregarDispositivo(semaforo.getCodigo(), semaforo);
        admin.agregarDispositivo(camara.getCodigo(), camara);

        admin.actualizarEstado("SEM-01", "ENCENDIDO");
        admin.actualizarEstado("CAM-01", "ENCENDIDO");

        camara.iniciarGrabacion();

        System.out.println("Semaforo inicial: " + semaforo.getColorActual());
        System.out.println("Camara grabando: " + (camara.isGrabando() ? "Si" : "No"));

        System.out.println("\n=== FLUJO VEHICULAR EN INTERSECCION ===");

        Vehiculos auto1 =
                new Vehiculos("AAA111", "Auto", 60);

        Vehiculos auto2 =
                new Vehiculos("BBB222", "Camioneta", 50);

        Vehiculos moto1 =
                new Vehiculos("CCC333", "Moto", 70);

        hospital.agregarVehiculo(auto1);
        hospital.agregarVehiculo(auto2);
        hospital.agregarVehiculo(moto1);

        System.out.println("Vehiculos esperando en la interseccion:");
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(moto1);

        System.out.println("\n=== PROTOCOLO DE EMERGENCIA ===");

        System.out.println("Semaforo cambia a VERDE para liberar el paso.");
        semaforo.cambiarColor("VERDE");

        System.out.println("Semaforo actual: " + semaforo.getColorActual());

        System.out.println("\nLiberando vehiculos en orden de llegada:");

        while (!hospital.getColaVehiculos().estaVacia()) {

            Vehiculos vehiculoLiberado =
                    (Vehiculos) hospital.liberarVehiculo();

            System.out.println("Vehiculo liberado: " + vehiculoLiberado);
        }

        Ambulancia ambulancia =
                new Ambulancia("AMB-101", 120);

        ambulancia.activarSirena();

        System.out.println("\nUnidad despachada:");
        System.out.println(ambulancia);

        System.out.println("\n=== ATENCION DE EMERGENCIA ===");
        central.atenderEmergencia();

        System.out.println("\nRestableciendo semaforo luego del despacho.");
        semaforo.cambiarColor("ROJO");

        System.out.println("Semaforo actual: " + semaforo.getColorActual());

        System.out.println("\n=== REPORTE FINAL ===");
        sistema.generarReporte();

        System.out.println("\nOK: La prueba integra reporte ciudadano, operador, central de emergencia, grafo, dispositivos, flujo vehicular y unidad de emergencia.");

        System.out.println("\n====================================");
        System.out.println(" FIN DE PRUEBA INTEGRAL");
        System.out.println("====================================");
    }
}