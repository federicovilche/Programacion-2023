
package clase16;

import java.util.Scanner;


public class Clase16 {

    
    public static void main(String[] args) {
        //Bucles de repetición
        System.out.println("***ESTRUCTURA WHILE***");
        //La estructura while, evalua una condición y mientras sea verdadera
        //ejecuta las sentencias del cuerpo de while 
        
        //imprimir los números del 1 al 10 , uno debajo del otro
      int contador=1;
      while(contador<=10) {
        System.out.println(contador);
        contador++;
    }
    //ERROR - bucle infinito
    //wl+tab=while
    while (contador<=10) {
        System.out.println(contador);    
    }
    
        System.out.println("Continua con el resto del programa");
        System.out.println("***ESTRUCTURA do-while***");
//el do-while ejecuta al menos una vez las sentencias
//y luego evalúa la condición para seguir ejecutando

//sumar los números positivos ingresados por el usuario 
int numero=0;
int suma=0;
        Scanner teclado = new Scanner(System.in);
do{
    System.out.println("######################################################");
    System.out.println("Ingresa un número entero para sumar o el 0 para salir:");
    numero=teclado.nextInt();
    if(numero>0) suma+=numero;
}while(numero!=0);

        System.out.println("Usted ingresó el 0 para salir.");
        System.out.println("La suma de números positivos es: "+suma);




























    
    }
    
}
