#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <math.h>
#include <conio.h>

struct Nodo{
    int dato;
    Nodo *siguiente;
};


Nodo *frente=NULL;
Nodo *fin=NULL;
Nodo *pila=NULL;
FILE *archivo;

void Menu_Generar();
void Menu_Pilas();
void insertar_numeros(Nodo *&,int);
void mostrarelementos(Nodo *&);
void OrdenamientoBurbuja();
void Buscarelemento(Nodo *&,int );
void SalvarDatos(Nodo *&);
void Editar(Nodo *&,int);
int main();
void Estado(Nodo *&);
void Eliminar_Dato(Nodo *&,int);
void Eliminar_Pila(Nodo *&);
void Cargar(Nodo *&);

void Menu_Pilas()
{
    int op=0,n,dato;
    printf("\t*********************************\n");
    printf("\t*          MENU PILAS           *\n");
    printf("\t*********************************\n");
    printf("\t*      1. GENERAR NUMEROS       *\n");
    printf("\t*          2. IMPRIMIR          *\n");
    printf("\t*        3. ORDENAR(BURBUJA)    *\n");
    printf("\t*          4. EDITAR            *\n");
    printf("\t*           5. BUSCAR           *\n");
    printf("\t*       6. SALVAR DATOS         *\n");
    printf("\t*         7. ESTADO             *\n");
    printf("\t*       8. ELIMINAR DATOS       *\n");
    printf("\t*       9. ELIMINAR TODO        *\n");
    printf("\t*       10. CARGAR ARCHIVO      *\n");
    printf("\t*       0. VOLVER AL MENU       *\n");
    printf("\t*********************************\n");
    printf("Escoja una opcion: ");
    scanf("%i",&op);
    switch(op)
    {
    case 1:
        system("cls");
        fflush(stdin);
        Menu_Generar();
        break;
    case 2:
        system("cls");
        mostrarelementos(pila);
        break;
    case 3:
        system("cls");
        OrdenamientoBurbuja();
        break;
    case 4:
        system("cls");
        printf("Ingrese el numero que desea modificar: ");
        scanf("%i",&n);
        Editar(pila,n);
    case 5:
        system("cls");
        printf("Ingrese el elemento que desea buscar: ");
        scanf("%i",&n);
        Buscarelemento(pila,n);
        break;
    case 6:
        SalvarDatos(pila);
        break;
    case 7:
        Estado(pila);
        break;
    case 8:
        //Prueba

        /*printf("Que dato desea eliminar: ");
        scanf("%i",&dato);*/
        Eliminar_Dato(pila,dato);
        break;
    case 9:
        Eliminar_Pila(pila);
        break;
    case 10:
        Cargar(pila);
        break;
    case 0:
        system("cls");
        main();
        break;
    default:
        printf("\n\nError, vuelve al menu.....\n\n");
        system("pause");
        system("cls");
        Menu_Pilas();

    }


}

