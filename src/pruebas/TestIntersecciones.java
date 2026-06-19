package pruebas;

import gestionRutas.Interseccion;
import unidadesDeEmergencia.Vehiculos;

public class TestIntersecciones {

    public static void main(String[] args) {

        Interseccion interseccion =
                new Interseccion("I-01");

        Vehiculos v1 =
                new Vehiculos(
                        "AAA111",
                        "Auto",
                        80
                );

        Vehiculos v2 =
                new Vehiculos(
                        "BBB222",
                        "Camioneta",
                        70
                );

        Vehiculos v3 =
                new Vehiculos(
                        "CCC333",
                        "Moto",
                        90
                );

        interseccion.agregarVehiculo(v1);
        interseccion.agregarVehiculo(v2);
        interseccion.agregarVehiculo(v3);

        System.out.println("=== LIBERANDO VEHICULOS ===");

        while (!interseccion.getColaVehiculos().estaVacia()) {

            Vehiculos vehiculo =
                    (Vehiculos) interseccion.liberarVehiculo();

            System.out.println(vehiculo);
        }

        System.out.println("\n=== PRUEBA DE INTERSECCION VACIA ===");

        interseccion.liberarVehiculo();
    }
}