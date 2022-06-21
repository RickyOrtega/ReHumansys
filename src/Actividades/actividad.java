package Actividades;

import Equipo.Empleado;

public class actividad {

    public actividad() {

    }

    private String nombre;
    private String descripcion;
    private int agnoEntrega;
    private int mesEntrega;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAgnoEntrega() {
        return agnoEntrega;
    }

    public void setAgnoEntrega(int agnoEntrega) {
        this.agnoEntrega = agnoEntrega;
    }

    public int getMesEntrega() {
        return mesEntrega;
    }

    public void setMesEntrega(int mesEntrega) {
        this.mesEntrega = mesEntrega;
    }

    public int getDiaEntrega() {
        return diaEntrega;
    }

    public void setDiaEntrega(int diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    public int getAgnoInicio() {
        return agnoInicio;
    }

    public void setAgnoInicio(int agnoInicio) {
        this.agnoInicio = agnoInicio;
    }

    public int getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(int mesInicio) {
        this.mesInicio = mesInicio;
    }

    public int getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    private int diaEntrega;
    private int agnoInicio;
    private int mesInicio;
    private int diaInicio;
    private Empleado empleado1;
    private Empleado empleado2;
}