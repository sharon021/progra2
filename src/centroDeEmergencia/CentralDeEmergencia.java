package  centroDeEmergencia;

public class CentralDeEmergencia {

    private final ColaDePrioridadDeEmergencia cola;

    public CentralDeEmergencia() {
        cola = new ColaDePrioridadDeEmergencia();
    }

    public void registrarEmergencia(
            String tipo,
            String ubicacion,
            int prioridad) {

        Emergencia nuevaEmergencia =new Emergencia(tipo, ubicacion);

        cola.insertar(nuevaEmergencia, prioridad);

        System.out.println("Emergencia registrada correctamente.");
    }

    public void atenderEmergencia() {

        if (cola.estaVacio()) {

            System.out.println("No hay emergencias para atender.");

        } else {

            Emergencia atendida = cola.eliminar();

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

        System.out.println(
                "Cantidad de emergencias: "
                        + cola.getCantidad()
        );
    }

}

