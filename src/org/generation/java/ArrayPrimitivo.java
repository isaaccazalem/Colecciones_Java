package org.generation.java;

///
public class ArrayPrimitivo {
    public static void main(String[] args) {
        //inicializamos un array primitivo vacio con 5 espacios de tipo int
       /* int[] edades = new int[5];
        //se inicializa con 0 todos los espacios
        //agregando un valor a un espacio
        edades[2] = 10;
        edades[3] = 20;
        edades[4] = 30;


        System.out.println("El valor en el indice 4 es: " + edades[4]);

        //como obtener el tamaño del array
        System.out.println("El tamaño del array es: " + edades.length);
        */
        //array con valores en la inicializacion
        int[] numeros = {
                427, 83, 916, 254, 671, 39, 582, 748, 193, 864,
                315, 702, 56, 489, 931, 167, 624, 358, 795, 241,
                873, 104, 536, 689, 22, 417, 962, 301, 754, 188,
                643, 95, 821, 476, 230, 907, 154, 568, 712, 349,
                986, 273, 605, 41, 839, 492, 126, 763, 584, 317,
                698, 215, 954, 367, 81, 541, 879, 432, 169, 725,
                293, 617, 48, 902, 384, 756, 131, 668, 509, 244,
                817, 96, 453, 781, 326, 639, 174, 925, 562, 208,
                691, 357, 44, 846, 495, 122, 738, 581, 269, 973,
                403, 157, 614, 892, 335, 71, 764, 528, 186, 947
        };

        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double promedio = suma / numeros.length;
        System.out.println("El promedio es: " + promedio);

        // Mostrar el numero mas grande y el mas pequeño sin usar Math
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El numero mas grande es: " + mayor);
        System.out.println("El numero mas pequeño es: " + menor);


    }

}