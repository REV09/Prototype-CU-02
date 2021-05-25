package Prototype.Domain;

public class Cable extends Dispositivo{
    private String adaptador;

    public Cable(){
        super();
        this.adaptador = "";
    }

    public Cable(String estado, String marca, String claveDispositivo,
                 String descripcion, String adaptador) {
        super(estado,marca,claveDispositivo,descripcion);
        this.adaptador = adaptador;
    }

    public void setAdaptador(String adaptador) {
        this.adaptador = adaptador;
    }

    public String getAdaptador() {
        return adaptador;
    }
}
