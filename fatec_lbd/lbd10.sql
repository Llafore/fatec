-- 2-crie uma tabela chamada auditlog{codigo, nomeTabela, registroRemovido, data} 
create database if not exists teste;
use teste;
create table auditlog(codigo int primary key auto_increment, nomeTabela varchar(60) , registroRemovido varchar(600), data date);
-- 3-crie uma trigger para exclusão na tabela reserva que guarde na tabela auditlog os dados do registro removido
DELIMITER  $$
create trigger tgr_reserva before delete on reserva
for each row
begin
	insert into auditlog(nomeTabela, registroRemovido) 
    values
		('reserva', concat("codigo: ", old.codigo, " || ", "nome_clinete: ", old.nome_cliente, " || ", "data_reserva", old.data_reserva ));
end$$
DELIMITER  ;
-- 4-crie uma trigger para exclusão na tabela emprestimo que guarde na tabela auditlog os dados do registro removido
DELIMITER  $$
create trigger tgr_emprestimo before delete on emprestimo
for each row
begin
	insert into auditlog(nomeTabela, registroRemovido) 
    values
		('emprestimo', concat("codigo: ", old.codigo, " || ", "nome_clinete: ", old.nome_cliente, " || ", "data_reserva", old.data_emprestimo ));
end$$
DELIMITER  ;