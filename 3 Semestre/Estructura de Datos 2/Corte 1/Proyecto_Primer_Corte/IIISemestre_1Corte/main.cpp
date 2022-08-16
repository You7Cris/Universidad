#include <iostream>
#include <stdio.h>
#include <conio.h>
#include <windows.h>
#include <stdlib.h>
#include <math.h>
#include <memory>
#define clientes 1000

using namespace std;

void Introduccion();
void Informacion();
void Menu(int,int);
void MostrarClientes(int,int);
void CrearClientes(int,int);
void ModificarCliente(int,int);
void VisualizarProductos(int,int);
void CrearProductos(int,int);
void ModificarProducto(int,int);
void CrearFactura(int,int);
void MostrarFacturas(int,int);
void FacturasPagasNoPagas(int,int);
void FacturaCliente(int,int);

struct Cliente
{
    int id_Cliente;
    char nombre[20];
    int cedula;
    char direccion[20];
    int telefono;
}Cliente[clientes], *P_Clientes=Cliente ;

struct Productos
{
    int id_Productos;
    char nombre[20];
    float Valor;
}Productos[clientes], *P_Productos=Productos;

 struct Factura
{
    int id;
    char cliente[30];
    char producto[30];
    int id_Factura;
    int cantidad;
    float valor;
    bool estado;
}Factura[clientes],*P_Factura=Factura;


int main()
{
    Introduccion();
    return 0;
}

void Introduccion()
{
    printf("\n\t\t\t Inicio\n\n");
    printf("Programa de Clientes de una empresa de Supermercado.\n");
    printf("\n\nPresione una tecla para entrar en el menu...");
    getch();
    system("cls");
    Informacion();
}

void Informacion()
{
    int numero,productos,opcion;
    printf("\t\tInformacion. \n\n");
    printf("Ingrese el numero de Clientes del supermercado: ");
    scanf("%i",&numero);
    printf("Ingrese el numero de Productos de la empresa: ");
    scanf("%i",&productos);
    printf("\n\nInformacion Almacenada...");
    getch();
    system("cls");
    Menu(numero,productos);
}

