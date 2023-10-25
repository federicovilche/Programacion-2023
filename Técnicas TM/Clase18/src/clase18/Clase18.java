/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase18;

import java.util.Scanner;

/**
 *
 * @author Aula 8 - Docente
 */
public class Clase18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Crear un programa que simule la petición de
        una opción según el siguiente menú y muestre
        en pantalla que ha ingresado a la opción
        seleccionada con las opciones siguientes:

        ¡Gracias por contactarte con nosotros!
        ¿En qué podemos ayudarte?
        A) Documentación
        B) Cotización
        C) Asistencia
        D) Siniestros
        E) Información de Pagos
        F) Otras Consultas
        G) Anulación
        Escribe la letra de la opción seleccionada.

        Debe mostrarse:
        Has elegido Documentación (o la opción que haya elegido)
        */
        
        Scanner teclado = new Scanner(System.in);
        
        char opcion;
        
        System.out.println("¡Gracias por contactarte con nosotros!\n" +
"        ¿En qué podemos ayudarte?\n" +
"        A) Documentación\n" +
"        B) Cotización\n" +
"        C) Asistencia\n" +
"        D) Siniestros\n" +
"        E) Información de Pagos\n" +
"        F) Otras Consultas\n" +
"        G) Anulación\n" +
"        Escribe la letra de la opción seleccionada.");
        
        opcion = teclado.next().charAt(0);
        
        switch(opcion){
            case 'A','a': System.out.println("Has elegido Documentación"); break;
            case 'B','b': System.out.println("Has elegido Cotización"); break;
            case 'C','c': System.out.println("Has elegido Asistencia"); break;
            case 'D','d': System.out.println("Has elegido Siniestros"); break;
            case 'E','e': System.out.println("Has elegido Información de Pagos"); break;
            case 'F','f': System.out.println("Has elegido Otras Consultas"); break;
            case 'G','g': System.out.println("Has elegido Anulación"); break;
            default: System.out.println("Opción no válida. Por favor elije una opción válida");
        }
        
        /*
        Solicitar al usuario que ingrese dos números.
        Luego ofrecerle un menú con las siguientes opciones:
        1-suma 2-resta 3-multiplicación 4-división
        Finalmente, mostrar el resultado de la operación
        aritmética elegida.
        */
        
        System.out.println("Por favor ingrese dos números para operarlos aritméticamente.");
        System.out.println("Ingrese el primer número y presione enter:");
        double nro1 = teclado.nextDouble();
//        int nro1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número y presione enter:");
        double nro2 = teclado.nextDouble();
//        int nro2 = teclado.nextInt();
        
        System.out.println("Qué operación aritmética precisa realizar con los números ingresados?");
        System.out.println("Opción 1: suma\nOpción 2: resta\nOpción 3: multiplicación\nOpción 4: división");
        System.out.println("Ingrese el número de la opción que corresponda y presione enter:");
        int opciones = teclado.nextInt();
        
        //esta solución no contempla el error de división por 0
        switch(opciones){
            case 1: System.out.println("Al sumar los números ingresados, el resultado es:"+(nro1+nro2)); break;
            case 2: System.out.println("Al restar los números ingresados, el resultado es:"+(nro1-nro2)); break;
            case 3: System.out.println("Al nultiplicar los números ingresados, el resultado es:"+(nro1*nro2)); break;
            case 4: System.out.println("Al dividir los números ingresados, el resultado es:"+(nro1/nro2)); break;
            default: System.out.println("El número ingresado no es una opción válida.");
        }
        
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
        
        System.out.println("####################################\n");
        double monto = 10000;
        System.out.println("Usted ha invertido: $"+monto);
        double interes = 2;
        int mes = 1;
        double total = 0;
        
        while(mes <= 12){
            System.out.println("Su interés inicial en este mes es de: "
                    + ""+Math.round(monto));
            System.out.println("El interés en el mes "+mes+" es del %"+interes);
            double interesMensual = monto/100*interes;
            total += interesMensual;
            System.out.println("Que representa una ganancia de $"+Math.round(interesMensual));
            System.out.println("----------------------------------------------");
            monto += interesMensual;
            mes++;
        }
        
        System.out.println("El interés total ganado fue de: $"+Math.round(total));
        System.out.println("Su capital actual es de $"+Math.round(monto));
        
       /*
          Crear un programa que ingrese una oración 
          y muestre cuál es el caracter que más se repite.
          No se cuenta el espacio en blanco.
          La oración a ingresar no debe estar vacía.
        */
        
        System.out.println("########################"); 
       
        String oracion ="";
        
        //utilizamos el do-while para asegurarnos de que se ingrese
        //una oración que no sea vacía
        do {
            System.out.println("Ingrese una oración y presione enter. La misma no puede estar vacía.");
            oracion = teclado.nextLine();
            if(oracion.isBlank()) System.out.println("La oración está vacía.\nPor favor ingrese una oración con contenido.");
        } while (oracion.isBlank());
       //el método isBlank() determina si una cadena de caracteres está vacía
       //o si sólo contiene espacios en blanco y/o tabulaciones
       
       //declaro una variable para almacenar el caracter que más se repita
       //en principio lo inicializo con el primer caracter de la oración
       //el método charAt() devuelve el caracter que se encuentra en la 
       //posición que se le indica como parámetro.
       char caracterMasRepetido = oracion.charAt(0);
       //en esta variable voy a contar la cantidad de veces que se repite el caracter
       int cantidadDeRepeticiones = 0;
       
       //utilizamos la estructura for porque sabemos de antemano la cantidad
       //de iteraciones
       for (int i=0; i<oracion.length();i++){
           //almacenamos el caracter actual del recorrido
           char caracter = oracion.charAt(i);
           
           //ignoramos los espacios
           if(caracter == ' ') continue;
           
           //creamos un contador parcial
           int recuento = 1;
           
           //contamos cuántas veces se repite el caracter en la oración
           for(int j=i+1; j<oracion.length(); j++){
               if(oracion.charAt(j) == caracter) recuento++;
           }
           
           //comprobamos si es el caracter más repetido hasta ahora
           //si lo es, reemplazamos los valores generales
           if(recuento>cantidadDeRepeticiones){
               cantidadDeRepeticiones = recuento;
               caracterMasRepetido = caracter;
           }          
       }
       
        System.out.println("El caracter más repetido (sin contar los espacios) es: "+caracterMasRepetido);
        System.out.println("Que se repite "+cantidadDeRepeticiones+" veces.");
       
       
       
    }
    
}
