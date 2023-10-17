/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase05;

/**
 *
 * @author alumno
 */
public class Clase05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 String palabra= "Programacion";
 //String es una clase que representan una cadena de caracteres 
 // cada caracter ocupa un lugar de posicion 
 // las posiciones comienzan desde el nro 0
 String subPalabra=palabra.substring(3);
 // el numero que va entre parentesis es la posicion desde donde comenzara 
 //la subcadena 
        System.out.println(subPalabra);
// si pasamos 2 parametros al metodo, le estamos indicando desde donde y hasta
// donde queremos la subcadena

String subPalabra2=palabra.substring(5,8);
        System.out.println(subPalabra2);
        
// operadores de agignación 
/*
= igual (asignación)
+= suma y asignación 
-= resta y asignación
*= multiplicación y asignación
/= división y asignación 
%= modulo y asignación 
Son operadores binarios porque necesitan dos operandoa.
Asignan el valor a una variable y se la modifica utilizando una expresión
*/
        
int nro1=10;
int nro2=2;
        System.out.println(nro1); //nro1 vale 10
        nro1=12; //con el igual se le asigna el valor que esta en la derecha 
        System.out.println(nro1); //ahora vale 12
        nro1+=2; //con el += le estamos sumando 2 a la variable 
        //es lo mismo que hacer nro1=nro1+2;
        System.out.println(nro1); //ahora vale 14
        
        nro1-=2; // con el -= le estamos restando 2 al valor de la variable 
        System.out.println(nro1);   
        
        nro1*=2; //  multiplica el valor de la variable por 2 
        //es lo mismo que hacer nro1=nro1*2;
        System.out.println(nro1); //ahora vale 24
        
        nro1/=2; //divide el valor de la variable por 2
        System.out.println(nro1); //ahora vale 12
        
        nro1%=2; //le asigna a la variable el resto de la división entre nro1 y 2
        System.out.println(nro1); // ahora vale 0
        
        
        //OPERADORES INCREMENTABLES Y DECREMENTABLES
        /*
        ++ Incremento en 1
        -- decremento en 1 
        Son operadores unarios, trabajan con un solo operador.
        */
        nro1 ++; // vale 0 y ahora vale 1 
        // es lo mismo que nro1=nro1+1;
        // tambien es lo mismo que nro1+-1;
       
        System.out.println(nro1); 
        
        nro1--; //valia 1 y ahora vale 0
        // es lo mismo que nro1=nro1-1;
        //tambien es lo mismo que nro1-=1;
        System.out.println(nro1);
                
        //Operadores relacionales 
        /*
        > mayor
        < menor 
        >= mayor o igual
        <= manor o igual
        == igual
        != distinto
        Son operadores binarios.
        Los operadores son numericos y el resultado es booleano
       
                */
        
        nro1=15;
        nro2=20;
        System.out.println(nro1>nro2); //false
        
        System.out.println(nro1<nro2); //true
        System.out.println(nro1>=nro2); //false 
        System.out.println(nro1<=nro2); //true
        System.out.println(nro1==nro2); //false está comparando con ==
        System.out.println(nro1!=nro2); //true 
        
        
        
        
        
        
        
    }
    
}
