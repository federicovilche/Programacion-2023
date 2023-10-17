

package clase15;

import java.util.Scanner;


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
        
        int edad = 65;
        String genero = "masculino";
        
        if (edad >= 65  && genero.equals("masculino")){
            System.out.println("Puede jubilarse");
        } else if (edad >= 60 && genero.equals("femenino")){
            System.out.println("Puede jubilarse");
        } else {
            System.out.println("No puede jubilarse");
        }
        
        if (edad>=65 && genero.equals("masculino") || edad>=60 && genero.equals("femenino")){
            System.out.println("Puede jubilarse");
        } else {
            System.out.println("No puede jubilarse");
        }
        
        
        System.out.println("**if anidado**");
        
        /*
        Teniendo 3 números distintos, determinar cuál es el mayor de los tres.
        */
        
        nro1 = 3000;
        nro2 = 1000;
        int nro3 = 500;
        
        if (nro1 > nro2){
            if (nro1 > nro3){
                System.out.println("El nro1 es el mayor");
            } else {
                System.out.println("El nro3 es el mayor");
            }
        }else {
            if (nro2 > nro3){
                System.out.println("El nro2 es el mayor");
            }else {
                System.out.println("El nro3 es el mayor");
            }
        }
        
        boolean tienePasaporte = true;
        edad = 18;
        
        if (tienePasaporte){
            if (edad >= 18){
                System.out.println("Puede viajar solo.");
            }else {
                System.out.println("Puede viajar, pero acompañado");
            }
        }else {
            System.out.println("No puede viajar.");
        }
        
        /*
        Ejercicio1:
        Según la edad de una persona, mostraremos los siguientes mensajes:
        menos de 13 años: eres un niño
        entre 13 y 18 años: eres un adolescente
        entre 19 y 42 años: eres joven
        entre 43 y 70: eres maduro
        mayor de 70: eres anciano
        */
        edad = 71;
        
        if (edad < 13){
            System.out.println("Eres un niño");
        } else if (edad <= 18){
            System.out.println("Eres un adolescente");
        } else if (edad <= 42){
            System.out.println("Eres joven");
        } else if (edad <= 70){
            System.out.println("Eres maduro");
        } else {
            System.out.println("Eres anciano");
        }
        
        
        /*
        Ejercicio2:
        Dada la siguiente tabla del tiempo, hacer un programa que indique qué
        puede hacer una persona con dicho pronóstico:
        TEMPERATURA     TIEMPO      SUGERENCIA
        >25º            Soleado     caminar y tomar sol
        >15º y <=25º    Soleado     caminar
        <=15º           Soleado     caminar con campera
        <10º            Lluvia      quedarse en casa o salir con paraguas y campera
        <10º            Nieve       esquiar
        */
               
        int temperatura = 15;
        String tiempo = "soleado";
        
        if (temperatura > 25 && tiempo.equals("soleado")){
            System.out.println("caminar y tomar sol");
        } else if (temperatura > 15 && temperatura <= 25 && tiempo.equals("soleado")){
            System.out.println("caminar");
        } else if (temperatura <= 15 && tiempo.equals("soleado")){
            System.out.println("caminar con campera");
        } else if (temperatura < 10 && tiempo.equals("lluvia")){
            System.out.println("quedarse en casa o salir con paraguas y campera");
        } else if (temperatura < 10 && tiempo.equals("nieve")){
            System.out.println("esquiar");
        } 
        
        if (tiempo.equalsIgnoreCase("soleado")){
            if (temperatura > 25){
                System.out.println("caminar y tomar sol");
            } else if (temperatura > 15 && temperatura <= 25){
                System.out.println("caminar");
            } else {
                System.out.println("caminar con campera");
            }
        }
        
        if (tiempo.equalsIgnoreCase("lluvia") && temperatura < 10){
            System.out.println("quedarse en casa o salir con paraguas y campera");
        }
        
        if (tiempo.equalsIgnoreCase("nieve") && temperatura < 10){
            System.out.println("esquiar");
        }
        
        /*
        Ejercicio3:
        Solicitar al usuario que ingrese 3 números. 2 positivos y 1 negativo
        En cualquier orden.
        Luego, informar por pantalla, la multiplicación de los números que son positivos
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese 3 números a continuación. Que sean enteros, por favor.");
        System.out.println("Declarando dos números positivos y uno negativo. Presione enter luego de cada número");
        System.out.println("(en cualquier orden)");
        nro1 = teclado.nextInt();
        nro2 = teclado.nextInt();
        nro3 = teclado.nextInt();
        
        if (nro1 < 0 ){
            System.out.println("El resultado de la multiplicación de números positivos es: "+nro2*nro3);
        }else if (nro2 < 0){
            System.out.println("El resultado de la multiplicación de números positivos es: "+nro1*nro3);
        }else {
            System.out.println("El resultado de la multiplicación de números positivos es: "+nro1*nro2);
        }  

        
        System.out.println("**Operador ternario**");
        
        edad = 20;
        String mensaje;
        
        if (edad >= 18){
            mensaje = "Es mayor de edad";
        } else {
            mensaje = "No es mayor de edad!";
        }
        
        //operador ternario
        mensaje = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad!";
        
        System.out.println(mensaje);
        
        //si quisiéramos indicar un color de acuerdo al siguiente esquema:
        //1=Rojo 2=Azul 3=Celeste 4=Violeta (cualquier otro número)=Negro
        
        nro1 = 2;
        
        if (nro1 == 1){
            System.out.println("Rojo");
        } else if (nro1 == 2){
            System.out.println("Azul");
        } else if (nro1 == 3){
            System.out.println("Celeste");
        } else if (nro1 == 4){
            System.out.println("Violeta");
        } else {
            System.out.println("Negro");
        }
        
        System.out.println("**estructura switch**");
        //la estructura switch reemplaza a la estructura if-else if-else
        //el comando break genera un corte en la secuencia de comandos
        //y saca el código de la esructura
        //el valor por default es el valor por defecto si no encuentra 
        //coincidencia anteriormente
        //el default es opcional
        switch (nro1){
            case 1: System.out.println("Rojo"); break;
            case 2: System.out.println("Azul"); break;
            case 3: System.out.println("Celeste"); break;
            case 4: System.out.println("Violeta"); break;
            default: System.out.println("Negro");
        }
        
        int dia= 6;
        
        switch(dia){
            case 1: System.out.println("El día es lunes"); break;
            case 2: System.out.println("El día es martes"); break;
            case 3: System.out.println("El día es miércoles"); break;
            case 4: System.out.println("El día es jueves"); break;
            case 5: System.out.println("El día es viernes"); break;
            case 6: System.out.println("El día es sábado"); break;
            case 7: System.out.println("El día es domingo"); break;
            default: System.out.println("El día no existe"); 
        }
        
        
        //en los casos en los que no hay un break funcionaría como un OR
        
        String opcion = "s";
        
        switch (opcion){
            //toma la s minúscula y mayúscula
            case "s":
            case "S":
                System.out.println("Sale del sistema"); break;
            case "c":
            case "C":
                System.out.println("Continúa"); break;
            default:
                System.out.println("Opción no válida.");
        }
        
        switch (dia){
            case 1, 2, 3, 4, 5:
                System.out.println("Es día de semana."); break;
            case 6, 7:
                System.out.println("Es fin de semana!"); break;
            default:
                System.out.println("No es un día válido!!");
        }
        
        //la estructura switch no admite expresiones del tipo double, float ni long
        
        //expresiones switch a partir  de JDK 12
        //se reemplazan los : por las ->
        //se elimina la sentencia break
        
        mensaje = switch (dia){
            case 1 -> "El día es lunes";
            case 2 -> "El día es martes";
            case 3 -> "El día es miércoles";
            case 4 -> "El día es jueves";
            case 5 -> "El día es viernes";
            case 6 -> "El día es sábado";
            case 7 -> "El día es domingo";
            default -> "El día no existe!!";
        };
        
        
        
        
    }
}