void Menu_Generar()
{
     int opcion,i,n,dato;
     printf("\t\t*************************************\n");
     printf("\t\t*          GENERAR NUMEROS          *\n");
     printf("\t\t*************************************\n");
     printf("\t\t*  1)100 NUMEROS   * 2)200 NUMEROS  *\n");
     printf("\t\t*  3)300 NUMEROS   * 4)400 NUMEROS  *\n");
     printf("\t\t*  5)500 NUMEROS   * 0)VOLVER       *\n");
     printf("\t\t*  6)PRUEBA 10 NUMEROS              *\n");
     printf("\t\t*************************************\n");
     printf("Opcion: ");
     scanf("%i",&opcion);
     system("cls");
     switch(opcion)
     {
     case 1:
        for(i=1;i<=100;i++)
        {
            n=1+rand()%((100+1)-1);
            dato=n;
            printf("->%i\n",dato);
            insertar_numeros(pila,dato);
        }
        system("pause");
        system("cls");
        Menu_Pilas();
        break;
     case 2:
        for(i=1;i<=200;i++)
        {
            n=1+rand()%((100+1)-1);
            dato=n;
            printf("->%i\n",dato);
            insertar_numeros(pila,dato);
        }
        system("pause");
        system("cls");
        Menu_Pilas();
        break;
     case 3:
        for(i=1;i<=300;i++)
        {
            n=1+rand()%((100+1)-1);
            dato=n;
            printf("->%i\n",dato);
            insertar_numeros(pila,dato);
        }
        system("pause");
        system("cls");
        Menu_Pilas();
        break;
     case 4:
         for(i=1;i<=400;i++)
        {
            n=1+rand()%((100+1)-1);
            dato=n;
            printf("->%i\n",dato);
            insertar_numeros(pila,dato);
        }
        system("pause");
        system("cls");
        Menu_Pilas();
        break;
     case 5:
        for(i=1;i<=500;i++)
        {
            n=1+rand()%((100+1)-1);
            dato=n;
            printf("->%i\n",dato);
            insertar_numeros(pila,dato);
        }
        system("pause");
        system("cls");
        Menu_Pilas();
        break;
        case 6:
        for(i=1;i<=10;i++)
        {
            n=1+rand()%((99+1)-1);
            dato=n;
            insertar_numeros(pila,dato);
        }
        system("pause");
        system("cls");
        Menu_Pilas();
        break;
     case 0:
        system("cls");
        Menu_Pilas();
     default:
         system("cls");
        printf("\n\nERROR.....\n\n");
        system("pause");
        system("cls");
        Menu_Generar();

     }

}


void insertar_numeros(Nodo *&pila,int n)
{
    Nodo *nuevo_nodo=new Nodo();
    nuevo_nodo->dato=n;
    nuevo_nodo->siguiente=pila;
    pila=nuevo_nodo;
    printf("%i ha sido guardado con exito...\n\n",nuevo_nodo->dato);
}

void mostrarelementos(Nodo *&pila)
{
    int i=0;
    Nodo *Nueva_Pila=pila;
    if(pila==NULL)
    {
        printf("\n\nLA PILA ESTA VACIA!..\n");
    }else{
         while(Nueva_Pila!=NULL)
             {
                 printf("Posicion[%i]->%i\n",i+1,Nueva_Pila->dato);
                 Nueva_Pila=Nueva_Pila->siguiente;
                 i++;
             }

    }
    system("Pause");
    system("cls");
    Menu_Pilas();

}


void OrdenamientoBurbuja()
{
    Nodo *p=pila;
    Nodo *j;

    int contador=1;
    if(p==NULL)
    {
        printf("\n\n\tLa pila esta vacia...\n\n\n");
        system("pause");
        system("cls");
        Menu_Pilas();
    }
    while(p!=NULL)
    {
        j=p->siguiente;
        while(j!=NULL)
        {
            if(p->dato > j->dato)
            {
                int aux=j->dato;
                j->dato=p->dato;
                p->dato=aux;
            }
            j=j->siguiente;
            contador++;
        }
        p=p->siguiente;
    }
    p=pila;
    while(p!=NULL)
    {
        printf("%d\t",p->dato);
        p=p->siguiente;
    }


    printf("\n\n");
    system("pause");
    system("cls");
    Menu_Pilas();

}



void Editar(Nodo *&pila,int n)
{
    Nodo *Nueva_pila=pila;
    int contador=1;
    if(Nueva_pila==NULL)
    {
        printf("\n\nLA PILA ESTA VACIA\n\n");
    }else{
        while(Nueva_pila!=NULL)
        {
            if(Nueva_pila->dato==n)
            {
                printf("Elemento %i encontrador en la posicion[%i]\n\n",n,contador);
                printf("Ingrese el elemento nuevo: ");
                scanf("%i",&Nueva_pila->dato);
                printf("\n\nEl elemento %i ha sido agregado correctamente...\n\n",Nueva_pila->dato);
            }
            Nueva_pila=Nueva_pila->siguiente;
            contador+=1;
        }
    }
    system("pause");
    system("cls");
    Menu_Pilas();


}



