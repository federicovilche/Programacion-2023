/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase10casa;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Clase10casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola! Bienvenido a los ejercicios de Tecnicas de programacion SMATA clase número 10. Presione ENTER para comerzar:");
        System.out.println("A continuacion ingrese el primero y presione enter");
        int n1 = teclado.nextInt();
        System.out.println("A continuacion ingrese el segundo y presione enter"); 
        int n2 = teclado.nextInt();
        System.out.println("A continuacion ingrese el tercer y presione enter");
        int n3 = teclado.nextInt();
        
        
        
         
        /*
Solicitar al usario que ingrese dos números.
Devolver el primer número aumentado en 17
y el segundo número decrementado en 10
*/

        System.out.println("Ejercicio 2");
        System.out.println("ingrese dos numeros");
        System.out.println("A continuacion ingrese el primer número entero y presione enter"); 
        n1 =+17;
        System.out.println("el primero número aumentado en 17 da" + n1);
        
        System.out.println("A continuacion ingrese el segundo número entero y presione enter"); 
        n2 -=10;
        System.out.println("el segundo número decrementado en 10 da " + n2);
        
        
        System.out.println("Solicitar al usuario que ingrese la base y la altura de un rectángulo e informar el área del rectángulo y el perímetro del rectángulo.");


 
        System.out.println("Ejercicio 3");
        System.out.println("Para calcular el perimetro y area de un rectangulo");
        System.out.println("ingrese la base de un rectangulo");
        double base = teclado.nextDouble();
        System.out.println("ingrese la altura de un rectangulo");
        double altura = teclado.nextDouble();
        
        double area = base*altura;
        System.out.println("El area del rectangulo es " + area);
        
        double perimetro = 2*(area+base);
        System.out.println("el perimetro del rectangulo es  "+ perimetro);
        
        
        System.out.println("Solicitar al usuario que ingrese el radio de un círculo e informar el área:");

        
        System.out.println("calcular el radio de un circulo");
        
        System.out.println("ingrese el radio de un circulo");
        double radio = teclado.nextDouble();
       System.out.println("el radio del circulo es " + radio);
         
       //final double pi = 3.14;
       //double areaCirculo=pi*(radio*radio);
        //System.out.println("el area del circulo " +areaCirculo);
        
        double areaCirculo=Math.PI*Math.pow(radio, 2);
        System.out.println("El área de un circulo es de: "+areaCirculo);
        
        //pi es una constante de la clase Math que representa el valor de pi 
        //pow// es un metodo de la clase Math que se utiliza para elevar un 
        //número a una potencia. El primer parámetro es el valor a elevar y
        //el segundo parámetro es la potencia.
        
        /* Se pide que ingrese por consola dos párrafos y muestre por pantalla lo siguiente:
    1. Los párrafos, ¿son iguales con el operador relacional ==?
    2. Los párrafos, ¿poseen el mismo contenido? Sin importar si están en mayúsculas o
    minúsculas.
    3. Mostrar los párrafos en mayúsculas.
    4. Mostrar los párrafos en minúsculas.
    5. Mostrar la primera letra en mayúscula de cada párrafo.
    6. Unir los párrafos con una coma.
*/
        System.out.println("ingrese en la consola dos parrafos");
        System.out.println("Por favor, ingrese un parrafo y presione enter");      
        
        String parrafo1 =  teclado.nextLine();
        System.out.println("Por favor, ingrese otro parrafo y presione enter");
        String parrafo2 =  teclado.nextLine();
        boolean condicion =parrafo1==parrafo2;
        
        System.out.println("Respuesta consigna 1");
        System.out.println("El resultado de comparar ambos parrafos"+ "con el operador == es:"+condicion);
  
        System.out.println("\nRespuesta consigna 2");
        System.out.println("El resultado de comparar el contenido de "
        + "ambos parrafos de acuerdo a su contenido es: "+condicion);
        
        System.out.println("\nRespuesta consigna 3 ");
        System.out.println("El parrafo 1 en mayúscula es:\n "+parrafo1.toUpperCase());
        System.out.println("El parrafo 2 en mayúscula es:\n "+parrafo1.toUpperCase());
        System.out.println("\nRespuesta consigna 4");
        System.out.println("El parrafo 1 en minúscula es:\n "+parrafo1.toLowerCase());
        System.out.println("El parrafo 2 en minúscula es:\n "+parrafo2.toLowerCase());
        System.out.println("\nRespuesta consigna 5");
        String primeraMayuscula=parrafo1.substring(0,1).toUpperCase()+parrafo1.substring(1).toLowerCase();
        System.out.println("\nRespuesta consigna 6 ");
        System.out.println(parrafo1+", "+parrafo2);
 
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
