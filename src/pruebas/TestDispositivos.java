package pruebas;
import gestionDispositivos.AdministradorDispositivo;
import gestionDispositivos.Camara;
import gestionDispositivos.Dispositivo;
import gestionDispositivos.Semaforo;
public class TestDispositivos {
     public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" PRUEBA DE DISPOSITIVOS");
        System.out.println("====================================");

        AdministradorDispositivo admin =
                new AdministradorDispositivo();

        Camara camara1 =new Camara("CAM-01", "APAGADO");

        Camara camara2 =new Camara("CAM-02", "ENCENDIDO");

        Semaforo semaforo1 =new Semaforo("SEM-01", "APAGADO", "ROJO");

        Semaforo semaforo2 =new Semaforo("SEM-02", "ENCENDIDO", "AMARILLO");

        System.out.println("\n=== REGISTRO DE DISPOSITIVOS ===");

        admin.agregarDispositivo(camara1.getCodigo(),camara1);

        admin.agregarDispositivo(camara2.getCodigo(),camara2);

        admin.agregarDispositivo(semaforo1.getCodigo(),semaforo1);

        admin.agregarDispositivo(semaforo2.getCodigo(),semaforo2);

        System.out.println("\n=== BUSQUEDA DE DISPOSITIVOS ===");

        String codigoCamara = "CAM-01";

        System.out.println("Buscando dispositivo: "+ codigoCamara);

        Dispositivo dispositivoBuscado =admin.buscarDispositivo(codigoCamara);

        if (dispositivoBuscado != null) {

            System.out.println("Dispositivo encontrado: "+ dispositivoBuscado.getCodigo());

            System.out.println("Estado: "+ dispositivoBuscado.getEstado());

        } else {

            System.out.println("No se encontro el dispositivo.");
        }

        System.out.println("\n=== BUSQUEDA DE DISPOSITIVO INEXISTENTE ===");

        String codigoInexistente = "XXX-99";

        System.out.println("Buscando dispositivo: "+ codigoInexistente);

        Dispositivo inexistente =admin.buscarDispositivo(codigoInexistente);

        if (inexistente == null) {

            System.out.println("No se encontro ningun dispositivo con codigo: "+ codigoInexistente);

        } else {

            System.out.println("Dispositivo encontrado: "+ inexistente.getCodigo());
        }

        System.out.println("\n=== ACTUALIZACION DE ESTADOS ===");

        admin.actualizarEstado("CAM-01","ENCENDIDO");

        admin.actualizarEstado("SEM-01","ENCENDIDO");

        System.out.println("CAM-01 estado actual: "+ camara1.getEstado());

        System.out.println("SEM-01 estado actual: "+ semaforo1.getEstado());

        System.out.println("\n=== PRUEBA DE CAMARAS ===");

        System.out.println("Camara: "+ camara1.getCodigo());

        System.out.println("Estado: "+ camara1.getEstado());

        System.out.println("Grabando: "+ (camara1.isGrabando() ? "Sí" : "No"));

        camara1.iniciarGrabacion();

        System.out.println("\nLuego de iniciar grabacion:");

        System.out.println("Camara: "+ camara1.getCodigo());

        System.out.println("Estado: "+ camara1.getEstado());

        System.out.println("Grabando: " + (camara1.isGrabando() ? "Sí" : "No"));

        System.out.println("\n=== PRUEBA DE SEMAFOROS ===");

        System.out.println("Semaforo: "+ semaforo1.getCodigo());

        System.out.println("Estado: "+ semaforo1.getEstado());

        System.out.println("Color inicial: "+ semaforo1.getColorActual());

        semaforo1.cambiarColor("VERDE");

        System.out.println("\nLuego de cambiar color:");

        System.out.println("Semaforo: "+ semaforo1.getCodigo());

        System.out.println("Estado: "+ semaforo1.getEstado());

        System.out.println("Color actual: "+ semaforo1.getColorActual());

        System.out.println("\n=== ELIMINACION DE DISPOSITIVOS ===");

        String codigoEliminar = "CAM-02";

        System.out.println("Eliminando dispositivo: "+ codigoEliminar);

        admin.eliminarDispositivo(codigoEliminar);

        Dispositivo eliminado =admin.buscarDispositivo(codigoEliminar);

        if (eliminado == null) {

            System.out.println("Dispositivo "+ codigoEliminar+ " eliminado correctamente.");

        } else {

            System.out.println("ERROR: No se elimino el dispositivo.");
        }

        System.out.println("\n=== VERIFICACION FINAL ===");

        Dispositivo pruebaCamara =admin.buscarDispositivo("CAM-01");

        Dispositivo pruebaSemaforo =admin.buscarDispositivo("SEM-01");

        if (pruebaCamara != null && pruebaSemaforo != null) {

            System.out.println("OK - El diccionario permite insertar, buscar, actualizar y eliminar dispositivos.");

        } else {

            System.out.println("ERROR - Fallo alguna operacion del diccionario.");
        }

        System.out.println("\n====================================");
        System.out.println(" FIN DE PRUEBA DE DISPOSITIVOS");
        System.out.println("====================================");
    }

}
