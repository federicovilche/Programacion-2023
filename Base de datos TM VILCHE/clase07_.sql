/*
Basándose en la tabla artículos, obtener los siguientes listados.
1- articulos con precio mayor a 1000
2- articulos con precio entre 2000 y 4000 (usar < y >)
3- articulos con precio entre 400 y 6000 (usar between)
4- articulos con precio = 2000 y stock mayor a 300
5- articulos con precio (1200,2000,3000) no usar in
6- articulos con precio (1200,2000,3000) usar in
7- articulos que su precio no sea (1200,2000,3000)
8- listar los articulos ordenados por precio de mayor a menor, y si hubiera
precios iguales deben quedar ordenados por nombre
9- listar todos los articulos incluyendo una columna denominada "precio con IVA", 
la cual deberá tener el monto con el iva del producto
10- listar todos los articulos incluyendo una columna denominada "cantidad de 
cuotas" y otra "valor de cuota", la cantidad es fija y es 3, el valor de cuota
corresponde a 1/3 del monto con un 5% de interés
*/

drop database if exists cursomysql;

create database cursomysql;

use cursomysql;

show databases;
create table articulos(

codigo int primary key,
    nombre varchar(50) not null,
    precio double not null,
    stock int not null
);
describe articulos;
-- insertar registros en la tabla articulos
insert into articulos values (1, 'Manubrio de Honda GLH',20000,3);
insert into articulos values (2, 'Porta celular manubrio',2000,9);
insert into articulos values (3, 'Aceite 10w30',2500,15);
insert into articulos values (4, 'Aceite 20w50',3000,10);
insert into articulos values (5, 'Parabrisas moto',15000,1);
insert into articulos values (6, 'USB para moto',4000,2);

-- selecciona todos los campos de aquellos registros cuyo precio sea mayor a 1000
select * from articulos where precio > 1000;
-- articulos con precio entre 2000 y 4000 (usar < y >)
select * from articulos where precio < 4001 and precio > 1999;
-- articulos con precio entre 400 y 6000 (usar between)
select * from articulos where precio between 400 and 6000;
-- articulos con precio = 2000 y stock mayor a 300
select * from articulos where precio = 2000 and stock < 299;
-- articulos con precio (1200,2000,3000) no usar in
select * from articulos where precio = 2000 or precio = 1200 or precio = 3000;
-- articulos con precio (1200,2000,3000) usar in
select * from articulos where precio in (1200,2000,3000);
-- articulos que su precio no sea (1200,2000,3000)
select * from articulos where precio not in (1200,2000,4000);
-- listar los articulos ordenados por precio de mayor a menor, y si hubiera precios iguales deben quedar ordenados por nombre
select * from articulos order by precio desc,nombre;
-- listar todos los articulos incluyendo una columna denominada "precio con IVA", 
-- la cual deberá tener el monto con el iva del producto
select nombre, (precio + (precio*0.21)) 'precio con IVA' from articulos;
select nombre, precio + precio*0.21 'precio con IVA' from articulos;
-- Forma recomendada
select nombre, precio, precio*1,21 'precio con IVA' from articulos;
select nombre, precio*1.21 'precio con IVA' from articulos;
select codigo, nombre, precio, precio*1.21 'precio con IVA', stock from articulos;
/*
listar todos los articulos incluyendo una columna denominada "cantidad de 
cuotas" y otra "valor de cuota", la cantidad es fija y es 3, el valor de cuota
corresponde a 1/3 del monto con un 5% de interés
*/
select codigo, nombre, stock, precio, 3 as 'Cantidad de cuotas', (precio*1.05)/3 'valor de cuotas' from articulos;