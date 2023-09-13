package com.examen.ejercicio5;

public class Persona {
    // Declarar atributos de la clase
    protected String nombre;
    protected String direccion;
    protected int edad;

    // Declarar constructores
    public Persona(){

    }

    public Persona (String nombre, String direccion, int edad ){
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    // Declarar Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Declarar metodo toString

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }

    // Declarar metod mayorDeEdad
    public boolean mayorDeEdad(){
        return edad >= 18;
    }
}
