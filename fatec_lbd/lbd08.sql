

select nome, email, 'vendedor' from vendedor union
select nome, email, 'cliente' from cliente 
order by nome;
select nome, email, 'vendedor' from vendedor union all
select nome, email, 'cliente' from cliente;
select nome, email from vendedor where (nome, email) not in (select nome, email from cliente);
select nome, email from vendedor where (nome, email) in (select nome, email from cliente);
