package Paquete1;


import java.util.Scanner;

public class Punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double calculadora;
		int n1,n2,operacion;
		
		System.out.print("Ingrese los dos numeros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		do {
			System.out.print("Ingrese la operacion 1.)Suma  2.)Resta   3.)Multiplicacion 4.)Division : ");
			operacion = sc.nextInt();
		}while(operacion < 1 || operacion > 4);
		
		switch(operacion)
		{
		case 1:
			System.out.println("La suma de "+n1+" + "+n2+" = "+(n1+n2));
			break;
		case 2:
			System.out.println("La resta de "+n1+" - "+n2+" = "+(n1-n2));
			break;
		case 3:
			System.out.println("La multiplicacion de "+n1+" * "+n2+" = "+(n1 * n2));
			break;
		case 4:
			if(n2 == 0)
			{
				System.out.println("Error....");
			}else {
				double resultado = (double) n1/n2;
				System.out.println("La division de "+n1+" / "+n2+" = "+String.format("%.2f",resultado));
			}
			break;
			default:
				System.out.println("Error");
		}
		sc.close();
		
		
		
		
	}

}
