package administracionDeDispositivos;
import gestionDispositivos.DiccionariosDeDispositivos;
import gestionDispositivos.Dispositivo;

public class AdministradorDispositivo {
    private DiccionariosDeDispositivos dispositivos;
    public AdministradorDispositivo() 
    {
        this.dispositivos = new DiccionariosDeDispositivos();
    }

    public void agregarDispositivo(String codigo, Dispositivo d) {
        dispositivos.insertar(codigo, d);
        System.out.println("Registrado en diccionario: " + d.getClass().getSimpleName() + " [" + codigo + "]");
    }

    public Dispositivo buscarDispositivo(String codigo) {
        return dispositivos.buscar(codigo);
    }

    public void actualizarEstado(String codigo, String nuevoEstado) {
        Dispositivo d = dispositivos.buscar(codigo);
        if (d != null) {
            d.setEstado(nuevoEstado);
            if (nuevoEstado.equalsIgnoreCase("ENCENDIDO")) {
                d.encender();
            } else {
                d.apagar();
            }
            System.out.println("Estado actualizado para [" + codigo + "] -> " + nuevoEstado);
        } else {
            System.out.println("No se encontró el dispositivo buscado con el codigo: " + codigo);
        }
    }
}
