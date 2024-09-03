drop database if exists alugaMaquinas;
create database alugaMaquinas;
use alugaMaquinas;

create table maquina (
	id int primary key auto_increment,
    diponivel varchar(1)
);
create table catalogo (
	id int primary key auto_increment,
    id_maquina int ,
	tipo_maquina varchar(50),
    descricao varchar(250),
	especificacao_tec varchar(250),
    foreign key (id_maquina) references maquina(id)
);
create table usuario (
	id int primary key auto_increment,
    cpf varchar(11),
    nome varchar(80),
    data_nasc date
);
create table suporte(
	id int primary key auto_increment,
    equipe varchar(2),
    nome varchar(80)
);
create table atendimento(
	id int primary key auto_increment,
    id_suporte int,
    id_usuario int,
    motivo varchar(200),
    resolucao varchar(10000),
    foreign key (id_suporte) references suporte(id),
    foreign key (id_usuario) references usuario(id)
);
create table aluguel (
	id int primary key auto_increment,
    id_usuario int,
    id_maquina int,
    data_aluguel datetime,
    data_devolucao date,
    retirada_ou_entrega varchar(1),
    feedback varchar(500),
    nota int,
    foreign key (id_usuario) references usuario(id),
    foreign key (id_maquina) references maquina(id)
);
create table pagamento (
	id_pgt int primary key auto_increment,
    id_aluguel int,
    valor float,
    tipo_pgt varchar(80),
    foreign key (id_pgt) references aluguel(id)
);