package model;

public class TrabajadorCompleto extends Trabajador {

    private String vehiculo;
    public TrabajadorCompleto(String nombre, Double sueldo, Finca finca, String vehiculo){
        super(nombre, sueldo, finca);
        this.vehiculo = vehiculo;
    }


    @Override
    public String toString() {
        return "TrabajadorCompleto{" + "Nombre " + getNombre()+ "Sueldo" + getSueldo()+
                "vehiculo='" + vehiculo + '\'' + " Id " + getId()+
                '}';
    }

    @Override
    public Double calcularSueldo() {
        return  0.0;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}