void Menu(int n, int p)
{
    int opcion;
    printf("\t-------------------------------------------\n");
    printf("\t|              MENU DE INICIO             |\n");
    printf("\t|-----------------------------------------|\n");
    printf("\t|          1.)Visualizar Clientes         |\n");
    printf("\t|          2.)Crear Clientes              |\n");
    printf("\t|          3.)Modificar Cliente           |\n");
    printf("\t|-----------------------------------------|\n");
    printf("\t|          4.)Visualizar Productos        |\n");
    printf("\t|          5.)Ingresar Productos          |\n");
    printf("\t|          6.)Modificar Productos         |\n");
    printf("\t|-----------------------------------------|\n");
    printf("\t|          7.)Visualizar Facturas         |\n");
    printf("\t|          8.)Crear Facturas              |\n");
    printf("\t|-----------------------------------------|\n");
    printf("\t|          9.)Facturas de un cliente      |\n");
    printf("\t|      10.)Facturas pagadas o no pagadas  |\n");
    printf("\t|-----------------------------------------|\n");
    printf("\t|          0.)Salir                       |\n");
    printf("\t-------------------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&opcion);
    system("cls");
    switch(opcion)
    {
    case 0:
        free(P_Productos);
        free(P_Factura);
        free(P_Clientes);
        printf("Hasta Luego...\n");
        getch();
        exit(1);
        break;
    case 1:
        MostrarClientes(n,p);
        break;
    case 2:
        CrearClientes(n,p);
        break;
    case 3:
        ModificarCliente(n,p);
        break;
    case 4:
        VisualizarProductos(n,p);
        break;
    case 5:
        CrearProductos(n,p);
        break;
    case 6:
        ModificarProducto(n,p);
        break;
    case 7:
        MostrarFacturas(n,p);
        break;
    case 8:
        CrearFactura(n,p);
        break;
    case 9:
        FacturaCliente(n,p);
        break;
    case 10:
        FacturasPagasNoPagas(n,p);
        break;
    default:
        printf("Error, vuelva a ingresar los datos...\n");
        getch();
        system("cls");
        Menu(n,p);

    }

}



void MostrarClientes(int n,int p)
{
    int i,j,id,opcion;
    printf("\t\t Informacion Clientes\n");
    printf("Desea ver la informacion de un solo cliente?\n");
    printf("1.Si 2.No\n");
    printf("Opcion: ");
    scanf("%i",&j);
    switch(j)
    {
    case 1:
        system("cls");
        printf("Ingrese el Id del Cliente: ");
        scanf("%i",&id);
        system("cls");
        printf("\n\n\t\tCliente #%i\n\n",id);
        printf("Id: %i\n",(P_Clientes+id)->id_Cliente);
        printf("Cedula: %i\n",(P_Clientes+id)->cedula);
        printf("Nombre: %s\n",(P_Clientes+id)->nombre);
        printf("Direccion: %s\n",(P_Clientes+id)->direccion);
        printf("Telefono: %i\n",(P_Clientes+id)->telefono);
        printf("\n\nDesea volver a ver informacion de cliente?. 1.Si 2.No 3.Volver al Menu\n");
        printf("Opcion: ");
        scanf("%i",&opcion);
        if(opcion==1)
        {
            system("cls");
            MostrarClientes(n,p);
        }else if(opcion==2)
        {
        	printf("\n\n");
        	printf("Presione una tecla para salir...\n");
        	getch();
            system("cls");
            Menu(n,p);
        }  else if(opcion==3)
        {
            system("cls");
            Menu(n,p);
        }
        else
        {
            printf("\n\nError, Presione una tecla para volver al Menu...");
            getch();
            system("cls");
            Menu(n,p);
        }
        system("cls");
        Menu(n,p);
        break;
    case 2:
        for(i=1;i<=n;i++)
        {
            printf("\t\tCliente #%i\n",i);
            printf("\n\nId: %i\n",(P_Clientes+i)->id_Cliente);
            printf("Cedula: %i\n",(P_Clientes+i)->cedula);
            printf("Nombre: %s\n",(P_Clientes+i)->nombre);
            printf("Direccion: %s\n",(P_Clientes+i)->direccion);
            printf("Telefono: %i\n",(P_Clientes+i)->telefono);
            printf("\n\nDesea continuar? 1.Si 2.No\n");
            printf("Opcion: ");
            scanf("%i",&opcion);
            if(opcion==1)
            {
                system("cls");
            }
            else if(opcion==2)
            {
                system("cls");
                Menu(n,p);
            }else
            {
                printf("\n\nError, presiona para volver al Menu...");
                getch();
                system("cls");
                Menu(n,p);
            }
        }
        system("cls");
        Menu(n,p);
        break;
    case 3:
        system("cls");
        Menu(n,p);
        break;
    default:
        printf("\n\nError, vuelve a ingresar...");
        system("cls");
        MostrarClientes(n,p);
    }
}

void CrearClientes(int n,int p)
{
    int i,opcion,opcion1,posicion;
    printf("\t\t REGISTRO CLIENTES\n\n");
    printf("1. Ingresar desde cero\n");
    printf("2. Desde una posicion\n");
    printf("3. Salir\n");
    printf("\nOpcion: ");
    scanf("%i",&opcion1);
    system("cls");
    switch(opcion1)
    {
    case 1:
        for(i=1;i<=n;i++)
        {
           printf("\t\tCliente #%i\n\n",i);
           (P_Clientes+i)->id_Cliente=i;
           printf("Id: %i\n",(P_Clientes+i)->id_Cliente);
           fflush(stdin);
           printf("Nombre: ");
           fgets((P_Clientes+i)->nombre,30,stdin);
           fflush(stdin);
           printf("Cedula: ");
           scanf("%i",&(P_Clientes+i)->cedula);
           fflush(stdin);
           printf("Direccion: ");
           fgets((P_Clientes+i)->direccion,20,stdin);
           fflush(stdin);
           printf("Telefono: ");
           scanf("%i",&(P_Clientes+i)->telefono);
           fflush(stdin);
           printf("\n\nDesea Continuar? 1.Si 2.No.\n");
           printf("Opcion: ");
           scanf("%i",&opcion);
           fflush(stdin);
           if(opcion==2)
           {
               system("cls");
               Menu(n,p);
           }else
           if(opcion==1)
           {
               system("cls");
           }else
           {
               i--;
               system("cls");
           }

        }
        system("cls");
        Menu(n,p);
        break;
    case 2:
        printf("Ingrese desde que posicion va a ingresar los usuarios.\n");
        printf("Posicion: ");
        scanf("%i",&posicion);
        system("cls");
        for(i=posicion;i<=n;i++)
        {
            (P_Clientes+i)->id_Cliente=i;
            fflush(stdin);
            printf("\t\tCliente #%i\n\n",i);
            printf("Id: %i\n",(P_Clientes+i)->id_Cliente);
            printf("Nombre: ");
            fgets((P_Clientes+i)->nombre,30,stdin);
            fflush(stdin);
            printf("Cedula: ");
            scanf("%i",&(P_Clientes+i)->cedula);
            fflush(stdin);
            printf("Direccion: ");
            fgets((P_Clientes+i)->direccion,30,stdin);
            fflush(stdin);
            printf("Telefono: ");
            scanf("%i",&(P_Clientes+i)->telefono);
            printf("\n\nInformacion guardada con exito....");
            printf("\n\nDesea seguir ingresando? 1.Si 2.No\n");
            printf("Opcion: ");
            scanf("%i",&opcion);
            if(opcion==2)
            {
                system("cls");
                Menu(n,p);
            }else if(opcion==1)
            {
                system("cls");
            }else
            {
                printf("\n\nError al ingresar....");
                getch();
                system("cls");
                i--;
            }


        }
    case 3:
        system("cls");
        Menu(n,p);
        break;
    default:
        printf("\n\nError al Ingresar, vuelva al menu....");
        getch();
        system("cls");
        CrearClientes(n,p);
    }

}

void ModificarCliente(int n,int p)
{
    int id,opcion,opcion1;
    printf("Que cliente ingresado desea modificar?\n");
    printf("Id: ");
    scanf("%i",&id);
    system("cls");
    printf("\nDesea Modificar algo en especifico?\n");
    printf("1. Cambiar todo el contenido del cliente\n");
    printf("2. Cambiar un dato en especifico.\n");
    printf("3. Volver al Menu.");
    printf("\nOpcion: ");
    scanf("%i",&opcion1);
    system("cls");
    switch(opcion1)
    {
    case 1:
        printf("\t\tCliente #%i\n\n",id);
        printf("Ingrese Cedula: ");
        scanf("%i",&(P_Clientes+id)->cedula);
        fflush(stdin);
        printf("Ingrese Nombre: ");
        fgets((P_Clientes+id)->nombre,30,stdin);
        fflush(stdin);
        printf("Ingrese Direccion: ");
        fgets((P_Clientes+id)->direccion,20,stdin);
        printf("Ingrese el telefono: ");
        scanf("%i",&(P_Clientes+id)->telefono);
        fflush(stdin);
        printf("\n\nCambiado con exito....");
        printf("\n\nDesea Modificar otro cliente? 1.Si 2.No\n");
        printf("Opcion: ");
        scanf("%i",&opcion);
        if(opcion==1)
        {
            system("cls");
            ModificarCliente(n,p);
        }else if(opcion==2)
        {
            printf("\n\nPresione una tecla para volver al Menu...");
            getch();
            system("cls");
            Menu(n,p);
        }
        system("Pause");
        system("cls");
        Menu(n,p);
        break;
    case 2:
        printf("\t------------------------------------\n");
        printf("\t|         MENU MODIFICACION        |\n");
        printf("\t|----------------------------------|\n");
        printf("\t|           1.Nombre               |\n");
        printf("\t|           2.Cedula               |\n");
        printf("\t|          3.Direccion             |\n");
        printf("\t|          4.Telefono              |\n");
        printf("\t|           5. Salir               |\n");
        printf("\t------------------------------------\n");
        printf("Opcion: ");
        scanf("%i",&opcion1);
        printf("\n\n");
        switch(opcion1)
        {
        case 1:
            printf("Ingrese el nombre: ");
            fgets((P_Clientes+id)->nombre,30,stdin);
            printf("\n\nInformacion cambiada con exito....\n");
            getch();
            system("cls");
            ModificarCliente(n,p);
            break;
        case 2:
            printf("Ingrese la cedula: ");
            scanf("%i",&(P_Clientes+id)->cedula);
            printf("\n\nInformacion cambiada con eexito....");
            getch();
            system("cls");
            ModificarCliente(n,p);
        case 3:
            printf("Ingrese la direccion: ");
            fgets((P_Clientes+id)->direccion,30,stdin);
            printf("\n\nInformacion cambiada con exito....\n");
            getch();
            system("cls");
            ModificarCliente(n,p);
            break;
        case 4:
            printf("Ingrese la cedula: ");
            scanf("%i",&(P_Clientes+id)->cedula);
            printf("\n\nInformacion cambiada con eexito....");
            getch();
            system("cls");
            ModificarCliente(n,p);
            break;
        case 5:
            system("cls");
            Menu(n,p);
            break;
        default:
            printf("\n\nError de sintaxis..");
            ModificarCliente(n,p);
        }


    }
}


void VisualizarProductos(int n,int p)
{
    int i,opcion,opcion1,id;
    printf("Desea Visualizar solo un producto? 1.Si 2.No\n");
    printf("Opcion: ");
    scanf("%i",&opcion1);
    system("cls");
    switch(opcion1)
    {
    case 1:
        printf("Ingrese el ID del producto: ");
        scanf("%i",&id);
        printf("\t\tProducto #%i\n\n",id);
        printf("Id: %i\n",(P_Productos+id)->id_Productos);
        printf("Nombre: %s\n",(P_Productos+id)->nombre);
        printf("Valor: %.1f\n",(P_Productos+id)->Valor);
        printf("\n\nDesea Continuar? 1.Si 2.No\n");
        printf("Opcion: ");
        scanf("%i",&opcion);
        if(opcion==1)
        {
            system("cls");
            VisualizarProductos(n,p);
        }else if(opcion==2)
        {
            system("cls");
            Menu(n,p);

        }else
        {
            printf("Error, vuelva al Menu...");
            getch();
            system("cls");
            Menu(n,p);
        }
        break;
    case 2:
        for(i=0;i<p;i++)
        {
            printf("\t\tProducto #%i\n\n",i+1);
            printf("Id: %i\n",(P_Productos+i)->id_Productos);
            printf("Nombre: %s\n",(P_Productos+i)->nombre);
            printf("Valor: %.1f\n",(P_Productos+i)->Valor);
            printf("\n\nDesea Continuar? 1.Si 2.No\n");
            printf("Opcion: ");
            scanf("%i",&opcion);
            if(opcion==1)
            {
                system("cls");
            }else
            if(opcion==2)
            {
                Menu(n,p);

            }else
            {
                i--;
                system("cls");
            }
        }
        system("cls");
        Menu(n,p);
        break;
    default:
        printf("Error, vuelve al Menu...");
        getch();
        system("cls");
        Menu(n,p);
    }
}

void CrearProductos(int n, int p)
{
    int i,opcion,opcion1,posicion;
    printf("\t\tREGISTRO PRODUCTOS\n\n");
    printf("1. Ingresar desde cero\n");
    printf("2. Ingresar desde una posicion\n");
    printf("3. Salir\n");
    printf("Opcion: ");
    scanf("%i",&opcion1);
    system("cls");
    switch(opcion1)
    {
    case 1:
        for(i=1;i<=p;i++)
        {
            printf("\t\t Producto #%i\n\n",i);
            (P_Productos+i)->id_Productos=i;
            fflush(stdin);
            printf("Nombre: ");
            fgets((P_Productos+i)->nombre,30,stdin);
            fflush(stdin);
            printf("Valor: ");
            scanf("%i",&(P_Productos+i)->Valor);
            fflush(stdin);
            printf("\n\nContinuar? 1.Si 2.No\n");
            printf("Opcion: ");
            scanf("%i",&opcion);
            if(opcion==2)
            {
                system("cls");
                Menu(n,p);
            }else if(opcion==1)
            {
                system("cls");
            }else
            {
                printf("\n\nVuelva a Ingresar....");
                system("cls");
                i--;
            }
        }
        system("cls");
        Menu(n,p);
        break;
    case 2:
        printf("Ingrese desde donde desea empezar.\n");
        printf("Posicion: ");
        scanf("%i",&posicion);
        system("cls");
        for(i=1;i<=p;i++)
        {
            printf("\t\t Producto #%i\n\n",i);
            (P_Productos+i)->id_Productos=i;
            printf("Nombre: ");
            fgets((P_Productos+i)->nombre,30,stdin);
            fflush(stdin);
            printf("Valor: ");
            scanf("%i",&(P_Productos+i)->Valor);
            fflush(stdin);
            printf("\n\nContinuar? 1.Si 2.No\n");
            printf("Opcion: ");
            scanf("%i",&opcion);
            if(opcion==2)
            {
                system("cls");
                Menu(n,p);
            }else if(opcion==1)
            {
                system("cls");
            }else
            {
                printf("\n\nVuelva a Ingresar....");
                system("cls");
                i--;
            }
        }
        system("cls");
        Menu(n,p);
    case 3:
        system("cls");
        Menu(n,p);
        break;
    default:
        printf("\n\nError vuelva a ingresar un valor..");
        getch();
        system("cls");
        CrearProductos(n,p);
    }

}

void ModificarProducto(int n,int p)
{
    int id,opcion,opcion1;
    printf("\t\tModificacion Productos\n\n");
    printf("Ingrese el Id del producto que desea modificar: ");
    scanf("%i",&id);
    system("cls");
    printf("\t\t--------------------------------\n");
    printf("\t\t|          PRODUCTOS           |\n");
    printf("\t\t|------------------------------|\n");
    printf("\t\t|         1. Nombre            |\n");
    printf("\t\t|         2. Valor             |\n");
    printf("\t\t|      3. Volver al Menu       |\n");
    printf("\t\t--------------------------------\n");
    printf("Opcion: ");
    scanf("%i",&opcion1);
    switch(opcion1)
    {
    case 1:
        system("cls");
        printf("\t\t Producto #%i\n",id);
        printf("Nombre: ");
        fgets((P_Productos+id)->nombre,30,stdin);
        fflush(stdin);
        printf("\n\nInformacion cambiada con exito...");
        getch();
        ModificarProducto(n,p);
        break;
    case 2:
        system("cls");
        printf("\t\t Producto #%i\n",id);
        printf("Valor: ");
        scanf("%i",&(P_Productos+id)->Valor);
        fflush(stdin);
        printf("\n\nInformacion cambiada con exito...");
        getch();
        ModificarProducto(n,p);
        break;
    case 3:
        system("cls");
        Menu(n,p);
        break;
    default:
        printf("\n\nError de sintaxis...\n");
        getch();
        system("cls");
        ModificarProducto(n,p);

    }
    system("cls");
    Menu(n,p);


}

void CrearFactura(int n,int p)
{
    int i,estado,posicion,cantidadFacturas,id,k,j=0,idProducto,cantidadProductos;
    int l=0,opcion;
    printf("\t\t FACTURAS\n\n");
    printf("Esta el Cliente registrado? 1.Si 2.No\n");
    scanf("%i",&posicion);
    printf("\n\nCuantas Facturas va a ingresar?\n");
    printf("Cantidad: ");
    scanf("%i",&cantidadFacturas);
    system("cls");
    switch(posicion)
    {
    case 1:
        printf("\t------------------------------------------\n");
        for(i=l;i<=cantidadFacturas;i++)
        {
            fflush(stdin);
            printf("Ingrese el ID del Cliente: ");
            scanf("%i",&id);
            fflush(stdin);
            (P_Factura+i)->id=i+1;
            fflush(stdin);
            for(k=0;k<n;k++)
            {
                if(id==(P_Clientes+k)->id_Cliente)
                {
                    j=k;
                }
            }
            strcpy((P_Factura+i)->cliente, (P_Clientes+j)->nombre);
            printf("Ingrese el id del producto que compra %s\n",(P_Factura+i)->cliente);
            printf("Id: ");
            scanf("%i",&idProducto);
            strcpy((P_Factura+i)->producto,(P_Productos+idProducto)->nombre);
            fflush(stdin);
            printf("Ingrese la cantidad de %s que va a comprar %s:\n",(P_Productos+idProducto)->nombre,(P_Clientes+j)->nombre);
            scanf("%i",&cantidadProductos);
            fflush(stdin);
            (P_Factura+i)->cantidad=cantidadProductos;
            fflush(stdin);
            (P_Factura+i)->valor=(P_Productos+idProducto)->Valor * cantidadProductos;
            fflush(stdin);
            printf("\n\nIngrese el estado de la compra? 1.Pagado 2.No pagado\n",(P_Clientes+j)->nombre);
            scanf("%i",&(P_Factura+i)->estado);
            fflush(stdin);
            if((P_Factura+i)->estado>=3 || (P_Factura+i)->estado<=0)
            {
                printf("\n\nError...");
                getch();
                l--;
            }
            l++;
            printf("\n\nGuardada con exito...");
            printf("Desea continuar? 1.Si 2.No\n");
            printf("Opcion: ");
            scanf("%i",&opcion);
            if(opcion==2)
            {
                system("cls");
                Menu(n,p);
            }else if(opcion==1)
            {
                system("cls");
            }else
            {
                printf("\n\nError, vuelve a ingresar...");
                getch();
                system("cls");
                i--;
            }
            system("cls");

        }
        system("cls");
        Menu(n,p);
        break;
    case 2:
        for(i=l;i<cantidadFacturas;i++)
        {
            (P_Factura+i)->id=i;
            fflush(stdin);
            printf("Ingrese el nombre del cliente: ");
            fgets((P_Factura+i)->cliente,30,stdin);
            fflush(stdin);
            printf("Ingrese el ID del producto %s\n",(P_Factura+i)->cliente);
            printf("Id: ");
            scanf("%i",&idProducto);
            fflush(stdin);
            strcpy((P_Factura+i)->producto,(P_Productos+idProducto)->nombre);
            fflush(stdin);
            printf("Ingrese la cantidad de %s que va a comprar %s\n",(P_Factura+i)->producto,(P_Factura+i)->cliente);
            printf("Cantidad: ");
            scanf("%i",&cantidadProductos);
            (P_Factura+i)->cantidad=cantidadProductos;
            fflush(stdin);
            (P_Factura+i)->valor=(P_Productos+idProducto)->Valor*cantidadProductos;
            fflush(stdin);
            printf("Ingrese el estado de la compra.\n");
            printf("1.)Pagado      2)No pagado\n");
            printf("Opcion: ");
            scanf("%i",&(P_Factura+i)->estado);
            if((P_Factura+i)->estado>3 || (P_Factura+i)->estado<=0)
            {
                printf("\n\nError, vuelve a ingresar..");
                getch();
                system("cls");
                i--;
            }
            fflush(stdin);
            printf("\n\nInformacion guardada con exito...");
            getch();
            system("cls");
            i++;
        }
        system("cls");
        Menu(n,p);
        break;
    default:
        printf("\n\nError al ingresar....");
        getch();
        system("cls");
    }

}


void MostrarFacturas(int n, int p)
{
    int i,opcion,numero,volver;
    printf("\t\tFACTURAS\n\n");
    printf("Deseas ver una factura en especifico?. 1.Si 2.No 3.Volver al Menu\n");
    printf("Opcion: ");
    scanf("%i",&opcion);
    if(opcion==1)
    {
        printf("\nIngrese el ID de la factura que desea ver: ");
        scanf("%i",&numero);
        system("cls");
        printf("\t\t FACTURA #%i\n\n",numero);
        printf("Id Factura: %i\n",(P_Factura+numero)->id);
        printf("Cantidad: %i\n",(P_Factura+numero)->cantidad);
        printf("Valor Producto %i x %.1f  -->%.1f\n",(P_Factura+numero)->cantidad,(P_Productos+numero)->Valor,(P_Factura+numero)->valor);
        printf("Nombre Cliente: %s\n",(P_Factura+numero)->cliente);
        printf("Nombre Producto: %s\n",(P_Factura+numero)->producto);
        printf("Estado= 1.Pagado 2.No pagado\n");
        printf("Estado Factura: %i\n",(P_Factura+numero)->estado);
        printf("\n\nDesea volver a ingresar? 1.Si 2.No\n");
        printf("Opcion: ");
        scanf("%i",&volver);
        if(volver==1)
        {
            system("cls");
            MostrarFacturas(n,p);
        }else if(volver==2)
        {
            system("cls");
            Menu(n,p);
        }else
        {
            printf("\n\nError, dato erroneo\n");
            getch();
            system("cls");
            Menu(n,p);
        }

    }else if(opcion==2)
    {
        for(i=1;i<=n;i++)
        {
        system("cls");
        printf("\t\t FACTURA #%i\n\n",numero);
        printf("Id Factura: %i\n",(P_Factura+i)->id);
        printf("Cantidad: %i\n",(P_Factura+i)->cantidad);
        printf("Valor Producto %i x %.1f  -->%.1f\n",(P_Factura+i)->cantidad,(P_Productos+i)->Valor,(P_Factura+i)->valor);
        printf("Nombre Cliente: %s\n",(P_Factura+i)->cliente);
        printf("Nombre Producto: %s\n",(P_Factura+i)->producto);
        printf("Estado= 1.Pagado 2.No pagado\n");
        printf("Estado Factura: %i\n",(P_Factura+i)->estado);
        printf("\n\nDesea Continuar? 1.Si 2.No\n");
        printf("Opcion: ");
        scanf("%i",&volver);
        if(volver==1)
        {
            system("cls");
        }else if(volver==2)
        {
            system("cls");
            MostrarFacturas(n,p);
        }else
        {
            printf("\n\nError, dato erroneo\n");
            getch();
            system("cls");
            Menu(n,p);
        }
        }

    }else if(opcion==3)
    {
        system("cls");
        Menu(n,p);
    }
        else
    {
        printf("\n\nError al ingresar, dato erroneo....");
        getch();
        system("cls");
        MostrarFacturas(n,p);
    }

}

void FacturasPagasNoPagas(int n,int p)
{
    int i,opcion,opcion1;
    printf("\t\t FACTURAS\n\n");
    printf("Que deseas ver?\n");
    printf("1.Facturas pagadas\n");
    printf("2.Facturas no pagadas\n");
    printf("3.Volver al Menu\n");
    printf("Opcion: ");
    scanf("%i",&opcion1);
    system("cls");
    switch(opcion1)
    {
    case 1:
        printf("\t\tFACTURAS PAGADAS\n\n");
        for(i=1;i<=n;i++)
        {
            if((P_Factura+i)->estado==1)
            {
                printf("Id Factura: %i\n",(P_Factura+i)->id);
                printf("Cantidad: %i\n",(P_Factura+i)->cantidad);
                printf("Valor Producto: %.1f\n",(P_Factura+i)->valor);
                printf("Nombre Cliente: %s\n",(P_Factura+i)->cliente);
                printf("Nombre del Producto: %s\n",(P_Factura+i)->producto);
                printf("Estado Factura: %d \n",(P_Factura+i)->estado);
                printf("\n\nDesea continuar? 1.Si 2.No\n");
                printf("Opcion: ");
                scanf("%i",&opcion);
                if(opcion==1)
                {
                    system("cls");
                }else if(opcion==2)
                {
                    system("cls");
                    Menu(n,p);
                }else
                {
                    printf("\n\nError, dato erroneo...");
                    system("cls");
                    Menu(n,p);
                }
            }
        }
        printf("\nPresione una tecla para volver al Menu...");
        getch();
        system("cls");
        Menu(n,p);
        break;
    case 2:
        printf("\t\tFACTURAS NO PAGADAS\n");
        for(i=1;i<=n;i++)
        {
            if((P_Factura+i)->estado==0)
            {
                printf("Id Factura: %i\n",(P_Factura+i)->id);
                printf("Cantidad: %i\n",(P_Factura+i)->cantidad);
                printf("Valor Producto: %.1f\n",(P_Factura+i)->valor);
                printf("Nombre Cliente: %s\n",(P_Factura+i)->cliente);
                printf("Nombre del Producto: %s\n",(P_Factura+i)->producto);
                printf("Estado Factura: %d \n",(P_Factura+i)->estado);
                printf("\n\nDesea continuar? 1.Si 2.No\n");
                printf("Opcion: ");
                scanf("%i",&opcion);
                if(opcion==1)
                {
                    system("cls");
                }else if(opcion==2)
                {
                    system("cls");
                    Menu(n,p);
                }else
                {
                    printf("\n\nError, dato erroneo...");
                    system("cls");
                    Menu(n,p);
                }
            }
        }
        getch();
        system("cls");
        Menu(n,p);
        break;
    case 3:
        system("cls");
        Menu(n,p);
    default:
        printf("\n\nError, dato erroneo...");
        getch();
        system("cls");
        FacturasPagasNoPagas(n,p);
    }
}


void FacturaCliente(int n, int p)
{
    int idCliente,i,largo=0,opcion;
    char nombreCliente[30];
    printf("\t\t FACTURA CLIENTE\n\n");
    printf("Si no conoce el ID del cliente, lo puede consultar en la opcion #1\n");
    getch();
    system("cls");
    printf("\t\t FACTURA CLIENTE\n\n");
    printf("1.Ingresar ID Cliente\n");
    printf("2.Volver al Menu\n");
    printf("Opcion: ");
    scanf("%i",&opcion);
    system("cls");
    switch(opcion)
    {
    case 1:
        printf("Ingrese el ID del cliente: ");
        scanf("%i",&idCliente);
        for(i=1;i<=n;i++)
        {
            if(idCliente==(P_Clientes+i)->id_Cliente);
            {
                strcpy(nombreCliente,(P_Clientes+i)->nombre);
            }
        }
        printf("\n\nMostrado con exito....\n\n");
        getch();
        system("cls");
        for(i=1;i<=n;i++)
        {
            if(strncmp(nombreCliente,(P_Factura+i)->cliente,30)==0)
            {
                printf("Id Factura: %i\n",(P_Factura+i)->id);
                printf("Nombre del Cliente: %s\n",(P_Factura+i)->cliente);
                printf("Cantidad: %i \n",(P_Factura+i)->cantidad);
                printf("Valor Producto -->%.1f\n",(P_Factura+i)->valor);
                printf("Nombre del Producto: %s\n",(P_Factura+i)->producto);
                printf("Estado Factura: %d\n",(P_Factura+i)->estado);
                printf("\n\n");
                printf("Informacion Mostrada con exito...");
            }
        }
        getch();
        system("cls");
        Menu(n,p);
        break;
    case 2:
        system("cls");
        Menu(n,p);
        break;
    default:
        printf("\n\nError, dato erroneo....");
        getch();
        system("cls");
        FacturaCliente(n,p);

    }
}
