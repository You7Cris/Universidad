#include <iostream>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

using namespace std;

struct Nodo{
    int dato;
    Nodo *siguiente;
};


void insertarLista(Nodo *&,int );
void mostrarLista(Nodo *);
void Buscar(Nodo *,int &);
void eliminarNodo(Nodo *&,int );
void Eliminarlista(Nodo *&);

Nodo *lista=NULL;

int main()
{
    int dato,n,i,buscar,n1;
    printf("\t\t Menu\n");
    printf("\t1.Ingresar un dato\n");
    printf("\t2.Mostrar elementos\n");
    printf("\t3.Buscar           \n");
    printf("\t4.Borrar un elemento\n");
    printf("\t5.Borrar todo\n");
    printf("\t6.Salir       \n\n");
    printf("Ingrese la Opcion: ");
    scanf("%i",&n);
    switch(n)
    {
    case 1:
        fflush(stdin);
        printf("\nIngrese dato: ");
        scanf("%i",&dato);
        fflush(stdin);
        insertarLista(lista,dato);
        break;
    case 2:
        mostrarLista(lista);
        break;
    case 3:
        printf("Que numero desea buscar? = ");
        scanf("%i",&buscar);
        Buscar(lista,buscar);
        break;
    case 4:
        printf("Que numero desea eliminar?: ");
        scanf("%i",&n1);
        eliminarNodo(lista,n1);
        break;
    case 5:
        Eliminarlista(lista);
        break;
    case 6:
        system("cls");
        printf("\n\n Hasta la proxima...");
        getch();
        break;
    default:
        system("cls");
        printf("\nError al ingresar, ingrese un dato correcto....\n");
        getch();
        main();

    }
}


void insertarLista(Nodo *&lista,int n){

    Nodo *nuevo_nodo=new Nodo();
    nuevo_nodo->dato=n;
    Nodo *aux1=lista;
    Nodo *aux2;
    while((aux1!=NULL)&&(aux1->dato<n)){
        aux2=aux1;
        aux1=aux1->siguiente;
    }
    if(lista==aux1){
        lista=nuevo_nodo;
    }else{
        aux2->siguiente=nuevo_nodo;
    }
    nuevo_nodo->siguiente=aux1;
    printf("El dato %d ha sido insertado con exito\n\n",n);
    system("pause");
    system("cls");
    main();
}

void mostrarLista(Nodo *lista){
     Nodo *actual = new Nodo();
     actual = lista;
     if(actual==NULL)
     {
         printf("No hay elementos en la lista\n");
     }
     while(actual != NULL){
     printf("->%d\n",actual->dato);
     actual=actual->siguiente;
     }
     system("pause");
     system("cls");
     main();
}

void Buscar(Nodo *lista,int &buscar){
    Nodo *actual= new Nodo();
    actual=lista;
    int contador=1;
    bool x=false;
    while(actual!=NULL)
    {
        if(actual->dato==buscar)
        {
            printf("El elemento %i esta en la lista posicion=[%i]\n",buscar,contador);
            x= true;
        }
        actual=actual->siguiente;
        contador++;
    }
    if(!x)
    {
        printf("El dato %i no existe\n",buscar);
    }
    system("pause");
    system("cls");
    main();

}

void eliminarNodo(Nodo *&lista,int n)
{
    Nodo *actual = new Nodo();
     actual = lista;
     while(actual != NULL){
     printf("->%d\n",actual->dato);
     actual=actual->siguiente;
     }
    if(lista != NULL){
		Nodo *aux_borrar;
		Nodo *anterior=NULL;
		aux_borrar = lista;
		while((aux_borrar != NULL) && (aux_borrar->dato!=n)){
			anterior=aux_borrar;
			aux_borrar=aux_borrar->siguiente;
		}
		if(aux_borrar==NULL){
			printf("El elemento no existe.\n");
		}else if(anterior==NULL){
			lista=lista->siguiente;
			printf("El elemento %i , ya ha sido eliminado.",n);
			delete aux_borrar;
		}else{
			anterior->siguiente=aux_borrar->siguiente;
			printf("El elemento %i ha sido eliminado.\n",n);
			delete aux_borrar;
		}
	}
    system("pause");
    system("cls");
    main();
}

void Eliminarlista(Nodo *&lista)
{
    int n;
    while(lista!=NULL)
    {
        Nodo *aux=lista;
        n= aux->dato;
        lista=aux->siguiente;
        printf("El elemento %d ha sido eliminado\n",n);
        delete aux;
    }
    getch();
    system("cls");
    main();
}

