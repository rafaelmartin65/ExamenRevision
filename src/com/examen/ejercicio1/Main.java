/**
 * 
 */
package com.examen.ejercicio1;

import java.util.ArrayList;

/**
 * @author Rafael Martín
 * Descripción: Clase Main en Java
 *
 */
public class Main {


	public static void main(String[] args) {

		// Declarar array con ArrayList
		ArrayList<Alumno> alumnos = new ArrayList<>();
		
		// Inicializar el array
		alumnos.add(new Alumno("Rafael", "Martin R.",37));
		alumnos.add(new Alumno("Mary", "Gonzalez P.",32));
		alumnos.add(new Alumno("Pepe","Gonzalez",35));


		for (Alumno alumno : alumnos){
			System.out.println("Alumno----- ");
			alumno.mostrarDatos();
			System.out.println();
		}
		


	}
	
	

}
