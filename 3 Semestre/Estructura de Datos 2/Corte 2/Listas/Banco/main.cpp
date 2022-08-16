#include <iostream>
#include <math.h>
#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

using namespace std;

struct cliente{
    char cliente[50];
    int cedula;
    int tipotransaccion;
    int edad;
    bool estado;
};


struct Nodo{
    cliente client;
    Nodo *siguiente;
};


void insertarLista(Nodo *&,char[],int,int,int,bool);
void mostrarLista(Nodo *);
void cedulasregistradas(Nodo *);
void tiempototal(Nodo *&);
void Buscar(Nodo *,int &);
void eliminarNodo(Nodo *&,int );
void Eliminarlista(Nodo *&);

Nodo *lista=NULL;

int main()
{
    int dato,opcion,n,n1;
    int cara=1;
    char cara1=cara;
    char nombre[50];
    int cedula,tipotransaccion,edad,estadoprioridad;
    bool estado;
    printf("\t\t Banco Trivago\n");
    printf("\t1.Ingresar datos\n");
    printf("\t2.Mostrar elementos ingresados\n");
    printf("\t3.Buscar un cliente \n");
    printf("\t4.Tiempo total \n");
    printf("\t5.Borrar un cliente\n");
    printf("\t6.Borrar todos los clientes\n");
    printf("\t7.Salir del programa      \n\n");
    printf("Ingrese la Opcion: ");
    scanf("%i",&n);
    system("cls");
    switch(n)
    {
    case 1:
        printf("\tMenu Ingresar\n\n1.Ingrese nombre\n2.Ingrese Cedula\n3.Ingrese Tipo de transaccion\n 1.)Retiro\n 2.)Deposito\n 3.)Consulta\n 4.)Actualizacion\n 5)Pagos\n4. Edad\n5.Estado de prioridad\n 1.Si\n 2.No\n\n");
        fflush(stdin);
        printf("Nombre-> ");
        cin>>nombre;
        fflush(stdin);
        printf("Cedula-> ");
        scanf("%i",&cedula);
        fflush(stdin);
        printf("Tipo de Transaccion-> ");
        scanf("%i",&tipotransaccion);
        if(tipotransaccion<=0 || tipotransaccion>5)
       {
           printf("Error, el dato no coincide...");
           printf("\nVuelva a elegir una opcion");
           getch();
           system("cls");
           main();
       }
       fflush(stdin);
       printf("Edad-> ");
       scanf("%i",&edad);
       fflush(stdin);
       printf("Estado de Prioridad-> ");
       scanf("%i",&estadoprioridad);
       if(estadoprioridad<=0 || estadoprioridad>2)
       {
           printf("\n\nError, vuelva a ingresar los datos de mantera correcta...");
           getch();
           system("cls");
           main();
       }else if(estadoprioridad==1 || edad>=60)
       {
           estado=true;
       }else {
            estado=false;
       }
       fflush(stdin);
       insertarLista(lista,nombre,cedula,tipotransaccion,edad,estado);
        break;
    case 2:
        mostrarLista(lista);
        break;
    case 3:
        printf("Que cliente desea Buscar?\n ");
        cedulasregistradas(lista);
        printf("Ingrese la cedula del cliente que desea buscar: ");
        scanf("%i",&opcion);
        Buscar(lista,opcion);

        break;
    case 4:
        tiempototal(lista);
        break;
    case 5:
        printf("Que Cliente desea eliminar?\n");
        cedulasregistradas(lista);
        printf("Ingrese la cedula que desea eliminar: ");
        scanf("%i",&n1);
        eliminarNodo(lista,n1);
        break;
    case 6:
        Eliminarlista(lista);
        break;
    case 7:
        system("cls");
        printf("\n\n Hasta la proxima...");
        getch();
        system("cls");
        break;
    default:
        system("cls");
        printf("\nError al ingresar, ingrese un dato correcto....\n");
        getch();
        main();

    }
}

void cedulasregistradas(Nodo *lista)
{
    Nodo *actual = new Nodo();
    actual = lista;
    if(actual==NULL)
    {
        printf("\nNo hay elementos en la lista\n\n");
    }
    while(actual != NULL){
    cout<<"\nCedula-> "<<actual->client.cedula<<"\n"<<endl;
    actual=actual->siguiente;
    }

}


