package Operaciones;

import java.util.Scanner;

public class Operaciones {
	
	//Atributos
	int n1,n2,opcion;
	float resultado;
	
	//Constructor
	
	public void Operaciones(){
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese el numero 1: ");
		n1 = sc.nextInt();
		System.out.print("Ingrese el numero 2: ");
		n2 = sc.nextInt();
		do {
			System.out.println("Ingrese la operacion que desea.");
			System.out.println("1.)Suma");
			System.out.println("2.)Resta");
			System.out.println("3.)Multiplicacion");
			System.out.println("4.)Division");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>4);
		switch(opcion)
		{
		case 1:
			Suma(n1,n2);
			break;
		case 2:
			Resta(n1,n2);
			break;
		case 3:
			Multiplicacion(n1,n2);
			break;
		case 4:
			Division(n1,n2);
			break;
			
		}
		sc.close();
		
		
	}
	
	private void Suma(int n1,int n2)
	{
		resultado = n1+n2;
		System.out.println("La suma de "+n1+" + "+n2+" = "+resultado);
	}
	
	
	private void Resta(int n1,int n2)
	{
		resultado =n1-n2;
		System.out.println("La resta de "+n1+" - "+n2+" = "+resultado);
		
	}
	
	private void Multiplicacion(int n1,int n2)
	{
		resultado = n1 * n2;
		System.out.println("La multiplicacion de "+n1+" * "+n2+" = "+resultado);
		
	}
	
	private void Division(int n1,int n2)
	{
		if(n2 == 0)
		{
			System.out.println("Error...");
		}else {
			resultado = n1/n2;
			System.out.println("La division de "+n1+" / "+n2+" = "+resultado);
		}
	}
	

}
