package Cinema;

import java.util.Scanner;

import Cinema.Salas;
import Cinema.Peliculas;
import Cinema.Boletas;
import Cinema.Reservas;

public class Usuarios {
	
	//Atributos Administrador
	String Usuario;
	String password;
	
	//Atributos Usuario
	public static String nombre[]= new String[100];
	/*{
	nombre[0]="Cristian";
	nombre[1] = "Diana";
	}*/
	public static int[]documento = new int[100];
	/*{
	documento[0] = 1112793923;
	documento[1] = 31430554;
	}*/
			
	//Atributos Salas
	public static String sala[]= new String[3];
	/*{
	sala[0] = "Sala 1";
	sala[1] = "Sala 2";
	}*/
	public static int []codigo = new int[3];
	/*{
	codigo[0]=123;
	codigo[1]=234;
	}*/
	/*int[]puestos = new int[10];
	puestos[0] = 30;
	puestos[1] = 20;*/
	
	//Atributo Peliculas
	public static String nombrePelicula[]=new String[3];
	/*{
	nombrePelicula[0] = "Programando Despacito";
	nombrePelicula[1] = "La pereza de Programar";
	}*/
	 public static int []codigoPelicula = new int[3];
	 /*{
	codigoPelicula[0]=1;
	codigoPelicula[1]=2;
	 }*/
	public static float []precioPelicula = new float[3];
	/*{
	precioPelicula[0] = 6000;
	}*/
	
	//Atributo Reservas para cada Sala
	
	//Sala 1
	public static int documentoSala1[] = new int[25];
	/*{
	documentoSala1[0] = documento[0];
	}*/
	public static String Sala[] = new String[1];
	/*{
	Sala[0] = sala[0];
	}*/
	public static String pelicula1[] = new String[1];
	/*{
	pelicula1[0] = nombrePelicula[0];
	}*/
	public static int [] asientos = new int[25];
	/*{
	asientos[0] = 1;
	}*/
	 public static float []precio = new float[1];
	 /*{
	precio[0] = precioPelicula[0];
	 }*/
	 public static int[] estado = new int[25];
	
	//Sala 2
	 public static int documentoSala2[] = new int[25];
	 /*{
	documentoSala2[0] = documento[1];
	 }*/
	public static String []Sala2 = new String[1];
	/*{
	Sala2[0] = sala[1];
	}*/
	public static String []pelicula2 = new String[1];
	/*{
	pelicula2[0] = nombrePelicula[1];
	}*/
	public static int []asiento2 = new int[25];
	/*{
		asiento2[0] = 1;
	}*/
	public static float []precio2 = new float[1];
	 /*{
		 precio2[0] = precioPelicula[1];
	 }*/
	public static int[] estado2 = new int[25];
	
	//Sala 3
	public static int documentoSala3[] = new int[25];
	public static String []Sala3 = new String[1];
	public static String []pelicula3 = new String[1];
	public static int []asiento3 = new int[25];
	public static float []precio3 = new float[1];
	
	public static int[] estado3 = new int[25];

	
			
	
	
	
	//Refrescar
	public void Refrescar() {
		for(int i=0;i<20;i++)
        {
        	System.out.println(" ");
        }
	}
	
	
	
