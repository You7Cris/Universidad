/*
 * Created by SharpDevelop.
 * User: crist
 * Date: 13/10/2017
 * Time: 2:47 p. m.
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Timers;
using System.Threading;
using System.Text;

namespace Cristian
{
	
	class Program
	{
		
		private int[] vector;
		
		
		public void  Inicio()
		{
			Console.WriteLine("\t \t Bienvenidos a la calculadora virtual\n");
			Console.WriteLine("\t Este es un programa que funciona como calculadora\n\n");
			Console.WriteLine("Presione una tecla para entrar en el menu..");
			Console.ReadKey();
			Console.Clear();
			Menu();
		}
		public void Menu()
		{
			Int16 dimension;
			Int64 total;
			total=0;
			int opcion,i;
			Console.WriteLine("\t ****************************************");
			Console.WriteLine("\t *            CALCULADORA               *");
			Console.WriteLine("\t ****************************************");
			Console.WriteLine("\t *             1.Sumar                  *");
			Console.WriteLine("\t *             2.Restar                 *");
			Console.WriteLine("\t *             3.Multiplicar            *");
			Console.WriteLine("\t *             4.Dividir                *");
			Console.WriteLine("\t *             5.Raiz                   *");
			Console.WriteLine("\t *             6.Salir                  *");
			Console.WriteLine("\t ****************************************");
			Console.WriteLine("Ingrese la opcion que desea usar");
			opcion=Convert.ToInt16(Console.ReadLine());
			switch(opcion)
			{
				case 1:
					Console.Clear();
					
					Console.WriteLine("\t \t SUMAR\n");
					Console.WriteLine("Ingrese cuantos numeros desea sumar");
					dimension=Convert.ToInt16(Console.ReadLine());
					vector=new int[dimension];
					Console.WriteLine("Ingrese los "+dimension+" numeros");
					
					for(i=0;i<dimension;i++)
					{
						string linea;
						linea=Console.ReadLine();
						vector[i]=int.Parse(linea);
						total=total+(vector[i]);
					}
					Console.WriteLine("El total es: "+total);
					Console.WriteLine("\n\n");
					Console.WriteLine("Presione una tecla para volver al menu principal");
					Console.ReadKey();
					Console.Clear();
					Menu();
					break;
				case 2:
					Int16 numero1,numero2;
					Int64 resta;
					Console.Clear();
					Console.WriteLine("\t Resta");
					Console.WriteLine("Ingrese los dos numeros que desea restar");
					numero1=Convert.ToInt16(Console.ReadLine());
					numero2=Convert.ToInt16(Console.ReadLine());
					resta=numero1-numero2;
					Console.WriteLine("El resultado es: "+resta+"\n\n");
					Console.WriteLine("Presione una tecla para volver al menu principal");
					Console.ReadKey();
					Console.Clear();
					Menu();
					break;
				case 3:
					Console.Clear();
					Int16 k;
					Int64 multiplicacion;
					multiplicacion=1;
					Console.WriteLine("\t MULTIPLICACION");
					Console.WriteLine("Ingrese cuantos numeros desea multiplicar");
					k=Convert.ToInt16(Console.ReadLine());
					vector=new int[k];
					Console.WriteLine("Ingrese los "+k+" numeros");
					for(i=0;i<k;i++)
					{
						string linea;
						linea=Console.ReadLine();
						vector[i]=int.Parse(linea);
						multiplicacion=multiplicacion*(vector[i]);
					}
					Console.WriteLine("El resultado es : "+multiplicacion+"\n\n");
					Console.WriteLine("Presione una tecla para volver al menu principal");
					Console.ReadKey();
					Console.Clear();
					Menu();
					break;
				case 4:
					
					break;
					
		
			}
			
			;
			
			
			Console.ReadKey();
			
			
		}
		
		public static void Main(string[] args)
		{
			Program pv= new Program();
			pv.Inicio();
		}
	}
}