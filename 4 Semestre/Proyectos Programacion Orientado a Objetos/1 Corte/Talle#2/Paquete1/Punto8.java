

package Paquete1;

import java.util.Scanner;

import java.util.Date;

public class Punto8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Date fecha = new Date();
		int opcion,mes;
		do {
			System.out.println("*****************************");
			System.out.println("*          MENU             *");
			System.out.println("*****************************");
			System.out.println("*   1.) Consultar Mes       *");
			System.out.println("*   2.) Codigo ASCII        *");
			System.out.println("*****************************");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
		}while((opcion < 1) || (opcion > 2));
		switch(opcion)
		{
		case 1:
			System.out.println("Fecha actual: "+fecha);//Muestra la fecha actual con hora.
			do {
				System.out.print("Ingrese el numero del mes : ");
				mes = sc.nextInt();
			}while((mes < 1) || (mes > 12));
			switch(mes)
			{
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
			}
			sc.close();
			break;
		case 2:
			int opcion2;
			int contador;
			do {
				System.out.println("**************************");
				System.out.println("        CODIGO ASCII     *");
				System.out.println("**************************");
				System.out.println("*   1. A     *     2. B  *");
				System.out.println("*   3. C     *     4. D  *");
				System.out.println("*   5. E     *     6. F  *");
				System.out.println("*   7. G     *     8. H  *");
				System.out.println("*   9. I     *    10. J  *");
				System.out.println("*  11. K     *    12. L  *");
				System.out.println("*  13. M     *    14. N  *");
				System.out.println("*  15. O     *    16. P  *");
				System.out.println("*  17. Q     *    18. R  *");
				System.out.println("*  19. S     *    20. T  *");
				System.out.println("*  21. U     *    22. V  *");
				System.out.println("*  23. W     *    24. X  *");
				System.out.println("*  25. Y     *    26. Z  *");
				System.out.println("**************************");
				System.out.print("Opcion: ");
				opcion2 = sc.nextInt();
			}while((opcion2 < 1) || (opcion2 > 26));
			System.out.println("  ");//Espacio
			do {
				System.out.println("1.)Mayuscula     2.)Minuscula");
				contador = sc.nextInt();
			}while((contador<1) || (contador > 2));
			switch(opcion2)
			{
			case 1:
				char l1 = 'A';
				char l2 = 'a';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l1+" : "+((int)l1));
				}else {
					System.out.println("Su codigo ASCII "+l2+" : "+((int)l2));
				}
				break;
			case 2:
				char l3 = 'B';
				char l4 = 'b';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l3+" : "+((int)l3));
				}else {
					System.out.println("Su codigo ASCII "+l4+" : "+((int)l4));
				}
				break;
				
			case 3:
				char l5 = 'C';
				char l6 = 'c';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l5+" : "+((int)l5));
				}else {
					System.out.println("Su codigo ASCII "+l6+" : "+((int)l6));
				}
				break;
			case 4:
				char l7 = 'D';
				char l8 = 'd';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l7+" : "+((int)l7));
				}else {
					System.out.println("Su codigo ASCII "+l8+" : "+((int)l8));
				}
				break;
			case 5:
				char l9 = 'E';
				char l10 = 'e';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l9+" : "+((int)l9));
				}else {
					System.out.println("Su codigo ASCII "+l10+" : "+((int)l10));
				}
				break;
			case 6:
				char l11 = 'F';
				char l12 = 'f';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l11+" : "+((int)l11));
				}else {
					System.out.println("Su codigo ASCII "+l12+" : "+((int)l12));
				}
				break;
			case 7:
				char l13 = 'G';
				char l14 = 'g';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l13+" : "+((int)l13));
				}else {
					System.out.println("Su codigo ASCII "+l14+" : "+((int)l14));
				}
				break;
			case 8:
				char l15 = 'H';
				char l16 = 'h';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l15+" : "+((int)l15));
				}else {
					System.out.println("Su codigo ASCII "+l16+" : "+((int)l16));
				}
				break;
			case 9:
				char l17 = 'I';
				char l18 = 'i';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l17+" : "+((int)l17));
				}else {
					System.out.println("Su codigo ASCII "+l18+" : "+((int)l18));
				}
				break;
			case 10:
				char l19 = 'J';
				char l20 = 'j';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l19+" : "+((int)l19));
				}else {
					System.out.println("Su codigo ASCII "+l20+" : "+((int)l20));
				}
				break;
			case 11:
				char l21 = 'K';
				char l22 = 'k';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l21+" : "+((int)l21));
				}else {
					System.out.println("Su codigo ASCII "+l22+" : "+((int)l22));
				}
				break;
			case 12:
				char l23 = 'L';
				char l24 = 'l';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l23+" : "+((int)l23));
				}else {
					System.out.println("Su codigo ASCII "+l24+" : "+((int)l24));
				}
				break;
			case 13:
				char l25 = 'M';
				char l26 = 'm';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l25+" : "+((int)l25));
				}else {
					System.out.println("Su codigo ASCII "+l26+" : "+((int)l26));
				}
				break;
			case 14:
				char l27 = 'N';
				char l28 = 'n';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l27+" : "+((int)l27));
				}else {
					System.out.println("Su codigo ASCII "+l28+" : "+((int)l28));
				}
				break;
			case 15:
				char l29 = 'O';
				char l30 = 'o';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l29+" : "+((int)l29));
				}else {
					System.out.println("Su codigo ASCII "+l30+" : "+((int)l30));
				}
				break;
			case 16:
				char l31 = 'P';
				char l32 = 'p';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l31+" : "+((int)l31));
				}else {
					System.out.println("Su codigo ASCII "+l32+" : "+((int)l32));
				}
				break;
			case 17:
				char l33 = 'Q';
				char l34 = 'q';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l33+" : "+((int)l33));
				}else {
					System.out.println("Su codigo ASCII "+l34+" : "+((int)l34));
				}
				break;
			case 18:
				char l35 = 'R';
				char l36 = 'r';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l35+" : "+((int)l35));
				}else {
					System.out.println("Su codigo ASCII "+l36+" : "+((int)l36));
				}
				break;
			case 19:
				char l37 = 'S';
				char l38 = 's';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l37+" : "+((int)l37));
				}else {
					System.out.println("Su codigo ASCII "+l38+" : "+((int)l38));
				}
				break;
			case 20:
				char l39 = 'T';
				char l40 = 't';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l39+" : "+((int)l39));
				}else {
					System.out.println("Su codigo ASCII "+l40+" : "+((int)l40));
				}
				break;
			case 21:
				char l41 = 'U';
				char l42 = 'u';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l41+" : "+((int)l41));
				}else {
					System.out.println("Su codigo ASCII "+l42+" : "+((int)l42));
				}
				break;
			case 22:
				char l43 = 'V';
				char l44 = 'v';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l43+" : "+((int)l43));
				}else {
					System.out.println("Su codigo ASCII "+l44+" : "+((int)l44));
				}
				break;
			case 23:
				char l45 = 'W';
				char l46 = 'w';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l45+" : "+((int)l45));
				}else {
					System.out.println("Su codigo ASCII "+l46+" : "+((int)l46));
				}
				break;
			case 24:
				char l47 = 'X';
				char l48 = 'x';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l47+" : "+((int)l47));
				}else {
					System.out.println("Su codigo ASCII "+l48+" : "+((int)l48));
				}
				break;
			case 25:
				char l49 = 'Y';
				char l50 = 'y';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l49+" : "+((int)l49));
				}else {
					System.out.println("Su codigo ASCII "+l50+" : "+((int)l50));
				}
				break;
			case 26:
				char l51 = 'Z';
				char l52 = 'z';
				if(contador == 1)
				{
					System.out.println("Su codigo ASCII "+l51+" : "+((int)l51));
				}else {
					System.out.println("Su codigo ASCII "+l52+" : "+((int)l52));
				}
				break;
				
			}
			sc.close();
			
			
			
		}
		sc.close();
		
		
		
		
		
	}

}



