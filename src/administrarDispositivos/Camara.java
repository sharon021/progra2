package src.administrarDispositivos;

public class Camara extends Dispositivo {
    private boolean grabando;

    public Camara(String codigo, String estado) {
        super(codigo, estado);
        this.grabando = false;
    }

    public void iniciarGrabacion() {
        this.grabando = true;
    }

    public boolean isGrabando() 
    { 
        return grabando; 
    }
    public void setGrabando(boolean grabando) 
    { 
        this.grabando = grabando; 
    }


    
}
