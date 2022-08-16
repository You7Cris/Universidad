#include <stdio.h>
#include <iostream>
#include <stdlib.h>
#include <conio.h>
#include <windows.h>
#include <math.h>
#include <string>
#define almn 3

using namespace std;

void hola();
void Menu_1();
void Menu_2();
void Menu_3();
void Menu_4();
int main();

void Uno_1()
{
    int i;
    float array[4]={32.583,11.239,45.781,22.237};
    float *P_array=&array[0];
    for(i=1;i<5;i++)
    {
        printf("Posicion %i = (%.2f)\n",i,*(P_array+i));
        printf("Posicion en memoria= %d\n\n",(P_array));
    }
    free(P_array);
    printf("Volver al menu....\n");
    getch();
    system("cls");
    Menu_1();
}

void Uno_2()
{
    int i,num1,num2,resultado;
    printf("Ingrese dos valores para crear una matriz\n");
    printf("Numeros: ");
    scanf("%i",&num1);
    scanf("%i",&num2);
    resultado=num1*num2;
    int matriz[resultado];
    int *P_matriz=&matriz[0];
    printf("\nCreando matriz.....\n");
    for(i=0;i<resultado;i++)
    {
        *(P_matriz+i)= 1 + rand()%((99+1)-1);
        printf("Posicion[%i]= %i\n",i+1,*(P_matriz+i));
        printf("Posicion en memoria= %d\n\n\n",(P_matriz+i));
    }
    free(P_matriz);
    printf("\n\nPresione para volver al menu....");
    getch();
    system("cls");
    Menu_1();
}

void Uno_3()
{
    int arreglo[4][4],i,j;
    int *P_arreglo=&arreglo[0][0];
    printf("Ingrese los 4 numeros\n");
    for(i=0;i<4;i++)
    {
            scanf("%i",&*(P_arreglo+i+0));
            *(P_arreglo+i+1*4)=pow(*(P_arreglo+i+0),2);
            *(P_arreglo+i+2*4)=pow(*(P_arreglo+i+0),3);
            *(P_arreglo+i+3*4)=pow(*(P_arreglo+i+0),4);

    }
    printf("\n\t\tMostrar Valores.....\n\n");
    for(i=0;i<4;i++)
    {
            printf("\t%i",*(P_arreglo+i+0));
            printf("\t%i",*(P_arreglo+i+1*4));
            printf("\t%i",*(P_arreglo+i+2*4));
            printf("\t%i",*(P_arreglo+i+3*4));
            printf("\n");
    }

    free(P_arreglo);
    printf("\n\nVolver al menu....");
    getch();
    system("cls");
    Menu_1();

}

void Dos_1()
{
    int i,j,m[3][3];
    int matriz[3][3];
    int *P_matriz=&matriz[0][0];
    int *P_m=&m[0][0];
    printf("Ingrese los valores de la matriz:\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%i",&*(P_matriz+i+j));
        }
    }
    system("cls");
    printf("Posicion en memoria....\n\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("Posicion [%i][%i] = %i\n",i,j,*(P_matriz+i+j));
            printf("Posicion en memoria = %i\n",(P_matriz));
        }
    }
    printf("\n\tSumatoria\n\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            *(P_m+i+j)=(*(P_matriz+i+j)+(*(P_matriz+i+j)));
            printf("%i\t",*(P_m+i+j));
        }
        printf("\n");
    }
    free(P_matriz);
    getch();
    system("cls");
    printf("Posicion en memoria:\n\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("Posicion[%i][%i]= %i\t",i,j,(P_m+i+j));
        }
    }
    free(P_m);
    printf("\n\nVolver al menu.....");
    getch();
    system("cls");
    Menu_2();

}

void Dos_2()
{
    int i,j;
    int matriz[3][3];
    int *P_matriz=&matriz[0][0];
    printf("\t\tMatriz Automatica\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            *(P_matriz+i+j)= 1 + rand()%((99+1)-1);
            printf("\t%i\t",*(P_matriz+i+j));
        }
        printf("\n");
    }
    for(i=0;i<3;i++)
    {
        free(P_matriz);
    }
    free(P_matriz);
    fflush(stdin);
    printf("\n\nVolver al menu.....");
    getch();
    system("cls");
    Menu_2();
}

