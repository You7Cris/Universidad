package Paquete1;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		DecimalFormat Redondear = new DecimalFormat("####.#");//Poner un solo decimal despues de la coma.
		double velocidad,VelocidadMetros;
		double cambio= 3.6;
		System.out.print("Ingrese la velocidad en km/h : ");
		velocidad = sc.nextFloat();
		VelocidadMetros =( velocidad / cambio) ;
		System.out.println("La velocidad es de : "+(Redondear.format(VelocidadMetros))+ " m/s");
		sc.close();
	}

}

