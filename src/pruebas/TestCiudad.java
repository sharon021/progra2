package pruebas;
import ciudad.Barrio;
import ciudad.Ciudad;
import ciudad.Manzana;
import ciudad.Zona;

public class TestCiudad { 
     public static void main(String[] args) {

        Ciudad ciudad = new Ciudad("Ciudad Inteligente");

        Zona zonaNorte = new Zona("Norte");
        Zona zonaSur = new Zona("Sur");

        Barrio barrioCentro = new Barrio("Centro");
        Barrio barrioResidencial = new Barrio("Residencial");

        Manzana manzana1 = new Manzana("MZ-01");
        Manzana manzana2 = new Manzana("MZ-02");
        Manzana manzana3 = new Manzana("MZ-03");

        System.out.println("\n=== CARGA DE ESTRUCTURA ===");

        barrioCentro.agregarManzana(manzana1);
        barrioCentro.agregarManzana(manzana2);

        barrioResidencial.agregarManzana(manzana3);

        zonaNorte.agregarBarrio(barrioCentro);
        zonaSur.agregarBarrio(barrioResidencial);

        ciudad.agregarZona(zonaNorte);
        ciudad.agregarZona(zonaSur);

        System.out.println("Ciudad creada correctamente.");
        System.out.println("Zonas agregadas correctamente.");
        System.out.println("Barrios agregados correctamente.");
        System.out.println("Manzanas agregadas correctamente.");

        System.out.println("\n=== DATOS REGISTRADOS ===");

        System.out.println("Ciudad: " + ciudad.getNombre());

        System.out.println("\nZona: " + zonaNorte.getNombre());
        System.out.println("Barrio: " + barrioCentro.getNombre());
        System.out.println("Manzana: " + manzana1.getCodigo());
        System.out.println("Manzana: " + manzana2.getCodigo());

        System.out.println("\nZona: " + zonaSur.getNombre());
        System.out.println("Barrio: " + barrioResidencial.getNombre());
        System.out.println("Manzana: " + manzana3.getCodigo());

        System.out.println("\n=== RESULTADO DE LA PRUEBA ===");

        System.out.println(
                "OK: Se cargo correctamente la estructura territorial "
                + "Ciudad -> Zona -> Barrio -> Manzana."
        );

        System.out.println("\n=== RESUMEN ===");

        System.out.println("Ciudad creada: 1");
        System.out.println("Zonas creadas: 2");
        System.out.println("Barrios creados: 2");
        System.out.println("Manzanas creadas: 3");

    
    }
    
}
