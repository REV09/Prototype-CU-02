package Prototype.Domain;

public class Dispositivo{
    private String estado;
    private String marca;
    private String claveDispositivo;
    private String descripcion;

    public Dispositivo(){
        this.estado = "";
        this.marca = "";
        this.claveDispositivo = "";
        this.descripcion = "";
    }

    public Dispositivo(String estado, String marca, String claveDispositivo, String descripcion){
        this.estado = estado;
        this.marca = marca;
        this.claveDispositivo = claveDispositivo;
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setClaveDispositivo(String claveDispositivo) {
        this.claveDispositivo = claveDispositivo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public String getMarca() {
        return marca;
    }

    public String getClaveDispositivo() {
        return claveDispositivo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
