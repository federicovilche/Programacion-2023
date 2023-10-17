/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase06;

/**
 *
 * @author alumno
 */
public class Clase06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Tabla de verdad
    //Es una representación lógica de resultados   
    /*
    A   |   B   |   AND |   OR
    V   |   V   |   V   |   V
    V   |   F   |   F   |   V
    F   |   V   |   F   |   V
    F   |   F   |   F   |   F
    
    Negación (NOT)
    A   |   NOT
    V   |   F
    F   |   V
    
    
    */
        
    //Operadores lógicos
/*
    & AND ( y lógico)
    | OR (o lógico)
    ! NOT (negación)
    Lo operandos son booleanos.
    El resultado es booleano.
    
    */    
        boolean log1 =true;
        boolean log2=false;
    
        System.out.println("AND &&");
        System.out.println(log1 && log2); //false
        
        System.out.println("OR ||");
        System.out.println(log1 || log2);//true
        System.out.println("NOT !");
        System.out.println(!log1);//false
        System.out.println(!log2);//true
        
        // Un solo operador evalúa ambas condiciones
        //Al utilizar dos operadores, si con la primera condición
        //ya determinar el valor de verdad,
        //no evalúa la condición siguiente
        
        /*
        Dados n1=5, n2=10 y n3=20. Informar:
        a) n1+n2
        b) n3-n1
        c) n1*n3
        d) n3/n2
        */
        
        int n1=5;
        int n2=10;
        int n3=20;
        
        System.out.println("El resultado de n1+n2 es:");
        System.out.println(n1+n2);
        
        System.out.println("El resultado de n3-n1 es:");
        System.out.println(n3-n1);
        
        System.out.println("El resultado de n1*n3 es:");
        System.out.println(n1*n3);
        
        System.out.println("El resultado de n3/n2 es:");
        System.out.println(n3/n2);
        
        /*
        Dados n1=10, n2=20. Informar
        a) El total
        b) El promedio
        c) El resto entre n2 y n1
        */
        
        System.out.println("EL TOTAL DE n1 Y n2 es:");
        System.out.println(n1+n2);
        
        System.out.println("El promedio de n1 y n2 es:");
        System.out.println(n1+n2/2);
        
        System.out.println("El resto entre n1 y n2 es:");
        System.out.println(n1%n2);
        
        
                
        
        
    }
    
}
