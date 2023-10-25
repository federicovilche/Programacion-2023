
package clase19;

import java.util.Scanner;

public class Clase19 {

    public static void main(String[] args) {
        System.out.println("*** Funciones y Procedimientos ***");
        
        /*
        La funciones y procedimientos son un bloque de codigos que contiene 
        una o más instrucciones, al cual podemos invocar para que que sean 
        ejecutadas. Las funciones Y Los procedimientos nos van a ayudar a
        hacer nuestro código más legible y evitar codigo duplicado
        */
        System.out.println("** Funciones **");
        /*
        Los metodos de tipo función siempre retornan un valor.
        En su declaración deben indicar que tipo de valor retornan.
        En su cuerpo debe contener la sentencia 'return' con el retorno
        del tipo de dato que se indicó en su cabecera.
        */
        
        int numero1=retornarNumeroDiez(); //llamar o invocar al método
        System.out.println(numero1);
        System.out.println(retornarNumeroDiez());
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Por favor ingrese un número entero: ");
        int primerNumero=teclado.nextInt();
        System.out.println("Por favor ingrese otro número entero: ");
        int segundoNumero=teclado.nextInt();
        
        System.out.println("La suma de los dos números enteros ingresados es de: ");
        System.out.println(sumarDosEnteros(primerNumero, segundoNumero));
        
        
        
    } //final del metodo main
    
    public static int retornarNumeroDiez(){
        return 10; // el return debe retornar el mismo tipo de dato 
        //declarado en la firma del método
    }
    public static int sumarDosEnteros(int num1,int num2){
        return num1+num2;
    }    
    }//final de la clase
    
    

