package pruebas;

import centroDeEmergencia.ColaDePrioridadDeEmergencia;
import centroDeEmergencia.Emergencia;

public class TestEmergencias {

    public static void main(String[] args) {

        ColaDePrioridadDeEmergencia cola = new ColaDePrioridadDeEmergencia();

        Emergencia e1 =
                new Emergencia(
                        "Accidente de transito",
                        "Av. Rivadavia 1230"
                );

        Emergencia e2 =
                new Emergencia(
                        "Incendio",
                        "Av. Corrientes 525"
                );

        Emergencia e3 =
                new Emergencia(
                        "Robo",
                        "Cabildo 222"
                );

        // prioridad: cuanto mas alta, mas urgente
        cola.insertar(e1, 3);
        cola.insertar(e2, 10);
        cola.insertar(e3, 6);

        System.out.println("=== EMERGENCIA MAS GRAVE ===");

        Emergencia emergencia = cola.verFrente();

        System.out.println(
                emergencia.getTipoEmergencia() +
                " - " +
                emergencia.getUbicacionEmergencia()
        );

        System.out.println("\n=== DESPACHANDO ===");

        while (!cola.estaVacio()) {

            Emergencia atendida =
                    cola.extraerMayorPrioridad();

            System.out.println(
                    atendida.getTipoEmergencia() +
                    " - " +
                    atendida.getUbicacionEmergencia()
            );
        }

        System.out.println("\n=== PRUEBA DE COLA VACIA ===");

        cola.extraerMayorPrioridad();
    }
}