use biblioteca;

select ltr.nome as nomeLeitor, obra.titulo, rsv.dataReserva from reserva as rsv
inner join leitor as ltr
on rsv.leitor = ltr.codigo
inner join obra 
on obra.codigo = rsv.obra;

select ltr.nome as nomeLeitor, obr.titulo, cp.codigo as codigoCopia, fnc.nome as nomeFunc from emprestimo as empr
left join leitor as ltr
on empr.leitor = ltr.codigo
left join copia as cp
on cp.codigo = empr.copia
left join funcionario as fnc
on fnc.codigo = empr.funcionario
left join obra as obr
on obr.codigo = cp.obra;

select ltr.nome from leitor as ltr
left join reserva as rsv
on rsv.leitor = ltr.codigo
where rsv.codigo is null;

select ltr.nome from leitor as ltr
left join emprestimo as rsv
on rsv.leitor = ltr.codigo
where rsv.codigo is null;

select a.titulo from obra as a
left join copia as b
on b.obra = a.codigo
left join emprestimo as c
on b.codigo = c.copia
where c.codigo is null
group by a.titulo;