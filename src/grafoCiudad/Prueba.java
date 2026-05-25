package grafoCiudad;

public class Prueba {

    public static void main(String[] args) {
        ColaVehiculos esquinaAvColon = new ColaVehiculos();

        // Creamos tres vehículos que llegan a la esquina
        Vehiculos v1 = new Vehiculos("AAA111", "Auto", 40);
        Vehiculos v2 = new Vehiculos("BBB222", "Colectivo", 30);
        Vehiculos v3 = new Vehiculos("CCC333", "Moto", 50);

        // Llegan en orden cronológico
        System.out.println("--- Llegando a la esquina ---");
        esquinaAvColon.encolar(v1);
        System.out.println("Llegó: " + v1.getPatente());
        esquinaAvColon.encolar(v2);
        System.out.println("Llegó: " + v2.getPatente());
        esquinaAvColon.encolar(v3);
        System.out.println("Llegó: " + v3.getPatente());

        // Se abre el semáforo y se liberan (FIFO)
        System.out.println("\n--- Semáforo en verde (Liberando) ---");
        System.out.println("Se liberó: " + esquinaAvColon.desencolar()); // Debe salir AAA111
        System.out.println("Se liberó: " + esquinaAvColon.desencolar()); // Debe salir BBB222
        System.out.println("Se liberó: " + esquinaAvColon.desencolar()); // Debe salir CCC333
        
        // Prueba de validación de estructura vacía (RNF02)
        System.out.println("Se liberó: " + esquinaAvColon.desencolar()); // Debe tirar la alerta
    }
    
}