	//Constructor
	public void Administrador() {
		Scanner sc = new Scanner(System.in);
		int salir;
		do {
			System.out.println("\t***************************");
			System.out.println("\t*         INICIO          *");
			System.out.println("\t***************************");
			System.out.println("\t*     1.)Ingresar         *");
			System.out.println("\t*     2.)Salir            *");
			System.out.println("\t***************************");
			System.out.print("Opcion: ");
			salir = sc.nextInt();
		}while(salir < 1 || salir > 2);
		if(salir == 1) {
			InicioSesion();
		}else
		{
			Refrescar();
			System.out.println("Hasta la proxima.....");
			System.exit(0); //Finalizar el Sistema
		}
		
	}
	
	
	//Inicio Sesion
	public void InicioSesion() {
		Scanner sc = new Scanner(System.in);
		
		Refrescar();
		System.out.println("\t********************************************");
		System.out.println("\t*               INICIO DE SESION           *");
		System.out.println("\t********************************************");
		System.out.println("\t*            1.)Usuario                    *");
		System.out.println("\t*            2.)Password                   *");
		System.out.println("\t********************************************");
		System.out.print("Ingrese Usuario: ");
		Usuario = sc.nextLine();
		System.out.print("Ingrese Contraseña: ");
		password = sc.nextLine();
		System.out.println(" ");
		System.out.println("Bienvenido Administrador...........");
		System.out.println("Presiona una tecla para Continuar...");
        new java.util.Scanner(System.in).nextLine();
        Refrescar();
        MenuPrincipal();
	}
	
	
	//Menu Principal
	public void MenuPrincipal() {
		Scanner sc = new Scanner (System.in);
		
		//Union con Salas
		Salas s = new Salas();
				
		//Union con Peliculas
		Peliculas p = new Peliculas();
				
		//Union con Boletos
		Boletas b = new Boletas();
				
		//Union con Reservas
		Reservas r = new Reservas();
		
		int opcion;
		do {
			Refrescar();
			System.out.println("\t****************************************");
			System.out.println("\t*            MENU PRINCIPAL            *");
			System.out.println("\t****************************************");
			System.out.println("\t*         1.)Usuarios                  *");
			System.out.println("\t*         2.)Salas                     *");
			System.out.println("\t*         3.)Peliculas                 *");
			System.out.println("\t*         4.)Boletas                   *");
			System.out.println("\t*         5.)Reservas                  *");
			System.out.println("\t*       6.)Cerrar Sesion               *");
			System.out.println("\t****************************************");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion >6);
		Refrescar();
		switch(opcion)
		{
		case 1:
			Usuarios(nombre,documento);
			break;
		case 2:
			s.MenuSalas(sala,codigo,Sala,Sala2,Sala3);
			break;
		case 3:
			p.MenuPeliculas(nombrePelicula,codigoPelicula,precioPelicula,pelicula1,precio,pelicula2,precio2,pelicula3,precio3);
			break;
		case 4:
			b.MostrarBoletas(sala, documentoSala1, Sala, pelicula1, precio, asientos, estado, documentoSala2, Sala2, pelicula2, precio2, asiento2, estado2, documentoSala3, Sala3, pelicula3, precio3, asiento3, estado3);
			break;
		case 5:
			r.MenuReservas(nombre,documento,sala,codigo,nombrePelicula,codigoPelicula,precioPelicula,documentoSala1,Sala,pelicula1,asientos,precio,documentoSala2,Sala2,pelicula2,asiento2,precio2,documentoSala3,Sala3,pelicula3,asiento3,precio3,estado,estado2,estado3);
			break;
		case 6:
			Administrador();
			break;
		}
		
		
	}
	
	public void Usuarios(String[] nombre,int[] documento) {
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("\t**********************************");
			System.out.println("\t*        MENU USUARIOS           *");
			System.out.println("\t**********************************");
			System.out.println("\t*       1.)Mostrar Usuarios      *");
			System.out.println("\t*       2.)Crear Usuario         *");
			System.out.println("\t*       3.)Editar Usuario        *");
			System.out.println("\t        4.)Eliminar Usuario      *");
			System.out.println("\t*       5.)Volver al Menu        *");
			System.out.println("\t**********************************");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while(opcion<1 || opcion>5);
		switch(opcion)
		{
		case 1:
			MostrarUsuarios(nombre,documento);
			break;
		case 2:
			CrearUsuarios(nombre,documento);
			break;
		case 3:
			EditarUsuarios(nombre,documento);
			break;
		case 4:
			EliminarUsuarios(nombre,documento);
			break;
		case 5:
			MenuPrincipal();
			break;		
		}
		
	}
	
	public void MostrarUsuarios(String[] nombre,int[] documento) {
		Scanner sc =  new Scanner(System.in);
		int opcion2;
		for(int i=0;i<nombre.length;i++)
		{
			/*if(documento[i] == 0)
			{
				System.out.println("No hay mas Usuarios...");
				System.out.println("Presiona una tecla para Continuar.....");
				new java.util.Scanner(System.in).nextLine();
				break;
			}*/
			System.out.println("Usuario #"+(i+1));
			System.out.println("Nombre: "+nombre[i]);
			System.out.println("Documento: "+documento[i]);
			System.out.println(" ");
			System.out.println("Desea Continuar? Opcion 1=Si : Opcion 2=No");
			System.out.print("Opcion: ");
			opcion2 = sc.nextInt();
			if(opcion2 == 1)
			{
				System.out.println(" ");
			}else if(opcion2 == 2)
			{
				Refrescar();
				Usuarios(nombre,documento);
			}else{
				System.out.println("Error............");
				System.out.println("Presiona una tecla para regresar......");
				 new java.util.Scanner(System.in).nextLine();
				 Refrescar();
				 Usuarios(nombre,documento);
			}
			
		}
		Refrescar();
		Usuarios(nombre,documento);
	}
	
	
	public void CrearUsuarios(String[] nombre,int[] documento) {
		Scanner sc = new Scanner (System.in);
		int opcion;
		System.out.println(" ");
		System.out.println("Crear nuevo Usuario");
		for(int i=0;i<nombre.length;i++)
		{
			if(documento[i] == 0)
			{
				sc.nextLine(); //fflush version pobre att:Molina
				System.out.println(" ");
				System.out.println("Usuario #"+(i+1));
				System.out.print("Ingrese nombre: ");
				nombre[i] = sc.nextLine();
				System.out.print("Ingrese documento: ");
				documento[i] = sc.nextInt();
				if(documento[i]<=0)
				{
					System.out.println(" ");
					System.out.println("Error, Presione una tecla para volver a ingresar......");
					new java.util.Scanner(System.in).nextLine();
					CrearUsuarios(nombre,documento);
				}else {
					System.out.println(" ");
					System.out.println("Usuario Guardado con exito...");
					System.out.println(" ");
					do {
						System.out.println("Desea Crear un nuevo Usuario? Opcion 1=Si: Opcion 2=No");
						System.out.print("Opcion: ");
						opcion = sc.nextInt();
					}while(opcion<1 || opcion>2);
					if(opcion == 1)
					{
						
					}else {
						Refrescar();
						Usuarios(nombre,documento);
						
					}
					
				}
				
			}else {
				System.out.println("Usuario #"+(i+1)+" ya existe");
				System.out.println(" ");
			}
		}
		Refrescar();
		Usuarios(nombre,documento);
			
	}
	
