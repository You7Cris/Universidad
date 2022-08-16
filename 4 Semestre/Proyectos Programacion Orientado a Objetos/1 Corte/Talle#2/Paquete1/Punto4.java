package Paquete1;

import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int opcion;
		int opcion2;
		int valor;
		double Rbits,Rbytes,RKilobytes,RMegabytes,RGigabytes,RTerabytes;
		do {
			System.out.println("*********************************************************");
			System.out.println("*               CONVERTIDOR CRISTIAN                    *");
			System.out.println("*********************************************************");
			System.out.println("*     1.) Bit               *    2.) Byte               *");
			System.out.println("*     3.) Kilobyte          *    4.) Megabyte           *");
			System.out.println("*     5.) Gigabyte          *    6.) Terabyte           *");
			System.out.println("*********************************************************");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while((opcion < 1) || (opcion > 6));
		do {
			System.out.print("Ingrese a la medida que desea convertir: ");
			opcion2 = sc.nextInt();
		}while((opcion2 < 1) || (opcion2 > 6));
		System.out.print("Ingrese el valor : ");
		valor = sc.nextInt();
		
		if((opcion == 1) && (opcion2 == 1))
		{
		Rbits = valor;
		System.out.println(+valor+" bits = "+Rbits+ " bits");
		}else if((opcion == 1) && (opcion2 == 2))
		{
			Rbytes =( valor * 1 )/8;
			System.out.println(+valor+ "* (1 Byte)/ 8  = " + Rbytes +" Bytes");
		}else if((opcion == 1) && (opcion2 == 3))
		{
			Rbytes =( valor * 1 )/8;
			System.out.println(+valor+ "* (1 Byte)/ 8  = " + Rbytes +" Bytes");
			RKilobytes = ( Rbytes * 1)/1024;
			System.out.println(+Rbytes+"* (1 Kilobyte) / 1024 = "+RKilobytes+" KiloBytes");
		}else if((opcion == 1) && (opcion2 == 4))
		{
			Rbytes =( valor * 1 )/8;
			System.out.println(+valor+ "* (1 Byte)/ 8  = " + Rbytes +" Bytes");
			RKilobytes = ( Rbytes * 1)/1024;
			System.out.println(+Rbytes+"* (1 Kilobyte) / 1024 = "+RKilobytes+" KiloBytes");
			RMegabytes = (RKilobytes * 1)/1024;
			System.out.println(+RKilobytes+"* (1 MegaByte) /1024 = "+RMegabytes+" MegaBytes");
		}else if((opcion == 1) && (opcion2 == 5))
		{
			Rbytes =( valor * 1 )/8;
			System.out.println(+valor+ "* (1 Byte)/ 8  = " + Rbytes +" Bytes");
			RKilobytes = ( Rbytes * 1)/1024;
			System.out.println(+Rbytes+"* (1 Kilobyte) / 1024 = "+RKilobytes+" KiloBytes");
			RMegabytes = (RKilobytes * 1)/1024;
			System.out.println(+RKilobytes+"* (1 MegaByte) /1024 = "+RMegabytes+" MegaBytes");
			RGigabytes = (RMegabytes * 1)/1024;
			System.out.println(+RMegabytes+"* (1 Gigabyte) /1024 = "+RGigabytes+" GigaBytes");
		}else if((opcion == 1) && (opcion2 == 6))
		{
			Rbytes =( valor * 1 )/8;
			System.out.println(+valor+ "* (1 Byte)/ 8  = " + Rbytes +" Bytes");
			RKilobytes = ( Rbytes * 1)/1024;
			System.out.println(+Rbytes+"* (1 Kilobyte) / 1024 = "+RKilobytes+" KiloBytes");
			RMegabytes = (RKilobytes * 1)/1024;
			System.out.println(+RKilobytes+"* (1 MegaByte) /1024 = "+RMegabytes+" MegaBytes");
			RGigabytes = (RMegabytes * 1)/1024;
			System.out.println(+RMegabytes+"* (1 Gigabyte) /1024 = "+RGigabytes+" GigaBytes");
			RTerabytes = (RGigabytes * 1)/1024;
			System.out.println(+RGigabytes+" * (1 TeraByte) /1024 = "+RTerabytes+" TeraBytes");
			
		}
		
		//Opcion 2
		
		else if((opcion == 2) && (opcion2 == 1))
		{
			Rbits = (valor * 8)/1;
			System.out.println(+valor+" * (8 bits)/ 1 = "+Rbits+" bits");
		}else if((opcion == 2) && (opcion2 == 2))
		{
			Rbytes = valor;
			System.out.println(+valor+" = "+Rbytes+" Bytes");
		}else if((opcion == 2) && (opcion2 == 3))
		{
			RKilobytes = (valor * 1)/1024;
			System.out.println(+valor+" * (1 Kilobyte) /1024 = "+RKilobytes+" Kilobytes");
		}else if((opcion == 2) && (opcion2 == 4))
		{
			RKilobytes = (valor * 1)/1024;
			System.out.println(+valor+" * (1 Kilobyte) /1024 = "+RKilobytes+ " Kilobytes");
			RMegabytes = (RKilobytes * 1)/1024;
			System.out.println(+RKilobytes+"* (1 MegaByte) /1024 = "+RMegabytes+" MegaBytes");
		}else if((opcion == 2) && (opcion2 == 5))
		{
			RKilobytes = (valor * 1)/1024;
			System.out.println(+valor+" * (1 Kilobyte)/1024 = "+RKilobytes+ " Kilobytes");
			RMegabytes = (RKilobytes * 1)/1024;
			System.out.println(+RKilobytes+"* (1 MegaByte) /1024 = "+RMegabytes+" MegaBytes");
			RGigabytes = (RMegabytes * 1)/1024;
			System.out.println(+RMegabytes+"* (1 Gigabyte) /1024 = "+RGigabytes+" GigaBytes");
		}else if((opcion == 2) && (opcion2 == 6)) 
		{
			RKilobytes = (valor * 1)/1024;
			System.out.println(+valor+" * (1 Kilobyte)/1024 = "+RKilobytes+ " Kilobytes");
			RMegabytes = (RKilobytes * 1)/1024;
			System.out.println(+RKilobytes+"* (1 MegaByte) /1024 = "+RMegabytes+" MegaBytes");
			RGigabytes = (RMegabytes * 1)/1024;
			System.out.println(+RMegabytes+"* (1 Gigabyte) /1024 = "+RGigabytes+" GigaBytes");
			RTerabytes = (RGigabytes * 1)/1024;
			System.out.println(+RGigabytes+" * (1 TeraByte) /1024 = "+RTerabytes+" TeraBytes");
		}
		
		//Punto 3
		
		else if((opcion == 3) && (opcion2 == 1))
		{
			Rbytes = (valor * 1024)/1;
			System.out.println(+valor+"* (1024 bytes)/1 = "+Rbytes+" Bytes");
			Rbits = (Rbytes * 8)/1;
			System.out.println(+Rbytes+"* (8 bits)/1 = "+Rbits+" bits");
		}else if((opcion == 3) && (opcion2 == 2))
		{
			Rbytes = (valor * 1024)/1;
			System.out.println(+valor+"* (1024 bytes)/1 = "+Rbytes+" Bytes");
		}else if((opcion == 3)&& (opcion2 == 3))
		{
			RKilobytes = valor;
			System.out.println(+valor+" = "+RKilobytes+ " Kilobytes");
		}else if((opcion == 3)&& (opcion2 == 4))
		{
			RMegabytes = (valor * 1)/1024;
			System.out.println(+valor+"* (1 MegaByte)/1024 ="+RMegabytes+" MegaBytes");
		}else if((opcion == 3)&& (opcion2 == 5))
		{
			RMegabytes = (valor * 1)/1024;
			System.out.println(+valor+"* (1 MegaByte)/1024 ="+RMegabytes+" MegaBytes");
			RGigabytes = (RMegabytes * 1)/1024;
			System.out.println(+RMegabytes+"* (1 Gigabyte) /1024 = "+RGigabytes+" GigaBytes");
		}else if((opcion == 3)&& (opcion2 == 6))
		{
			RMegabytes = (valor * 1)/1024;
			System.out.println(+valor+"* (1 MegaByte)/1024 ="+RMegabytes+" MegaBytes");
			RGigabytes = (RMegabytes * 1)/1024;
			System.out.println(+RMegabytes+"* (1 Gigabyte) /1024 = "+RGigabytes+" GigaBytes");
			RTerabytes = (RGigabytes * 1)/1024;
			System.out.println(+RGigabytes+" * (1 TeraByte) /1024 = "+RTerabytes+" TeraBytes");
		}
		
		//Punto 4
		
		else if((opcion == 4) && (opcion2 == 1))
		{
			RKilobytes = (valor * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
			Rbytes = (RKilobytes * 1024)/1;
			System.out.println(RKilobytes+"* (1024 Bytes)/ 1 = "+Rbytes+" Bytes");
			Rbits = (Rbytes * 8)/1;
			System.out.println(Rbytes+"* (8 bits)/1 = "+Rbits+" bits");
		}else if((opcion == 4)&& (opcion2 == 2))
		{
			RKilobytes = (valor * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
			Rbytes = (RKilobytes * 1024)/1;
			System.out.println(RKilobytes+"* (1024 Bytes)/ 1 = "+Rbytes+" Bytes");
		}else if((opcion == 4)&& (opcion2 == 3))
		{
			RKilobytes = (valor * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
		}else if((opcion == 4)&& (opcion2 == 4))
		{
			RMegabytes = valor;
			System.out.println(valor+" = "+RMegabytes+" MegaBytes");
		}else if((opcion == 4)&& (opcion2 == 5))
		{
			RGigabytes = (valor * 1)/1024;
			System.out.println(valor+"* (1 Gigabytes) /1024 = "+RGigabytes);
		}else if((opcion == 4)&& (opcion2 == 6))
		{
			RGigabytes = (valor * 1)/1024;
			System.out.println(valor+"* (1 Gigabytes) /1024 = "+RGigabytes);
			RTerabytes = (RGigabytes * 1)/1024;
			System.out.println(+RGigabytes+" * (1 TeraByte) /1024 = "+RTerabytes+" TeraBytes");
		}
		
		//Punto 5
		
		else if((opcion == 5)&&(opcion2 == 1))
		{
			RMegabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 MegaBytes) /1 = "+RMegabytes+" MegaBytes");
			RKilobytes = (RMegabytes * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
			Rbytes = (RKilobytes * 1024)/1;
			System.out.println(RKilobytes+"* (1024 Bytes)/ 1 = "+Rbytes+" Bytes");
			Rbits = (Rbytes * 8)/1;
			System.out.println(Rbytes+"* (8 bits)/1 = "+Rbits+" bits");
		}else if((opcion == 5)&&(opcion2 == 2))
		{
			RMegabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 MegaBytes) /1 = "+RMegabytes+" MegaBytes");
			RKilobytes = (RMegabytes * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
			Rbytes = (RKilobytes * 1024)/1;
			System.out.println(RKilobytes+"* (1024 Bytes)/ 1 = "+Rbytes+" Bytes");
		}else if((opcion == 5)&&(opcion2 == 3))
		{
			RMegabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 MegaBytes) /1 = "+RMegabytes+" MegaBytes");
			RKilobytes = (RMegabytes * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
		}else if((opcion == 5)&&(opcion2 == 4))
		{
			RMegabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 MegaBytes) /1 = "+RMegabytes+" MegaBytes");
		}else if((opcion == 5)&&(opcion2 == 5))
		{
			RGigabytes = valor;
			System.out.println(valor+" = "+RGigabytes);
		}else if((opcion == 5)&&(opcion2 == 6))
		{
			RTerabytes = (valor * 1)/1024;
			System.out.println(valor+" * (1 TeraByte) /1024 = "+RTerabytes+" TeraBytes");
		}
		
		//Punto 6
		
		else if((opcion == 6)&& (opcion2 == 1))
		{
			RGigabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 GigaBytes) /1 = "+RGigabytes+ " GigaBytes");
			RMegabytes = (RGigabytes * 1024)/1;
			System.out.println(RGigabytes+"* (1024 MegaBytes) /1 = "+RMegabytes+" MegaBytes");
			RKilobytes = (RMegabytes * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
			Rbytes = (RKilobytes * 1024)/1;
			System.out.println(RKilobytes+"* (1024 Bytes)/ 1 = "+Rbytes+" Bytes");
			Rbits = (Rbytes * 8)/1;
			System.out.println(Rbytes+"* (8 bits)/1 = "+Rbits+" bits");
		}else if((opcion == 6)&& (opcion2 == 2))
		{
			RGigabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 GigaBytes) /1 = "+RGigabytes+ " GigaBytes");
			RMegabytes = (RGigabytes * 1024)/1;
			System.out.println(RGigabytes+"* (1024 MegaBytes) /1 = "+RMegabytes+" MegaBytes");
			RKilobytes = (RMegabytes * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
			Rbytes = (RKilobytes * 1024)/1;
			System.out.println(RKilobytes+"* (1024 Bytes)/ 1 = "+Rbytes+" Bytes");
		}else if((opcion == 6)&&(opcion == 3))
		{
			RGigabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 GigaBytes) /1 = "+RGigabytes+ " GigaBytes");
			RMegabytes = (RGigabytes * 1024)/1;
			System.out.println(RGigabytes+"* (1024 MegaBytes) /1 = "+RMegabytes+" MegaBytes");
			RKilobytes = (RMegabytes * 1024)/1;
			System.out.println(valor+" * (1024 KiloBytes) / 1 = "+RKilobytes+" KiloBytes");
		}else if((opcion == 6)&&(opcion2 == 4))
		{
			RGigabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 GigaBytes) /1 = "+RGigabytes+ " GigaBytes");
			RMegabytes = (RGigabytes * 1024)/1;
			System.out.println(RGigabytes+"* (1024 MegaBytes) /1 = "+RMegabytes+" MegaBytes");
		}else if((opcion == 6)&&(opcion2 == 5))
		{
			RGigabytes = (valor * 1024)/1;
			System.out.println(valor+"* (1024 GigaBytes) /1 = "+RGigabytes+ " GigaBytes");
		}else
		{
			RTerabytes = valor;
			System.out.println(valor+" = "+RTerabytes);
		}
		sc.close();
		}
		
		
		

}

