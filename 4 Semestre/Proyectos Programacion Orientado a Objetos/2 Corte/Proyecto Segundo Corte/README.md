
# Programación Orientado a Objetos


## Algoritmos de Ordenamiento.
Los algoritmos de ordenamiento, nos permiten ordenar una cantidad de datos. En este trabajo emplearemos los tipos de ordenamiento 

* Counting Sort.
* HeapSort.
* Insercion.
* Mezcla.
* QuickSort.
* RadixSort.

### Nota: *Para el caso de los gráficos, los valores de la zona izquierda equivalen a los segundos en que se demoro en ordenar, y las barras equivalen al numero de datos ordenado*.

## Referencias.

- Windows 10 PRO.
- Procesador : Intel(R) Core(TM) !5-4300 CPU @ 2.60GHz  2.60 GHz
- Memoria (RAM) : 8,00 GB.

### Counting Sort (*Ordenamiento por cuentas*)
Es un algoritmo de ordenamiento en el que se cuenta el numero de elementos de cada clase para luego ordenarlos. Sólo puede ser utilizado por tanto para ordenar elementos que sean contables, por ejemplo, los números enteros de un determinado intervalo, sin contar números reales.

![enter image description here](https://lh3.googleusercontent.com/QdyG4bYNHc-bcYhXXiO00s6IgaWnPua7gT1sfO9vYK-XIKW0xK1aLOOIEfuqPZxpf0XPgBz2dxX_)

#### Diagrama de Clase.

![enter image description here](https://lh3.googleusercontent.com/xLsuMN-5bWgiNTVeSOabjGKDOy4A6ApoUxBt2GlOqxBLjPIyiaXdeIicITJ71BO8x9Bsw5T79xvO)

### Gráfico.
![enter image description here](https://lh3.googleusercontent.com/MQwGa1J-ibxhAM_OfXaHr-kUxNMXwYLDIWN0VIc0POY7XiB8E-o-8-ga23JNCb4b_JuMbAsyn6-H)
#### Ventajas 😃
* El algoritmo funciona mejor con listas largas, de un solo elemento simple.
#### Desventajas  😐
* Necesidad de almacenar muchos datos en memoria.
 



### HeapSort (*Ordenamiento por Montículos*)
Es un metodo de ordenamiento basado con comparacion.
Usa el montiuclo (Heap) como estructura de datos, el cual representa un arbol.
Mas lento que otros metodos, pero mas eficaz en escenarios mas rigurosos.
Se define como No recursivo y No estable.

![enter image description here](https://lh3.googleusercontent.com/NKTlGCNzbXiuqNBap2V97Ikzb3ytCOjyX95Y1HZ28UkX69b4-VWqkCydGVGhmIgOwH-Bb5frK12g)

#### Diagrama de Clase.
![enter image description here](https://lh3.googleusercontent.com/CLUG6kA0V-k5pPpUgiLWZrCx1TKfRlOatyc2Qfv0rKfd9acIaUqyfIuGH1nYAyptnRHEOcTYGZCv)

### Gráfico.
![enter image description here](https://lh3.googleusercontent.com/eWFAOdQEGTZWTLHop5vtFhdZjkHrXXZvuZNRvJvQMwhRfhlvtiepH9ol5NAy-LJxT7T0zImMwYck)
#### Ventajas 😃
* Funciona efectivamente con datos desordenados.
* No utiliza memoria adicional.
* Su desempeño es en promedio tan bueno como el QuickSort.

#### Desventaja 😐
* No es estable.
* Método Complejo.



###  Insertion Sort (*Ordenamiento por Inserción*)

Este es uno de los métodos más sencillos. Consta de tomar uno por uno los elementos de un arreglo y recorrerlo hacia su posición con respecto a los anteriormente ordenados. Así empieza con el segundo elemento y lo ordena con respecto al primero. Luego sigue con el tercero y lo coloca en su posición ordenada con respecto a los dos anteriores, así sucesivamente hasta recorrer todas las posiciones del arreglo.
![enter image description here](https://lh3.googleusercontent.com/4OoJkDT-fioVgqKauNMQdiRb3GZN6kBgAbmVBbWTADKlDzhKE5z1NkaBGNqWmf30gO577TAv4jCU)

#### Diagrama de Clase.
![enter image description here](https://lh3.googleusercontent.com/zLpEV3JDHhsS5vDYnnJo493Hl_xm2808032OODdMUO4HHsHnkCFhpW3jhmEPmN2GU2W0nJXRfy26)

### Gráfico.
![enter image description here](https://lh3.googleusercontent.com/9QA3JHEnsb6UciInntD2gLBNoletZ-Lj6IGKk9CVORQRBUIqTfP0VU2j51c35vKVVKaRSxMW9qPG)

#### Ventajas 😃
* Simplicidad (Sencillo).
* Buen rendimiento cuando se trabaja con una pequeña lista.

#### Desventaja 😐
* No funciona tan bien como otros algoritmos mejores de ordenamiento. 
* Solo es útil cuando se ordena una lista de pocos elementos.



### Merge Sort ( *Ordenamiento por Mezcla*)
En éste método se unen dos estructuras ordenadas para formar una sola ordenada correctamente. Tiene la ventaja de que utiliza un tiempo proporcional a: n log (n), su desventaja radica en que se requiere de un espacio extra para el procedimiento.

Este tipo de ordenamiento es útil cuando se tiene una estructura ordenada y los nuevos datos a añadir se almacenan en una estructura temporal para después agregarlos a la estructura original de manera que vuelva a quedar ordenada.
![enter image description here](https://lh3.googleusercontent.com/etWRREzUlrhyi7Khw5owHGz9-n89a-HcL2DeE47g557KcwMAEk5t5Yp2dN8yRkv_B0E_BpgZ5TOY)

#### Diagrama de Clase.
![enter image description here](https://lh3.googleusercontent.com/xv9dVdz0YdHIvqwPLvmzsoThtzS0XnFOC7hzBdN93PKXseqkaPgdW7sl67eBp6v2l4sLVr7MqopY)

### Gráfico.

![enter image description here](https://lh3.googleusercontent.com/rlrZDIHPcAlRkq4rz8fGV6runjTTTqBj3TCIPaV0PbOv9FtrvdsIw_qGUbDjcXqbKnKRhZy9bAgG)

#### Ventajas 😃
* Es estable mientras la funcion de mezcla sea implementada correctamente.
* Efectivo para conjuntos de datos a los que se puede acceder secuencialmente (arreglos,vectores, etc.).

#### Desventaja 😐
* Esta definido recursivamente. Por lo que si se desea implementarlo de forma no recursiva, se tendría que emplear una pila y se requiere un espacio adicional de memoria para almacenarlo.



### QuickSort (*Ordenamiento Rápido*)

Es un método de ordenamiento recursivo y en lenguajes en dónde no se permite la recursividad esto puede causar un retraso significativo en la ejecución del quicksort.

Su tiempo de ejecución es de n( log2n) en promedio.
![enter image description here](https://lh3.googleusercontent.com/SbCXO1x7y5-2YRMhQ_Ge6DtWwuZXsUl3rLOEltF6Yyq2MD3CDRA0WeyonsU7PKWXWTAEmjfWEYhS)

#### Diagrama de Clase.
![enter image description here](https://lh3.googleusercontent.com/Z9KBhMmE1KyhR4N2XDYe0c622pQGOJxylWXzU1Lvpbp0JVg3BcbMali_xQrjiOIka8CkIsIhA2ZR)

### Gráfico.
![enter image description here](https://lh3.googleusercontent.com/w6VOJ6TcD75-4PiZG0IWmTuVMlkIixM1Qtm_qStEu-3j-MYYUUSO53L0SSMhUi4f-JoE7AwQjoJC)

#### Ventajas 😃
* Es considerado el mejor algoritmo de ordenamiento.
* No requiere almacenamiento adicional.
* Ciclo interno es extremadamente corto.
#### Desventaja  😐
* Un leve inconveniente es que su rendimiento en el peor de los casos es similar a los rendimiento promedio del tipo de ordenamiento burbuja, inserción o por selección.
* Se complica la implementación si la incursión no es posible.
* Peor caso, se requiere N(^2).



### Radix Sort (*Ordenamiento de Raíz*)
Este ordenamiento se basa en los valores de los dígitos reales en las representaciones de posiciones de los números que se ordenan.
Por ejemplo el numero 235 se escribe 2 en la posición de centenas, un 3 en la posición de decenas y un 5 en la posición de unidades.

#### Diagrama de Clase.
![enter image description here](https://lh3.googleusercontent.com/pAiMfAzJ8OoMhxZyDsqRoL4BTOUFPpanhFbtpMAzFrvjZWge096Z4vPv-bSjVFSKne0pI98qmcXD)

### Gráfico.
![enter image description here](https://lh3.googleusercontent.com/ynR_sFmoF29x3lUjR8tCL4G18GfQr04QHLBbWEl0LyNz-i_aWXaVzfZJkGpk65BzQpqtOWMwNqAt)
#### Ventajas 😃
* Es estable.
* Funciona en un tiempo lineal, en comparación de varios otros métodos de ordenamiento.
* El tiempo de ordenar cada elemento es constante, ya que no se hacen comparaciones entre elementos.
* Es eficiente cuando se trata de grandes grupos.
#### Desventaja 😐
* No funciona tan bien cuando los números no son muy largos, ya que el total de tiempo es proporcional a la longitud del numero mas grande y al numero de elementos a ordenar.

# Comparación Métodos de Ordenamiento.

Comparación de los métodos de ordenamiento hablados en el documento.

![enter image description here](https://lh3.googleusercontent.com/9oML65M5lsWGGLY0YlbUGqntDFvKba4pgQ8Ncuayn-qs-FOfpf7cWah1oTVAba8qMbq5_SHKvtWN)


## Nota : *Estos tiempos fueron generados durante el transcurso de ordenar los valores sin mostrarlos*
# Conclusiones.

* Una conclusión es que el tiempo de ordenamiento depende de los valores generados, porque cuando hay mas números que son iguales, mas tiempo tomara en ordenarse, mientras que los números menos se repitan, el ordenamiento sera mas eficaz.
* Otra conclusión es, que el método HeapSort tiene una forma divertida para aprender su funcionalidad.
* Cada tipo de ordenamiento es eficaz para la funcionalidad que se le ha asignado, como unos operan mas rápido con menos cantidad de valores, otros son mas eficaces con datos mas grandes.


# Bibliográfia

*  [[Ventajas y Desventajas de los algoritmos de ordenamiento]](https://techlandia.com/ventajas-desventajas-algoritmos-ordenamiento-info_181515/)
