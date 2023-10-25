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
        Crear un programa que simule la petici�n de
        una opci�n seg�n el siguiente men� y muestre
        en pantalla que ha ingresado a la opci�n
        seleccionada con las opciones siguientes:

        �Gracias por contactarte con nosotros!
        �En qu� podemos ayudarte?
        A) Documentaci�n
        B) Cotizaci�n
        C) Asistencia
        D) Siniestros
        E) Informaci�n de Pagos
        F) Otras Consultas
        G) Anulaci�n
        Escribe la letra de la opci�n seleccionada.

        Debe mostrarse:
        Has elegido Documentaci�n (o la opci�n que haya elegido)
        */
        
        Scanner teclado = new Scanner(System.in);
        
        char opcion;
        
        System.out.println("�Gracias por contactarte con nosotros!\n" +
"        �En qu� podemos ayudarte?\n" +
"        A) Documentaci�n\n" +
"        B) Cotizaci�n\n" +
"        C) Asistencia\n" +
"        D) Siniestros\n" +
"        E) Informaci�n de Pagos\n" +
"        F) Otras Consultas\n" +
"        G) Anulaci�n\n" +
"        Escribe la letra de la opci�n seleccionada.");
        
        opcion = teclado.next().charAt(0);
        
        switch(opcion){
            case 'A','a': System.out.println("Has elegido Documentaci�n"); break;
            case 'B','b': System.out.println("Has elegido Cotizaci�n"); break;
            case 'C','c': System.out.println("Has elegido Asistencia"); break;
            case 'D','d': System.out.println("Has elegido Siniestros"); break;
            case 'E','e': System.out.println("Has elegido Informaci�n de Pagos"); break;
            case 'F','f': System.out.println("Has elegido Otras Consultas"); break;
            case 'G','g': System.out.println("Has elegido Anulaci�n"); break;
            default: System.out.println("Opci�n no v�lida. Por favor elije una opci�n v�lida");
        }
        
        /*
        Solicitar al usuario que ingrese dos n�meros.
        Luego ofrecerle un men� con las siguientes opciones:
        1-suma 2-resta 3-multiplicaci�n 4-divisi�n
        Finalmente, mostrar el resultado de la operaci�n
        aritm�tica elegida.
        */
        
        System.out.println("Por favor ingrese dos n�meros para operarlos aritm�ticamente.");
        System.out.println("Ingrese el primer n�mero y presione enter:");
        double nro1 = teclado.nextDouble();
//        int nro1 = teclado.nextInt();
        System.out.println("Ingrese el segundo n�mero y presione enter:");
        double nro2 = teclado.nextDouble();
//        int nro2 = teclado.nextInt();
        
        System.out.println("Qu� operaci�n aritm�tica precisa realizar con los n�meros ingresados?");
        System.out.println("Opci�n 1: suma\nOpci�n 2: resta\nOpci�n 3: multiplicaci�n\nOpci�n 4: divisi�n");
        System.out.println("Ingrese el n�mero de la opci�n que corresponda y presione enter:");
        int opciones = teclado.nextInt();
        
        //esta soluci�n no contempla el error de divisi�n por 0
        switch(opciones){
            case 1: System.out.println("Al sumar los n�meros ingresados, el resultado es:"+(nro1+nro2)); break;
            case 2: System.out.println("Al restar los n�meros ingresados, el resultado es:"+(nro1-nro2)); break;
            case 3: System.out.println("Al nultiplicar los n�meros ingresados, el resultado es:"+(nro1*nro2)); break;
            case 4: System.out.println("Al dividir los n�meros ingresados, el resultado es:"+(nro1/nro2)); break;
            default: System.out.println("El n�mero ingresado no es una opci�n v�lida.");
        }
        
        /*
         Una persona desea invertir $10.000 en un banco, 
         el cual le otorga un %2 de inter�s mensual.
         �Cu�l ser� la cantidad de dinero que esta persona
         tendr� al cabo de un a�o?
         El primer mes tendr� un acumulado de $10.000 + $200 de inter�s
         (es el %2 de 10.000).
         En el segundo mes se le sumar� un %2 a la base de $10.200 
         del mes anterior, y as� sucesivamente.
         */
        
        System.out.println("####################################\n");
        double monto = 10000;
        System.out.println("Usted ha invertido: $"+monto);
        double interes = 2;
        int mes = 1;
        double total = 0;
        
        while(mes <= 12){
            System.out.println("Su inter�s inicial en este mes es de: "
                    + ""+Math.round(monto));
            System.out.println("El inter�s en el mes "+mes+" es del %"+interes);
            double interesMensual = monto/100*interes;
            total += interesMensual;
            System.out.println("Que representa una ganancia de $"+Math.round(interesMensual));
            System.out.println("----------------------------------------------");
            monto += interesMensual;
            mes++;
        }
        
        System.out.println("El inter�s total ganado fue de: $"+Math.round(total));
        System.out.println("Su capital actual es de $"+Math.round(monto));
        
       /*
          Crear un programa que ingrese una oraci�n 
          y muestre cu�l es el caracter que m�s se repite.
          No se cuenta el espacio en blanco.
          La oraci�n a ingresar no debe estar vac�a.
        */
        
        System.out.println("########################"); 
       
        String oracion ="";
        
        //utilizamos el do-while para asegurarnos de que se ingrese
        //una oraci�n que no sea vac�a
        do {
            System.out.println("Ingrese una oraci�n y presione enter. La misma no puede estar vac�a.");
            oracion = teclado.nextLine();
            if(oracion.isBlank()) System.out.println("La oraci�n est� vac�a.\nPor favor ingrese una oraci�n con contenido.");
        } while (oracion.isBlank());
       //el m�todo isBlank() determina si una cadena de caracteres est� vac�a
       //o si s�lo contiene espacios en blanco y/o tabulaciones
       
       //declaro una variable para almacenar el caracter que m�s se repita
       //en principio lo inicializo con el primer caracter de la oraci�n
       //el m�todo charAt() devuelve el caracter que se encuentra en la 
       //posici�n que se le indica como par�metro.
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
           
           //contamos cu�ntas veces se repite el caracter en la oraci�n
           for(int j=i+1; j<oracion.length(); j++){
               if(oracion.charAt(j) == caracter) recuento++;
           }
           
           //comprobamos si es el caracter m�s repetido hasta ahora
           //si lo es, reemplazamos los valores generales
           if(recuento>cantidadDeRepeticiones){
               cantidadDeRepeticiones = recuento;
               caracterMasRepetido = caracter;
           }          
       }
       
        System.out.println("El caracter m�s repetido (sin contar los espacios) es: "+caracterMasRepetido);
        System.out.println("Que se repite "+cantidadDeRepeticiones+" veces.");
       
       
       
    }
    
}
