package src.administrarDispositivos;


public abstract class Dispositivo {
    private String codigo;
    private String estado;

    public Dispositivo(String codigo, String estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public void encender() {
        this.estado = "ENCENDIDO";
    }

    public void apagar() {
        this.estado = "APAGADO";
    }

    public String getCodigo() { 
        return codigo; 
    }
    public void setCodigo(String codigo) { 
        this.codigo = codigo; 
    }
    public String getEstado() { 
        return estado; 
    }
    public void setEstado(String estado) { 
        this.estado = estado; 
    }
}

