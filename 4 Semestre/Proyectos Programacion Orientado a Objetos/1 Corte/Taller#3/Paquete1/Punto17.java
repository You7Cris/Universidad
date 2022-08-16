package Paquete1;

import java.util.Scanner;

public class Punto17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		char c;
		System.out.print("Ingrese algo: ");
		c = sc.next().charAt(0);//Devuelve el valor de la posicion 
		if((c >= '0')&&(c <= '9'))
		{
			System.out.println("Es un numero");
		}else if((c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')||(c == 'A')||(c == 'E')||(c == 'I')||(c == 'O')||(c == 'U')) 
		{
			System.out.println("Es una vocal");
		}else {
			System.out.println("El dato es una letra u otro");
		}
		sc.close();
		
	}

}