void insertarLista(Nodo *&lista,char nombre[50] ,int cedula, int tipotransaccion, int edad, bool estado){

    Nodo *nuevo_nodo=new Nodo();
    strcpy(nuevo_nodo->client.cliente,nombre);
    nuevo_nodo->client.cedula=cedula;
    nuevo_nodo->client.tipotransaccion=tipotransaccion;
    nuevo_nodo->client.edad=edad;
    nuevo_nodo->client.estado=estado;

    Nodo *aux1=lista;
    Nodo *aux2;
    while((aux1!=NULL)&&(aux1->client.estado==true)){
        aux2=aux1;
        aux1=aux1->siguiente;
    }
    if(lista==aux1){
        lista=nuevo_nodo;
    }else{
        aux2->siguiente=nuevo_nodo;
    }
    nuevo_nodo->siguiente=aux1;
    system("cls");
    printf("Informacion guardada con exito: \n");
    cout<<"\nNombre-> "<<nuevo_nodo->client.cliente<<"\nCedula-> "<<nuevo_nodo->client.cedula<<"\nEdad-> "<<nuevo_nodo->client.edad<<"\nEstado prioritario: "<<nuevo_nodo->client.estado<<"\nTipo transaccion-> "<<nuevo_nodo->client.tipotransaccion<<"\n\n"<<endl;
    system("pause");
    system("cls");
    main();
}

void mostrarLista(Nodo *lista){
     Nodo *actual = new Nodo();
     actual = lista;
     if(actual==NULL)
     {
         printf("\nNo hay elementos en la lista\n\n");
     }
     while(actual != NULL){
     cout<<"\nNombre-> "<<actual->client.cliente<<"\nCedula-> "<<actual->client.cedula<<"\nEdad-> "<<actual->client.edad<<"\nEstado prioritario: "<<actual->client.estado<<"\nTipo transaccion-> "<<actual->client.tipotransaccion<<"\n\n"<<endl;
     actual=actual->siguiente;
     }
     system("pause");
     system("cls");
     main();
}

void Buscar(Nodo *lista,int &opcion){
    Nodo *actual= new Nodo();
    actual=lista;
    int contador=1;
    bool x=false;
    while(actual!=NULL)
    {
        if(actual->client.cedula==opcion)
        {
            printf("\nEl cliente->%s con la cedula->%i esta en la lista posicion=[%i]\n\n",actual->client.cliente,opcion,contador);
            x= true;
        }
        actual=actual->siguiente;
        contador++;
    }
    if(!x)
    {
        printf("\nEl dato %i no existe\n\n",opcion);
    }
    system("pause");
    system("cls");
    main();

}


void tiempototal(Nodo *&lista)
{
    Nodo *nuevo_nodo=lista;
    float retiro=0,deposito=0,consulta=0,actualizacion=0,pagos=0,ttotal=0;
    if(lista==NULL)
    {
        printf("\n\nLa lista esta vacia\n");
    }else if(nuevo_nodo!=NULL)
    {
        while(nuevo_nodo!=NULL)
        {
            if(nuevo_nodo->client.tipotransaccion==1){
                retiro+=4;
            };
            if(nuevo_nodo->client.tipotransaccion==2){
                deposito+=2;
            };
            if(nuevo_nodo->client.tipotransaccion==3){
                consulta+=3.4;
            };
            if(nuevo_nodo->client.tipotransaccion==4){
                actualizacion+=5;
            };
            if(nuevo_nodo->client.tipotransaccion==5){
                pagos+=2;
            };
            nuevo_nodo=nuevo_nodo->siguiente;
        }
    }
    ttotal=retiro+deposito+consulta+actualizacion+pagos;
    printf("\nEl tiempo total en la lista es de = %.1f minutos\n\n",ttotal);
    system("pause");
    system("cls");
    main();
}

void eliminarNodo(Nodo *&lista,int n1)
{
     Nodo *actual = new Nodo();
     actual = lista;
     while(actual != NULL){
         printf("Nombre-> %s\n",actual->client.cliente);
         printf("Cedula ->%d\n",actual->client.cedula);
         actual=actual->siguiente;
     }
    if(lista != NULL){
		Nodo *aux_borrar;
		Nodo *anterior=NULL;
		aux_borrar = lista;
		while((aux_borrar != NULL) && (aux_borrar->client.cedula!=n1)){
			anterior=aux_borrar;
			aux_borrar=aux_borrar->siguiente;
		}
		if(aux_borrar==NULL){
			printf("El elemento no existe.\n");
		}else if(anterior==NULL){
			lista=lista->siguiente;
			printf("El cliente con Cedula->%i , ya ha sido eliminado.\n",n1);
			delete aux_borrar;
		}else{
			anterior->siguiente=aux_borrar->siguiente;
			printf("El cliente con Cedula->%i ha sido eliminado.\n",n1);
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
        n= aux->client.cedula;
        lista=aux->siguiente;
        printf("Nombre-> %s\n",aux->client.cliente);
        printf("Cedula-> %d\n",aux->client.cedula);
        printf("El cliente con la cedula->%d ha sido eliminado\n\n",n);
        delete aux;
    }
    getch();
    system("cls");
    main();
}


