package com.examen.ejercicio5;

public class Main {

    Estudiante estudiante1 = new Estudiante("Juan", "Calle 123", 20, "E123");
    Estudiante estudiante2 = new Estudiante("Maria", "Avenida XYZ", 22, "E456");

    EstudianteInt estudianteInt1 = new EstudianteInt("John", "123 Street", 24, "I789", "ingles");
    EstudianteInt estudianteInt2 = new EstudianteInt("Pierre", "Rue ABC", 23, "F123", "frances");
    EstudianteInt estudianteInt3 = new EstudianteInt("Carlos", "Rua 456", 26, "P789", "portugues");

    System.out.println("Estudiantes Internacionales:");
    System.out.println(estudianteInt1);
    System.out.println("Es Europeo: " + estudianteInt1.esEuropeo());
    System.out.println("Tiene descuento para jóvenes: " + estudianteInt1.descuentoParaJovenes());
    System.out.println("\n" + estudianteInt2);
    System.out.println("Es Europeo: " + estudianteInt2.esEuropeo());
    System.out.println("Tiene descuento para jóvenes: " + estudianteInt2.descuentoParaJovenes());
    System.out.println("\n" + estudianteInt3);
    System.out.println("Es Europeo: " + estudianteInt3.esEuropeo());
    System.out.println("Tiene descuento para jóvenes: " + estudianteInt3.descuentoParaJovenes());


}