void Buscarelemento(Nodo *&pila,int n)
{
    int i=1;
    bool x=false;
    Nodo *Nueva_Pila=pila;
    if(pila==NULL)
    {
        printf("\n\nLA PILA ESTA VACIA!..");

    }else if(pila!=NULL){
        while(Nueva_Pila!=NULL)
        {
         if(Nueva_Pila->dato==n)
            {
                printf("El elemento se encuentra en la pila Posicion[%i]->%i\n\n",i,Nueva_Pila->dato);
                x=true;
            }
            Nueva_Pila=Nueva_Pila->siguiente;
            i++;
        };
    }if(!x)
    {
        printf("\nEl elemento no se encuentra en la pila....\n");
    }


    system("pause");
    system("cls");
    Menu_Pilas();
}



void SalvarDatos(Nodo *&pila)
{
    Nodo *nuevo_nodo=pila;
    FILE *archivo;
	archivo = fopen("texto/SalvarDatos.txt", "w");
	while(nuevo_nodo!=NULL){
		fprintf(archivo, "%d\n",nuevo_nodo->dato);
		nuevo_nodo=nuevo_nodo->siguiente;
	}
	fclose(archivo);
	printf("\n\nArchivo creado con exito...\n\n\n");
	system("pause");
	system("cls");
	Menu_Pilas();
}





void Estado(Nodo *&pila)
{
    Nodo *nuevo_nodo=pila;
    if(nuevo_nodo!=NULL)
    {
        printf("\n\nLA PILA ESTA LLENA!!\n\n");
    }else{

        printf("\n\nLA PILA ESTA VACIA\n\n");
    }
    system("pause");
    system("cls");
    Menu_Pilas();

}


void Eliminar_Dato(Nodo *&pila,int dato)
{
    if(pila==NULL)
    {
        printf("Pila esta vacia..\n");
    }else
    {
        Nodo *aux=pila;
        pila=aux->siguiente;
        printf("Borrando el dato %d\n",aux->dato);
        delete aux;
    }
    printf("\n\n");
    system("pause");
    system("cls");
    Menu_Pilas();
}

    //Prueba...

    /*int contador_pila=1;
    bool x=false;
	Nodo *Nueva_pila = pila;
	while(Nueva_pila != NULL){
		if(Nueva_pila->dato == dato){
			printf("El dato %i se encuentra en la Posicion[%i].\n",dato,contador_pila);
			printf("El dato se ha borrado correctamente.\n\n");
            Nueva_pila->dato=NULL;
            delete Nueva_pila->dato;
			x=true;
			//Nueva_pila=Nueva_pila->dato;
		}
			Nueva_pila=Nueva_pila->siguiente;
			contador_pila+=1;
	}
	if(!x)
    {
        printf("El dato no existe...\n\n");
    }
    printf("\n\n");
    system("pause");
    system("cls");
    Menu_Pilas();
    }*/


void Eliminar_Pila(Nodo *&pila)
{
    if(pila==NULL)
    {
        printf("\n\nLa pila esta vacia\n");
    }
    while(pila!=NULL)
    {
        Nodo *aux=pila;
        pila=aux->siguiente;
        printf("Borrando el dato ->%d\n",aux->dato);
        delete aux;
    }
    printf("\n\n\n");
    system("pause");
    system("cls");
    Menu_Pilas();
}



void Cargar(Nodo *&pila)
{
    int dato;
    archivo = fopen("texto/SalvarDatos.txt", "r");
    while(!feof(archivo))
    {
        fscanf(archivo,"%d\n",&dato);
        printf("dato desde archivo %d\n",dato);
    }
    printf("\n\nCargado con exito\n");
    fclose(archivo);
    system("pause");
    system("cls");
    Menu_Pilas();
}


