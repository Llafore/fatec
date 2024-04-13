select nome from leitor where cidade = 'São Paulo' order by email;
select nome from funcionario where cidade <> 'São Paulo' order by nome;
select sum(multa) as totalMultas, count(codigo) as totalLivrosEmprestados from emprestimo;
select funcionario,count(funcionario) from emprestimo group by funcionario ;
select leitor,count(leitor) from reserva group by leitor;