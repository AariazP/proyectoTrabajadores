package model;

public class TrabajadorParcial extends Trabajador{

    private String colorUniforme;

    private Integer horas;

    public TrabajadorParcial(String nombre, Double sueldo, Finca finca, String colorUniforme, Integer horas){
        super(nombre, sueldo, finca);
        this.colorUniforme = colorUniforme;
        this.horas = horas;
        calcularSueldo();
    }

    @Override
    public Double calcularSueldo() {
        Double sueldoAux = horas*1000.0;
        setSueldo(sueldoAux+getSueldo());
        return sueldoAux;
    }

    @Override
    public String toString() {
        return "TrabajadorParcial{" + "Nombre " + getNombre()+ " Sueldo " + getSueldo()+
                    " colorUniforme=' " + colorUniforme + '\'' + " Id " + getId()+
                     '}';

    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }
}
