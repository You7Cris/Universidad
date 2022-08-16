package Cinema;

import java.util.Scanner;

import Cinema.Usuarios;


public class Peliculas {
	
	//Union con Usuarios
	Usuarios p = new Usuarios();
	
	
	public void MenuPeliculas(String[] nombrePelicula, int[] codigoPelicula,float[] precioPelicula,String[] pelicula1,float[] precio1, String[] pelicula2, float[] precio2,String[] pelicula3,float[] precio3) 
	{
		
		Scanner sc = new Scanner (System.in);
		int opcion,opcion2;
		do {
			System.out.println("\t**************************************");
			System.out.println("\t*         MENU PELICULAS             *");
			System.out.println("\t**************************************");
			System.out.println("\t*     1.)Mostrar Peliculas           *");
			System.out.println("\t*     2.)Crear Peliculas             *");
			System.out.println("\t*     3.)Editar Peliculas            *");
			System.out.println("\t*     4.)Eliminar Peliculas          *");
			System.out.println("\t*    5.)Volver al Menu Principal     *");
			System.out.println("\t**************************************");
			System.out.print("Opcion: ");
			opcion  =sc.nextInt();
		}while(opcion<1 || opcion>5);
		switch(opcion)
		{
		case 1:
			for(int i=0;i<nombrePelicula.length;i++)
			{
				System.out.println(" ");
				System.out.println("Pelicula #"+(i+1));
				System.out.println("Nombre: "+nombrePelicula[i]);
				System.out.println("Codigo : "+codigoPelicula[i]);
				System.out.println("Precio: "+precioPelicula[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Continuar Visualizando? Opcion 1=Si : Opcion 2=No");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>2);
				if(opcion2 == 1)
				{
					System.out.println(" ");
				}else{
					p.Refrescar();
					MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
				}
			}
			p.Refrescar();
			MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);;
			break;
		case 2:
			CrearPelicula(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
			break;
		case 3:
			EditarPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
			break;
		case 4:
			EliminarPelicula(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
			break;
		case 5:
			p.Refrescar();
			p.MenuPrincipal();
			break;
			
		}
	}
	
	public void CrearPelicula(String[] nombrePelicula, int[] codigoPelicula,float[] precioPelicula,String[] pelicula1,float[] precio1, String[] pelicula2, float[] precio2,String[] pelicula3,float[] precio3)
	{
		Scanner sc = new Scanner(System.in);
		int contador = 0,opcion;
		System.out.println("Crear nueva Pelicula");
		System.out.println(" ");
		System.out.println("Presione enter....");
		for(int i=0;i<nombrePelicula.length;i++)
		{
			if(codigoPelicula[i] == 0) 
			{
				sc.nextLine();
				System.out.println(" ");
				System.out.println("Pelicula #"+(i+1));
				System.out.print("Ingrese el nombre de la pelicula: ");
				nombrePelicula[i] = sc.nextLine();
				System.out.print("Ingrese el codigo de la pelicula: ");
				codigoPelicula[i] = sc.nextInt();
				System.out.print("Ingrese el precio de la Pelicula: ");
				precioPelicula[i] = sc.nextFloat();
				if(i==0)
				{
					pelicula1[contador] = nombrePelicula[i];
					precio1[contador] = precioPelicula[i];
				}else if(i==1)
				{
					pelicula2[contador] = nombrePelicula[i];
					precio2[contador] = precioPelicula[i];
				}else {
					pelicula3[contador] = nombrePelicula[i];
					precio3[contador] = precioPelicula[i];
				}
				if(codigoPelicula[i] == 0 || precioPelicula[i]<=3000)
				{
					System.out.println("Dato no valido........");
					System.out.println("Presione una tecla para volver....");
					new java.util.Scanner(System.in).nextLine();
					p.Refrescar();
					CrearPelicula(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
				}else {
					System.out.println(" ");
					System.out.println("Pelicula Guardado con exito...");
					System.out.println(" ");
					do {
						System.out.println("Desea Seguir Creando Peliculas? Opcion 1=Si : Opcion 2=No");
						System.out.print("Opcion: ");
						opcion = sc.nextInt();
					}while(opcion<1 || opcion>2);
					if(opcion == 1)
					{
						
					}else {
						p.Refrescar();
						MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
					}
					
				}
			}else {
				System.out.println("Pelicula #"+(i+1)+" ya existe");
				System.out.println(" ");
			}
		}
		p.Refrescar();
		MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
	}
	
	
	
	//Editar Peliculas
	public void EditarPeliculas(String[] nombrePelicula, int[] codigoPelicula,float[] precioPelicula,String[] pelicula1,float[] precio1, String[] pelicula2, float[] precio2,String[] pelicula3,float[] precio3) 
	{
		Scanner sc = new Scanner (System.in);
		int opcion,id,contador;
		System.out.println(" ");
		System.out.print("Ingrese el codigo de la pelicula: ");
		id = sc.nextInt();
		for(int i=0;i<nombrePelicula.length;i++)
		{
			if(codigoPelicula[i] == id)
			{
				System.out.println(" ");
				System.out.println("Pelicula #"+(i+1));
				System.out.println("Nombre Pelicula: "+nombrePelicula[i]);
				System.out.println("Codigo Pelicula: "+codigoPelicula[i]);
				System.out.println("Precio Pelicula: "+precioPelicula[i]);
				do {
					System.out.println(" ");
					System.out.println("Desea Editar la Pelicula? Opcion 1=Si : Opcion 2=No");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					contador = i;
					EditarP(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3,contador);
				}else {
					p.Refrescar();
					MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
				}
				
			}else if(nombrePelicula.length == nombrePelicula.length)
			{
				System.out.println("La pelicula no existe.");
				System.out.println("Presione una tecla para continuar....");
				new java.util.Scanner(System.in).nextLine();
				p.Refrescar();
				MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
			}else {
				
			}
		}
		p.Refrescar();
		MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
	}
	
	//Editar Pelicula Individual
	public void EditarP(String[] nombrePelicula, int[] codigoPelicula,float[] precioPelicula,String[] pelicula1,float[] precio1, String[] pelicula2, float[] precio2,String[] pelicula3,float[] precio3,int contador) 
	{
		Scanner sc = new Scanner(System.in);
		int o = 0;
		System.out.print("Ingrese el nombre de la Pelicula: ");
		nombrePelicula[contador] = sc.nextLine();
		System.out.print("Ingrese el codigo de la Pelicula: ");
		codigoPelicula[contador] = sc.nextInt();
		System.out.print("Ingrese el precio de la Pelicula: ");
		precioPelicula[contador] = sc.nextFloat();
		if(contador == 0)
		{
			pelicula1[o] = nombrePelicula[contador];
			precio1[o] = precioPelicula[contador];
			
		}else if(contador == 1)
		{
			pelicula2[o] = nombrePelicula[contador];
			precio2[o] = precioPelicula[contador];
		}else {
			pelicula3[o] = nombrePelicula[contador];
			precio3[o] = precioPelicula[contador];
		}
		if(codigoPelicula[contador]<=0 || precioPelicula[contador]<=3000)
		{
			System.out.println(" ");
			System.out.println("Error....vuelva a ingresar los datos");
			new java.util.Scanner(System.in).nextLine();
			EditarP(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3,contador);
		}else
		{
			System.out.println(" ");
			System.out.println("Pelicula Guardada con Exito....");
			System.out.println("Presione una tecla para Continuar.....");
			new java.util.Scanner(System.in).nextLine();
			p.Refrescar();
			MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
		}
	}
	
	//Eliminar Pelicula
	public void EliminarPelicula(String[] nombrePelicula, int[] codigoPelicula,float[] precioPelicula,String[] pelicula1,float[] precio1, String[] pelicula2, float[] precio2,String[] pelicula3,float[] precio3)
	{
		Scanner sc = new Scanner(System.in);
		int opcion,id,contador;
		System.out.println(" ");
		System.out.print("Ingrese el codigo de la Pelicula: ");
		id = sc.nextInt();
		for(int i=0;i<nombrePelicula.length;i++)
		{
			if(codigoPelicula[i] == id)
			{
				System.out.println("Pelicula #"+(i+1));
				System.out.println("Nombre Pelicula: "+nombrePelicula[i]);
				System.out.println("Codigo Pelicula: "+codigoPelicula[i]);
				System.out.println("Precio de la Pelicula: "+precioPelicula[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Eliminar la Pelicula? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion==1)
				{
					contador = i;
					EliminarP(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3,contador);
				}else {
					p.Refrescar();
					MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
				}
				
			}else if(nombrePelicula.length == nombrePelicula.length)
			{
				System.out.println(" ");
				System.out.println("La pelicula no existe....");
				new java.util.Scanner(System.in).nextLine();
				p.Refrescar();
				MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
			}else {
				
			}
		}
		/*p.Refrescar();
		MenuPeliculas(nombrePelicula,codigoPelicula);*/
		
	}
	
	//Eliminar Pelicula Independiente
	public void EliminarP(String[] nombrePelicula, int[] codigoPelicula,float[] precioPelicula,String[] pelicula1,float[] precio1, String[] pelicula2, float[] precio2,String[] pelicula3,float[] precio3,int contador) 
	{
		Scanner sc = new Scanner(System.in);
		int o = 0;
		nombrePelicula[contador] = null;
		codigoPelicula[contador] = 0;
		precioPelicula[contador] = 0;
		if(contador == 0)
		{
			pelicula1[o] = null;
			precio1[o] = 0;
		}else if(contador == 1)
		{
			pelicula2[o] = null;
			precio2[o] = 0;
		}else {
			pelicula3[o] = null;
			precio3[o] = 0;
		}
		System.out.println(" ");
		System.out.println("Pelicula Eliminada con Exito.....");
		System.out.println("Presione una tecla para volver al menu...");
		new java.util.Scanner(System.in).nextLine();
		p.Refrescar();
		MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio1,pelicula2,precio2,pelicula3,precio3);
	}

}
