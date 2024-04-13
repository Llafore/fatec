delete from emprestimo where codigo in (1,2,3);
delete from reserva where codigo = 1;
delete from funcionario where codigo = 1;
delete from leitor where codigo = 1;
delete from categorialeitor where codigo = 1;
delete from copia where obra = 1;
delete from obra where codigo = 1;
delete from categoriaobra where codigo = 2;

update categorialeitor set dias = (dias+3);
update emprestimo set multa = 0 where multa < 50;

begin;
delete from funcionario;
rollback;
