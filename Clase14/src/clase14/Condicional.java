package clase14;

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
        if (nro1 > nro2) {
            System.out.println("El primer número es mayor que el segundo");
        }
        System.out.println("Fin de la estructura if");

        if (nro1 == nro2) {
            System.out.println("Ambos números son iguales"); //añ ser falsa la condición
            //no se ejecuta esta línea
        }

        if (nro1 != nro2) {
            System.out.println("Ambos números son distintos");
        }

        boolean log1 = false;

        if (!log1) {
            System.out.println("Log1 es verdadero");
        }

        //también se puede escribir en línea si sólo ejecutamos una sentencia
        if (nro1 > 10) {
            System.out.println("El número 1 es mayor a 10.");
        }

        if (nro1 == 20 && !log1) {
            System.out.println("El nro1 es igual a 20 y log1 es verdadero");
        }

        //si se ejecutan más de una sentencia dentro del if, no se puede hacer en línea
        System.out.println("**Estructura if-else**");
        //en caso de que la condición fuera falsa, se ejecuta el cuerpo del else

        nro2 += 100;
        if (nro1 > nro2) {
            System.out.println("El nro1 es mayor al nro2");
        } else {
            System.out.println("El nro1 no es mayor al nro2");
        }

        //también se puede escribir en línea si solo ejecutamos una sentencia
        if (10 > 50) {
            System.out.println("El primer número es mayor al segundo.");
        } else {
            System.out.println("El primer número no es mayor que el segundo.");
        }

        /*
        Ejercicio if-else
        dado un usuario="pepito" y una contraseña="1234"
        informar:
        si ingresó bien ambos datos: "Bienvenido pepito!!"
        de lo contrario: "ERROR - credenciales incorrectas"
         */
        String usuario = "pepito";
        String clave = "1234";

        if (usuario.equals("pepito") && clave.equals("1234")) {
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
        } else if (nro2 > nro1) {
            System.out.println("El nro2 es mayor al nro1.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        int edad = 60;
        String genero = "femenino";

        if (edad >= 65 && genero.equals("masculino")) {
            System.out.println("Puede jubilarse");
        } else if (edad >= 60 && genero.equals("femenino")) {
            System.out.println("Puede jubilarse");
        } else {
            System.out.println("No puede jubilarse");
        }

        if (edad >= 65 && genero.equals("masculino") || edad >= 60 && genero.equals("femenino")) {
            System.out.println("Puede jubilarse");
        } else {
            System.out.println("No puede jubilarse");
        }
        System.out.println("**if anidado**");
        /*
        teniendo 3 números distintos, determinar cual es el mayor de los 3.
         */
        nro1 = 300;
        nro2 = 100;
        int nro3 = 500;
        if (nro1 > nro2) {
            if (nro1 > nro3) {
                System.out.println("El nro1 es el mayor");
            } else {
                System.out.println("El nro3 es el mayor");
            }
            if (nro2 > nro3) {
                System.out.println("El nro2 es el mayor");
            } else {
                if (nro2 > nro3) {
                    System.out.println("El nro3 es el mayor");

                    boolean TienePasaporte = true;
                    edad = 18;
                    if (TienePasaporte) {
                        if (edad >= 18) {
                            System.out.println("Puede viajar solo.");
                        } else {
                            System.out.println("Puede viajar, pero acompañado.");
                        }
                    } else {
                        System.out.println("No puede viajar.");
                    }
                }
                /* Ejercicio 1:
segun la edad de una persona, mostraremos los siguientes mensajes:
menos de 13 años eres un niño
entre 13 a 18 años: eres un adolecente
entre 19 a 42 eres un joven 
entre 43 y 70: eres maduro
mayor de 70: eres anciano
                
                
                
                 */

                edad = 20;

                if (edad < 13) {
                    System.out.println("Eres un niño");

                } else if(edad <= 18) {
                    System.out.println("Eres un adolecente");
                }else if (edad<=42)    
                    System.out.println("Eres un joven");
                }else if (edad<=70)
                    System.out.println("Eres maduro");
                }else if (edad<=70)
                    System.out.println("Eres anciano");
                }

                /*
                Ejercicio 2:
                Dada la siguiente tabla del tiempo, hacer un programa que indique que
                puede hacer una persona con dicho pronóstico:
                TEMPERATURA     TIEMPO      SUGERENCIA
                >25°            Soleado     caminar y tomar sol
                >15° y <=25°    Soleado     caminar
                <=15°           Soleado     caminar con campera
                <10°            lluvia      quedarse en casa o salir con paraguas y campera
                <10°            nieve
                 */
                }
            }

            //shift+alt+f acomoda las llaves y agrega si hay faltantes
        }
    }
