use biblioteca;
/*1-faça uma consulta usando inner join com o titulo de todos os empréstimos e nome dos leitores do tipo alunos no período do ultimo mês de março.*/
SELECT 
    ob.titulo, ltr.nome
FROM
    categorialeitor AS cl
        INNER JOIN
    leitor AS ltr ON ltr.categoriaLeitor = cl.codigo
        INNER JOIN
    emprestimo AS emp ON ltr.codigo = emp.leitor
        LEFT JOIN
    copia AS cp ON emp.copia = cp.codigo
        LEFT JOIN
    obra AS ob ON cp.obra = ob.codigo
WHERE
    cl.nome = 'Alunos'
        AND DATE_FORMAT(dataEmprestimo, '%y-%b') = '24-mar'
;
/*2-faça uma consulta com a quantidade de copias e nome das obras que no titulo contenha a palavra JAVA*/
SELECT 
    COUNT(cp.codigo), ob.titulo
FROM
    obra AS ob
        INNER JOIN
    copia AS cp ON cp.obra = ob.codigo
WHERE
    ob.titulo LIKE '%JAVA%'
GROUP BY ob.titulo
;
/*3-faça uma consulta que mostre o nome dos funcionários que nunca participaram de um empréstimo no período do ultimo ano.*/
SELECT 
    func.nome as "Funcionarios Fantasma"
FROM
    funcionario AS func
        LEFT JOIN
    emprestimo AS emp ON emp.funcionario = func.codigo
WHERE
    emp.funcionario IS NULL
;
/*4-faça uma consulta que traga todos as obras que são do tipo 1 e 2 */
SELECT 
    *
FROM
    obra
WHERE
    categoriaObra IN (1 , 2)	;