void Dos_3()
{
    int i,j,z,a,n;
    int matriz[3][3];
    int *P_matriz=&matriz[0][0];
    printf("\t Matriz con numeros primos\n\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            a=0;
            n= 1+rand()%((99+1)-1);
            for(z=1;z<=n;z++)
            {
                if(n%z==0)
                {
                    a++;
                }
            }
            if(a==2)
            {
                *(P_matriz+i+j)=n;
                printf("%i\t",*(P_matriz+i+j));
            }else
            {
                j--;
            }

        }
    }
    for(i=0;i<3;i++)
    {
        free(P_matriz);
    }
    free(P_matriz);
    printf("\n\nVolver al Menu....");
    getch();
    system("cls");
    Menu_2();
}


void Tres_1()
{
    int i,n;
    printf("Ingrese la dimension del vector\n");
    printf("Dimension: ");
    scanf("%i",&n);
    int vector[n];
    int *P_vector=&vector[0];
    printf("\n\n\tMostrando numeros en pantalla\n");
    for(i=0;i<n;i++)
    {
        *(P_vector+i)= 1 +rand()%((100+1)-1);
        if(*(P_vector+i)%2==0)
        {
            printf("Numero: %i\n",*(P_vector+i));
            printf("Posicion en Memoria: %d\n",(P_vector+i));
            printf("El numero es Par\n\n");
        }else
        {
            printf("Numero: %i \n",*(P_vector+i));
            printf("Posicion en Memoria: %d\n",(P_vector+i));
            printf("El numero es Impar\n\n");
        }
    }
    free(P_vector);
    printf("\n\nVolver al Menu....");
    getch();
    system("cls");
    Menu_3();
}

void Tres_2()
{
    int i,z,n,a;
    printf("Ingrese la dimension del vector\n");
    printf("Dimension: ");
    scanf("%i",&n);
    int vector[n];
    int *P_vector=&vector[0];
    printf("Numeros Primos\n\n");
    for(i=0;i<n;i++)
    {
        a=0;
        *(P_vector+i)= 1 + rand()%((99+1)-1);
        for(z=0;z<=*(P_vector+i);z++)
        {
            if(*(P_vector+i)%z==0)
            {
                a++;
            }
        }
        if(a==2)
        {
            printf("Numero= %i\n",*(P_vector+i));
            printf("Posicion de memoria= %i\n",(P_vector+i));
            printf("El numero es primo\n\n");
        }
        else
        {
            printf("Numero: %i\n",*(P_vector+i));
            printf("No es primo\n\n");
        }
    }
    free(P_vector);
    printf("\n\nVolver al Menu....");
    getch();
    system("cls");
    Menu_3();
}

void Tres_3()
{
    int i,n;
    int array[10];
    int *P_array=&array[0];
    printf("\t Generando numeros\n");
    for(i=0;i<10;i++)
    {
        n=1+rand()%((100+1)-1);
        if(n%2==0)
        {
            *(P_array+i)=n;
            printf("Posicion [%i]= %i\n",i+1,*(P_array+i));
            printf("Posicion en memoria= %d\n\n",(P_array+i));
        }else
        {
            i--;
        }
    }
    free(P_array);
    printf("\n\nVolver al Menu...");
    getch();
    system("cls");
    Menu_3();
}

void Tres_4()
{
    int tam;
	printf("Ingrese la dimension del vector\n");
	scanf("%i",&tam);
	int vec[tam],i,menor,ciclo=0;
	int *p_vec=&vec[0];
	for (i = 0; i < tam; i++) {
		*(p_vec + i* tam) = rand () % 31;
	}
	for(i=0;i<tam;i++){
		if (menor>=*(p_vec+i * tam)) {
				menor = *(p_vec+i * tam);
				ciclo = i;
		}
	}
	fflush(stdin);
	printf("\n\n");
	for(i=0;i<tam;i++){
		printf("\tEl vector: %i  En posicion: %i\n",*(p_vec + i* tam),i+1);
	}
	printf("\n\n");
	printf("El numero menor es: %i en posicion: %i en memoria: %p",*(p_vec+ciclo* tam),ciclo+1,(p_vec+ciclo));
    free(p_vec);
    getch();
    system("cls");
    Menu_3();
}

