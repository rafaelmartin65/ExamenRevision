package com.examen.ejercicio5;

public class Estudiante extends Persona{
    // Declarar atributos
    private String codigo;

    // Declarar constructores
    public Estudiante() {

    }

    public Estudiante(String nombre, String direccion, int edad, String codigo) {
        super(nombre, direccion, edad);
        this.codigo = codigo;
    }

    // Declarar getter y setters


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Decalarar toString

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }



}
