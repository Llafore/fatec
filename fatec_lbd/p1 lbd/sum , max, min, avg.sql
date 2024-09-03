select avg(nota) from aluguel group by id_usuario;
select max(valor), min(valor) from aluguel group by id_usuario;
select count(id) from aluguel group by id_usuario;