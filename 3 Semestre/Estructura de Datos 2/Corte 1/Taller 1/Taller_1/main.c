#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <conio.h>


void  uno_uno()
{
    int n=0,i=0;
    while(i<=100)
    {
        n=n+i;
        i++;
    }
    printf("El total es: %i",n);
    printf("\n\n Presione una tecla para volver al menu..");
    getch();
    system("cls");
    Menu_Punto1();
}

void uno_dos()
{
        int n=0,i=0;
    while(i<=50)
    {
        if(i%2==0)
        {
            n=n+i;
            i++;
        }else
        {
       	 i++;
        }
    }
    printf("El total es: %i",n);
    printf("\n\n Presione una tecla para volver al menu...");
    getch();
    system("cls");
    Menu_Punto1();

}

void uno_tres()
{
    int n=0,i=0;
    while(i<=50)
    {
        if(i%2==0)
        {
            i++;
        }else
        {
            n=n+i;
            i++;
        }
    }
    printf("El total es: %i",n);
    printf("\n\n Presione una tecla para volver al menu....");
    getch();
    system("cls");
    Menu_Punto1();
}

void dos_uno()
{
    int i,num,a=0;
    printf("\t Tabla de Multiplicar\n");
    printf("Ingrese el numero\n");
    printf("Numero: ");
    scanf("%i",&num);
    if(num>20)
    {
        printf("Error\n");
    }
    else{
    system("cls");
    printf("\t TABLA\n");
    for(i=0;i<10;i++)
    {
        a=num*(i+1);
        printf("%i * %i = %i\n",num,i+1,a);
    }
    }
    printf("\n\n Presione una tecla para volver....");
    getch();
    system("cls");
    Menu_Punto2();
}

void dos_dos()
{
    int num,factorial=1,i;
    printf("Ingrese el numero\n");
    printf("Numero: ");
    scanf("%i",&num);
    for(i=1;i<num;i++)
    {
        factorial= factorial* (i+1);
    }
    printf("El factorial del %i es: %i\n",num,factorial);
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto2();

}

