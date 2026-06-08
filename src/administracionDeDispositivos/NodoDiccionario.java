package administracionDeDispositivos;

import gestionDispositivos.Dispositivo;



public class NodoDiccionario {
   private String clave;
    private Dispositivo valor;
    private NodoDiccionario siguiente;

    public NodoDiccionario(String clave, Dispositivo valor) {
        this.clave = clave;
        this.valor = valor;
        this.siguiente = null;
    }

    public String getClave() 
    { 
        return clave; 
    }
    public void setClave(String clave) 
    { 
        this.clave = clave; 
    }
    public Dispositivo getValor() { 
        return valor; 
    }
    public void setValor(Dispositivo valor) 
    { 
        this.valor = valor; 
    }
    public NodoDiccionario getSiguiente() { 
        return siguiente; 
    }
    public void setSiguiente(NodoDiccionario siguiente) { 
        this.siguiente = siguiente; 
    }


    
}
