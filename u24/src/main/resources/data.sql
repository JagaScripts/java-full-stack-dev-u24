DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario integer
);

insert into empleado (nombre, trabajo, salario)values('Jose','Trabajo 1',1221);
insert into empleado (nombre, trabajo, salario)values('Juan','Trabajo 2',1222);
insert into empleado (nombre, trabajo, salario)values('Pedro','Trabajo 3',1233);
insert into empleado (nombre, trabajo, salario)values('Jordi','Trabajo 4',1234);
insert into empleado (nombre, trabajo, salario)values('Jonatan','Trabajo 5',1555);
