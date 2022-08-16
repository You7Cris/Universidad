package Paquete1;

import java.util.Scanner;

public class Punto24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int tiempo = 1976 - 1616;
		double capital =(double)(24/0.12)*360;
		System.out.println("El capital "+tiempo+" años despues con aumento del 12% de interes cada año es ="+capital+" $dolares");
		sc.close();
	}

}
