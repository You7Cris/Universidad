package Paquete1;

import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc  =new Scanner (System.in);
			System.out.print("Ingrese el salario:");
			
			double salario=sc.nextDouble();
			double interes = (salario*0.3);
			double capacidad = (interes-(interes*0.02));
		
			System.out.println("Monto Solicitado :"+capacidad);
				System.out.println("PLAZO\tINTERES\t\tTOTAL MENSUAL\tTOTAL A PAGAR TOTAL");
			for(int i = 12;i<=72; i+=12 ) {
				System.out.println(+i+"\t"+String.format("%.1f", aumento(i,100))+"\t\t"+ String.format("%.2f", ( (salario+capacidad+aumento(i,100))/i ))+"\t\t"+ String.format("%.2f", ((salario + capacidad+ aumento(i,100)))));
			}//Se manda i, como el mes para el ciclo, para calcular el aumento de interes.
	
			
			
			
		}
		//Funcion privada 
		private static double aumento(int meses,float monto) {
			
			double Mensual = monto * 0.025,total=0; 
			
			for(int i=1;i<=meses;i++) {
				total = total+(Mensual);//Total para agregarle al aumento
			}
			
			return total; 
		}
			
	}
