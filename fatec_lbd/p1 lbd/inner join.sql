SELECT 
    usu.nome, alu.id, alu.feedback, pgt.valor
FROM
    usuario AS usu
        INNER JOIN
    aluguel AS alu ON alu.id_usuario = usu.id
        INNER JOIN
    pagamento AS pgt ON alu.id_usuario = pgt.id_aluguel