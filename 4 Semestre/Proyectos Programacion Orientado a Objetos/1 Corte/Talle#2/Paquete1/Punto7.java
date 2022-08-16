package Paquete1;

import java.util.Scanner;

public class Punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero,opcion,factorial=1;
		do {
			System.out.println("*************************************************************");
			System.out.println("*                  MENU PRINCIPAL                           *");
			System.out.println("*************************************************************");
			System.out.println("*            1.)Tabla de Multiplicar                        *");
			System.out.println("*            2.)Factorial de un numero                      *");
			System.out.println("             3.)Serie de Fibonacci                          *");
			System.out.println("*************************************************************");
			System.out.print("Opcion :");
			opcion = sc.nextInt();
		}while((opcion<1) || (opcion>3));
		switch(opcion)
		{
		case 1:
			System.out.print("Ingrese un numero para ver su tabla de multiplicacion :");
			numero = sc.nextInt();
			if((numero<1) || (numero>12))
			{
				System.out.println("El numero esta fuera del limite...");
			}else {
				for(int i=1; i<=10; i++)
				{
					System.out.println(""+numero+" * "+ i +" = "+(numero*i));
				}

			}
			sc.close();
			break;
		case 2: 
			System.out.print("Ingrese el numero: ");
			numero = sc.nextInt();
			for(int i = numero; i > 0; i --)
			{
				factorial = i * factorial;
			}
			System.out.println("El factorial de "+numero+" es : "+factorial);
			break;
		case 3:
			do {
				System.out.print("Ingrese un numero mayor que 1: ");
				numero = sc.nextInt();
			}while(numero<=1);
			int Numero1 = 1;
			int Numero2 = 1;
			System.out.println(Numero1+" ");
			for(int i=2; i <=numero ; i++ )
			{
				System.out.println(Numero2+" ");
				Numero2 = Numero1 + Numero2;
				Numero1 = Numero2 - Numero1;
			}
			System.out.println(" ");
			sc.close();
			break;
		}
		sc.close();
	}

}


