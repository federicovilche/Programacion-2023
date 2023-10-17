use cursomysql;

-- Basándose en la tabla clientes realizar los siguientes puntos.

-- 1- 	Insertar 5 clientes en la tabla clientes dejando que el motor de la BD complete su código
insert into clientes (nombre, apellido, dni, direccion) values
('Fernando','Vilchez','46563222','Av Siempre Viva 123'),
('Nancy','ambriosio','88776666', null),
('Laura','Ponce','33336655',''),
('Agustin','Rueda','89898989','Freire 78'),
('Mariana','Aguirre','77441122','Salta 304');

-- 2-	Insertar 5 clientes en la tabla clientes utilizando los campos como parte de la sentencias,
-- es decir de la forma extendida. Completando todos los campos
select * from clientes;
insert into clientes (codigo, nombre, apellido, dni, direcion) values
(21,'Walter','White','44759810','Las Vegas 789'),
(30, 'El Chavo', 'Del 8','77441122',''),
(33,'Pablo','Picapiedra','96580000','Soler2356'),
(22,'Peter','Soler','85214466','Jujuy 202'),
(100,'Soledad','Dolores', '','Solari 123');

insert into clientes (nombre,apellido,dni,direccion) values
('Juan','Perez','88552222',null);

-- 3-	Actualizar el nombre del cliente 1 a Jose.
update clientes set nombre='Jose' where codigo=1;

-- 4-	Actualizar el nombre apellido y dni del cliente 3 a Pablo Fuentes 21053119
update clientes set nombre='Pablo',apellido='Fuentes', dni='21053119' where codigo=3;
select * from clientes where codigo=3;

-- 5-  Actualizar la dirección del cliente de código 2 a vacío
update clientes set direccion='' where codigo=2;
select * from clientes where codigo=2;

-- 6-	Actualizar las direcciones de los clientes de código 3, 5 y 7 a 'null'
update clientes set direccion=null where codigo in(3,5,7);
select * from clientes where codigo in (3,5,7);

-- 7-	Eliminar los clientes con apellido Perez.
delete from clientes where apellido='Perez';

-- 8-	Eliminar los clientes con dni que terminan en 0.
delete from clientes where dni like '%0';

-- 9-  Eliminar los clientes cuyo nombre contenga una r y su apellido termine en z
delete from clientes where  nombre like '%r%' and apellido like '%z';
select * from clientes;

-- Basandose se en la tabla artículos, realizar los siguientes puntos.
-- 	10- Aumentar un 20% los precios de los artículos con precio menor igual a 50.
update articulos set precio=precio*1.2 where precio <=50;
select * from articulos;

-- 	11- Aumentar un 15% los precios de los artículos con precio mayor a 50.
update articulos set precio=precio*1.15 where precio>50;

-- 	12- Bajar un 5% los precios de los artículos con precio mayor a 200.
update articulos set precio=precio*0.95 where precio>200;


-- 13- bajar el %50 del precio a los artículos que estén entre 20000 y 40000
update articulos set precio=precio/2 where precio between 20000 and 40000;


-- 14- aumentar el stock a 200 a todos aquellos productos que tengan el stock mayor a 0 y hasta 150
update articulos set stock=200 where stock>0 and stock<=150;

-- 	15- Eliminar los artículos con stock menor a 0.
delete from articulos where stock<0;

-- 16- eliminar todos los artículos cuyo precio sea mayor a $50.000
delete from articulos where precio>50000;


-- *************************************************************************************************************************
-- ALTER TABLE
-- modifica la estructura de una tabla


describe clientes;
-- agregar campos 
alter table clientes add edad smallint unsigned not null;
describe clientes;
select * from clientes ;

update clientes set edad =25 where codigo=1; 
update clientes set edad =35 where codigo=2; 
select * from clientes;

-- modificar campos 
alter table clientes modify edad tinyint unsigned;
describe clientes;

-- cambiar nombre a un campo
alter table clientes change edad antiguedad tinyint unsigned;
describe clientes;

-- borrar campos
alter table clientes drop antiguedad;
describe clientes;

-- eliminar la PK
-- para poder eliminar la PK, el campo de puede ser auto_increment 
-- alter table clientes drop primary key;
alter table clientes modify codigo int;
describe clientes;

-- agregar clave primaria 
alter table clientes add primary key(codigo);
describe clientes;
alter table clientes modify codigo int auto_increment;
describe clientes;

-- renombrar tablas 
rename table clientes to auxiliar, facturas to auxiliar2;
show tables;

rename table auxiliar to clientes, auxiliar2 to facturas;


