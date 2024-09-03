SELECT 
    cat.tipo_maquina, maq.diponivel, alu.feedback
FROM
    maquina AS maq
        LEFT JOIN
    catalogo AS cat ON cat.id_maquina = maq.id
        LEFT JOIN
    aluguel AS alu ON alu.id_maquina = maq.id;
    