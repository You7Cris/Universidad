#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <math.h>
#include <conio.h>


int main();
void Menu_Colas();
void Generar_NumeroColas();
void Insertar_Colas(Nodo *&,Nodo *&,int);
bool colaVacia(Nodo *&);
void Imprimir_Colas(Nodo *&,Nodo *&);
void Eliminar_Cola(Nodo *&,Nodo *&,int &);
void Ordenamiento_Colas(Nodo *&,Nodo *&);
void Eliminar_ElementoCola(Nodo *&,Nodo *&,int );
void Estado_Colas(Nodo *&,Nodo *&);
void Editar_Colas(Nodo *&,Nodo *&,int );
void Buscar_Colas(Nodo *&,Nodo *&,int);
void Salvar_Colas(Nodo *&,Nodo *&);
void Cargar_DatosColas(Nodo *&,Nodo *&);




void Menu_Colas()
{
    int op=0,dato,n;
    printf("\t*********************************\n");
    printf("\t*          MENU COLAS           *\n");
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
        Generar_NumeroColas();
        break;
    case 2:
        system("cls");
        Imprimir_Colas(frente,fin);
        break;
    case 3:
        system("cls");
        Ordenamiento_Colas(frente,fin);
        break;
    case 4:
        system("cls");
        printf("Ingrese el dato que desea reemplazar: ");
        scanf("%i",&n);
        Editar_Colas(frente,fin,n);
        break;
    case 5:
        system("cls");
        printf("Ingrese el elemento que desea buscar: ");
        scanf("%i",&n);
        Buscar_Colas(frente,fin,n);
        break;
    case 6:
        system("cls");
        Salvar_Colas(frente,fin);
        break;
    case 7:
        Estado_Colas(frente,fin);
        break;
    case 8:
        //Prueba

       /* printf("Ingrese el elemento que desea eliminar: ");
        scanf("%i",&dato);*/
        Eliminar_ElementoCola(frente,fin,dato);

        break;
    case 9:
        Eliminar_Cola(frente,fin,dato);
        break;
    case 10:
        Cargar_DatosColas(frente,fin);
        break;
    case 0:
        system("cls");
        main();
    }
}

void Generar_NumeroColas()
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
     case 0:
        system("cls");
        Menu_Colas();
     case 1:
        for(i=1;i<=100;i++)
        {
            n=1+rand()%((99+1)-1);
            dato=n;
            Insertar_Colas(frente,fin,dato);
        }
        system("pause");
        system("cls");
        Menu_Colas();
        break;
     case 2:
        for(i=1;i<=200;i++)
        {
            n=1+rand()%((99+1)-1);
            dato=n;
            Insertar_Colas(frente,fin,dato);
        }
        system("pause");
        system("cls");
        Menu_Colas();
        break;
     case 3:
        for(i=1;i<=300;i++)
        {
            n=1+rand()%((99+1)-1);
            dato=n;
            Insertar_Colas(frente,fin,dato);
        }
        system("pause");
        system("cls");
        Menu_Colas();
        break;
     case 4:
        for(i=1;i<=400;i++)
        {
            n=1+rand()%((99+1)-1);
            dato=n;
            Insertar_Colas(frente,fin,dato);
        }
        system("pause");
        system("cls");
        Menu_Colas();
        break;
     case 5:
        for(i=1;i<=500;i++)
        {
            n=1+rand()%((99+1)-1);
            dato=n;
            Insertar_Colas(frente,fin,dato);
        }
        system("pause");
        system("cls");
        Menu_Colas();
        break;
     case 6:
        for(i=1;i<=10;i++)
        {
            n=1+rand()%((99+1)-1);
            dato=n;
            Insertar_Colas(frente,fin,dato);
        }
        system("pause");
        system("cls");
        Menu_Colas();
        break;
     default:
        printf("\n\n\tError...\n");
        system("pause");
        system("cls");
        Menu_Colas();
     }
}


void Editar_Colas(Nodo *&frente, Nodo *&fin,int n)
{
    Nodo *nuevo_nodo=frente;
    int contador=1;
    if(frente==NULL)
    {
        printf("\n\n\tLA COLA ESTA VACIA...\n\n");
    }else if(nuevo_nodo!=NULL)
    {
        while(nuevo_nodo!=NULL)
        {
            if(nuevo_nodo->dato==n)
            {
                printf("El elemento %i esta en la posicion [%i]...\n\n",n,contador);
                printf("Ingrese el nuevo elemento: ");
                scanf("%i",&nuevo_nodo->dato);
                printf("\nElemento agregado con exito....\n\n");
            }
            contador+=1;
            nuevo_nodo=nuevo_nodo->siguiente;
        }
    }
    system("pause");
    system("cls");
    Menu_Colas();
}



void Insertar_Colas(Nodo *&frente,Nodo *&fin,int n)
{
    Nodo *nuevo_nodo = new Nodo();
    nuevo_nodo->dato = n;
    nuevo_nodo->siguiente=NULL;
    if(colaVacia(frente)){
    frente=nuevo_nodo;
    }else{
    fin -> siguiente = nuevo_nodo;
    }
    fin = nuevo_nodo;
    printf("El dato %d se agrego correctamente a la Cola\n",n );
}

bool colaVacia(Nodo *&frente)
{
    return (frente==NULL)?true:false;
}

