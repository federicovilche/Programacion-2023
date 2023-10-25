/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase17;

import java.util.Scanner;

/**
 *
 * @author Aula 8 - Docente
 */
public class Clase17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //bucles de repetición
        System.out.println("**Estructura while**");
        //la estructura while, evalúa una condición y mientras sea verdadera
        //ejecuta las sentencias del cuepo del while
        
        //imprimir los números del 1 al 10, uno debajo del otro
        
        int contador = 1;
        
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }
        
        contador = 1;
        
        //ERROR - bucle infinito
//        while (contador <= 10){
//            System.out.println(contador);
//        }
        
//        while (contador >= 1) {
//            System.out.println(contador);
//            contador++;
//        }

//        System.out.println("Continúa con el resto del programa");


        System.out.println("**Estructura do-while**");
        //el do-while ejecuta al menos una vez las sentencias
        //y luego evalúa la condición para seguir ejecutando
        
        //sumar los números positivos ingresados por el usuario
        int numero = 0;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
        
//        do{
//            System.out.println("###################################################");
//            System.out.println("Ingrese un número entero para sumar ó el 0 para salir:");
//            numero = teclado.nextInt();
//            if(numero>0) suma+=numero;
//        }while(numero!=0);
//        
//        System.out.println("Usted ingresó el 0 para salir.");
//        System.out.println("La suma de números positivos es: "+suma);
        
        System.out.println("** Sentencia break **");
        
        //La sentencia break genera un corte en la secuencia de comandos
        //y saca la ejecución del bloque de código
        
        //Siguiendo el ejemplo anterior, si la suma supera los 100
        //cortamos la ejecución del programa
        
        suma=0;
        
//        do{
//            System.out.println("Ingrese un número entero para sumar o el 0 para salir:");
//            numero = teclado.nextInt();
//            if(numero>0) suma+=numero;
//            if(suma>100) break;
//        }while(numero!=0);
//        
//        System.out.println("La suma de números enteros positivos es de: "+suma);
        
        System.out.println("** Sentencia continue **");
        
        //La sentencia continue genera un corte en la secuencia de comandos
        //y vuelve al comienzo de la estructura
        
        //Continuando con nuestro ejemplo, sólo sumaremos los números pares
        
//        do{
//            System.out.println("Ingrese un número entero para sumar o el 0 para salir:");
//            numero = teclado.nextInt();
//            if(numero%2!=0) continue;
//            if(numero>0) suma+=numero;
//            if(suma>100) break;
//        }while(numero!=0);
//        
//        System.out.println("La suma de los números enteros positivos pares es de: "+suma);
        
        
        System.out.println("** Estructura for **");
         // es también una estructura repetitiva
         
         //imprimir los números del 1 al 10 uno debajo del otro
         for(int i=1; i<=10; i++){
             System.out.println(i);
         }
        
         System.out.println("");
         
         //se puede utilizar en línea si sólo se ejecuta una sentencia
         //ej. imprimir "Hola Mundo!!" 5 veces uno debajo del otro
         
         for(int i=1; i <=5; i++) System.out.println("Hola Mundo!!");
         
        /*
         La variable que está dentro del for es una variable local.
         Sólo se utiliza dentro del for, no tiene alcance (scope) fuera de la estructura.
         Al terminar el bucle, se destruye y desaparece, es decir, que deja de ocupar lugar 
         en memoria.
         */
         
         //imprimir los números del 1 al 10 sin imprimir los números 2, 5 y 9
         for(int i=1; i<=10; i++){
             if(i!=2 && i!=5 && i!=9) System.out.println(i);
         }
         
         System.out.println("**************************************************");
         
         //imprimir los números del 1 al 30 sin imprimir los números entre el 10 y el 20
         for(int i=1 ; i<=30; i++){
             if(i<10 || i>20) System.out.println(i);
         }
         
         System.out.println("**************************************************");
         
         //imprimir los números del 1 al 20 salteando de a 2 
         //uno al lado del otro, separado con espacio
         for(int i=1; i<=20; i+=2){
             System.out.print(i+" ");
         }
         
         System.out.println("\n**************************************************");
         
         //imprimir los números del 10 al 1, uno debajo del otro
         for(int i=10; i>=1; i--){
             System.out.println(i);
         }
         
         //imprimir los números pares del 1 al 20 uno al lado del otro separados por /
         for(int i=1; i<=20; i++){
             if(i%2==0) System.out.print(i+"/");
         }
         
         //Ejercicios:
          /*
         Una persona desea invertir $10.000 en un banco, 
         el cual le otorga un %2 de interés mensual.
         ¿Cuál será la cantidad de dinero que esta persona
         tendrá al cabo de un año?
         El primer mes tendrá un acumulado de $10.000 + $200 de interés
         (es el %2 de 10.000).
         En el segundo mes se le sumará un %2 a la base de $10.200 
         del mes anterior, y así sucesivamente.
         */
         
          /*
          Crear un programa que ingrese una oración 
          y muestre cuál es el caracter que más se repite.
          No se cuenta el espacio en blanco.
          La oración a ingresar no debe estar vacía.
          */
        
    }
    
}

