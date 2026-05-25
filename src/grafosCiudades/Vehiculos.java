package grafosCiudades;

public class Vehiculos {
    private String patente;
    private String tipo; //aca pongo esto es para identificar el tipo de vehiculo
    private double velocidad;

    // Constructor
    public Vehiculos(String patente, String tipo, double velocidad) {
        this.patente = patente;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }
    public String getPatente() { 
        return patente; 
    }
    public void setPatente(String patente) 
    { 
        this.patente = patente; 
    }

    public String getTipo() { 
        return tipo; 
    }
    public void setTipo(String tipo) 
    { 
        this.tipo = tipo; 
    }

    public double getVelocidad() 
    { 
        return velocidad; 
    }
    public void setVelocidad(double velocidad) 
    { 
        this.velocidad = velocidad; 
    }

    @Override
    public String toString()
     {
        return "Tipo de vehiculo: " + tipo + ". Patente: " + patente;
    }
    
}
