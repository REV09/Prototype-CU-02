package Prototype.Domain;

public class Proyector extends Dispositivo{
    private String capacidad;

    public Proyector(){
        super();
        this.capacidad = "";
    }

    public Proyector(String estado, String marca, String claveDispositivo,
                     String descripcion, String capacidad){
        super(estado, marca, claveDispositivo, descripcion);
        this.capacidad = capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCapacidad() {
        return capacidad;
    }
}