	//Editar Usuario
	
	public void EditarUsuarios(String[] nombre, int[] documento)
	{
		Scanner sc = new Scanner(System.in);
		int opcion,contador;
		for(int i=0;i<nombre.length;i++)
		{
			System.out.println("Usuario #"+(i+1));
			System.out.println("Nombre: "+nombre[i]);
			System.out.println("Documento: "+documento[i]);
			System.out.println(" ");
			do {
				System.out.println("Editar Usuario? Opcion 1=Si: Opcion 2=No: Opcion 3=Salir");
				opcion = sc.nextInt();
			}while(opcion<1 || opcion>3);
			if(opcion == 1)
			{
				contador=i;
				EditarU(nombre,documento,contador);
				
			}else if(opcion == 3) {
				Refrescar();
				Usuarios(nombre,documento);
				
			}else {
				
			}
			
			
		}
		Refrescar();
		Usuarios(nombre,documento);
		
	}
	
	//Editar Usuario Independiente
	public void EditarU(String[] nombre, int[] documento,int contador)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese Nuevo Nombre: ");
		nombre[contador]= sc.nextLine();
		System.out.print("Ingrese Nuevo Documento: ");
		documento[contador]= sc.nextInt();
		System.gc();
		System.out.println(" ");
		System.out.println("Actualizacion Guardada....");
		System.out.println("Presione una tecla para continuar......");
		new java.util.Scanner(System.in).nextLine();
		Refrescar();
		Usuarios(nombre,documento);
	}
	
	//Eliminar Usuario
	public void EliminarUsuarios(String[] nombre, int[] documento)
	{
		Scanner sc = new Scanner (System.in);
		int opcion,id,contador;
		System.out.print("Ingrese el documento del usuario: ");
		id = sc.nextInt();
		for(int i=0;i<nombre.length;i++)
		{
			if(id == documento[i])
			{
				System.out.println("Usuario #"+(i+1));
				System.out.println("Nombre: "+nombre[i]);
				System.out.println("Documento: "+documento[i]);
				System.out.println(" ");
				do {
					System.out.println("Desea Eliminarlo? Opcion 1=SI: Opcion 2=NO");
					opcion = sc.nextInt();
					
				}while(opcion<1 || opcion>2);
				if(opcion == 1)
				{
					contador = i;
					EliminarU(nombre,documento,contador);
					Usuarios(nombre,documento);
					
					
				}else {
					Refrescar();
					Usuarios(nombre,documento);
				}
				
			}else{
				
				
			}
		}
		System.out.println(" ");
		System.out.println("El usuario con este documento no existe...");
		System.out.println("Presione una tecla para volver....");
		new java.util.Scanner(System.in).nextLine();
		Refrescar();
		Usuarios(nombre,documento);
		
	}
	
	//Eliminar Usuario Independiente
	public void EliminarU(String[] nombre,int[] documento, int contador) 
	{
		Scanner sc = new Scanner(System.in);
		nombre[contador] = null;
		documento[contador] = 0;
		System.out.println(" ");
		System.out.println("Usuario Eliminado....");
		System.out.println("Presione una tecla para continuar.........");
		new java.util.Scanner(System.in).nextLine();
		Refrescar();
		Usuarios(nombre,documento);
	}
}
