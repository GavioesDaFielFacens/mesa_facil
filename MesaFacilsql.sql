drop database if exists MesaFacil;
create database MesaFacil;
use MesaFacil;

create table Usuario(
id			int			primary key			auto_increment,
nome		varchar(50)	not null unique,
senha		varchar(30)	not null unique,
email		varchar(50) not null
);

create table Mesas(
id			int			primary key			auto_increment,
qtdLugares	varchar(10)	not null,
numMesa		varchar(10)	not null,
obs			varchar(50)
);

select * from Usuario;
select * from Mesas;

