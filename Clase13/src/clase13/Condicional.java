

package clase13;


public class Condicional {
    public static void main(String[] args) {
        //Condicionales
        
        //Estructura if
        System.out.println("**Estructura if**");
        
        int nro1 = 20;
        int nro2 = 10;
        
        /*
        estructura:
        if(){ -> en esta línea va la condición a evaluar, dentro de los paréntesis
            acá van las sentencias, dentro del cuerpo del if
        } esta llave indica el final de la estructura del if
        aquí continúa el resto del programa
        */
        
        if(nro1 > nro2){
            System.out.println("El primer número es mayor que el segundo");
        }
        System.out.println("Fin de la estructura if");
        
        
        if(nro1 == nro2){
            System.out.println("Ambos números son iguales"); //añ ser falsa la condición
            //no se ejecuta esta línea
        }
        
        
        if (nro1 != nro2) {
            System.out.println("Ambos números son distintos");
        }
        
        
        boolean log1 = false;
        
        if (!log1){
            System.out.println("Log1 es verdadero");
        }
        
        
        //también se puede escribir en línea si sólo ejecutamos una sentencia
        if (nro1 > 10) System.out.println("El número 1 es mayor a 10.");
        
        if (nro1 == 20  &&  !log1) System.out.println("El nro1 es igual a 20 y log1 es verdadero");
        
        //si se ejecutan más de una sentencia dentro del if, no se puede hacer en línea
        
        
        System.out.println("**Estructura if-else**");
        //en caso de que la condición fuera falsa, se ejecuta el cuerpo del else
        
        nro2 += 100;
        if (nro1 > nro2){
            System.out.println("El nro1 es mayor al nro2");
        }else {
            System.out.println("El nro1 no es mayor al nro2");
        }
        
        //también se puede escribir en línea si solo ejecutamos una sentencia
        if (10 > 50) System.out.println("El primer número es mayor al segundo.");
        else System.out.println("El primer número no es mayor que el segundo.");
        
        
        /*
        Ejercicio if-else
        dado un usuario="pepito" y una contraseña="1234"
        informar:
        si ingresó bien ambos datos: "Bienvenido pepito!!"
        de lo contrario: "ERROR - credenciales incorrectas"
        */
        
        String usuario = "pepito";
        String clave = "1234";
        
        if (usuario.equals("pepito") && clave.equals("1234") ) {
            System.out.println("Bienvenido pepito!!");
        } else {
            System.out.println("ERROR - credenciales incorrectas");
        }
        
        
        System.out.println("**Estructura if-else if-else**");
        
        //Determinar cuál es el mayor número
        nro1 = 15;
        nro2 = 30;
        
        if (nro1 > nro2) {
            System.out.println("El nro1 es mayor al nro2.");
        } else if (nro2 > nro1){
            System.out.println("El nro2 es mayor al nro1.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
        int edad = 60;
        String genero = "femenino";
        
        if (edad >= 65  && genero.equals("masculino")){
            System.out.println("Puede jubilarse");
        } else if (edad >= 60 && genero.equals("femenino")){
            System.out.println("Puede jubilarse");
        } else {
            System.out.println("No puede jubilarse");
        }
        
        
        
        
        
        
    }
}