void dos_tres()
{
    int a,b,c,cont;
    a=0;
    b=1;
    printf("0\n1\n",c);
    for (cont=1;cont<=20;cont=cont+1)
    {
      c=a+b;
      printf("%d\n",c);
      a=b;
      b=c;
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto2();
}

void tres_uno()
{
    float array[4]={32.583, 11.239, 45.781, 22.237};
    int i;
    for(i=0;i<4;i++)
    {
        printf("%.2f\n",array[i]);
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto3();
}

void tres_dos()
{
    int vector[2],i,resultado1=1,n;
    printf("\t Ingrese 2 valores\n");
    for(i=0;i<2;i++)
    {
        printf("Numero %i: ",i+1);
        scanf("%i",&vector[i]);
        resultado1=vector[i]*resultado1;
    }
    int vector1[resultado1];
    printf("\n\t Rellenar\n");
    for(i=0;i<resultado1;i++)
    {
        n= 1 + rand()% ((1+1)-1);
        vector1[i]=n;
        printf("%i\t",vector1[i]);
    }

    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto3();
}

void tres_tres()
{
    int array[4];
    int i;
    int segunda[4],tercera[4],cuarta[4];
    for(i=0;i<4;i++)
    {
        printf("Ingrese %i numero: ",i+1);
        scanf("%i",&array[i]);
        segunda[i]=pow(array[i],2);
        tercera[i]=pow(array[i],3);
        cuarta[i]=pow(array[i],4);
    }
    system("cls");
    for(i=0;i<4;i++)
    {
        printf("%i     %i        %i         %i   \n",array[i],segunda[i],tercera[i],cuarta[i]);
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto3();

}

void cuatro_uno()
{
    int mes;
    system("color f3");
    SYSTEMTIME str_t;
    GetSystemTime(&str_t);
    mes= str_t.wMonth;
    switch(mes)
    {
        case 1:
            printf("\t Este mes es: Enero");
        break;

        case 2:
            printf("\t Este mes es: Febrero");
        break;

        case 3:
            printf("\t Este mes es: Marzo");
        break;

        case 4:
            printf("\t Este mes es: Abril");
        break;

        case 5:
            printf("\t Este mes es: Mayo");
        break;

        case 6:
            printf("\t Este mes es: Junio");
        break;

        case 7:
            printf("\t Este mes es: Julio");
        break;

        case 8:
            printf("\t Este mes es: Agosto");
        break;

        case 9:
            printf("\t Este mes es: Septiembre");
        break;

        case 10:
            printf("\t Este mes es: Octubre");
        break;

        case 11:
            printf("\t Este mes es: Noviembre");
        break;

        case 12:
            printf("\t Este mes es: Diciembre");
        break;
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto4();
}

void cuatro_dos()
{
    int vocal;
    printf("Ingrese la vocal para saber su Codigo ASCII\n");
    printf("1. A\n");
    printf("2. a\n");
    printf("3. E\n");
    printf("4. e\n");
    printf("5. I\n");
    printf("6. i\n");
    printf("7. O\n");
    printf("8. o\n");
    printf("9. U\n");
    printf("10. u\n");
    printf("Vocal: ");
    scanf("%i",&vocal);
    switch(vocal)
    {
    case 1:
        printf("ALT + 65");
        break;
    case 2:
        printf("ALT + 97");
        break;
    case 3:
        printf("ALT + 69");
        break;
    case 4:
        printf("ALT + 101");
        break;
    case 5:
        printf("ALT + 73");
        break;
    case 6:
        printf("ALT + 105");
        break;
    case 7:
        printf("ALT + 79");
        break;
    case 8:
        printf("ALT + 111");
        break;
    case 9:
        printf("ALT + 85");
        break;
    case 10:
        printf("ALT + 117");
        break;
    default:
        printf("ERROR\n");

    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto4();
}

void cuatro_tres()
{
    int numero;
    printf("Ingrese un numero del 0-9 para ver su codigo ASCII\n");
    printf("Numero: ");
    scanf("%i",&numero);
    switch(numero)
    {
    case 0:
        printf("ALT + 48");
        break;
    case 1:
        printf("ALT + 49");
        break;
    case 2:
        printf("ALT + 50");
        break;
    case 3:
        printf("ALT + 51");
        break;
    case 4:
        printf("ALT + 52");
        break;
    case 5:
        printf("ALT + 53");
        break;
    case 6:
        printf("ALT + 54");
        break;
    case 7:
        printf("ALT + 55");
        break;
    case 8:
        printf("ALT + 56");
        break;
    case 9:
        printf("ALT + 57");
        break;
    default:
        printf("Error\n");
        getch();
        system("cls");
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto4();
}

void cinco_uno()
{
    int matriz[3][3];
    int resultado;
    int i,j;
    printf("Ingrese los valores\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%i",&matriz[i][j]);
        }
    }
    system("cls");
    printf("\n");
    printf("\t Matriz\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%i\t",matriz[i][j]);
        }
        printf("\n");
    }
    printf("\n");
    printf("Matriz Sumatoria\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            resultado=(matriz[i][j])+(matriz[i][j]);
            printf("%i\t",resultado);
        }
        printf("\n");
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto5();

}

void cinco_dos()
{
    int matriz[3][3];
    int resultado;
    int i,j;
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            matriz[i][j]= 1 + rand()%((99+1)-1);
        }
    }
    printf("\t Matriz\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%i\t",matriz[i][j]);
        }
        printf("\n");
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto5();
}