void Imprimir_Colas(Nodo *&frente,Nodo *&fin)
{
    int contador=1;
    Nodo *nuevo_colas=frente;
    if(frente==NULL)
    {
        printf("\n\nLa cola esta vacia! \n\n");
    }else if(nuevo_colas !=NULL)
    {
        while(nuevo_colas !=NULL)
        {
            printf("Posicion[%i]->%d\n",contador,nuevo_colas->dato);
            nuevo_colas=nuevo_colas->siguiente;
            contador+=1;
        }
    }
    system("pause");
    system("cls");
    Menu_Colas();
}

void Eliminar_Cola(Nodo *&frente,Nodo *&fin,int &n)
{
    while(frente!=NULL)
    {
         n=frente->dato;
         Nodo *aux = frente;

         if(frente == fin){
         frente = NULL;
         fin = NULL;
         }else{
         frente = frente -> siguiente;
         }
         printf("Dato %d eliminado...\n",aux->dato);
         delete aux;
    }
    printf("\n\n");
    system("pause");
    system("cls");
    Menu_Colas();

}


void Ordenamiento_Colas(Nodo *&frente,Nodo *&fin)
{
    if(frente==NULL)
    {
        printf("\n\nLA COLA ESTA VACIA\n\n");
        system("pause");
        system("cls");
        Menu_Colas();
    }else if(frente != NULL){
		Nodo *p = frente;
		Nodo *j = fin;
		int aux;
		while(p != NULL){
			j = p -> siguiente;
			while(j != NULL){
				if(p -> dato > j -> dato){
					aux = p -> dato;
					p -> dato = j -> dato;
					j -> dato = aux;
				}
				j = j -> siguiente;
			}
			p = p -> siguiente;
		}
	}
    printf("\n\n");
	system("pause");
	system("cls");
	Menu_Colas();

}


void Buscar_Colas(Nodo *&frente,Nodo *&fin,int n)
{
    int i=1;
    bool x=false;
    Nodo *Nuevo_nodo=frente;
    if(frente==NULL)
    {
        printf("\n\nLA COLA ESTA VACIA!..");

    }else if(Nuevo_nodo!=NULL){
        while(Nuevo_nodo!=NULL)
        {
         if(Nuevo_nodo->dato==n)
            {
                printf("El elemento se encuentra en la cola Posicion[%i]->%i\n\n",i,Nuevo_nodo->dato);
                x=true;
            }
            Nuevo_nodo=Nuevo_nodo->siguiente;
            i++;
        };
    }if(!x)
    {
        printf("\n\nEl elemento no se encuentra en la cola....\n");
    }


    system("pause");
    system("cls");
    Menu_Colas();

}


void Eliminar_ElementoCola(Nodo *&frente,Nodo *&fin,int n)
{
    if(frente==NULL)
    {
        printf("La cola esta vacia\n");
    }else
    {
    n=frente->dato;
    Nodo *aux = frente;
    if(frente == fin){
    frente = NULL;
    fin = NULL;
    }else{
    frente = frente -> siguiente;
    }
    printf("dato %d eliminado\n\n\n",aux->dato);
    delete aux;
    }
    system("pause");
    system("cls");
    Menu_Colas();

}


    // Prueba

    /*
    int nuevo_dato;
    int contador=1;
    bool x=false;
    Nodo *aux=frente;
    if(frente==NULL)
    {
        printf("\n\n\tLA COLA ESTA VACIA!!...\n\n");
        system("pause");
        system("cls");
        Menu_Colas();
    }
    while(aux!=NULL)
    {
        if(aux->dato==n)
        {
            printf("El dato %i esta en la posicion[%i]\n",n,contador);
            printf("El dato ha sido eliminado...\n\n");
            aux->dato=NULL;
            x=true;
        }
        aux=aux->siguiente;
        contador+=1;
    }
    if(!x)
    {
        printf("El dato no existe\n\n");
    }
    system("pause");
    system("cls");
    Menu_Colas();

}*/

void Estado_Colas(Nodo *&frente,Nodo *&fin)
{
    if(frente==NULL)
    {
        printf("\n\nLA COLA ESTA VACIA!!\n\n");
    }else
    {
        printf("\n\nLA COLA ESTA LLENA!\n\n");
    }
    system("pause");
    system("cls");
    Menu_Colas();
}

void Salvar_Colas(Nodo *&frente,Nodo *&fin)
{
    Nodo *nuevo_nodo=frente;
    FILE *archivo;
	archivo = fopen("texto/SalvarDatosColas.txt", "w");
	while(nuevo_nodo!=NULL){
		fprintf(archivo, "%d\n",nuevo_nodo->dato);
		nuevo_nodo=nuevo_nodo->siguiente;
	}
	fclose(archivo);
	printf("\n\nArchivo creado con exito...\n\n\n");
	system("pause");
	system("cls");
	Menu_Colas();
}

void Cargar_DatosColas(Nodo *&frente, Nodo *&fin)
{
    int dato;
    archivo = fopen("texto/SalvarDatosColas.txt", "r");
    while(!feof(archivo))
    {
        fscanf(archivo,"%d\n",&dato);
        printf("dato desde archivo %d\n",dato);
    }
    printf("\n\nCargado con exito\n\n");
    fclose(archivo);
    system("pause");
    system("cls");
    Menu_Colas();
}

