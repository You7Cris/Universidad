package Alumno;

import java.util.Scanner;

public class Alumno {
	
	//Atributos 
	String nombre;
	int edad;
	
	//Constructor
	public void Alumno() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese el nombre: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese la edad: ");
		edad = sc.nextInt();
	}
	
	public void Mostrar() {
		System.out.println("El nombre del alumno es: "+this.nombre);
		System.out.println("Edad : "+this.edad);
		if(edad>=18)
		{
			System.out.println("Es mayor de edad");
		}else
		{
			System.out.println("Es menor de edad");
		}
	}

}
