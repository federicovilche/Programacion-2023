
package clase03;

/**
 *
 * @author alumno
 */
public class Clase03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //tipo de dato var 
      //aparece a partir del JDK10
      //este tipo de dato indica que el dato real va a estar dado por la literal
      //de la primera asignación
      
      //var var1 = 100; //lo toma como int
      //var1 = "hola"; //ya no se puede cambiar el tipo de dato
      //var var2 = 'c'; //char
      //var var3 = "c"; //String
      //var var4 = true; //boolean
      //var var5 = 5.24f; //float
      //var var6 = 5.24; //double  

     //constantes
     //son similares a las variables, pero la diferencia es que su valor no se 
     //puede cambiar
     final double PI=3.14; //para declarar una constante debemos utilizar la palabra 
     //reservada "final"
     //por convencion utilizamos mayúsculas
     //PI=3.22; error, al ser constante no puede cambiar su valor
      
    System.out.println(System.getProperty("java.version"));
    String nombre = "Marcelo";
    String apellido = "López";
        System.out.println(nombre+" "+apellido);
        System.out.println("El nombre es "+nombre+" y el apellido es "+apellido);
        
        //Operadores aritméticos
        /*
        + suma
        - resta
        * multiplicación
        / división
        % múdulo o resto de la división
        son operadores binarios porque necesitan 2 operadores
        los operadores son numéricos y el resultado es numérico
        
        */
        
        int nro1=10;
        int nro2=2;
        
        System.out.println("suma: ");
        System.out.println(nro1+nro2);
        
        System.out.println("Resta: ");
        System.out.println(nro1+-nro2);
        
        System.out.println("multiplicación: ");
        System.out.println(nro1+nro2);
        
        System.out.println("División: ");
        System.out.println(nro1/nro2);
        
        System.out.println("Modulo: ");
        System.out.println(nro1%nro2);
        
        
        
        
        
        
    }
    
    
        
    
        
        
        
        
        
        
        
    }
    
}
