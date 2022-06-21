package Equipo;

public class Empleado {

    public Empleado(){
        this.foto = getFoto();
        this.indiceS=100;
        this.nombreS = " ";
    }

    private String foto;
//Informacion personal
    private String nombreP;
    private String nombreS;
    private String apellidoP;
    private String apellidoS;
    private String cedula;
    private int edad;
    private int agnoNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;
    private String estadoCivil;
    private String genero;

    //Info de contacto
    private String direccion;
    private String barrio;
    private String ciudad;
    private int telefono;
    private String celular;
    private String email;

    //Info de trabajo
    private String cargo;
    private int agnoIngreso;
    private int mesIngreso;
    private int diaIngreso;
    private int sueldo;

    private int indiceS;

    //Información academica
    private String universidad;
    private String carrera;

    private int anioEgreso;
    private int mesEgreso;
    private int diaEgreso;
    private String nivelAcademico;
    private boolean ingles;
    private String nivelIngles;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getApellidoS() {
        return apellidoS;
    }

    public void setApellidoS(String apellidoS) {
        this.apellidoS = apellidoS;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getagnoNacimiento() {
        return agnoNacimiento;
    }

    public void setagnoNacimiento(int agnoNacimiento) {
        this.agnoNacimiento = agnoNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getagnoIngreso() {
        return agnoIngreso;
    }

    public void setagnoIngreso(int agnoIngreso) {
        this.agnoIngreso = agnoIngreso;
    }

    public int getMesIngreso() {
        return mesIngreso;
    }

    public void setMesIngreso(int mesIngreso) {
        this.mesIngreso = mesIngreso;
    }

    public int getDiaIngreso() {
        return diaIngreso;
    }

    public void setDiaIngreso(int diaIngreso) {
        this.diaIngreso = diaIngreso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public int getIndiceS() {
        return indiceS;
    }

    public void setIndiceS(int indiceS) {
        this.indiceS = indiceS;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getAnioEgreso() {
        return anioEgreso;
    }

    public void setAnioEgreso(int anioEgreso) {
        this.anioEgreso = anioEgreso;
    }

    public int getMesEgreso() {
        return mesEgreso;
    }

    public void setMesEgreso(int mesEgreso) {
        this.mesEgreso = mesEgreso;
    }

    public int getDiaEgreso() {
        return diaEgreso;
    }

    public void setDiaEgreso(int diaEgreso) {
        this.diaEgreso = diaEgreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public boolean isIngles() {
        return ingles;
    }

    public void setIngles(boolean ingles) {
        this.ingles = ingles;
    }

    public String getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(String nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
}