void Tres_5()
{
    int n,i,j,aux;
    int array[0];
    int *array_dinamica=NULL;
    printf("Por Favor digite el tamaño del arreglo: ");
    scanf("%i",&n);
    array_dinamica= new int[n];
    for(i=0;i<n;i++)
    {
        printf("Ingrese el %i numero: ",i+1);
        scanf("%i",&*(array_dinamica+i));
    }
    printf("\nOrdenando.....\n");
    for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
		 if (*(array_dinamica+j)<*(array_dinamica+j+1))
		 {
		 	aux=*(array_dinamica+j+1);
		 	*(array_dinamica+j+1)=*(array_dinamica+j);
		 	*(array_dinamica+j)=aux;

		 }
		}
	}
	for (i=0;i<n;i++)
	{
		printf ("%d\t",*(array_dinamica+i));
	}
	delete(array_dinamica);
	printf("\n\nVolver al Menu....");
	getch();
	system("cls");
	Menu_3();

}

void Tres_6()
{
    int i,j,n,n1;
    printf("Ingrese la dimension del vector: ");
    scanf("%i",&n);
    int array[n];
    int *array_dinamico=new int[n];
    for(i=0;i<n;i++)
    {
        printf("Ingrese %i numero: ",i+1);
        scanf("%i",&*(array_dinamico+i));
    }
    printf("\n\nQue numero desea buscar: ");
    scanf("%i",&n1);
    printf("\n\n");
    for(i=0;i<n;i++)
    {
        if(*(array_dinamico+i)==n1)
        {
            printf("El numero %i se encuentra en la posicion: %i\n",*(array_dinamico+i),i+1);
            printf("Su posicion en memoria: %d\n\n",(array_dinamico+i));
        }
    }
    delete(array_dinamico);
    printf("\n\nPresione para volver al menu.....");
    getch();
    system("cls");
    Menu_3();

}

void Tres_7()
{
    char nombre[30];
    int  cont=0;
    char *P_nombre= nombre;
    printf("Ingrese su nombre: ");
    scanf("%s",&nombre);
    strupr(nombre);
    while(*P_nombre)
    {
        switch(*P_nombre)
        {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U': cont=cont+1;
        }
        P_nombre+=1;
    }
    printf("\nEl numero de vocales es: %d\n\n",cont);
    free(P_nombre);
    printf("\n\nVolver al Menu....");
    getch();
    system("cls");
    Menu_3();
}

void Tres_8()
{
    char nombre[30];
    int cont=0;
    char *P_nombre=nombre;
    printf("Ingrese su Nombre: ");
    scanf("%s",&nombre);
    strupr(nombre);
    while(*P_nombre)
    {
        switch(*P_nombre)
        {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U': cont+=1;
        }
        P_nombre+=1;
    }
    printf("\nEl numero de vocales es: %d\n\n",cont);
    printf("\nVolver al menu...");
    free(P_nombre);
    getch();
    system("cls");
    Menu_3();
}

void Tres_9()
{
    int i,j,filas,columnas;
    printf("Ingrese las filas: ");
    scanf("%i",&filas);
    printf("\nIngrese las columnas: ");
    scanf("%i",&columnas);
    int **P_dinamica1;
    int **P_dinamica2;
    int **P_sumatoria;
    P_dinamica1= new int*[filas];
    P_dinamica2= new int*[filas];
    P_sumatoria= new int*[filas];
    printf("\n\n\t\t Matriz 1\n\n");
    for(i=0;i<filas;i++)
    {
        P_dinamica1[i]= new int[columnas];
        for(j=0;j<columnas;j++)
        {
            P_dinamica1[i][j]= 1+rand()&((100+1)-1);
            printf("%i\t",P_dinamica1[i][j]);
        }
        printf("\n");
    }
    getch();
    system("cls");
    printf("\t\t Matriz 2\n\n");
    for(i=0;i<filas;i++)
    {
        P_dinamica2[i]= new int[columnas];
        for(j=0;j<columnas;j++)
        {
            P_dinamica2[i][j]= 1 + rand()%((100+1)-1);
            printf("%i\t",P_dinamica2[i][j]);
        }
        printf("\n");
    }
    getch();
    system("cls");
    printf("\t Sumatoria entre ambas matrices\n\n");
    for(i=0;i<filas;i++)
    {
        P_sumatoria[i]=new int[columnas];
        for(j=0;j<columnas;j++)
        {
            P_sumatoria[i][j]=1+rand()%((100+1)-1);
            printf("%i\t",P_sumatoria[i][j]);
        }
        printf("\n");
    }
    delete(P_dinamica1);
    delete(P_dinamica2);
    delete(P_sumatoria);
    printf("\n\nVolver al Menu....");
    getch();
    system("cls");
    Menu_3();
}

