package Proyectos;

import Equipo.Empleado;

public class proyecto {
    public proyecto() {
        this.nombre = "Proyecto Vacío";
    }

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

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    private String nombre;
    private String descripcion;
    private int agnoEntrega;
    private int mesEntrega;
    private int diaEntrega;
    private int agnoInicio;
    private int mesInicio;
    private int diaInicio;
    private int cantidadEmpleados;
    private Empleado[] empleados = new Empleado[cantidadEmpleados];
}