package com.examen.ejercicio5;

public class EstudianteInt extends Estudiante{
    private Boolean esErasmus;
    private String nacionalidad;


    // Declarar constructores

    public EstudianteInt() {

    }

    public EstudianteInt(String nombre, String direccion, int edad, String codigo, String nacionalidad) {
        super(nombre, direccion, edad, codigo);
    }

    // Declarar getters y setters

    public Boolean getEsErasmus() {
        return esErasmus;
    }

    public void setEsErasmus(Boolean esErasmus) {
        this.esErasmus = esErasmus;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Declarar metodo toString


    @Override
    public String toString() {
        return "EstudianteInt{" +
                "esErasmus=" + esErasmus +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }

    // Declarar metodo privado esEuropeo
    public boolean esEuropeo(){
        return nacionalidad.equalsIgnoreCase("ingles")||nacionalidad.equalsIgnoreCase("frances")||nacionalidad.equalsIgnoreCase("portugues");
    }

    // Declarar metodo descuento para jovenes
    public boolean descuentoParaJovenes(){
        return esErasmus && edad < 25;
    }
}