void Tres_10()
{
    int i,j,n,m;
    printf("Ingrese la dimension de la matriz\n");
    printf("N: ");
    scanf("%i",&n);
    printf("M: ");
    scanf("%i",&m);
    int **P_matriz= new int *[n];
    for(i=0;i<n;i++)
    {
        P_matriz[i]= new int[m];
        for(j=0;j<m;j++)
        {
            P_matriz[i][j]= 1 + rand()%((50+1)-1);
            printf("%i\t",*(*P_matriz+i)+j);
        }
        printf("\n");
    }
    printf("\n\n\tTranspuesta de la Matriz\n\n");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%i\t",*(*(P_matriz+j)+i));
        }
        printf("\n");
    }
    for(i=0;i<n;i++)
    {
        delete[](P_matriz);
    }
    delete(P_matriz);
    getch();
    system("cls");
    Menu_3();
}

struct estudiante
{
    char nombre[20];
    int edad;
    float promedio;
}Alumno[3],*P_struct=&Alumno[0];

void Tres_11()
{
    int i,ciclo;
    float mayor=0;
    struct alumno{
    char nombre[30];
    int edad;
    float promedio;
    }*p_alu[3];

    for(i=0;i<3 ;i++){
        p_alu[i]=(struct alumno *) malloc(sizeof(struct alumno));
        printf("Ingrese el nombre el estudiante: %i\n",i+1);fflush(stdin);
        printf("Nombre:\n");fflush(stdin);
        scanf("%s",&p_alu[i]->nombre);fflush(stdin);
        printf("Edad:\n");fflush(stdin);
        scanf("%d",&p_alu[i]->edad);fflush(stdin);
        printf("Promedio:\n");fflush(stdin);
        scanf("%f",&p_alu[i]->promedio);fflush(stdin);
    }
    getch();
    system("cls");
    printf("Informacion Ingresada\n");
    for(i=0;i<3;i++){
        printf("\nInformacion del estudiante: %i\n",i+1);
        printf("\nNombre:  %s ",p_alu[i]->nombre);
        printf("\nEdad: %d",p_alu[i]->edad);
        printf("\nPromedio: %.2f",p_alu[i]->promedio);
    }
    for(i=0;i<3;i++){
        if (mayor<p_alu[i]->promedio) {
                mayor = p_alu[i]->promedio;
                ciclo = i;
        }
    }
    getch();
    printf("\n\n\n");
    printf("\t\tEl alumno con mejor promedio es: %s con: %.2f edad: %d\n",p_alu[ciclo]->nombre,mayor,p_alu[ciclo]->edad);
    free(P_struct);
    printf("\n\nVolver al Menu....");
    getch();
    system("cls");
    Menu_3();

}

struct ciclismo
{
    int horas;
    int minutos;
    int segundos;
}ciclismo[3],*P_structs=ciclismo;

void Tres_12()
{
    int i,thoras=0,tminutos=0,tsegundos=0;
    printf("Ingrese el tiempo de las 3 etapas del circuito\n");
    for(i=0;i<3;i++)
    {
        fflush(stdin);
        printf("\n\t\t %i ETAPA\n",i+1);
        printf("Horas: ");
        scanf("%i",&(P_structs+i)->horas);
        thoras=thoras+(P_structs+i)->horas;
        fflush(stdin);
        printf("Minutos: ");
        scanf("%i",&(P_structs+i)->minutos);
        if(60<(P_structs+i)->minutos)
        {
            printf("\n\nError incorrecto..\n");
            i=i-1;
        }
        else
        {
            tminutos=tminutos+(P_structs+i)->minutos;
            fflush(stdin);
            printf("Segundos: ");
            scanf("%i",&(P_structs+i)->segundos);
            fflush(stdin);
            if((P_structs+i)->segundos>60)
            {
                printf("Error incorrecto....\n");
                i=i-1;
            }
            else
            {
                tsegundos=tsegundos+(P_structs+i)->segundos;
                printf("\n\nInformacion almacenada\n");
            }
        }
        getch();
        system("cls");

    }
        printf("Mostrar Informacion total\n");
        while(tminutos>=60)
        {
            tminutos=tminutos-60;
            thoras=thoras+1;
        }
        while(tsegundos>=60)
        {
            tsegundos=tsegundos-60;
            tminutos=tminutos+1;
        }
        printf("\nEl tiempo total empleado\n");
        printf("Horas: %i\tMinutos: %i\tSegundos: %i\n",thoras,tminutos,tsegundos);
        free(P_structs);
        delete[](P_structs);
        printf("\n\nVolver al menu....");
        getch();
        system("cls");
        Menu_3();
}

