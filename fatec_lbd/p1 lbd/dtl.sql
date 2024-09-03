INSERT INTO maquina (diponivel) VALUES 
('S'),
('S'),
('N'),
('S'),
('N');

INSERT INTO catalogo (id_maquina, tipo_maquina, descricao, especificacao_tec) VALUES 
(1, 'Escavadeira', 'Escavadeira de pequeno porte', 'Motor a diesel, capacidade de escavação de 1 metro cúbico por minuto'),
(2, 'Trator', 'Trator agrícola', 'Motor a gasolina, tração nas quatro rodas, potência de 100 HP'),
(3, 'Guindaste', 'Guindaste móvel', 'Capacidade de carga de 50 toneladas, lança telescópica'),
(4, 'Caminhão Betoneira', 'Caminhão betoneira', 'Capacidade de mistura de 6 metros cúbicos, motor a diesel'),
(5, 'Retroescavadeira', 'Retroescavadeira de médio porte', 'Motor a diesel, capacidade de escavação de 0,5 metros cúbicos por minuto');

INSERT INTO usuario (cpf, nome, data_nasc) VALUES 
('12345678901', 'João da Silva', '1990-05-15'),
('23456789012', 'Maria Santos', '1985-10-20'),
('34567890123', 'Pedro Oliveira', '1982-03-25'),
('45678901234', 'Ana Costa', '1978-07-30'),
('56789012345', 'José Pereira', '1995-12-05');

INSERT INTO suporte (equipe, nome) VALUES 
('01', 'Equipe de Suporte 01'),
('02', 'Equipe de Suporte 02'),
('03', 'Equipe de Suporte 03'),
('04', 'Equipe de Suporte 04'),
('05', 'Equipe de Suporte 05');

INSERT INTO atendimento (id_suporte, id_usuario, motivo, resolucao) VALUES 
(1, 1, 'Problema com a máquina', 'Troca de peça realizada com sucesso'),
(2, 2, 'Dúvida sobre funcionamento', 'Dúvida esclarecida'),
(3, 3, 'Erro no sistema', 'Atualização do sistema realizada com sucesso'),
(4, 4, 'Manutenção preventiva', 'Máquina revisada e em perfeito funcionamento'),
(5, 5, 'Problema no motor', 'Substituição do motor realizada com sucesso');

INSERT INTO aluguel (id_usuario, id_maquina, data_aluguel, data_devolucao, retirada_ou_entrega, feedback, nota) VALUES 
(1, 1, '2024-03-01 08:00:00', '2024-03-08', 'R', 'Ótima máquina, excelente desempenho', 5),
(2, 2, '2024-03-02 10:00:00', '2024-03-09', 'R', 'Máquina em boas condições', 4),
(3, 3, '2024-03-03 12:00:00', '2024-03-10', 'E', 'Máquina apresentou problemas', 3),
(4, 4, '2024-03-04 14:00:00', '2024-03-11', 'E', 'Entrega pontual, bom atendimento', 4),
(5, 5, '2024-03-05 16:00:00', '2024-03-12', 'R', 'Máquina danificada durante uso', 2);

INSERT INTO pagamento (id_aluguel, valor, tipo_pgt) VALUES 
(1, 800.00, 'Cartão de Crédito'),
(2, 700.00, 'Boleto Bancário'),
(3, 600.00, 'Transferência Bancária'),
(4, 750.00, 'Dinheiro'),
(5, 500.00, 'Cheque');

UPDATE maquina SET diponivel = 'N' WHERE id = 1;

UPDATE catalogo SET tipo_maquina = 'Trator Compacto' WHERE id = 1;

UPDATE usuario SET nome = 'João Silva' WHERE id = 1;

UPDATE suporte SET equipe = '02' WHERE id = 1;

UPDATE atendimento SET resolucao = 'Problema resolvido com sucesso' WHERE id = 1;

UPDATE aluguel SET nota = 3 WHERE id = 4;

UPDATE pagamento set valor = 850 UPDATE id_pgt = 1; 

