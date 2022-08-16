package Cinema;

import java.util.Scanner;

import Cinema.Usuarios;

public class Reservas {
	
	
	//Union con Usuarios
	Usuarios p = new Usuarios();
	
	public void MenuReservas(String[] nombre,int[] documento,String[] sala,int[] codigo,String[] nombrePelicula,int[] codigoPelicula,float[] precioPelicula,int[] dSala1,String[] Sala1, String[] pelicula1, int[] asientos,float[] precio,int[] dSala2,String[] Sala2, String[] pelicula2, int[] asiento2,float[] precio2,int[] dSala3,String[] Sala3, String[] pelicula3, int[] asiento3,float[] precio3,int[] estado, int[] estado2,int[] estado3)
	{
		Scanner sc = new Scanner (System.in);
		int[] opcion3 = new int[sala.length];
		int posicionReserva = 0;
		int posicionReserva1 = 0;
		int posicionReserva2 = 0;
		int posicionReserva3 = 0;
		int opcion2,opcion,max=0,contador=0,editar=0;
		do {
			System.out.println("\t********************************************");
			System.out.println("\t*               MENU RESERVAS              *");
			System.out.println("\t********************************************");
			System.out.println("\t*        1.)Mostrar Reservas               *");
			System.out.println("\t*        2.)Crear Reservas                 *");
			System.out.println("\t*        3.)Editar Reservas                *");
			System.out.println("\t*        4.)Pagar Reservas                 *");
			System.out.println("\t*        5.)Eliminar Reservas              *");
			System.out.println("\t*         6.)Volver al Menu                *");
			System.out.println("\t********************************************");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>6);
		switch(opcion)
		{
		case 1://Opcion 1 Mostrar
			System.out.println(" ");
			System.out.println("\tSalas Actuales");
			for(int i=0;i<sala.length;i++)
			{
				contador+=1;
				if(sala[i] == null)
				{
					contador--;
				}
				posicionReserva = i+1;
				if(sala[i] == null)
				{
					if(i==0)
					{
						posicionReserva1 = 0;
					}
					if(i>0 && i<2)
					{
						posicionReserva2 = 0;
					}else if(i>1)
					{
						posicionReserva3 = 0;
					}else {
						
					}
				}else {
					if(sala[i] != null)
					{
						if(i==0)
						{
							posicionReserva1 = 1;
						}
						if(i>0 && i<2)
						{
							posicionReserva2 = 1;
						}
						if(i>2)
						{
							posicionReserva3 = 1;
						}
						
					}
					
				}
				System.out.println((i+1)+".)"+sala[i]);
				opcion3[i] = i+1;
				if(max<opcion3[i])
				{
					max=opcion3[i];
				}else
				{
					
				}
			}
			if(contador==0)
			{
				System.out.println(" ");
				System.out.println("No hay salas Disponibles en estos momentos...");
				System.out.println("Presiona una tecla para volver......");
				new java.util.Scanner(System.in).nextLine();
				p.Refrescar();
				MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
				
			}else if(contador==1){
				do {
					System.out.println("Solo hay 1 Sala para visualizar? Opcion 1=Visualizar Opcion 2=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2 < 1 || opcion2 > 2);
				if(posicionReserva == 1)
				{
					switch(opcion2)
					{
					case 1:
						MostrarSala1(dSala1,Sala1,pelicula1,asientos,estado,precio);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva == 2)
				{
					switch(opcion2)
					{
					case 1:
						MostrarSala2(dSala2,Sala2,pelicula2,asiento2,estado2,precio2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						MostrarSala3(dSala3,Sala3,pelicula3,asiento3,estado3,precio3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			
			}else if(contador == 2)
			{
				do {
					System.out.println("Solo hay 2 Salas para visualizar? Opcion 3 = Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>3);
				if(posicionReserva1 == 1 && posicionReserva2 == 1)
				{
					switch(opcion2)
					{
					case 1:
						MostrarSala1(dSala1,Sala1,pelicula1,asientos,estado,precio);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						MostrarSala2(dSala2,Sala2,pelicula2,asiento2,estado2,precio2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva1 == 1 && posicionReserva3 == 1)
				{
					switch(opcion2)
					{
					case 1:
						MostrarSala1(dSala1,Sala1,pelicula1,asientos,estado,precio);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						MostrarSala3(dSala3,Sala3,pelicula3,asiento3,estado3,precio3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						MostrarSala2(dSala2,Sala2,pelicula2,asiento2,estado2,precio2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						MostrarSala3(dSala3,Sala3,pelicula3,asiento3,estado3,precio3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			}else 
			{
				do {
					System.out.println("Que sala desea Visualizar: Opcion 4=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>4);
				switch(opcion2)
				{
				case 1:
					MostrarSala1(dSala1,Sala1,pelicula1,asientos,estado,precio);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 2:
					MostrarSala2(dSala2,Sala2,pelicula2,asiento2,estado2,precio2);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 3:
					MostrarSala3(dSala3,Sala3,pelicula3,asiento3,estado3,precio3);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 4:
					p.Refrescar();
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					
					
					
				}
			}
			
			break;
			
			
		case 2: //Opcion 2 Crear
			int a;
			System.out.println("");
			System.out.println("\tSalas Actuales");
			for(int i=0;i<sala.length;i++)
			{
				contador+=1;
				if(sala[i] == null)
				{
					contador--;
				}
				posicionReserva = i+1;
				if(sala[i] == null)
				{
					if(i==0)
					{
						posicionReserva1 = 0;
					}
					if(i>0 && i<2)
					{
						posicionReserva2 = 0;
					}else if(i>1)
					{
						posicionReserva3 = 0;
					}else {
						
					}
				}else {
					if(sala[i] != null)
					{
						if(i==0)
						{
							posicionReserva1 = 1;
						}
						if(i>0 && i<2)
						{
							posicionReserva2 = 1;
						}
						if(i>2)
						{
							posicionReserva3 = 1;
						}
						
					}
					
				}
				System.out.println((i+1)+".)"+sala[i]);
				opcion3[i] = i+1;
				if(max<opcion3[i])
				{
					max=opcion3[i];
				}else
				{
					
				}
			}
			if(contador==0)
			{
				System.out.println(" ");
				System.out.println("No hay salas Disponibles en estos momentos...");
				System.out.println("Presiona una tecla para volver......");
				new java.util.Scanner(System.in).nextLine();
				p.Refrescar();
				MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
				
			}else if(contador==1){
				do {
					System.out.println("Solo hay 1 Sala para Crear Reservas? Opcion 1=Crear Opcion 2=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2 < 1 || opcion2 > 2);
				if(posicionReserva == 1)
				{
					switch(opcion2)
					{
					case 1:
						CrearReservasSala1(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva == 2)
				{
					switch(opcion2)
					{
					case 1:
						CrearReservasSala2(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						CrearReservasSala3(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			
			}else if(contador == 2)
			{
				do {
					System.out.println("Solo hay 2 Salas para Crear Reservas? Opcion 3 = Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>3);
				if(posicionReserva1 == 1 && posicionReserva2 == 1)
				{
					switch(opcion2)
					{
					case 1:
						CrearReservasSala1(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						CrearReservasSala2(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva1 == 1 && posicionReserva3 == 1)
				{
					switch(opcion2)
					{
					case 1:
						CrearReservasSala1(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						CrearReservasSala3(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						CrearReservasSala2(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						CrearReservasSala3(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			}else 
			{
				do {
					System.out.println("En cual sala desea crear una o muchas reservas?: Opcion 4=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>4);
				switch(opcion2)
				{
				case 1:
					CrearReservasSala1(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 2:
					CrearReservasSala2(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 3:
					CrearReservasSala3(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 4:
					p.Refrescar();
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					
					
					
				}
			}
					
			break;
		case 3: //Opcion 3 Editar----------------------------------------------------------------
			System.out.println("");
			System.out.println("\tSalas Actuales");
			for(int i=0;i<sala.length;i++)
			{
				contador+=1;
				if(sala[i] == null)
				{
					contador--;
				}
				posicionReserva = i+1;
				if(sala[i] == null)
				{
					if(i==0)
					{
						posicionReserva1 = 0;
					}
					if(i>0 && i<2)
					{
						posicionReserva2 = 0;
					}else if(i>1)
					{
						posicionReserva3 = 0;
					}else {
						
					}
				}else {
					if(sala[i] != null)
					{
						if(i==0)
						{
							posicionReserva1 = 1;
						}
						if(i>0 && i<2)
						{
							posicionReserva2 = 1;
						}
						if(i>2)
						{
							posicionReserva3 = 1;
						}
						
					}
					
				}
				System.out.println((i+1)+".)"+sala[i]);
				opcion3[i] = i+1;
				if(max<opcion3[i])
				{
					max=opcion3[i];
				}else
				{
					
				}
			}
			if(contador==0)
			{
				System.out.println(" ");
				System.out.println("No hay salas Disponibles en estos momentos...");
				System.out.println("Presiona una tecla para volver......");
				new java.util.Scanner(System.in).nextLine();
				p.Refrescar();
				MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
				
			}else if(contador==1){
				do {
					System.out.println("Solo hay 1 Sala para Editar? Opcion 1=Entrar Opcion 2=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2 < 1 || opcion2 > 2);
				if(posicionReserva == 1)
				{
					switch(opcion2)
					{
					case 1:
						EditarSala1(nombre,documento,dSala1,Sala1,pelicula1,asientos,estado,precio);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva == 2)
				{
					switch(opcion2)
					{
					case 1:
						EditarSala2(nombre,documento,dSala2,Sala2,pelicula2,asiento2,estado2,precio2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						EditarSala3(nombre,documento,dSala3,Sala3,pelicula3,asiento3,estado3,precio3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			
			}else if(contador == 2)
			{
				do {
					System.out.println("Solo hay 2 Salas para Editar? Opcion 3 = Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>3);
				if(posicionReserva1 == 1 && posicionReserva2 == 1)
				{
					switch(opcion2)
					{
					case 1:
						EditarSala1(nombre,documento,dSala1,Sala1,pelicula1,asientos,estado,precio);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						EditarSala2(nombre,documento,dSala2,Sala2,pelicula2,asiento2,estado2,precio2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva1 == 1 && posicionReserva3 == 1)
				{
					switch(opcion2)
					{
					case 1:
						EditarSala1(nombre,documento,dSala1,Sala1,pelicula1,asientos,estado,precio);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						EditarSala3(nombre,documento,dSala3,Sala3,pelicula3,asiento3,estado3,precio3);	
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						EditarSala2(nombre,documento,dSala2,Sala2,pelicula2,asiento2,estado2,precio2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						EditarSala3(nombre,documento,dSala3,Sala3,pelicula3,asiento3,estado3,precio3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			}else 
			{
				do {
					System.out.println("En cual sala desea crear una o muchas reservas?: Opcion 4=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>4);
				switch(opcion2)
				{
				case 1:
					EditarSala1(nombre,documento,dSala1,Sala1,pelicula1,asientos,estado,precio);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 2:
					EditarSala2(nombre,documento,dSala2,Sala2,pelicula2,asiento2,estado2,precio2);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 3:
					EditarSala3(nombre,documento,dSala3,Sala3,pelicula3,asiento3,estado3,precio3);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 4:
					p.Refrescar();
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					
					
					
				}
			}
				
			break;
		case 4: //Pagar Reservas----------------------------------------------------------------------
			System.out.println("");
			System.out.println("\tSalas Actuales");
			for(int i=0;i<sala.length;i++)
			{
				contador+=1;
				if(sala[i] == null)
				{
					contador--;
				}
				posicionReserva = i+1;
				if(sala[i] == null)
				{
					if(i==0)
					{
						posicionReserva1 = 0;
					}
					if(i>0 && i<2)
					{
						posicionReserva2 = 0;
					}else if(i>1)
					{
						posicionReserva3 = 0;
					}else {
						
					}
				}else {
					if(sala[i] != null)
					{
						if(i==0)
						{
							posicionReserva1 = 1;
						}
						if(i>0 && i<2)
						{
							posicionReserva2 = 1;
						}
						if(i>2)
						{
							posicionReserva3 = 1;
						}
						
					}
					
				}
				System.out.println((i+1)+".)"+sala[i]);
				opcion3[i] = i+1;
				if(max<opcion3[i])
				{
					max=opcion3[i];
				}else
				{
					
				}
			}
			if(contador==0)
			{
				System.out.println(" ");
				System.out.println("No hay salas Disponibles en estos momentos...");
				System.out.println("Presiona una tecla para volver......");
				new java.util.Scanner(System.in).nextLine();
				p.Refrescar();
				MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
				
			}else if(contador==1){
				do {
					System.out.println("Solo hay una Sala para Ver y pagar las reservas? Opcion 1=Entrar Opcion 2=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2 < 1 || opcion2 > 2);
				if(posicionReserva == 1)
				{
					switch(opcion2)
					{
					case 1:
						PagarReservaSala1(dSala1,Sala1,pelicula1,precio,asientos,estado);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva == 2)
				{
					switch(opcion2)
					{
					case 1:
						PagarReservaSala2(dSala2,Sala2,pelicula2,precio2,asiento2,estado2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						PagarReservaSala3(dSala3,Sala3,pelicula3,precio3,asiento3,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			
			}else if(contador == 2)
			{
				do {
					System.out.println("Solo hay 2 Salas para Ver y Pagar las reservas? Opcion 3 = Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>3);
				if(posicionReserva1 == 1 && posicionReserva2 == 1)
				{
					switch(opcion2)
					{
					case 1:
						PagarReservaSala1(dSala1,Sala1,pelicula1,precio,asientos,estado);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						PagarReservaSala2(dSala2,Sala2,pelicula2,precio2,asiento2,estado2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva1 == 1 && posicionReserva3 == 1)
				{
					switch(opcion2)
					{
					case 1:
						PagarReservaSala1(dSala1,Sala1,pelicula1,precio,asientos,estado);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						PagarReservaSala3(dSala3,Sala3,pelicula3,precio3,asiento3,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						PagarReservaSala2(dSala2,Sala2,pelicula2,precio2,asiento2,estado2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						PagarReservaSala3(dSala3,Sala3,pelicula3,precio3,asiento3,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			}else 
			{
				do {
					System.out.println("En cual sala desea Ver o Pagar las reservas?: Opcion 4=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>4);
				switch(opcion2)
				{
				case 1:
					PagarReservaSala1(dSala1,Sala1,pelicula1,precio,asientos,estado);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 2:
					PagarReservaSala2(dSala2,Sala2,pelicula2,precio2,asiento2,estado2);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 3:
					PagarReservaSala3(dSala3,Sala3,pelicula3,precio3,asiento3,estado3);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 4:
					p.Refrescar();
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					
					
					
				}
			}
			p.Refrescar();
			
			break;
			
			
		case 5: //Eliminar Reservas-------------------------------------------------------------------
			System.out.println("");
			System.out.println("\tSalas Actuales");
			for(int i=0;i<sala.length;i++)
			{
				contador+=1;
				if(sala[i] == null)
				{
					contador--;
				}
				posicionReserva = i+1;
				if(sala[i] == null)
				{
					if(i==0)
					{
						posicionReserva1 = 0;
					}
					if(i>0 && i<2)
					{
						posicionReserva2 = 0;
					}else if(i>1)
					{
						posicionReserva3 = 0;
					}else {
						
					}
				}else {
					if(sala[i] != null)
					{
						if(i==0)
						{
							posicionReserva1 = 1;
						}
						if(i>0 && i<2)
						{
							posicionReserva2 = 1;
						}
						if(i>2)
						{
							posicionReserva3 = 1;
						}
						
					}
					
				}
				System.out.println((i+1)+".)"+sala[i]);
				opcion3[i] = i+1;
				if(max<opcion3[i])
				{
					max=opcion3[i];
				}else
				{
					
				}
			}
			if(contador==0)
			{
				System.out.println(" ");
				System.out.println("No hay salas Disponibles en estos momentos...");
				System.out.println("Presiona una tecla para volver......");
				new java.util.Scanner(System.in).nextLine();
				p.Refrescar();
				MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
				
			}else if(contador==1){
				do {
					System.out.println("Solo hay una Sala para Eliminar una o muchas reservas? Opcion 1=Entrar Opcion 2=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2 < 1 || opcion2 > 2);
				if(posicionReserva == 1)
				{
					switch(opcion2)
					{
					case 1:
						EliminarReservaSala1(dSala1,Sala1,pelicula1,precio,asientos,estado);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva == 2)
				{
					switch(opcion2)
					{
					case 1:
						EliminarReservaSala2(dSala2,Sala2,pelicula2,precio2,asiento2,estado2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						EliminarReservaSala3(dSala3,Sala3,pelicula3,precio3,asiento3,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			
			}else if(contador == 2)
			{
				do {
					System.out.println("Solo hay 2 Salas para Eliminar una o muchas reservas? Opcion 3 = Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>3);
				if(posicionReserva1 == 1 && posicionReserva2 == 1)
				{
					switch(opcion2)
					{
					case 1:
						EliminarReservaSala1(dSala1,Sala1,pelicula1,precio,asientos,estado);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						EliminarReservaSala2(dSala2,Sala2,pelicula2,precio2,asiento2,estado2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else if(posicionReserva1 == 1 && posicionReserva3 == 1)
				{
					switch(opcion2)
					{
					case 1:
						EliminarReservaSala1(dSala1,Sala1,pelicula1,precio,asientos,estado);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						EliminarReservaSala3(dSala3,Sala3,pelicula3,precio3,asiento3,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}else {
					switch(opcion2)
					{
					case 1:
						EliminarReservaSala2(dSala2,Sala2,pelicula2,precio2,asiento2,estado2);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 2:
						EliminarReservaSala3(dSala3,Sala3,pelicula3,precio3,asiento3,estado3);
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						break;
					case 3:
						p.Refrescar();
						MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					}
				}
				
			}else 
			{
				do {
					System.out.println("En cual sala desea Eliminar una o muchas reservas?: Opcion 4=Salir");
					System.out.print("Opcion: ");
					opcion2 = sc.nextInt();
				}while(opcion2<1 || opcion2>4);
				switch(opcion2)
				{
				case 1:
					EliminarReservaSala1(dSala1,Sala1,pelicula1,precio,asientos,estado);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 2:
					EliminarReservaSala2(dSala2,Sala2,pelicula2,precio2,asiento2,estado2);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 3:
					EliminarReservaSala3(dSala3,Sala3,pelicula3,precio3,asiento3,estado3);
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					break;
				case 4:
					p.Refrescar();
					MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
					
					
					
				}
			}
			p.Refrescar();
			break;
		case 6:
			p.MenuPrincipal();
			break;
		}
		
		
	}
	

	//Sala 1-----------------------------------------------------------------------------------------------------
	
	
	//Mostrar
	public void MostrarSala1(int[] documentoSala1,String[] Sala1, String[] pelicula1, int[] asientos,int[] estado,float[] precio)
	{
		Scanner sc = new Scanner (System.in);
		int opcion,contador=0;
		for(int i=0;i<documentoSala1.length;i++)
		{
			System.out.println(" ");
			System.out.println("\tReserva #"+(i+1));
			System.out.println("Documento Usuario: "+documentoSala1[i]);
			System.out.println("Sala: "+Sala1[contador]);
			System.out.println("Pelicula : "+pelicula1[contador]);
			System.out.println("Asiento: "+asientos[i]);
			System.out.println("Precio: "+precio[contador]);
			System.out.println("Estado 1-Pagado 2-No Pagado: "+estado[i]);
			System.out.println(" ");
			do {
				System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
				System.out.print("Opcion: ");
				opcion = sc.nextInt();
			}while(opcion<1 || opcion>2);
			if(opcion == 2)
			{
				p.Refrescar();
				break;
			}
		}
	
		p.Refrescar();
		
	}
	
	//Crear Reservas
	public void CrearReservasSala1(String[] nombre,int[] documento,String[] sala,int[] codigo,String[] nombrePelicula,int[] codigoPelicula,float[] precioPelicula,int[] dSala1,String[] Sala1, String[] pelicula1, int[] asientos,float[] precio,int[] dSala2,String[] Sala2, String[] pelicula2, int[] asiento2,float[] precio2,int[] dSala3,String[] Sala3, String[] pelicula3, int[] asiento3,float[] precio3,int[] estado, int[] estado2,int[] estado3)

	{
		Scanner sc = new Scanner (System.in);
		int a,opcion,opcion2,id,reserva,opcion3;
		for(int i=0;i<Sala1.length;i++)
		{
			System.out.println(" ");
			System.out.println("Nombre: "+Sala1[i]);
			System.out.println("Pelicula: "+pelicula1[i]);
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.print("Ingrese el documento del Usuario: ");
		id = sc.nextInt();
		for(int i=0;i<dSala1.length;i++)
		{
			if(dSala1[i] == 0)
			{
				for(int j=0;j<documento.length;j++)
				{			
					if(id == documento[j])
					{
						System.out.println(" ");
						System.out.println("El usuario Existe..");
						System.out.println("Nombre: "+nombre[j]);
						System.out.println("Documento :"+documento[j]);
						do {
							System.out.println("Desea Reservar Señor@ ? Opcion 1=SI : Opcion 2=NO");
							System.out.print("Opcion: ");
							a = sc.nextInt();
						}while(a<1 || a>2);
						if(a==1)
						{
							do {
								System.out.println("Desea Pagar ahora? Opcion 1=Si : Opcion 2=NO");
								System.out.print("Opcion: ");
								opcion3 = sc.nextInt();
							}while(opcion3<1 || opcion3>2);
							if(opcion3 == 1)
							{
								estado[i] = 1;
							}else {
								estado[i] = 2;
							}
							dSala1[i] = documento[j];
							asientos[i] = 1;
							System.out.println(" ");
							System.out.println("Reserva #"+(i+1));
							System.out.println("Documento Usuario: "+dSala1[i]);
							System.out.println("Su asiento sera: "+asientos[i]);
							System.out.println("Estado 1-Pagado 2-No pagado : "+estado[i]);
							System.out.println(" ");
							do {
								System.out.println("Seguir Haciendo Reservas? Opcion 1=SI : Opcion 2=NO");
								System.out.print("Opcion: ");
								opcion2 = sc.nextInt();
							}while(opcion2 < 1 || opcion2>2);
							if(opcion2 == 1)
							{
								p.Refrescar();
								CrearReservasSala1(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
								
							}else {
								p.Refrescar();
								MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
							}
						}else {
							p.Refrescar();
							MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						}
							
					}else {
						
						
					}
				}
				
			}else if(dSala1[i]>0 ){
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1)+" ya esta ocupada");
				
			}else {
				
			}
		
		
		}
		System.out.println(" ");
		System.out.println("El usuario no existe....");
		do {
			System.out.println("Desea crearlo? Opcion 1=SI : Opcion 2=NO");
			System.out.print("Opcion: ");
			a = sc.nextInt();
		}while(a<1 || a>2);
		if(a==1)
		{
			p.Refrescar();
			p.CrearUsuarios(nombre, documento);
		}else {
			p.Refrescar();
			MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
		}
		
		
	}
	
	//Editar Reserva Sala 1
	public void EditarSala1(String[] nombre,int[] documento,int[] documentoSala1,String[] Sala1, String[] pelicula1, int[] asientos,int[] estado,float[] precio)
	{
		Scanner sc = new Scanner(System.in);
		int opcion, contador =0,id,editar,a=0;
		System.out.print("Ingrese el documento del Usuario: ");
		id = sc.nextInt();
		for(int i=0;i<documentoSala1.length;i++)
		{
			if(documentoSala1[i] == id)
			{
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento: "+documentoSala1[i]);
				System.out.println("Sala: "+Sala1[contador]);
				System.out.println("Asiento : "+asientos[i]);
				System.out.println("Precio: "+precio[contador]);
				System.out.println("Estado 1-Pagado: 2-No pagado :"+estado[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Editar la Reserva? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					p.Refrescar();
					editar = i;
					EditarReservaISala1(nombre,documento,documentoSala1,asientos,editar);
				}else {
					a++;
				}
				
			}
			
			
		}
		if(a==100)
		{
			System.out.println("No hay usuarios en esta sala...");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}
		p.Refrescar();
		
	}
	
	//Editar Reserva Individual
	public void EditarReservaISala1(String[] nombre,int[] documento,int[] documentoSala1,int[] asientos,int editar)
	{
		Scanner sc = new Scanner(System.in);
		int opcion,opcion2;
		System.out.println(" ");
		System.out.println("\tEditar");
		System.out.println("Lo unico que se puede editar es el numero de documento, o eliminar la reserva");
		do {
			System.out.println("1.Editar Documento");
			System.out.println("2.Eliminar Reserva");
			System.out.println("3.Volver al Menu");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>3);
		if(opcion == 1)
		{
			System.out.println("Ingrese el nuevo documento: ");
			documentoSala1[editar] = sc.nextInt();
			for(int i=0;i<documento.length;i++)
			{
				if(documentoSala1[editar] == documento[i])
				{
					System.out.println("El usuario existe...");
					System.out.println("Reserva Actualizada con exito...");
					new java.util.Scanner(System.in).nextLine();
					p.Refrescar();
					EditarReservaISala1(nombre,documento,documentoSala1,asientos,editar);
				}else {
					
				}
			}
			System.out.println("El usuario no existe....");
			do {
				System.out.println("Desea Agregarlo ? Opcion 1=SI :Opcion 2=NO");
				System.out.print("Opcion: ");
				opcion2 = sc.nextInt();
			}while(opcion2<1 || opcion2>2);
			if(opcion2 == 1)
			{
				p.Refrescar();
				p.CrearUsuarios(nombre, documento);
			}else {
				
			}
			
		}else if(opcion == 2) {
			p.Refrescar();
			
		}else {
			
		}
		p.Refrescar();
		
		
	}
	
	//Eliminar Reserva dSala1,Sala1,pelicula1,precio1,asientos
	public void EliminarReservaSala1(int[] dSala1,String[] Sala1,String[] pelicula1,float[] precio,int[] asientos,int[] estado)
	{
		Scanner sc = new Scanner(System.in);
		int id,opcion,contador;
		System.out.println(" ");
		System.out.print("Ingrese el documento del cliente: ");
		id = sc.nextInt();
		for(int i=0;i<dSala1.length;i++)
		{
			if(id == dSala1[i])
			{
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento :"+dSala1[i]);
				System.out.println("Sala: "+Sala1[i]);
				System.out.println("Pelicula: "+pelicula1[i]);
				System.out.println("Asiento: "+asientos[i]);
				System.out.println("Precio: "+precio[i]);
				System.out.println("Estado :"+estado[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Eliminar la reserva? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					contador = i;
					p.Refrescar();
					EliminarReservaI(dSala1,asientos,estado,contador);
					System.out.println(" ");
				}else {
					
				}
				
			}else {
				
			}
		}
		p.Refrescar();
		
	}
	
	//Eliminar Reserva Independiente
	
	public void EliminarReservaI(int[] dSala1,int[] asientos,int[] estado,int contador)
	{
		System.out.println(" ");
		dSala1[contador] = 0;
		asientos[contador] = 0;
		estado[contador] = 0;
		System.out.println("Reserva Eliminada con exito...");
		System.out.println(" ");
	}
	
	//Pagar Reserva
	
	public void PagarReservaSala1(int[] dSala1,String[] Sala1,String[] pelicula1,float[] precio,int[] asientos,int[] estado)
	{
		Scanner sc = new Scanner(System.in);
		int documento,opcion4;
		System.out.println(" ");
		System.out.print("Ingrese el documento del Usuario:  ");
		documento = sc.nextInt();
		for(int i=0;i<dSala1.length;i++)
		{
			if(dSala1[i] == documento)
			{
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento: "+dSala1[i]);
				System.out.println("Sala: "+Sala1[i]);
				System.out.println("Pleicula: "+pelicula1[i]);
				System.out.println("Precio : "+precio[i]);
				System.out.println("Estado 1-Pagado 2-No pagado: "+estado[i]);
				if(estado[i] == 1)
				{
					System.out.println(" ");
					System.out.println("El usuario "+dSala1[i]+" ya pago la reserva de la pelicula "+pelicula1[i]);
					
				}else {
					System.out.println(" ");
					do {
						System.out.println("El usuario no ha pagado, Desea Pagar? Opcion 1=SI: Opcion 2=NO");
						System.out.print("Opcion: ");
						opcion4 = sc.nextInt();
					}while(opcion4<1 || opcion4>2);
					if(opcion4 == 1)
					{
						estado[i] = 1;
						System.out.println(" ");
						System.out.println("Actualizacion con exito....");
						System.out.println(" ");
						p.Refrescar();
					}else {
						
					}
					
				}
			}
		}
		System.out.println(" ");
		System.out.println("Presione una tecla para Continuar.....");
		new java.util.Scanner(System.in).nextLine();
		p.Refrescar();
		
		
		
	}
	
	
	//Sala 2-------------------------------------------------------------------------------------------------------
	
	
	//Mostrar
	public void MostrarSala2(int[] dSala2,String[] Sala2,String[] pelicula2,int[] asiento2,int[] estado2,float[] precio2)
	{
		Scanner sc = new Scanner (System.in);
		int opcion,contador=0;
		for(int i=0;i<dSala2.length;i++)
		{
			System.out.println(" ");
			System.out.println("\tReserva #"+(i+1));
			System.out.println("Documento Usuario: "+dSala2[i]);
			System.out.println("Sala: "+Sala2[contador]);
			System.out.println("Pelicula : "+pelicula2[contador]);
			System.out.println("Asiento: "+asiento2[i]);
			System.out.println("Precio: "+precio2[contador]);
			System.out.println("Estado 1-Pagado 2-No Pagado : "+estado2[i]);
			System.out.println(" ");
			do {
				System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
				System.out.print("Opcion: ");
				opcion = sc.nextInt();
			}while(opcion<1 || opcion>2);
			if(opcion == 2)
			{
				p.Refrescar();
				break;
			}
		}
		p.Refrescar();
		
		
	}
	
	//Reservas Sala 2
	
	public void CrearReservasSala2(String[] nombre,int[] documento,String[] sala,int[] codigo,String[] nombrePelicula,int[] codigoPelicula,float[] precioPelicula,int[] dSala1,String[] Sala1, String[] pelicula1, int[] asientos,float[] precio,int[] dSala2,String[] Sala2, String[] pelicula2, int[] asiento2,float[] precio2,int[] dSala3,String[] Sala3, String[] pelicula3, int[] asiento3,float[] precio3,int[] estado, int[] estado2,int[] estado3)
	{
		Scanner sc = new Scanner (System.in);
		int a,opcion,opcion2,id,opcion3;
		for(int i=0;i<Sala2.length;i++)
		{
			System.out.println(" ");
			System.out.println("Nombre: "+Sala1[i]);
			System.out.println("Pelicula: "+pelicula1[i]);
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.print("Ingrese el documento del Usuario: ");
		id = sc.nextInt();
		for(int i=0;i<dSala2.length;i++)
		{
			if(dSala2[i] == 0)
			{
				for(int j=0;j<documento.length;j++)
				{			
					if(id == documento[j])
					{
						System.out.println(" ");
						System.out.println("El usuario Existe..");
						System.out.println("Nombre: "+nombre[j]);
						System.out.println("Documento :"+documento[j]);
						do {
							System.out.println("Desea Reservar Señor@ ? Opcion 1=SI : Opcion 2=NO");
							System.out.print("Opcion: ");
							a = sc.nextInt();
						}while(a<1 || a>2);
						if(a==1)
						{
							do {
								System.out.println(" ");
								System.out.println("Desea Pagar Ahora? Opcion 1=SI:  Opcion 2=NO");
								System.out.print("Opcion: ");
								opcion3 = sc.nextInt();
							}while(opcion3<1 || opcion3>2);
							if(opcion3==1)
							{
								estado2[i] = 1;
							}else {
								estado2[i] = 2;
							}
							dSala2[i] = documento[j];
							asiento2[i] = i+1;
							System.out.println("Reserva #"+(i+1));
							System.out.println("Documento Usuario: "+dSala2[i]);
							System.out.println("Su asiento sera: "+asiento2[i]);
							System.out.println(" ");
							do {
								System.out.println("Seguir Haciendo Reservas? Opcion 1=SI : Opcion 2=NO");
								opcion2 = sc.nextInt();
							}while(opcion2 < 1 || opcion2>2);
							if(opcion2 == 1)
							{
								p.Refrescar();
								CrearReservasSala2(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
							}else {
								p.Refrescar();
								MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
							}
						}else {
							p.Refrescar();
							MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						}
							
					}else {
						
						
					}
				}
				
			}else if(dSala2[i]>0 ){
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1)+" ya esta ocupada");
				
			}else {
				
			}
		
		
		}
		System.out.println(" ");
		System.out.println("El usuario no existe....");
		do {
			System.out.println("Desea crearlo? Opcion 1=SI : Opcion 2=NO");
			System.out.print("Opcion: ");
			a = sc.nextInt();
		}while(a<1 || a>2);
		if(a==1)
		{
			p.Refrescar();
			p.CrearUsuarios(nombre, documento);
		}else {
			p.Refrescar();
			MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
		}
		
	}
	
	//Editar Sala2 
	public void EditarSala2(String[] nombre, int[] documento,int[] dSala2, String[] Sala2, String[] pelicula2, int[] asiento2,int[] estado2,float[] precio2)
	{
		Scanner sc = new Scanner(System.in);
		int opcion, contador =0,id,editar,h=0;
		System.out.print("Ingrese el documento del Usuario: ");
		id = sc.nextInt();
		for(int i=0;i<dSala2.length;i++)
		{
			if(dSala2[i] == id)
			{
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento: "+dSala2[i]);
				System.out.println("Sala: "+Sala2[contador]);
				System.out.println("Asiento : "+asiento2[i]);
				System.out.println("Precio: "+precio2[contador]);
				System.out.println("Estado 1-Pagado 2-No Pagado : "+estado2[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Editar la Reserva? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					p.Refrescar();
					editar = i;
					EditarReservaISala2(nombre,documento,dSala2,asiento2,editar);
				}else {
					p.Refrescar();
					
					h++;
				}
				
			}
			
			
		}
		if(h==100)
		{
			System.out.println("No hay clientes en la sala...");
			System.out.println("Presiona una tecla para continuar...");
			new java.util.Scanner(System.in).nextLine();
		}
		p.Refrescar();
		
	}
	
	//Editar Sala 2 Independiente
	public void EditarReservaISala2(String[] nombre,int[] documento,int[] dSala2,int[] asiento2,int editar)
	{
		Scanner sc = new Scanner(System.in);
		int opcion,opcion2;
		System.out.println(" ");
		System.out.println("\tEditar");
		System.out.println("Lo unico que se puede editar es el numero de documento, o eliminar la reserva");
		do {
			System.out.println("1.Editar Documento");
			System.out.println("2.Eliminar Reserva");
			System.out.println("3.Volver al Menu");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>3);
		if(opcion == 1)
		{
			System.out.println("Ingrese el nuevo documento: ");
			dSala2[editar] = sc.nextInt();
			for(int i=0;i<documento.length;i++)
			{
				if(dSala2[editar] == documento[i])
				{
					System.out.println("El usuario existe...");
					System.out.println("Reserva Actualizada con exito...");
					new java.util.Scanner(System.in).nextLine();
					p.Refrescar();
					EditarReservaISala2(nombre,documento,dSala2,asiento2,editar);
				}else {
					
				}
			}
			System.out.println("El usuario no existe....");
			do {
				System.out.println("Desea Agregarlo ? Opcion 1=SI :Opcion 2=NO");
				System.out.print("Opcion: ");
				opcion2 = sc.nextInt();
			}while(opcion2<1 || opcion2>2);
			if(opcion2 == 1)
			{
				p.Refrescar();
				p.CrearUsuarios(nombre, documento);
			}else {
				
			}
			
		}else if(opcion == 2) {
			p.Refrescar();
			
		}else {
			
		}
		p.Refrescar();
		
	}
	//Eliminar Reserva Sala 2
	public void EliminarReservaSala2(int[] dSala2,String[] Sala2,String[] pelicula2,float[] precio2,int[] asiento2,int[] estado2)
	{
		Scanner sc = new Scanner(System.in);
		int id,opcion,contador;
		System.out.println(" ");
		System.out.print("Ingrese el documento del cliente: ");
		id = sc.nextInt();
		for(int i=0;i<dSala2.length;i++)
		{
			if(id == dSala2[i])
			{
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento :"+dSala2[i]);
				System.out.println("Sala: "+Sala2[i]);
				System.out.println("Pelicula: "+pelicula2[i]);
				System.out.println("Asiento: "+asiento2[i]);
				System.out.println("Precio: "+precio2[i]);
				System.out.println("Estado :"+estado2[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Eliminar la reserva? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					contador = i;
					p.Refrescar();
					EliminarReservaI2(dSala2,asiento2,estado2,contador);
					System.out.println(" ");
				}else {
					
				}
				
			}else {
				
			}
		}
		p.Refrescar();
		
		
		
	}
	
	//Eliminar Reserva Individual Sala 2
	public void EliminarReservaI2(int[] dSala2,int[]asiento2,int[] estado2,int contador)
	{
		System.out.println(" ");
		dSala2[contador] = 0;
		asiento2[contador] = 0;
		estado2[contador] = 0;
		System.out.println("Reserva Eliminada con exito...");
		System.out.println(" ");
	}
	
	//Pagar Reserva Sala 2
	public void PagarReservaSala2(int[] dSala2,String[] Sala2,String[] pelicula2,float[] precio2,int[] asiento2,int[] estado2)
	{
		Scanner sc = new Scanner(System.in);
		int documento,opcion4;
		System.out.println(" ");
		System.out.print("Ingrese el documento del Usuario:  ");
		documento = sc.nextInt();
		for(int i=0;i<dSala2.length;i++)
		{
			if(dSala2[i] == documento)
			{
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento: "+dSala2[i]);
				System.out.println("Sala: "+Sala2[i]);
				System.out.println("Pleicula: "+pelicula2[i]);
				System.out.println("Precio : "+precio2[i]);
				System.out.println("Estado 1-Pagado 2-No pagado: "+estado2[i]);
				if(estado2[i] == 1)
				{
					System.out.println(" ");
					System.out.println("El usuario "+dSala2[i]+" ya pago la reserva de la pelicula "+pelicula2[i]);
					
				}else {
					System.out.println(" ");
					do {
						System.out.println("El usuario no ha pagado, Desea Pagar? Opcion 1=SI: Opcion 2=NO");
						System.out.print("Opcion: ");
						opcion4 = sc.nextInt();
					}while(opcion4<1 || opcion4>2);
					if(opcion4 == 1)
					{
						estado2[i] = 1;
						System.out.println(" ");
						System.out.println("Actualizacion con exito....");
						System.out.println(" ");
						p.Refrescar();
					}else {
						
					}
					
				}
			}
		}
		System.out.println(" ");
		System.out.println("Presione una tecla para Continuar.....");
		new java.util.Scanner(System.in).nextLine();
		p.Refrescar();
		
	}
	
	//Sala 3-------------------------------------------------------------------------------------------------

	
	//Mostrar
	public void MostrarSala3(int[] dSala3,String[] Sala3,String[] pelicula3,int[] asiento3,int[] estado3,float[] precio3)
	{
		Scanner sc = new Scanner (System.in);
		int opcion,contador=0;
		for(int i=0;i<dSala3.length;i++)
		{
			System.out.println(" ");
			System.out.println("\tReserva #"+(i+1));
			System.out.println("Documento Usuario: "+dSala3[i]);
			System.out.println("Sala: "+Sala3[contador]);
			System.out.println("Pelicula : "+pelicula3[contador]);
			System.out.println("Asiento: "+asiento3[i]);
			System.out.println("Precio: "+precio3[contador]);
			System.out.println("Estado 1-Pagado 2-No Pagado: "+estado3[i]);
			System.out.println(" ");
			do {
				System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
				System.out.print("Opcion: ");
				opcion = sc.nextInt();
			}while(opcion<1 || opcion>2);
			if(opcion == 2)
			{
				p.Refrescar();
				break;
			}
		}
		p.Refrescar();
	}
	
	
	//Crear
	public void CrearReservasSala3(String[] nombre,int[] documento,String[] sala,int[] codigo,String[] nombrePelicula,int[] codigoPelicula,float[] precioPelicula,int[] dSala1,String[] Sala1, String[] pelicula1, int[] asientos,float[] precio,int[] dSala2,String[] Sala2, String[] pelicula2, int[] asiento2,float[] precio2,int[] dSala3,String[] Sala3, String[] pelicula3, int[] asiento3,float[] precio3,int[] estado, int[] estado2,int[] estado3)
	{
		Scanner sc = new Scanner (System.in);
		int a,opcion,opcion2,id,opcion3;
		for(int i=0;i<Sala3.length;i++)
		{
			System.out.println(" ");
			System.out.println("Nombre: "+Sala1[i]);
			System.out.println("Pelicula: "+pelicula1[i]);
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.print("Ingrese el documento del Usuario: ");
		id = sc.nextInt();
		for(int i=0;i<dSala3.length;i++)
		{
			if(dSala2[i] == 0)
			{
				for(int j=0;j<documento.length;j++)
				{			
					if(id == documento[j])
					{
						System.out.println(" ");
						System.out.println("El usuario Existe..");
						System.out.println("Nombre: "+nombre[j]);
						System.out.println("Documento :"+documento[j]);
						do {
							System.out.println("Desea Reservar Señor@ ? Opcion 1=SI : Opcion 2=NO");
							System.out.print("Opcion: ");
							a = sc.nextInt();
						}while(a<1 || a>2);
						if(a==1)
						{
							do {
								System.out.println(" ");
								System.out.println("Desea Pagar ahora? Opcion 1=SI: Opcion 2=NO");
								System.out.println("Opcion: ");
								opcion3 = sc.nextInt();
							}while(opcion3<1 || opcion3>2);
							if(opcion3 == 1)
							{
								estado3[i] = 1;
							}else {
								estado3[i] = 2;
							}
							dSala3[i] = documento[j];
							asiento3[i] = i+1;
							System.out.println("Reserva #"+(i+1));
							System.out.println("Documento Usuario: "+dSala3[i]);
							System.out.println("Su asiento sera: "+asiento3[i]);
							System.out.println(" ");
							do {
								System.out.println("Seguir Haciendo Reservas? Opcion 1=SI : Opcion 2=NO");
								opcion2 = sc.nextInt();
							}while(opcion2 < 1 || opcion2>2);
							if(opcion2 == 1)
							{
								p.Refrescar();
								CrearReservasSala3(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
							}else {
								p.Refrescar();
								MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
							}
						}else {
							p.Refrescar();
							MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
						}
							
					}else {
						
						
					}
				}
				
			}else if(dSala3[i]>0 ){
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1)+" ya esta ocupada");
				
			}else {
				
			}
		
		
		}
		System.out.println(" ");
		System.out.println("El usuario no existe....");
		do {
			System.out.println("Desea crearlo? Opcion 1=SI : Opcion 2=NO");
			System.out.print("Opcion: ");
			a = sc.nextInt();
		}while(a<1 || a>2);
		if(a==1)
		{
			p.Refrescar();
			p.CrearUsuarios(nombre, documento);
		}else {
			p.Refrescar();
			MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,dSala1,Sala1,pelicula1,asientos,precio,dSala2,Sala2,pelicula2,asiento2,precio2,dSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
		}
		p.Refrescar();
		
	}
	
	//	Editar Reservas Sala 3
	public void EditarSala3(String[] nombre,int[] documento,int[] dSala3,String[] Sala3,String[] pelicula3,int[] asiento3,int[] estado3,float[] precio3)
	{
		Scanner sc = new Scanner(System.in);
		int opcion, contador =0,id,editar,h=0;
		System.out.print("Ingrese el documento del Usuario: ");
		id = sc.nextInt();
		for(int i=0;i<dSala3.length;i++)
		{
			if(dSala3[i] == id)
			{
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento: "+dSala3[i]);
				System.out.println("Sala: "+Sala3[contador]);
				System.out.println("Asiento : "+asiento3[i]);
				System.out.println("Precio: "+precio3[contador]);
				System.out.println("Estado 1-Pagado 2-No Pagado : "+estado3[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Editar la Reserva? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					p.Refrescar();
					editar = i;
					EditarReservaISala3(nombre,documento,dSala3,asiento3,editar);
				}else {
					p.Refrescar();
					h++;
				}
				
			}
			
			
		}
		if(h==100)
		{
			System.out.println("No hay clientes en la sala...");
			System.out.println("Presione una tecla para continuar..");
			new java.util.Scanner(System.in).nextLine();
		}
		p.Refrescar();
	}
	
	//Editar Reserva Sala 3 Independiente
	public void EditarReservaISala3(String[] nombre,int[] documento,int[] dSala3,int[] asiento3,int editar)
	{
		Scanner sc = new Scanner(System.in);
		int opcion,opcion2;
		System.out.println(" ");
		System.out.println("\tEditar");
		System.out.println("Lo unico que se puede editar es el numero de documento, o eliminar la reserva");
		do {
			System.out.println("1.Editar Documento");
			System.out.println("2.Eliminar Reserva");
			System.out.println("3.Volver al Menu");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>3);
		if(opcion == 1)
		{
			System.out.println("Ingrese el nuevo documento: ");
			dSala3[editar] = sc.nextInt();
			for(int i=0;i<documento.length;i++)
			{
				if(dSala3[editar] == documento[i])
				{
					System.out.println("El usuario existe...");
					System.out.println("Reserva Actualizada con exito...");
					new java.util.Scanner(System.in).nextLine();
					p.Refrescar();
					EditarReservaISala3(nombre,documento,dSala3,asiento3,editar);
				}else {
					
				}
			}
			System.out.println("El usuario no existe....");
			do {
				System.out.println("Desea Agregarlo ? Opcion 1=SI :Opcion 2=NO");
				System.out.print("Opcion: ");
				opcion2 = sc.nextInt();
			}while(opcion2<1 || opcion2>2);
			if(opcion2 == 1)
			{
				p.Refrescar();
				p.CrearUsuarios(nombre, documento);
			}else {
				
			}
			
		}else if(opcion == 2) {
			p.Refrescar();
			
		}else {
			
		}
		p.Refrescar();
		
	}
	
	
	
	//Eliminar Reserva Sala 3
	public void EliminarReservaSala3(int[] dSala3,String[] Sala3,String[] pelicula3,float[] precio3,int[] asiento3,int[] estado3)
	{
		Scanner sc = new Scanner(System.in);
		int id,opcion,contador=0;
		System.out.println(" ");
		System.out.print("Ingrese el documento del cliente: ");
		id = sc.nextInt();
		for(int i=0;i<dSala3.length;i++)
		{
			if(id == dSala3[i])
			{
				System.out.println(" ");
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento :"+dSala3[i]);
				System.out.println("Sala: "+Sala3[i]);
				System.out.println("Pelicula: "+pelicula3[i]);
				System.out.println("Asiento: "+asiento3[i]);
				System.out.println("Precio: "+precio3[i]);
				System.out.println("Estado :"+estado3[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Eliminar la reserva? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					contador = i;
					p.Refrescar();
					EliminarReservaI3(dSala3,asiento3,estado3,contador);
					System.out.println(" ");
				}else {
					
				}
				
			}else {
				contador++;
				
			}
		}
		if(contador==dSala3.length)
		{
			System.out.println("No hay Usuarios en la sala....");
			System.out.println("Presiona una tecla para continuar....");
			new java.util.Scanner(System.in);
		}
		p.Refrescar();
	}
	
	//Eliminar Reserva Independiente
	public void EliminarReservaI3(int[] dSala3,int[] asiento3,int [] estado3,int contador)
	{
		System.out.println(" ");
		dSala3[contador] = 0;
		asiento3[contador] = 0;
		estado3[contador] = 0;
		System.out.println("Reserva Eliminada con exito...");
		System.out.println(" ");
	}
	
	//Pagar Reserva Sala 3
	public void PagarReservaSala3(int[] dSala3,String[] Sala3,String[] pelicula3,float[] precio3,int[] asiento3,int[] estado3)
	{
		Scanner sc = new Scanner(System.in);
		int documento,opcion4;
		System.out.println(" ");
		System.out.print("Ingrese el documento del Usuario:  ");
		documento = sc.nextInt();
		for(int i=0;i<dSala3.length;i++)
		{
			if(dSala3[i] == documento)
			{
				System.out.println("Reserva #"+(i+1));
				System.out.println("Documento: "+dSala3[i]);
				System.out.println("Sala: "+Sala3[i]);
				System.out.println("Pelicula: "+pelicula3[i]);
				System.out.println("Asiento: "+asiento3[i]);
				System.out.println("Precio : "+precio3[i]);
				System.out.println("Estado 1-Pagado 2-No pagado: "+estado3[i]);
				if(estado3[i] == 1)
				{
					System.out.println(" ");
					System.out.println("El usuario "+dSala3[i]+" ya pago la reserva de la pelicula "+pelicula3[i]);
					
				}else {
					System.out.println(" ");
					do {
						System.out.println("El usuario no ha pagado, Desea Pagar? Opcion 1=SI: Opcion 2=NO");
						System.out.print("Opcion: ");
						opcion4 = sc.nextInt();
					}while(opcion4<1 || opcion4>2);
					if(opcion4 == 1)
					{
						estado3[i] = 1;
						System.out.println(" ");
						System.out.println("Actualizacion con exito....");
						System.out.println(" ");
						p.Refrescar();
					}else {
						
					}
					
				}
			}
		}
		System.out.println(" ");
		System.out.println("Presione una tecla para Continuar.....");
		new java.util.Scanner(System.in).nextLine();
		p.Refrescar();
	}

}
