package Empleado;

import java.util.Scanner;

public class Empleado {
	
	//Atributos 
	String nombre;
	float sueldo;
	
	//Constructor 
	
	public void Empleado() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese el nombre: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese el sueldo: ");
		sueldo = sc.nextFloat();
		sc.close();
	}
	
	public void Mostrar() {
		System.out.println("El nombre del usuario es: "+this.nombre);
		System.out.println("Su sueldo es de: "+this.sueldo+" $pesos");
		if(sueldo > 1500000)
		{
			System.out.println("Si debe pagar impuestos");
		}else {
			System.out.println("No debe pagar impuestos");
		}
	}

}
