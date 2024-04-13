drop database biblioteca;
create database biblioteca;
use biblioteca;

create table categoriaLeitor(
	codigo int primary key,
    nome varchar(100),
    dias int default(7)
);
create table categoriaObra(
	codigo int primary key,
    nome varchar(100)
);
create table funcionario(
codigo int primary key auto_increment,
nome varchar(100),
documento varchar(30),
email varchar(100) unique,
Telefone varchar(30),
cidade varchar(30),
Logradouro varchar(100),
cep char(8),
senha varchar(100)
);
create table leitor(
codigo bigint primary key auto_increment,
nome varchar(100),
documento varchar(30),
email varchar(100) unique,
Telefone varchar(30),
cidade varchar(100),
Logradouro varchar(100),
cep char(8),
senha varchar(100),
categoriaLeitor int
);
create table obra(
	codigo	bigint primary key auto_increment,
	titulo	varchar(100),
	autor 	varchar(100),
	Isbn	varchar(30),
	editora	varchar(100),
	Ano  int,
	Sinopse text,
	palavrasChaves varchar(100),
    categoriaObra int
);
create table copia(
	codigo bigint primary key auto_increment,
    descritivo varchar(100),
    disponivel char(1) default('N'),
    obra bigint 
);
create table reserva(
	codigo bigint primary key auto_increment,
	dataReserva datetime default(now()),
	dataRetirada datetime,
	dataPrevista datetime,
    leitor bigint,
    obra bigint
);
create table emprestimo(
codigo bigint primary key auto_increment,
dataEmprestimo datetime default(now()),
dataPrevista datetime,
dataDevolucao datetime,
multa decimal(18,2),
leitor bigint,
copia bigint,
funcionario int
);

alter table leitor add foreign key (categoriaLeitor) 
references categoriaLeitor(codigo);

alter table obra add foreign key (categoriaObra) 
references categoriaObra(codigo);

alter table copia add foreign key (obra) references
obra(codigo);

alter table reserva add foreign key (leitor) references
leitor(codigo);
alter table reserva add foreign key (obra) references
obra(codigo);

alter table emprestimo add foreign key (leitor) references
leitor(codigo);
alter table emprestimo add foreign key (funcionario) references
funcionario(codigo);
alter table emprestimo add foreign key (copia) references
copia(codigo);