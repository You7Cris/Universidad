package Paquete1;

import java.util.Scanner;

public class Punto16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double deuda, pago, credito, cambio;
		
		System.out.print("Ingrese el valor de la deuda: ");
		deuda = sc.nextDouble();
		System.out.print("Ingrese el pago del cliente : ");
		pago =  sc.nextDouble();
		if(deuda == pago)
		{
			System.out.println("El cliente no debe nada");
		}else if(pago > deuda)
		{
			cambio = pago - deuda;
			System.out.println("El cambio es de : "+cambio);
		}else {
			credito =(deuda-pago)+(deuda-pago)*0.3;
			System.out.println("La nueva deuda es de :"+credito);
		}
		sc.close();
		
	}

}
