package  centroDeEmergencia;

public class CentralDeEmergencia {

    private final ColaDePrioridadDeEmergencia cola;

    public CentralDeEmergencia() {
        cola = new ColaDePrioridadDeEmergencia();
    }

    public void registrarEmergencia(String tipo,String ubicacion) {
        int prioridad = calcularPrioridad(tipo);
        Emergencia nuevaEmergencia =new Emergencia(tipo, ubicacion);

        cola.insertar(nuevaEmergencia, prioridad);

        System.out.println("Emergencia registrada correctamente. Prioridad: "+prioridad);
    }
        private int calcularPrioridad(String tipo) {

            if (tipo.equalsIgnoreCase("Incendio")|| tipo.equalsIgnoreCase("Incendios")) {
                return 10;
            }

            if (tipo.equalsIgnoreCase("Accidente")|| tipo.equalsIgnoreCase("Accidentes")|| tipo.equalsIgnoreCase("Accidente de transito")|| tipo.equalsIgnoreCase("Choque")) {
                return 8;
            }

            if (tipo.equalsIgnoreCase("Corte de calle")|| tipo.equalsIgnoreCase("Cortes de calle")) {
                return 5;
            }

            if (tipo.equalsIgnoreCase("Semaforo roto")) {
                return 4;
            }

            return 1;
        }

    public void atenderEmergencia() {

        if (cola.estaVacio()) {

            System.out.println("No hay emergencias para atender.");

        } else {

            Emergencia atendida = cola.extraerMayorPrioridad();

            System.out.println("Atendiendo emergencia:");

            System.out.println(atendida);
        }
    }

    public void mostrarProximaEmergencia() {

        if (cola.estaVacio()) {

            System.out.println("No hay emergencias pendientes.");

        } else {

            System.out.println("Próxima emergencia:");

            System.out.println(
                    cola.verFrente()
            );
        }
    }

    public void mostrarCantidadEmergencias() {

        System.out.println("Cantidad de emergencias: "+ cola.getCantidad());
    }

}

