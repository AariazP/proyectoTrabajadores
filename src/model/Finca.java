package model;

import java.util.ArrayList;

public class Finca {

    private ArrayList<Trabajador> listaTrabajadores;

    public Finca(){
        listaTrabajadores = new ArrayList<>();
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }


    public void crearEmpleadoTiempoCompleto(String nombre, Double sueldo, String vehiculo) {

        TrabajadorCompleto trabajadorCompleto = new TrabajadorCompleto(nombre, sueldo, this, vehiculo);

        listaTrabajadores.add(trabajadorCompleto);
        System.out.println("El trabajador de tiempo completo se ha creado");
        System.out.println("trabajadorCompleto = " + trabajadorCompleto);

    }

    public void crearEmpleadoTiempoParcial(String nombre, Double sueldo, String colorUniforme, Integer horas) {

        Trabajador trabajadorCompleto = new TrabajadorParcial(nombre, sueldo, this, colorUniforme, horas);

        listaTrabajadores.add(trabajadorCompleto);
        System.out.println("El trabajador de tiempo parcial se ha creado");
        System.out.println("trabajadorCompleto = " + trabajadorCompleto);

    }
}
