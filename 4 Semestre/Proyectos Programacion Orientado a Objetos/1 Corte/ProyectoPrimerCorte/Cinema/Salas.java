package Cinema;

import java.util.Scanner;

import Cinema.Usuarios;


public class Salas {
	//Union Cinema
	Usuarios p =new Usuarios();
	
	//Menu Salas
	public void MenuSalas(String[] sala,int[] codigo,String[] Sala,String[] Sala2,String[] Sala3)
	{
		Scanner sc = new Scanner(System.in);
		int opcion,opcion2;
		do {
			System.out.println("\t************************************");
			System.out.println("\t*          MENU SALAS              *");
			System.out.println("\t************************************");
			System.out.println("\t*      1.)Mostrar Salas            *");
			System.out.println("\t*      2.)Crear Salas              *");
			System.out.println("\t*      3.)Editar Salas             *");
			System.out.println("\t*      4.)Eliminar Salas           *");
			System.out.println("\t*      5.)Volver al Menu           *");
			System.out.println("\t************************************");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>5);
		switch(opcion)
		{
		case 1:
			for(int i=0;i<sala.length;i++)
			{
				System.out.println(" ");
				System.out.println("Nombre Sala: "+sala[i]);
				System.out.println("Codigo Sala: "+codigo[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Continuar? Opcion 1=SI: Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2 <1 || opcion2>2);
				if(opcion2 == 1)
				{
					
				}else {
					p.Refrescar();
					MenuSalas(sala,codigo,Sala,Sala2,Sala3);
				}
			}
			p.Refrescar();
			MenuSalas(sala,codigo,Sala,Sala2,Sala3);
			break;
		case 2:
			CrearSalas(sala,codigo,Sala,Sala2,Sala3);
			break;
		case 3:
			EditarSala(sala,codigo,Sala,Sala2,Sala3);
			break;
		case 4:
			EliminarSala(sala,codigo,Sala,Sala2,Sala3);
			break;
		case 5:
			p.MenuPrincipal();
			break;
		}
	}
	
	//Crear Salas
	public void CrearSalas(String[] sala,int[] codigo,String[] Sala,String[] Sala2,String[] Sala3)
	{
		Scanner sc = new Scanner (System.in);
		int opcion,contador=0;
		System.out.println(" ");
		System.out.println("Crear nueva Sala");
		for(int i=0;i<sala.length;i++)
		{
			/*if(sala.length == sala.length)
			{
				System.out.println("Ya no se pueden crear mas salas...");
			}*/
			if(codigo[i] == 0)
			{
				System.out.println("Presiona enter...");
				sc.nextLine();
				System.out.println(" ");
				System.out.print("Ingrese nombre de la Sala: ");
				sala[i] = sc.nextLine();
				codigo[i] = i+1;
				System.out.print("Codigo de la Sala: "+codigo[i]);
				//Condicion de codigo
				if(codigo[i]<=0)
				{
					System.out.println(" ");
					System.out.println("Error, Presione una tecla para volver a ingresar......");
					new java.util.Scanner(System.in).nextLine();
					CrearSalas(sala,codigo,Sala,Sala2,Sala3);
				}else {
					if(i == 0)
					{
						Sala[contador] = sala[i];
					}else if(i==1)
					{
						Sala2[contador] = sala[i];
					}else {
						Sala3[contador] = sala[i];
					}
					System.out.println(" ");
					System.out.println("Sala Guardada con exito...");
					System.out.println(" ");
					do {
						System.out.println("Desea Crear una nueva Sala? Opcion 1=Si: Opcion 2=No");
						System.out.print("Opcion: ");
						opcion = sc.nextInt();
					}while(opcion<1 || opcion>2);
					if(opcion == 1)
					{
						
					}else {
						p.Refrescar();
						MenuSalas(sala,codigo,Sala,Sala2,Sala3);
					}
					
				}
				
			}else {
				System.out.println("Sala #"+(i+1)+" ya existe");
				System.out.println(" ");
			}
		}
		p.Refrescar();
		MenuSalas(sala,codigo,Sala,Sala2,Sala3);
		
	}
	
	//Editar Sala
	public void EditarSala(String[] sala,int[] codigo,String[] Sala,String[] Sala2,String[] Sala3)
	{
		Scanner sc = new Scanner(System.in);
		int opcion,id,contador;
		System.out.print("Ingrese el codigo de la sala: ");
		id = sc.nextInt();
		for(int i=0;i<sala.length;i++)
		{
			if(codigo[i] == id)
			{
				System.out.println(" ");
				System.out.println("Nombre Sala: "+sala[i]);
				System.out.println("Codigo: "+codigo[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea editar? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion ==1)
				{
					contador = i;
					p.Refrescar();
					EditarS(sala,codigo,Sala,Sala2,Sala3,contador);
				}else
				{
					p.Refrescar();
					MenuSalas(sala,codigo,Sala,Sala2,Sala3);
				}
				
			}else if(sala.length == sala.length)
			{
				System.out.println(" ");
				System.out.println("La sala no existe");
				System.out.println("Presione una tecla para volver....");
				new java.util.Scanner(System.in).nextLine();
				p.Refrescar();
				MenuSalas(sala,codigo,Sala,Sala2,Sala3);
				
			}else {
				
			}
			
		}
		p.Refrescar();
		MenuSalas(sala,codigo,Sala,Sala2,Sala3);
	}
	
	//Editar Sala Independiente
	public void EditarS(String[] sala,int[] codigo,String[] Sala,String[] Sala2,String[] Sala3,int contador)
	{
		Scanner sc = new Scanner(System.in);
		int a=0;
		System.out.print("Ingrese el nombre de la Sala: ");
		sala[contador] = sc.nextLine();
		if(codigo[contador]<=0)
		{
			System.out.println(" ");
			System.out.println("Error de Actualizacion de datos...");
			System.out.println("Presione una tecla para volver a ingresar los datos...");
			new java.util.Scanner(System.in).nextLine();
			p.Refrescar();
			EditarS(sala,codigo,Sala,Sala2,Sala3,contador);
		}
		if(contador == 0)
		{
			Sala[a] = sala[contador];
		}else if(contador == 1)
		{
			Sala2[a] = sala[contador];
		}else {
			Sala3[a] = sala[contador];
		}
		System.out.println(" ");
		System.out.println("Actualizacion Exitosa....");
		System.out.println("Presiona una tecla para Continuar");
		new java.util.Scanner(System.in).nextLine();
		p.Refrescar();
		MenuSalas(sala,codigo,Sala,Sala2,Sala3);
	}
	
	//Eliminar Sala
	public void EliminarSala(String[] sala,int[] codigo,String[] Sala,String[] Sala2,String[] Sala3)
	{
		Scanner sc = new Scanner (System.in);
		int opcion, id,contador;
		System.out.println(" ");
		System.out.println("Eliminar Sala");
		System.out.print("Ingrese el codigo de la Sala: ");
		id = sc.nextInt();
		for(int i=0;i<sala.length;i++)
		{
			if(codigo[i] == id)
			{
				System.out.println(" ");
				System.out.println("Nombre de la sala: "+sala[i]);
				System.out.println("Codigo de la sala: "+codigo[i]);
				do {
					System.out.println(" ");
					System.out.println("Desea Eliminar esta Sala? Opcion 1=Si: Opcion 2=NO: Opcion 3=Salir");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					contador=i;
					p.Refrescar();
					EliminarS(sala,codigo,Sala,Sala2,Sala3,contador);
					
				}else if(opcion==3){
					p.Refrescar();
					MenuSalas(sala,codigo,Sala,Sala2,Sala3);
				}
				
			}else {
				
			}
			
		}
		System.out.println(" ");
		System.out.println("La sala no existe");
		System.out.println("Presione una tecla para volver al menu....");
		new java.util.Scanner(System.in).nextLine();
		MenuSalas(sala,codigo,Sala,Sala2,Sala3);
		
	}
	
	//Eliminar Sala Independiente
	public void EliminarS(String[] sala,int[] codigo,String[] Sala,String[] Sala2,String[] Sala3,int contador) 
	{
		Scanner sc = new Scanner(System.in);
		int a=0;
		sala[contador]= null;
		codigo[contador]=0;
		if(contador == 0)
		{
			Sala[a] = null;
		}else if(contador == 1)
		{
			Sala2[a] = null;
		}else {
			Sala3[a] = null;
		}
		System.out.println(" ");
		System.out.println("Sala Eliminada con exito....");
		System.out.println("Presiona una tecla para volver....");
		new java.util.Scanner(System.in).nextLine();
		p.Refrescar();
		MenuSalas(sala,codigo,Sala,Sala2,Sala3);
	}
	
	
	
	

}