struct Estudiante
{
    char nombre[20];
    int edad;
    char sexo[10];
    char club[10];
    char categoria[20];


}Estudiante[100],*P_Estudiante= Estudiante;

void Cuatro_1()
{
    int i,n;
    printf("Ingrese el numero de ciclistas: ");
    scanf("%i",&n);
    printf("Ingrese los datos del competidor\n");
    for(i=0;i<n;i++)
    {
        printf("Nombre: ");
        scanf("%s",&(P_Estudiante+i)->nombre);
        fflush(stdin);
        printf("Edad: ");
        scanf("%i",&(P_Estudiante+i)->edad);
        fflush(stdin);
        printf("Sexo: ");
        scanf("%s",&(P_Estudiante+i)->sexo);
        fflush(stdin);
        printf("Club: ");
        scanf("%s",&(P_Estudiante+i)->club);
        fflush(stdin);
        if(15>=(P_Estudiante+i)->edad)
        {
            strcpy((P_Estudiante+i)->categoria,("Infantil"));
        }else if(30>=(P_Estudiante+i)->edad)
        {
            strcpy((P_Estudiante+i)->categoria,("Joven"));
        }else
        {
            strcpy((P_Estudiante+i)->categoria,("Mayor"));
        }
        fflush(stdin);
        printf("\n\nInformacion almacenada....");
        getch();
        system("cls");
    }
    printf("Mostrar Informacion\n\n");
    for(i=0;i<n;i++)
    {
        printf("Nombre: %s\n",(P_Estudiante+i)->nombre);
        printf("Edad: %i\n",(P_Estudiante+i)->edad);
        printf("Sexo: %s\n",(P_Estudiante+i)->sexo);
        printf("Club: %s\n",(P_Estudiante+i)->club);
        printf("Categoria: %s\n",(P_Estudiante+i)->categoria);
        printf("\n\n");
        printf("Presiona una tecla para continuar....");
        getch();
        if(i<n-1);
        {
        system("cls");
        }
    }
    free(P_Estudiante);
    delete[](P_Estudiante);
    printf("\n\nVolver al Menu....");
    getch();
    system("cls");
    Menu_4();

}

struct Estudiante1
{
    char nombre[20];
    int edad;
    int grado;
    float promedio;
}Estudiante1[3],*P_estudiante1=Estudiante1;

void Cuatro_2()
{
    int i,mayor=0,vuelta;
    printf("Ingrese los datos para cada estudiante\n\n");
    for(i=0;i<3;i++)
    {
        fflush(stdin);
        printf("Nombre: ");
        fgets((P_estudiante1+i)->nombre,20,stdin);
        fflush(stdin);
        printf("Edad: ");
        scanf("%i",&(P_estudiante1+i)->edad);
        fflush(stdin);
        printf("Grado,ingrese numero(Ej: 1,2...): ");
        scanf("%i",&(P_estudiante1+i)->grado);
        fflush(stdin);
        printf("Promedio: ");
        scanf("%f",&(P_estudiante1+i)->promedio);
        fflush(stdin);
        if((P_estudiante1+i)->promedio>mayor)
        {
                mayor=(P_estudiante1+i)->promedio;
                vuelta=i;
        }
        printf("\n\nInformacion Almacenada...");
        getch();
        system("cls");

    }
    printf("Estudiante con mayor promedio\n");
    printf("\n\t El nombre del estudiante # %i es: %s\n",vuelta+1,(P_estudiante1+vuelta)->nombre);
    printf("\nLa edad: %d\n",(P_estudiante1+vuelta)->edad);
    printf("\nEl grado: %d\n",(P_estudiante1+vuelta)->grado);
    printf("\nEl promedio: %.2f\n",(P_estudiante1+vuelta)->promedio);
    free(P_estudiante1);
    delete(P_estudiante1);
    printf("\n\nVolver al Menu....");
    getch();
    system("cls");
    Menu_4();
}

struct trabajador
{
    float salario;
}trabajador[100],*P_trabajador=trabajador;

