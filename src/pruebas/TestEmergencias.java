package pruebas;

import centroDeEmergencia.CentralDeEmergencia;

public class TestEmergencias {

    public static void main(String[] args) {

        CentralDeEmergencia central = new CentralDeEmergencia();

        System.out.println("\n=== REGISTRO CON PRIORIDAD AUTOMATICA ===");

        central.registrarEmergencia("Corte de calle", "Av. Cabildo 1500");
        central.registrarEmergencia("Incendio", "Av. Corrientes 525");
        central.registrarEmergencia("Accidente", "Av. Rivadavia 1230");
        central.registrarEmergencia("Semaforo roto", "Cabildo 222");
        central.registrarEmergencia("Otro incidente", "Plaza Central");

        System.out.println("\n=== CANTIDAD DE EMERGENCIAS ===");
        central.mostrarCantidadEmergencias();

        System.out.println("\n=== EMERGENCIA MAS GRAVE ===");
        central.mostrarProximaEmergencia();

        System.out.println("\n=== DESPACHANDO POR PRIORIDAD ===");

        central.atenderEmergencia();
        central.atenderEmergencia();
        central.atenderEmergencia();
        central.atenderEmergencia();
        central.atenderEmergencia();

        System.out.println("\n=== PRUEBA DE COLA VACIA ===");
        central.atenderEmergencia();
    }
}