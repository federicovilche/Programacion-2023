-- 1- Crear la tabla facturas dentro de la base de datos, con el siguiente detalle:

-- campos		tipo
-- letra		char y PK
-- numero 		int y PK
-- fecha		date
-- monto		double

-- PK siginifica Primary Key
-- en este caso se declara una clave primaria compuesta
-- es decir, (letra,codigo)

drop database if exists cursomysql;

create database cursomysql;

use cursomysql;

drop table facturas;
create table facturas(
	letra enum('A','B','C'),
    numero int unsigned,
    fecha date not null,
    monto double not null,
    check (letra in ('A','B','C')),
    primary key(letra, numero)
);

describe facturas;

/*
Crear la tabla articulos dentro de la base de datos con el siguiente detalle:
	codigo		int y PK
    nombre		varchar(50)
    precio		double
    stock		int
*/

create table articulos(
	codigo int primary key,
    nombre varchar(50) not null,
    precio double not null,
    stock int not null
);

describe articulos;

-- insertar registros en la tabla facturas
insert into facturas (letra, numero, fecha, monto) values ('A',1,curdate(),12500);
insert into facturas (letra, numero, fecha, monto) values ('A',2,curdate(),12500);
insert into facturas (letra, numero, fecha, monto) values ('B',1,curdate(),12500);
insert into facturas (letra, numero, fecha, monto) values ('C',1,'2023-09-04',50000);
-- insert into facturas (letra, numero, fecha, monto) values ('J',1,'2023-08-09',90000);
insert into facturas (letra, numero, fecha, monto) values ('B',2,'2023-01-19',1500);
-- si se cargan todos los campos y en orden, no es necesario describirlos antes:
insert into facturas values ('B',3,'2023-01-19',1500);

-- insertar registros en la tabla articulos
insert into articulos values (1, 'alfajorcito',1000,7);
insert into articulos values (2, 'papitas', 1500, 20);
insert into articulos values (3, 'caramelos', 100, 2000);
insert into articulos values (4, 'agua', 500, 50);
insert into articulos values (5, 'gaseosa', 1200,200); 





