/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase16;

import java.util.Scanner;

/**
 *
 * @author Aula 8 - Docente
 */
public class Clase16 {

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
        
        do{
            System.out.println("###################################################");
            System.out.println("Ingrese un número entero para sumar ó el 0 para salir:");
            numero = teclado.nextInt();
            if(numero>0) suma+=numero;
        }while(numero!=0);
        
        System.out.println("Usted ingresó el 0 para salir.");
        System.out.println("La suma de números positivos es: "+suma);
        
        
        
    }
    
}

