#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

//Librerias

#include "pilas.h"
#include "colas.h"


using namespace std;

int main();

int main()
{
    int opcion;
    printf("\t-------------------------------\n");
    printf("\t|       MENU PRINCIPAL        |\n");
    printf("\t|-----------------------------|\n");
    printf("\t|         1. PILAS            |\n");
    printf("\t|         2. COLAS            |\n");
    printf("\t|         3. SALIR            |\n");
    printf("\t-------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&opcion);
    system("cls");
    switch(opcion)
    {
    case 1:
        Menu_Pilas();
        break;
    case 2:
        Menu_Colas();
        break;
    case 3:
        printf("\n\n\tHasta la Proxima!!\n\n");
        break;
    default:
        printf("\n\n\tError de sintaxis...\n\n\n");
        system("pause");
        system("cls");
        main();

    }
}


