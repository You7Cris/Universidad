package Cinema;

import java.util.Scanner;

import Cinema.Usuarios;

public class Boletas {
	//Importar Usuarios
		Usuarios p = new Usuarios();
	
	public void MostrarBoletas(String[] sala,int[] dSala1,String[] Sala1,String[] pelicula,float[] precio,int[] asientos,int[] estado,int[] dSala2,String[] Sala2,String[] pelicula2,float[] precio2,int[] asiento2,int[] estado2,int[] dSala3,String[] Sala3,String[] pelicula3,float[] precio3,int[] asiento3,int[] estado3)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int[] opcion3 = new int[sala.length];
		int contador=0,opcion2,max=0;
		int posicionReserva = 0;
		int posicionReserva1 = 0;
		int posicionReserva2 = 0;
		int posicionReserva3 = 0;
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
					MostrarBoletasSala1(dSala1,Sala1,pelicula,asientos,precio,estado);
					break;
				case 2:
					p.Refrescar();
					p.MenuPrincipal();
				}
			}else if(posicionReserva == 2)
			{
				switch(opcion2)
				{
				case 1:
					MostrarBoletasSala2(dSala2,Sala2,pelicula2,asiento2,precio2,estado2);
					break;
				case 2:
					p.Refrescar();
					p.MenuPrincipal();
				}
			}else {
				switch(opcion2)
				{
				case 1:
					MostrarBoletasSala3(dSala3,Sala3,pelicula3,asiento3,precio3,estado3);
					p.MenuPrincipal();
					break;
				case 2:
					p.Refrescar();
					p.MenuPrincipal();
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
					MostrarBoletasSala1(dSala1,Sala1,pelicula,asientos,precio,estado);
					p.MenuPrincipal();
					break;
				case 2:
					MostrarBoletasSala2(dSala2,Sala2,pelicula2,asiento2,precio2,estado2);
					p.MenuPrincipal();
					break;
				case 3:
					p.Refrescar();
					p.MenuPrincipal();
				}
			}else if(posicionReserva1 == 1 && posicionReserva3 == 1)
			{
				switch(opcion2)
				{
				case 1:
					MostrarBoletasSala1(dSala1,Sala1,pelicula,asientos,precio,estado);
					p.MenuPrincipal();
					break;
				case 2:
					MostrarBoletasSala3(dSala3,Sala3,pelicula3,asiento3,precio3,estado3);
					p.MenuPrincipal();
					break;
				case 3:
					p.Refrescar();
					p.MenuPrincipal();
				}
			}else {
				switch(opcion2)
				{
				case 1:
					MostrarBoletasSala2(dSala2,Sala2,pelicula2,asiento2,precio2,estado2);
					p.MenuPrincipal();
					break;
				case 2:
					MostrarBoletasSala3(dSala3,Sala3,pelicula3,asiento3,precio3,estado3);
					p.MenuPrincipal();
					break;
				case 3:
					p.Refrescar();
					p.MenuPrincipal();
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
				MostrarBoletasSala1(dSala1,Sala1,pelicula,asientos,precio,estado);
				p.MenuPrincipal();
				break;
			case 2:
				MostrarBoletasSala2(dSala2,Sala2,pelicula2,asiento2,precio2,estado2);
				p.MenuPrincipal();
				break;
			case 3:
				MostrarBoletasSala3(dSala3,Sala3,pelicula3,asiento3,precio3,estado3);
				p.MenuPrincipal();
				break;
			case 4:
				p.Refrescar();
				p.MenuPrincipal();
				
				
			}
		}
		p.Refrescar();
		p.MenuPrincipal();
		
		
	}
	
	//Mostrar Boletas Sala 1
	public void MostrarBoletasSala1(int[] dSala1,String[] Sala1,String[] pelicula,int[] asientos,float[] precio,int[] estado)
	{
		int o=0,opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\t"+Sala1[o]);
			System.out.println("1.)Boletas Pagadas");
			System.out.println("2.)Reservas No pagadas");
			System.out.println("3.)Volver al Menu");
			System.out.println("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>3);
		switch(opcion)
		{
		case 1:
			BoletasPagadasSala1(dSala1,Sala1,pelicula,asientos,precio,estado);
			MostrarBoletasSala1(dSala1,Sala1,pelicula,asientos,precio,estado);
			break;
		case 2:
			BoletasNoPagadasSala1(dSala1,Sala1,pelicula,asientos,precio,estado);
			MostrarBoletasSala1(dSala1,Sala1,pelicula,asientos,precio,estado);
			break;
		case 3:
			p.Refrescar();
			p.MenuPrincipal();
			break;
		}
		
		
	}
	
	//Boletas Pagadas Sala 1
	
	public void BoletasPagadasSala1(int[] dSala1,String[] Sala1,String[] pelicula,int[] asientos,float[] precio,int[] estado)
	{
		Scanner sc = new Scanner (System.in);
		int a=0,opcion,contador=0;
		System.out.println("\tBoletas Pagadas");
		System.out.println(" ");
		for(int i=0;i<dSala1.length;i++)
		{
			if(estado[i]==1)
			{
				System.out.println("\tReserva: #"+(i+1));
				System.out.println("\t      Usuario: "+dSala1[i]);
				System.out.println("\t		Pelicula: "+pelicula[a]+"  Precio:"+precio[a]);
				System.out.println("\t		Sala: "+Sala1[a]+" Asiento: "+asientos[i]);
				System.out.println("Estado : Pagado");
				System.out.println(" ");
				do {
					System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					
				}else {
					p.Refrescar();
					p.MenuPrincipal();
				}
				
				
			}else {
				contador++;
			}
		}
		if(contador==0)
		{
			System.out.println("No hay usuarios en la sala...");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}else {
			System.out.println(" ");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}
		p.Refrescar();
		
	}
	
	//No pagadas
	public void BoletasNoPagadasSala1(int[] dSala1,String[] Sala1,String[] pelicula,int[] asientos,float[] precio,int[] estado)
	{
		Scanner sc = new Scanner (System.in);
		int a=0,opcion,contador=0;
		System.out.println("\tBoletas No Pagadas");
		System.out.println(" ");
		for(int i=0;i<dSala1.length;i++)
		{
			if(estado[i]==2)
			{
				System.out.println("\tReserva: #"+(i+1));
				System.out.println("\t      Usuario: "+dSala1[i]);
				System.out.println("\t		Pelicula: "+pelicula[a]+"  Precio:"+precio[a]);
				System.out.println("\t		Sala: "+Sala1[a]+" Asiento: "+asientos[i]);
				System.out.println("Estado : No Pagado");
				System.out.println(" ");
				do {
					System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					
				}else {
					p.Refrescar();
					p.MenuPrincipal();
				}
				
				
			}else {
				contador++;
			}

		}
		if(contador==100)
		{
			System.out.println("No hay usuarios en la sala...");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}else {
			System.out.println(" ");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}
		p.Refrescar();
		
	}
	
	
	//Mostrar Boletas Sala 2
	public void MostrarBoletasSala2(int[] dSala2,String[] Sala2,String[] pelicula2,int[] asiento2,float[] precio2,int[] estado2)
	{
		int o=0,opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\t"+Sala2[o]);
			System.out.println("1.)Boletas Pagadas");
			System.out.println("2.)Reservas No pagadas");
			System.out.println("3.)Volver al Menu");
			System.out.println("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>3);
		switch(opcion)
		{
		case 1:
			BoletasPagadasSala2(dSala2,Sala2,pelicula2,asiento2,precio2,estado2);
			MostrarBoletasSala2(dSala2,Sala2,pelicula2,asiento2,precio2,estado2);
			break;
		case 2:
			BoletasNoPagadasSala2(dSala2,Sala2,pelicula2,asiento2,precio2,estado2);
			MostrarBoletasSala2(dSala2,Sala2,pelicula2,asiento2,precio2,estado2);
			break;
		case 3:
			p.Refrescar();
			p.MenuPrincipal();
			break;
		}
		
	}
	
	//Pagadas Sala 2
	public void BoletasPagadasSala2(int[] dSala2,String[] Sala2,String[] pelicula2,int[] asiento2,float[] precio2,int[] estado2)
	{
		Scanner sc = new Scanner (System.in);
		int a=0,opcion,contador=0;
		System.out.println("\tBoletas Pagadas");
		System.out.println(" ");
		for(int i=0;i<dSala2.length;i++)
		{
			if(estado2[i]==1)
			{
				System.out.println("\tReserva: #"+(i+1));
				System.out.println("\t      Usuario: "+dSala2[i]);
				System.out.println("\t		Pelicula: "+pelicula2[a]+"  Precio:"+precio2[a]);
				System.out.println("\t		Sala: "+Sala2[a]+" Asiento: "+asiento2[i]);
				System.out.println("Estado : Pagado");
				System.out.println(" ");
				do {
					System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					
				}else {
					p.Refrescar();
					p.MenuPrincipal();
				}
				
				
			}else {
				contador++;
			}
		}
		if(contador==100)
		{
			System.out.println("No hay usuarios en la sala...");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}else {
			System.out.println(" ");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}
		
		p.Refrescar();
		
	}
	//No pagadas
		public void BoletasNoPagadasSala2(int[] dSala2,String[] Sala2,String[] pelicula2,int[] asiento2,float[] precio2,int[] estado2)
		{
			Scanner sc = new Scanner (System.in);
			int a=0,opcion,contador=0;
			System.out.println("\tBoletas No Pagadas");
			System.out.println(" ");
			for(int i=0;i<dSala2.length;i++)
			{
				if(estado2[i]==2)
				{
					System.out.println("\tReserva: #"+(i+1));
					System.out.println("\t      Usuario: "+dSala2[i]);
					System.out.println("\t		Pelicula: "+pelicula2[a]+"  Precio:"+precio2[a]);
					System.out.println("\t		Sala: "+Sala2[a]+" Asiento: "+asiento2[i]);
					System.out.println("Estado : No Pagado");
					System.out.println(" ");
					do {
						System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
						System.out.print("Opcion: ");
						opcion = sc.nextInt();
					}while(opcion<1 || opcion>2);
					if(opcion == 1)
					{
						
					}else {
						p.Refrescar();
						p.MenuPrincipal();
					}
					
					
				}else {
					contador++;
				}
			}
			if(contador==100)
			{
				System.out.println("No hay usuarios en la sala...");
				System.out.println("Presione una tecla para continuar....");
				new java.util.Scanner(System.in).nextLine();
			}else {
				System.out.println(" ");
				System.out.println("Presione una tecla para continuar....");
				new java.util.Scanner(System.in).nextLine();
			}
			p.Refrescar();
			
		}
	
	
	
	//Mostrar Boletas Sala 3
	public void MostrarBoletasSala3(int[] dSala3,String[] Sala3,String[] pelicula3,int[] asiento3,float[] precio3,int[] estado3)
	{
		int o=0,opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\t"+Sala3[o]);
			System.out.println("1.)Boletas Pagadas");
			System.out.println("2.)Reservas No pagadas");
			System.out.println("3.)Volver al Menu");
			System.out.println("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>3);
		switch(opcion)
		{
		case 1:
			BoletasPagadasSala3(dSala3,Sala3,pelicula3,asiento3,precio3,estado3);
			MostrarBoletasSala3(dSala3,Sala3,pelicula3,asiento3,precio3,estado3);
			break;
		case 2:
			BoletasNoPagadasSala3(dSala3,Sala3,pelicula3,asiento3,precio3,estado3);
			MostrarBoletasSala3(dSala3,Sala3,pelicula3,asiento3,precio3,estado3);
			break;
		case 3:
			p.Refrescar();
			p.MenuPrincipal();
			break;
		}
		
		
	}
	
	//Pagadas
	public void BoletasPagadasSala3(int[] dSala3,String[] Sala3,String[] pelicula3,int[] asiento3,float[] precio3,int[] estado3)
	{
		Scanner sc = new Scanner (System.in);
		int a=0,opcion,contador=0;
		System.out.println("\tBoletas Pagadas");
		System.out.println(" ");
		for(int i=0;i<dSala3.length;i++)
		{
			if(estado3[i]==1)
			{
				System.out.println("\tReserva: #"+(i+1));
				System.out.println("\t      Usuario: "+dSala3[i]);
				System.out.println("\t		Pelicula: "+pelicula3[a]+"  Precio:"+precio3[a]);
				System.out.println("\t		Sala: "+Sala3[a]+" Asiento: "+asiento3[i]);
				System.out.println("Estado : Pagado");
				System.out.println(" ");
				do {
					System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
					System.out.print("Opcion: ");
					opcion = sc.nextInt();
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					
				}else {
					p.Refrescar();
					p.MenuPrincipal();
				}
				
				
			}else {
				contador++;
			}
		}
		if(contador==100)
		{
			System.out.println("No hay usuarios en la sala...");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}else {
			System.out.println(" ");
			System.out.println("Presione una tecla para continuar....");
			new java.util.Scanner(System.in).nextLine();
		}
		p.Refrescar();
		
	}
	//No pagadas
		public void BoletasNoPagadasSala3(int[] dSala3,String[] Sala3,String[] pelicula3,int[] asiento3,float[] precio3,int[] estado3)
		{
			Scanner sc = new Scanner (System.in);
			int a=0,opcion,contador=0;
			System.out.println("\tBoletas No Pagadas");
			System.out.println(" ");
			for(int i=0;i<dSala3.length;i++)
			{
				if(estado3[i]==2)
				{
					System.out.println("\tReserva: #"+(i+1));
					System.out.println("\t      Usuario: "+dSala3[i]);
					System.out.println("\t		Pelicula: "+pelicula3[a]+"  Precio:"+precio3[a]);
					System.out.println("\t		Sala: "+Sala3[a]+" Asiento: "+asiento3[i]);
					System.out.println("Estado : No Pagado");
					System.out.println(" ");
					do {
						System.out.println("Desea seguir Visualizando? Opcion 1=SI : Opcion 2=NO");
						System.out.print("Opcion: ");
						opcion = sc.nextInt();
					}while(opcion<1 || opcion>2);
					if(opcion == 1)
					{
						
					}else {
						p.Refrescar();
						p.MenuPrincipal();
					}
					
					
				}else {
					contador++;
				}
			}
			if(contador==100)
			{
				System.out.println("No hay usuarios en la sala...");
				System.out.println("Presione una tecla para continuar....");
				new java.util.Scanner(System.in).nextLine();
			}else {
				System.out.println(" ");
				System.out.println("Presione una tecla para continuar....");
				new java.util.Scanner(System.in).nextLine();
			}
			
			p.Refrescar();
			
		}
		
	

}
