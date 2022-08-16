package Paquete1;

import java.util.Scanner;

public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero1,numero2;
		double resultado;
		
		System.out.println("Ingrese los dos numeros : ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		System.out.println(numero1+"+"+numero2+"="+(numero1+numero2));
		System.out.println(numero1+"-"+numero2+"="+(numero1-numero2));
		System.out.println(numero1+"*"+numero2+"="+(numero1 * numero2));
		if(numero2 == 0)
		{
			System.out.println("El numero no se puede dividir por cero");
		}else {
			resultado = (double)numero1 / numero2;
			System.out.println(+numero1+"/"+numero2+"="+String.format("%.4f", resultado));
		}
		sc.close();
	}

}
