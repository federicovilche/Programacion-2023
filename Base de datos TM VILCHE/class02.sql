-- esto es una línea de comentarios
-- es necesario dejar un espacio luego de --

/*
esto es un bloque de comentarios
se puede escribir en varias líneas
*/

# es otro tipo de comentario, pero no es ANSI
# sólo va a funcionar en MySQL

show databases; -- muestra las bases del servidor

SHOW DATABASES; -- las instrucciones se pueden escribir en mayúsculas
-- el lenguaje es NO CASE SENSITIVE
-- el ; es el terminador de sentencias

drop database if exists cursobd; 
-- elimina la base de datos si es que existe

create database cursobd;
-- crea la base de datos

create database if not exists cursobd;
-- crea la base de datos si no existe
 
show databases;

use cursobd;
-- entramos y activamos la base

show tables;
-- muestra las tablas de la base

-- creación de tabla
create table clientes(
	codigo int auto_increment,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    dni char (8) not null,
    direccion varchar(100),
    primary key (codigo)
);

-- la coma separa los campos
-- el ; termina la sentencia
-- not null significa que no admite nulos, es decir, que es campo obligatorio
-- primary key es la llave primaria que identifica al registro.

describe clientes;
-- realiza una descripción de los campos de la tabla

select * from clientes;
-- muestra todos los registros de la tabla clientes

drop table clientes;
-- eliminamos la tabla clientes

drop table if exists clientes;
-- elimina la tabla clientes si es que existe

create table if not exists clientes(
	codigo int auto_increment,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    dni char (8) not null,
    direccion varchar(100),
    primary key (codigo)
);
-- crea la tabla si no existe. Si existe, no hace nada.

show tables;

-- Insertar registros en una tabla

insert into clientes (nombre, apellido, dni, direccion) values
('Agustín','González','22333444','Paso 1521'),
('Jorge', 'García','56359874','Lanús 2042'),
('Malena','Fernández','33568568','España 123'),
('Juan', 'Gardoni', '98999888','Lavalle 1236'),
('Fernando','Flores','12345678','Belgrano 122');

select * from clientes;

-- ----------------------------------------------------

-- TIPOS DE DATOS MAS UTILIZADOS

-- ----------------------------------------------------

/*
Tipos de datos de texto mas utilizados 

CHAR -> Este tipo de datos lo utilizamos cuando sabemos cuantos caracteres se guardaran
Por ejemplo, si declaramos un tipo de dato CHAR de 20 posiciones, simepre va a guardar 20 bytes
nombre char(20); entre parentesis inticamos la lonhitud
|--------------------| -> 20 bytes
|maximiliano---------| -> 20 bytes
|carlos--------------| -> 20 bytes
|ana-----------------| -> 20 bytes

VARCHAR -> este tipo de dato lo utilizaremos cuando no sabemos la longitud del dato que se ingresara
nombre varchar(20);
|--------------------| -> 20 bytes
|maximiliano---------| -> 11 bytes + 1 bytes de aviso de longitud
|carlos--------------| -> 6 bytes + 1 bytes de aviso de longitud
|ana-----------------| -> 3 + 1 bytes de aviso de longitud
*/

/*
Tipos de datos numericos 


BIT o BOOL
guarda un entero que representa un valor de verdad.
Sirve para guardar valores logicos.
El cero representa el valor falso 
Y cualquier otro numero distinto de cero representa el valor de verdad 

TINYINT 
almacena un entero de 1 byte
|--------|--------|
-128     0        127

TINYINT (unsigned)
|--------|--------|
0                255

SMALLINT 
|--------|--------|
-32.768  0        32.767

SMALLINT(unsigned)
|--------|--------|
0                 65.535

INT(32 bits)
|--------|--------|
-2.147.483.648    2.147.483.647

INT(unsigned)
|--------|--------|
0                 4.294.967.295

BIGINT
es el valor  mas grande (64 bits)


FLOAT(son decimales de 32 bits)
almacena hasta 8 digitos
|--------|
Por ejemplo si quisiera hacer 
10/3
3.333333(el punto cuenta como un digito mas)

si hiciera 
100/3
33.33333
En este caso se desplazo el punto, por eso decimos que es punto flotante.
Se achica ña´precision decimal

DOUBLE (son decimales de 64 bits)
almacena hasta 17 digitos 
si hiciera 
10/3
3.333333333333333
ó
100/3
33.33333333333333

DECIMAL
Representa numeros decimales de precision fija, es una precision exacta.
La estructura es:
DECIMAL(m,n)
donde m es la cantidad de digitos que se tendra el numero en total
y n es la cantidad de digitos que utilizaran para representar los decimales
EJEMPLO
DECIMAL(10,2)
xxxxxxxx.xx(en este caso el putno no se considera un digito)
el mayor numero que puedo representar es 
99999999.99

En MySQL ocupa la longitud + 2 como cantidad de bytes
Siguiendo el ejemplo, ocuparia 12 bytes -> 10 + 2
*/
/*
Tipos de datos de fecha y hora

DATE 
ocupa 3 bytes y almacena una fecha
formato: YYYY-MM-DD
por ejemplo:'2023-08-30'

DATETIME
ocupa 8 bytes y guarda la fecha y la hora 
formato: YYYY-MM-DD  HH:MM:SS

TIME
ocupa 3 bytes y guarda la hora
formato: HH:MM:SS

YEAR(no es ANSI)
ocupa un byte y almacena años.
*/

-- El comando select nos sirve para traer registros de una tabla.
-- pero tambien lo podemos utilizar para imprimir menaajes en la consola 
select'hola mundo!';
-- tambien podemos realizar operaciones matematicas
select 2+2;
-- se puede agregar un alias a las consultas select
select 2 + 2  as 'Suma';
-- el "as" ya no es obligatorio
select 2+2 'uma'