void Cuatro_3()
{
    int i,n,j;
    int mayor=0,menor=50000000000000000,vuelta_1,vuelta_2;
    printf("Ingrese el numero de trabajadores: ");
    scanf("%i",&n);
    j=n;
    printf("Ingrese el salario de cada trabajador: ");
    for(i=0;i<n;i++)
    {
        printf("Ingrese el salario del %i trabajador: ",i+1);
        scanf("%f",&(P_trabajador+i)->salario);
        if((P_trabajador+i)->salario>mayor)
        {
            mayor=(P_trabajador+i)->salario;
            vuelta_1=i;
        }
         if((P_trabajador+i)->salario<menor)
        {
            menor=(P_trabajador+i)->salario;
            vuelta_2=i;
        }
        printf("\n");
        printf("Informacion almacenada....");
        getch();
        system("cls");
        fflush(stdin);
    }
    printf("\tEmpleado con mas salario\n");
    printf("Empleado # %i: %.2f\n\n",vuelta_1+1,(P_trabajador+vuelta_1)->salario);
    getch();
    printf("\tEmpleado con menor salario\n");
    printf("Empleado # %i: %.2f\n\n",vuelta_2+1,(P_trabajador+vuelta_2)->salario);
    printf("\n\n Volver al Menu...");
    getch();
    system("cls");
    Menu_4();

}

struct Promedio
{
    float nota1;
    float nota2;
    float nota3;
    float promedio;
};


struct datosAlumno
{
    char nombre[30];
    int edad;
    char sexo[10];
    struct Promedio Students_1;
}datosAlumno[10],*Mi_Estudiante=datosAlumno;

void Cuatro_4()
{
    int i,alumnos;
    printf("Ingrese el numero de estudiantes: ");
    scanf("%i",&alumnos);
    printf("\t Registro Estudiantes\n\n");
    for(i=0;i<alumnos;i++)
    {
        fflush(stdin);
        printf("Digite Nombre: ");
        fgets((Mi_Estudiante+i)->nombre,30,stdin);
        fflush(stdin);
        printf("Digite la edad: ");
        scanf("%i",&(Mi_Estudiante+i)->edad);
        fflush(stdin);
        printf("Ingrese sexo: ");
        fgets((Mi_Estudiante+i)->sexo,10,stdin);
        fflush(stdin);
        printf("Digite Nota 1: ");
        scanf("%f",&(Mi_Estudiante+i)->Students_1.nota1);
        fflush(stdin);
        printf("Digite Nota 2: ");
        scanf("%f",&(Mi_Estudiante+i)->Students_1.nota2);
        fflush(stdin);
        printf("Digite Nota 3: ");
        scanf("%f",&(Mi_Estudiante+i)->Students_1.nota3);
        fflush(stdin);
        (Mi_Estudiante+i)->Students_1.promedio=((Mi_Estudiante+i)->Students_1.nota1 + (Mi_Estudiante+i)->Students_1.nota2 + (Mi_Estudiante+i)->Students_1.nota3)/3;
        printf("Su promedio es: %.2f\n",(Mi_Estudiante+i)->Students_1.promedio);
        printf("Informacion Almacenada....");
        getch();
        system("cls");

    }
    printf("\t Mostrar Informacion\n\n");
    for(i=0;i<alumnos;i++)
    {
        printf("\tAlumno # %i\n\n",i+1);
        printf("Nombre: %s\n",(Mi_Estudiante+i)->nombre);
        printf("Edad: %i\n",(Mi_Estudiante+i)->edad);
        printf("Sexo: %s\n",(Mi_Estudiante+i)->sexo);
        printf("Nota 1: %.2f\tNota 2: %.2f\tNota 3: %.2f\n",(Mi_Estudiante+i)->Students_1.nota1, (Mi_Estudiante+i)->Students_1.nota2, (Mi_Estudiante+i)->Students_1.nota3);
        printf("Promedio: %.2f\n",(Mi_Estudiante+i)->Students_1.promedio);
        printf("\n\nContinuar...");
        getch();
        system("cls");
    }
    delete[](Mi_Estudiante);
    printf("Volver al Menu...");
    getch();
    system("cls");
    Menu_4();

}


struct datosAlumno1
{
    char nombre[30];
    int edad;
    int grado;
    float promedio;

}datosAlumno1[100],*p_estudiante4=datosAlumno1;

