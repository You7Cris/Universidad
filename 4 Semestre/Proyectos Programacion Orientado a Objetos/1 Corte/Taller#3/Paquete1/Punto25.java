package Paquete1;


import java.util.Scanner;

public class Punto25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int prestamo=200,anos=5;
		double valorTotal = prestamo + ((prestamo*0.06) * anos);
		
		System.out.println("El total a pagar en el transcurso de los 5 años es : "+valorTotal);
		
		sc.close();
		
		
		
		
	}

}
