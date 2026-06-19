package pruebas;

import gestionRutas.Calle;
import gestionRutas.GrafoCiudad;
import gestionRutas.Interseccion;
import gestionRutas.ListaCalles;
import gestionRutas.NodoCalle;

public class TestGestionRutas {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" PRUEBA DE GESTION DE RUTAS");
        System.out.println("====================================");

        GrafoCiudad grafo = new GrafoCiudad();

        Interseccion central = new Interseccion("Central de Emergencias");
        Interseccion hospital = new Interseccion("Hospital Municipal");
        Interseccion plaza = new Interseccion("Plaza Central");
        Interseccion aeropuerto = new Interseccion("Aeropuerto");

        grafo.agregarInterseccion(central);
        grafo.agregarInterseccion(hospital);
        grafo.agregarInterseccion(plaza);
        grafo.agregarInterseccion(aeropuerto);

        grafo.conectarIntersecciones(central, hospital, "Av. San Martin", 2.5, 8);
        grafo.conectarIntersecciones(hospital, plaza, "Av. Belgrano", 1.8, 5);
        grafo.conectarIntersecciones(central, plaza, "Av. Rivadavia", 7.0, 18);

        System.out.println("\n=== INTERSECCIONES CARGADAS ===");
        System.out.println(central);
        System.out.println(hospital);
        System.out.println(plaza);
        System.out.println(aeropuerto);

        System.out.println("\n=== RUTA CENTRAL A HOSPITAL ===");

        ListaCalles rutaHospital = grafo.calcularRutaMinima(central, hospital);
        NodoCalle actualHospital = rutaHospital.getPrimero();

        if (actualHospital == null) {
            System.out.println("No se encontro una ruta disponible.");
        } else {
            while (actualHospital != null) {
                Calle calle = actualHospital.getCalle();

                System.out.println(calle.getOrigen().getId()+ " -> "+ calle.getDestino().getId() + " por "+ calle.getNombre()+ " | "+ calle.getDistancia()+ " km | "+ calle.getTiempoEstimado()+ " min");
                actualHospital = actualHospital.getSiguiente();
            }
        }

        System.out.println("\n=== RUTA CENTRAL A PLAZA ===");

        ListaCalles rutaPlaza = grafo.calcularRutaMinima(central, plaza);
        NodoCalle actualPlaza = rutaPlaza.getPrimero();

        if (actualPlaza == null) {
            System.out.println("No se encontro una ruta disponible.");
        } else {
            while (actualPlaza != null) {
                Calle calle = actualPlaza.getCalle();

                System.out.println(
                        calle.getOrigen().getId()+ " -> "+ calle.getDestino().getId()+ " por "+ calle.getNombre()+ " | "+ calle.getDistancia()+ " km | "+ calle.getTiempoEstimado()+ " min");

                actualPlaza = actualPlaza.getSiguiente();
            }
        }

        System.out.println("\n=== RUTA INEXISTENTE: AEROPUERTO A CENTRAL ===");

        ListaCalles rutaInexistente = grafo.calcularRutaMinima(aeropuerto, central);

        if (rutaInexistente.getPrimero() == null) {
            System.out.println("No se encontro una ruta entre "+ aeropuerto.getId()+ " y "+ central.getId());
        } else {
            System.out.println("ERROR: Se encontro una ruta que no deberia existir.");

            NodoCalle actualInexistente = rutaInexistente.getPrimero();

            while (actualInexistente != null) {
                Calle calle = actualInexistente.getCalle();

                System.out.println(calle.getOrigen().getId()+ " -> "+ calle.getDestino().getId()+ " por "+ calle.getNombre());

                actualInexistente = actualInexistente.getSiguiente();
            }
        }

        System.out.println("\n====================================");
        System.out.println(" FIN DE PRUEBA DE GESTION DE RUTAS");
        System.out.println("====================================");
    }
}