void Cuatro_5()
{
    int x, mayor,n;
    printf("Digite el numero de estudiantes: ");
    scanf("%i",&n);

    printf("\t\tREGISTRO ESTUDIANTES\n\n");
    for(int i=0;i<n;i++)
        {
            printf("\tEstudiante #%i\n",i+1);
            fflush(stdin);
            printf("\nDigite Nombre: ");
            fgets((p_estudiante4+i)->nombre,30,stdin);
            fflush(stdin);
            printf("\nDigite Edad: ");
            scanf("%d",&(p_estudiante4+i)->edad);
            fflush(stdin);
            printf("\nDigite Grado: ");
            scanf("%d",&(p_estudiante4+i)->grado);
            fflush(stdin);
            printf("\nDigite Promedio: ");
            scanf("%f", &(p_estudiante4+i)->promedio);
            fflush(stdin);
            printf("Informacion Almacenada....");
            getch();
            system("cls");
    }

    mayor = (p_estudiante4+0)->promedio;
    for (int i=0; i<almn; i++){
        if ((p_estudiante4+i)->promedio > mayor)
            {
            mayor = (p_estudiante4+i)->promedio;
            x = i;
        }
    }
    printf("\n\n\t\tMEJOR PROMEDIO\n\n");
    printf("\nNombre: %s",(p_estudiante4+x)->nombre);
    printf("\nEdad: %d", (p_estudiante4+x)->edad);
    printf("\nGrado: %d",(p_estudiante4+x)->grado);
    printf("\nPromedio: %.2f\n\n",(p_estudiante4+x)->promedio);
    printf("\n\n");
    delete[](p_estudiante4);
   printf("\nVolver al Menu...");
   getch();
   system("cls");
}


struct discapacitado{
    char nombre[30];
    char discapacidad[30]="NINGUNA";
}*p_discapacidades[almn];

void Cuatro_6(){
    int nPersonas,ndiscapacidad;
    printf("INGRESE NUMERO DE PERSONAS: ");
    scanf("%d", &nPersonas);
    int i;
    for( i=0;i<nPersonas;i++){
            p_discapacidades[i]=(struct discapacitado*)malloc(sizeof(struct discapacitado));
            fflush(stdin);
            printf("Ingrese Nombre Persona [%d]: ",i+1);
            scanf("%s",&p_discapacidades[i]->nombre);
            fflush(stdin);
            printf("Tiene alguna discapacidad?: ");
            printf("1. Si\n");
            printf("0. No\n");
            scanf("%d", &ndiscapacidad);
            switch(ndiscapacidad){
            case 1: printf("Que tipo de discapacidad tiene?: ");
                fflush(stdin);
                scanf("%s",&p_discapacidades[i]->discapacidad);
                system("cls");
                printf("DATO REGISTRADO\n");
                break;
            case 0: system("cls");
                printf("DATO REGISTRADO\n");
                break;
            default: system("cls");
                printf("NO ES VALIDA, INTENTE DE NUEVO.\n");
                Cuatro_6();
        }
    }
    for(int i=0; i<nPersonas; i++){
        printf("NOMBRE: %s | DISCAPACIDAD: %s\n", (p_discapacidades[i]->nombre), (p_discapacidades[i]->discapacidad));
    }
    printf("\n\nVolver al Menu...");
    getch();
    system("cls");
    Menu_4();
}



void Menu_1()
{
    int valor;
    printf("----------------------------------------------------\n");
    printf("|                    MENU UNO                      |\n");
    printf("|--------------------------------------------------|\n");
    printf("|           1. Mostrar los elementos               |\n");
    printf("|            2. Ingrese dos valores                |\n");
    printf("|               3. Dimension 4x4                   |\n");
    printf("|              4. Volver al menu                   |\n");
    printf("----------------------------------------------------\n");
    printf("\nOpcion: ");
    scanf("%i",&valor);
    system("cls");
    switch(valor)
    {
    case 1:
        Uno_1();
        break;
    case 2:
        Uno_2();
        break;
    case 3:
        Uno_3();
        break;
    case 4:
        main();
        break;
    default:
        printf("\n\nError, vuelva a ingresar.....");
        getch();
        system("cls");
        Menu_1();
    }
}

void Menu_2()
{
    int valor;
    printf("----------------------------------------------------\n");
    printf("|                     MENU DOS                     |\n");
    printf("|--------------------------------------------------|\n");
    printf("|                 1. Matriz 3x3                    |\n");
    printf("|         2. Matriz 3x3 llenado Automatico         |\n");
    printf("|          3. Matriz 3x3 numeros primos            |\n");
    printf("|               4. Volver al Menu                  |\n");
    printf("----------------------------------------------------\n");
    printf("\nOpcion: ");
    scanf("%i",&valor);
    system("cls");
    switch(valor)
    {
    case 1:
        Dos_1();
        break;
    case 2:
        Dos_2();
        break;
    case 3:
        Dos_3();
        break;
    case 4:
        main();
        break;
    default:
        printf("\n\nError al ingresar.....");
        getch();
        system("cls");
        main();
    }
}

