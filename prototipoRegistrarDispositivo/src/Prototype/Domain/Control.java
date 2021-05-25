package Prototype.Domain;

public class Control extends Dispositivo{
    private String claveProductoAsociado;

    public Control(){
        super();
        this.claveProductoAsociado = "";
    }

    public Control(String estado, String marca, String claveDispositivo,
                   String descripcion, String claveProductoAsociado){
        super(estado, marca, claveDispositivo, descripcion);
        this.claveProductoAsociado = claveProductoAsociado;
    }

    public void setClaveProductoAsociado(String claveProductoAsociado) {
        this.claveProductoAsociado = claveProductoAsociado;
    }

    public String getClaveProductoAsociado() {
        return claveProductoAsociado;
    }
}
