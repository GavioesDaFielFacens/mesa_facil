drop database if exists Park;
create database Park;
use Park;

create table Usuario(
id			int			primary key			auto_increment,
usuario		Varchar(50)	not null,
senha		varchar(30)	not null,
endereco	varchar(100),
cidade		varchar(50),
estado		varchar(50)
);