void Menu_3()
{
    int valor;
    printf("----------------------------------------------------\n");
    printf("|                       MENU TRES                  |\n");
    printf("|--------------------------------------------------|\n");
    printf("|             1. Numero par, impar.                |\n");
    printf("|           2. Determinar si es primo              |\n");
    printf("|             3. Array 10 numeros                  |\n");
    printf("|           4. Numero menor del vector             |\n");
    printf("|             5. Orden Ascendente                  |\n");
    printf("|              6. Buscar numero                    |\n");
    printf("|         7. Devolver el numero de vocales         |\n");
    printf("|            8. Cadena de Caracteres               |\n");
    printf("|             9. Suma de dos matrices              |\n");
    printf("|              10. Matriz Transpuesta              |\n");
    printf("|              11. Estructura Alumno               |\n");
    printf("|         12. Tiempo Empleado de un ciclista       |\n");
    printf("|                  0. Salir                        |\n");
    printf("----------------------------------------------------\n");
    printf("\nOpcion: ");
    scanf("%i",&valor);
    system("cls");
    switch(valor)
    {
    case 1:
        Tres_1();
        break;
    case 2:
        Tres_2();
        break;
    case 3:
        Tres_3();
        break;
    case 4:
        Tres_4();
        break;
    case 5:
        Tres_5();
        break;
    case 6:
        Tres_6();
        break;
    case 7:
        Tres_7();
        break;
    case 8:
        Tres_8();
        break;
    case 9:
        Tres_9();
        break;
    case 10:
        Tres_10();
        break;
    case 11:
        Tres_11();
        break;
    case 12:
        Tres_12();
        break;
    case 0:
        main();
        break;
    default:
        printf("\n\nError al ingresar.....");
        getch();
        system("cls");
        Menu_3();
    }
}

void Menu_4()
{
    int valor;
    printf("----------------------------------------------------\n");
    printf("|                     MENU CUATRO                  |\n");
    printf("|--------------------------------------------------|\n");
    printf("|             1. Estructura Competidor             |\n");
    printf("|             2. Estructura Estudiante             |\n");
    printf("|        3. Arreglo de estructura Trabajadores     |\n");
    printf("|             4. 2 Estructuras Promedio            |\n");
    printf("|                  5. N Alumnos                    |\n");
    printf("|             6. Representar una persona           |\n");
    printf("|                 0.Volver al menu                 |\n");
    printf("----------------------------------------------------\n");
    printf("\nOpcion: ");
    scanf("%i",&valor);
    system("cls");
    switch(valor)
    {
    case 0:
        main();
        break;
    case 1:
        Cuatro_1();
        break;
    case 2:
        Cuatro_2();
        break;
    case 3:
        Cuatro_3();
        break;
    case 4:
        Cuatro_4();
        break;
    case 5:
        Cuatro_5();
        break;
    case 6:
        Cuatro_6();
    default:
        printf("Error, vuelva a ingresar....");
        getch();
        system("cls");
        Menu_4();

    }
}

int main()
{
    int valor;
    printf("\n");
    printf("-----------------------------------------------------\n");
    printf("|                    MENU PRINCIPAL                 |\n");
    printf("|---------------------------------------------------|\n");
    printf("|          1. Arreglos con Punteros                 |\n");
    printf("|          2. Matrices con Punteros                 |\n");
    printf("|                3. Punteros                        |\n");
    printf("|         4. Estructuras con Punteros               |\n");
    printf("|                  0. Salir                         |\n");
    printf("-----------------------------------------------------\n");
    printf("\nOpcion: ");
    scanf("%i",&valor);
    system("cls");
    switch(valor)
    {
    case 1:
        Menu_1();
        break;
    case 2:
        Menu_2();
        break;
    case 3:
        Menu_3();
        break;
    case 4:
        Menu_4();
        break;
    case 0:
        printf("\n\n\tGracias por usarla.....");
        getch();
        break;
    default:
        printf("\n\nError, vuelva a ingresar.....");
        getch();
        system("cls");
        main();
    }
    return 0;
}

