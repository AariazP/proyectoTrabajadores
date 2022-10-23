package model;

public abstract class Trabajador {

    private String nombre;

    private Double sueldo;

    private Finca finca;

    private Integer id;

    private static Integer idAux =0 ;

    public Trabajador(String nombre, Double sueldo, Finca finca) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.finca=finca;
        id=++idAux;
    }


    public abstract Double calcularSueldo();


    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static Integer getIdAux() {
        return idAux;
    }

    public static void setIdAux(Integer idAux) {
        Trabajador.idAux = idAux;
    }

    public Double getSueldo() {
        return sueldo;
    }
}