void cinco_tres()
{
    int n,i=3,j,cuenta,c,vec[9],matriz[3][3],ciclo=0;
    for ( cuenta = 2 ; cuenta <= 10 ;  )
    {
        for ( c = 2 ; c <= i - 1 ; c++ )
        {
            if ( i%c == 0 )
                break;
        }
        if ( c==i & ciclo<9)
        {
            vec[ciclo]=i;
            ciclo++;
            cuenta++;
        }
        i++;
    }  ciclo=0;

    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            matriz[i][j]=vec[ciclo];
            ciclo++;
        }
    }

    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            printf("- %i",matriz[i][j]);
        }
        printf("\n")    ;
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto5();

}

struct estudiantes
  {
    char nombre[20];
    float nota1;
    float nota2;
    float nota3;
   }Students[3];

void seis_uno()
{
    int i;
    float promedio[3];
    int Orden[3];
    printf("Ingrese el nombre del Estudiante y Sus 3 notas\n");
    for(i=0;i<3;i++)
    {
        fflush(stdin);
        printf("Nombre estudiante %i : ",i+1);
        gets(Students[i].nombre);
        fflush(stdin);
        printf("Ingrese las 3 notas: \n");
        printf("Nota 1: ");
        scanf("%f",&Students[i].nota1);
        fflush(stdin);
        printf("Nota 2: ");
        scanf("%f",&Students[i].nota2);
        fflush(stdin);
        printf("Nota 3: ");
        scanf("%f",&Students[i].nota3);
        fflush(stdin);
        promedio[i]= (Students[i].nota1+Students[i].nota2+Students[i].nota3)/3;
        fflush(stdin);
    }
    printf("\n Informacion Almacenada....\n");
    printf("\n");
    getch();
    system("cls");
    printf("Mostrar Informacion\n");
    for(i=0;i<3;i++)
    {
          printf("Alumno : %s\n",Students[i].nombre);
          printf("Nota 1 : %.2f\n",Students[i].nota1);
          printf("Nota 2 : %.2f\n",Students[i].nota2);
          printf("Nota 3 : %.2f\n",Students[i].nota3);
          printf("Promedio : %.2f\n",promedio[i]);
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto6();

}

struct Competidor
{
    char Nombre[20];
    int edad;
    char Sexo[10];
    char Club[20];
    char Categoria[20];
}Atleta[10];


void seis_dos()
{
    int n,i;
    printf("Ingrese el numero de competidores\n");
    printf("Competidores: ");
    scanf("%i",&n);
    printf("\n\n");
    printf("\tIngrese los datos del competidor\n");
    printf("1.Nombre\n");
    printf("2.Edad\n");
    printf("3.Sexo\n");
    printf("M= Masculino  F=Femenino\n");
    printf("4.Club\n");
    printf("\n\nPresione una tecla para ingresar los datos...\n");
    getch();
    system("cls");
    for(i=0;i<n;i++)
    {
        fflush(stdin);
        printf("\tCOMPETIDOR %i\n",i+1);
        printf("Nombre: ");
        gets(Atleta[i].Nombre);
        fflush(stdin);
        printf("Edad: ");
        scanf("%i",&Atleta[i].edad);
        fflush(stdin);
        printf("Sexo: ");
        gets(Atleta[i].Sexo);
        fflush(stdin);
        printf("Club: ");
        gets(Atleta[i].Club);
        fflush(stdin);
        if(Atleta[i].edad<=15)
        {
            strcpy(Atleta[i].Categoria,("Infantil\n"));
        }else if(Atleta[i].edad<=30)
        {
            strcpy(Atleta[i].Categoria,("Joven\n"));
        }else
        {
            strcpy(Atleta[i].Categoria,("Mayor\n"));
        }
        fflush(stdin);
        printf("\n");
        printf("Informacion Almacenada\n");
        getch();
        system("cls");
    }
    printf("\tMostrar Valores\n");
    printf("\n\n");
    for(i=0;i<n;i++)
    {
        printf("\t COMPETIDOR %i\n\n",i+1);
        printf("NOMBRE: %s\n",Atleta[i].Nombre);
        printf("EDAD: %i\n",Atleta[i].edad);
        printf("SEXO: %s\n",Atleta[i].Sexo);
        printf("CLUB: %s\n",Atleta[i].Club);
        printf("CATEGORIA: %s\n",Atleta[i].Categoria);
        printf("\n");
        printf("Siguiente...");
        getch();
        system("cls");
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto6();
}

struct promedio
{
    float nota1;
    float nota2;
    float nota3;
    float resultado;
};

struct Alumno
{
    char nombre[20];
    char Sexo[10];
    int edad;
    struct promedio estudiante;
}Estudents[5];


void seis_tres()
{
    struct promedio estudiante;
    int i,n;
    printf("Cuantos Alumnos desea Ingresar?\n");
    printf("Alumnos: ");
    scanf("%i",&n);
    for(i=0;i<n;i++)
    {
        fflush(stdin);
        printf("\tIngrese los datos del estudiante\n");
        printf("Nombre: ");
        gets(Estudents[i].nombre);
        fflush(stdin);
        printf("Sexo: ");
        gets(Estudents[i].Sexo);
        fflush(stdin);
        printf("Edad: ");
        scanf("%i",&Estudents[i].edad);
        fflush(stdin);
        printf("Ingrese las 3 Notas\n");
        printf("Nota 1: ");
        scanf("%f",&Estudents[i].estudiante.nota1);
        fflush(stdin);
        printf("Nota 2: ");
        scanf("%f",&Estudents[i].estudiante.nota2);
        fflush(stdin);
        printf("Nota 3: ");
        scanf("%f",&Estudents[i].estudiante.nota3);
        fflush(stdin);
        Estudents[i].estudiante.resultado=(Estudents[i].estudiante.nota1+Estudents[i].estudiante.nota2+Estudents[i].estudiante.nota3)/3;
        fflush(stdin);
        printf("Informacion Guardada....\n");
        getch();
        system("cls");
    }
    printf("\t Mostrar Informacion\n");
    for(i=0;i<n;i++)
    {
        printf("Estudiante %i\n",i+1);
        printf("Nombre: %s\n",Estudents[i].nombre);
        printf("Edad: %i\n",Estudents[i].edad);
        printf("\t Notas\n");
        printf("Nota 1: %.2f \n",Estudents[i].estudiante.nota1);
        printf("Nota 2: %.2f \n",Estudents[i].estudiante.nota2);
        printf("Nota 3: %.2f \n",Estudents[i].estudiante.nota3);
        printf("Promedio: %.2f\n\n",Estudents[i].estudiante.resultado);
        printf("Presione para continuar...\n");
        getch();
        system("cls");
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto6();
}


struct promedio_1
{
    float nota1;
    float nota2;
    float nota3;
    float resultado;
};

struct Alumno_1
{
    char nombre[20];
    char Sexo[10];
    int edad;
    struct promedio estudiante;
}Alumnos[5];

void seis_cuatro()
{
    struct promedio estudiante;
    int i,n,merito=0,vuelta,vueltaBajo,masBajo;
    printf("Cuantos Alumnos desea Ingresar?\n");
    printf("Alumnos: ");
    scanf("%i",&n);
    for(i=0;i<n;i++)
    {
        fflush(stdin);
        printf("\tIngrese los datos del estudiante\n");
        printf("Nombre: ");
        gets(Alumnos[i].nombre);
        fflush(stdin);
        printf("Sexo: ");
        gets(Alumnos[i].Sexo);
        fflush(stdin);
        printf("Edad: ");
        scanf("%i",&Alumnos[i].edad);
        fflush(stdin);
        printf("Ingrese las 3 Notas\n");
        printf("Nota 1: ");
        scanf("%f",&Alumnos[i].estudiante.nota1);
        fflush(stdin);
        printf("Nota 2: ");
        scanf("%f",&Alumnos[i].estudiante.nota2);
        fflush(stdin);
        printf("Nota 3: ");
        scanf("%f",&Alumnos[i].estudiante.nota3);
        fflush(stdin);
        Alumnos[i].estudiante.resultado=(Alumnos[i].estudiante.nota1+Alumnos[i].estudiante.nota2+Alumnos[i].estudiante.nota3)/3;
        if(Alumnos[i].estudiante.resultado>merito)
        {
            merito=Alumnos[i].estudiante.resultado;
            vuelta=i;
        }
        if(Alumnos[i].estudiante.resultado<merito)
        {
            masBajo=Alumnos[i].estudiante.resultado;
            vueltaBajo=i;
        }
        fflush(stdin);
        printf("Informacion Guardada....\n");
        getch();
        system("cls");
    }
    printf("\t Mostrar Informacion\n");
    for(i=vuelta;i<=vuelta;i++)
    {
        printf("\t Datos personales\n");
        printf("\nNombre: %s \n",Alumnos[vuelta].nombre);
        printf("Sexo: %s \n",Alumnos[vuelta].Sexo);
        printf("Edad: %i \n",Alumnos[vuelta].edad);
        printf("Promedio: %.2f\n",Alumnos[vuelta].estudiante.resultado);
        printf("\n\n .....\n");
    }
    printf("\n\n Presione una tecla para volver al menu....\n");
    getch();
    system("cls");
    Menu_Punto6();

}

void Menu_Punto1()
{
    int valor_1;
    printf("\t ---------------------------------------------------\n");
    printf("\t |                  PUNTO 1                        |\n");
    printf("\t |-------------------------------------------------|\n");
    printf("\t |  1. Sumar los numeros del 1 al 100              |\n");
    printf("\t |  2. Sumar los numeros pares del 1 al 50         |\n");
    printf("\t |  3. Sumar los numeros impares del 1 al 50       |\n");
    printf("\t |  4. Volver al menu                              |\n");
    printf("\t ---------------------------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&valor_1);
    system("cls");
    switch(valor_1)
    {
    case 1:
        uno_uno();
        break;
    case 2:
        uno_dos();
        break;
    case 3:
        uno_tres();
        break;
    case 4:
        main();
        break;
    default:
        printf("Error, vuelva a ingresar....\n");
        getch();
        system("cls");
        Menu_Punto1();
    }

}

void Menu_Punto2()
{
    int valor_1;
    printf("\t -----------------------------------------------\n");
    printf("\t |                   PUNTO 2                   |\n");
    printf("\t |---------------------------------------------|\n");
    printf("\t |  1. Imprimir tabla de multiplicar           |\n");
    printf("\t |  2. Factorial de un numero                  |\n");
    printf("\t |  3. Numero de Fibonacci                     |\n");
    printf("\t |  4. Volver al menu                          |\n");
    printf("\t -----------------------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&valor_1);
    system("cls");
    switch(valor_1)
    {
    case 1:
        dos_uno();
        break;
    case 2:
        dos_dos();
        break;
    case 3:
        dos_tres();
        break;
    case 4:
        main();
        break;
    default:
        printf("Error, vuelve a ingresar....\n\n");
        getch();
        system("cls");
        Menu_Punto2();

    }

}

void Menu_Punto3()
{
    int valor_1;
    printf("\t -----------------------------------------------\n");
    printf("\t |                  PUNTO 3                    |\n");
    printf("\t |---------------------------------------------|\n");
    printf("\t |   1. Mostrar Elementos                      |\n");
    printf("\t |   2. Ceros y Unos                           |\n");
    printf("\t |   3. Dimension 4x4                          |\n");
    printf("\t |   4. Volver al menu                         |\n");
    printf("\t -----------------------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&valor_1);
    system("cls");
    switch(valor_1)
    {
    case 1:
        tres_uno();
        break;
    case 2:
        tres_dos();
        break;
    case 3:
        tres_tres();
        break;
    case 4:
        main();
        break;
    default:
        printf("Error, vuelva a ingresar......");
        getch();
        system("cls");
        Menu_Punto3();
    }
}

void Menu_Punto4()
{
    int valor_1;
    printf("\t ----------------------------------------\n");
    printf("\t |             PUNTO 4                  |\n");
    printf("\t |--------------------------------------|\n");
    printf("\t |   1. Consultar mes                   |\n");
    printf("\t |   2. Codigo ASCII de una vocal       |\n");
    printf("\t |   3. Codigo ASCII de un numero       |\n");
    printf("\t |   4. Volver al menu                  |\n");
    printf("\t ----------------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&valor_1);
    system("cls");
    switch(valor_1)
    {
    case 1:
        cuatro_uno();
        break;
    case 2:
        cuatro_dos();
        break;
    case 3:
        cuatro_tres();
        break;
    case 4:
        main();
        break;
    default:
        printf("Error, vuelva a ingresar....");
        getch();
        system("cls");
        Menu_Punto4();
    }

}

void Menu_Punto5()
{
    int valor_1;
    printf("\t ----------------------------------------------\n");
    printf("\t |                    PUNTO 5                 |\n");
    printf("\t |--------------------------------------------|\n");
    printf("\t |        1. Suma Matriz                      |\n");
    printf("\t |        2. Llenado automatico               |\n");
    printf("\t |      3. Llenado con numeros primos         |\n");
    printf("\t |         4. Volver al menu                  |\n");
    printf("\t ----------------------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&valor_1);
    system("cls");
    switch(valor_1)
    {
    case 1:
        cinco_uno();
        break;
    case 2:
        cinco_dos();
        break;
    case 3:
        cinco_tres();
    case 4:
        main();
        break;
    default:
        printf("Error, vuelva a ingresar ....");
        getch();
        system("cls");
        Menu_Punto5();
    }

}

void Menu_Punto6()
{
    int valor_1;
    printf("\t -----------------------------------------------\n");
    printf("\t |                    PUNTO 6                  |\n");
    printf("\t |---------------------------------------------|\n");
    printf("\t |           1. Alumnos y su promedio          |\n");
    printf("\t |           2. Competidor                     |\n");
    printf("\t |           3. Estructuras Anidadas           |\n");
    printf("\t |           4. 2 Estructuras                  |\n");
    printf("\t |           5. Volver al menu                 |\n");
    printf("\t -----------------------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&valor_1);
    system("cls");
    switch(valor_1)
    {
    case 1:
        seis_uno();
        break;
    case 2:
        seis_dos();
        break;
    case 3:
        seis_tres();
        break;
    case 4:
        seis_cuatro();
        break;
    case 5:
        main();
        break;
    default:
        printf("Error, volver a ingresar.....");
        getch();
        system("cls");
        Menu_Punto6();
    }
}

int main()
{
    int valor;
    printf("\t -----------------------------------------------\n");
    printf("\t |                   TABLA                     |\n");
    printf("\t |---------------------------------------------|\n");
    printf("\t |  1. Ciclo While     |    2. Ciclo For       |\n");
    printf("\t |  3. Array           |    4. Switch          |\n");
    printf("\t |  5. Matrices        |    6. Estructuras     |\n");
    printf("\t |                     |    0. Salir           |\n");
    printf("\t -----------------------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&valor);
    system("cls");
    switch(valor)
    {
        case 0:
            printf("Gracias por usarla\n");
            getch();
            break;
        case 1:
            Menu_Punto1();
            break;
        case 2:
            Menu_Punto2();
            break;
        case 3:
            Menu_Punto3();
            break;
        case 4:
            Menu_Punto4();
            break;
        case 5:
            Menu_Punto5();
            break;
        case 6:
            Menu_Punto6();
            break;
        default:
            printf("Error, vuelva a ingresar\n");
    }

}
