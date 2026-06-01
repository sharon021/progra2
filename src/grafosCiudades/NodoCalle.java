package grafosCiudades;

public class NodoCalle {

    private Calle calle;
    private NodoCalle siguiente;

    // Constructor
    public NodoCalle(Calle calle) 
    {
        this.calle = calle;
        this.siguiente = null; // Al crearse, no apunta a nadie todavía
    }

    // Getters y Setters
    public Calle getCalle() 
    { 
        return calle; 

    }
    public void setCalle(Calle calle) 
    { 
        this.calle = calle; 
    }

    public NodoCalle getSiguiente() 
    { 
        return siguiente; 

    }
    public void setSiguiente(NodoCalle siguiente) 
    { 
        this.siguiente = siguiente; 
    }
    
}