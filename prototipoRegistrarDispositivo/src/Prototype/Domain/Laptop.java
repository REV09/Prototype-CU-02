package Prototype.Domain;

public class Laptop extends Dispositivo{
    private String procesador;
    private String capacidad;

    public Laptop(){
        super();
        this.capacidad = "";
        this.procesador = "";
    }

    public Laptop(String estado, String marca, String claveDispositivo,
                  String descripcion, String procesador,
                  String capacidad){
        super(estado,marca,claveDispositivo,descripcion);
        this.procesador = procesador;
        this.capacidad = capacidad;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getCapacidad() {
        return capacidad;
    }
}
