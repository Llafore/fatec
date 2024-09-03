DROP DATABASE IF EXISTS clinica;
CREATE DATABASE clinica;
USE clinica;

CREATE TABLE paciente (
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    telefone VARCHAR(12),
    genero VARCHAR(20),
    idade INT
);

CREATE TABLE  medico(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    telefone VARCHAR(12),
    crm INT,
    especialidade VARCHAR(50)
    );

CREATE TABLE consulta (
	codigo INT PRIMARY KEY AUTO_INCREMENT,
    data datetime,
	medico_id INT,
    paciente_id INT,
    historico varchar(800),
    status varchar (12),
	FOREIGN KEY (medico_id) REFERENCES medico(codigo),
    FOREIGN KEY (paciente_id) REFERENCES paciente(codigo)
);

CREATE TABLE receita (
codigo INT PRIMARY KEY AUTO_INCREMENT,
consulta_id int,
data date,
desconto float,
FOREIGN KEY (consulta_id) REFERENCES consulta(codigo)
);

INSERT INTO paciente (nome, telefone, genero, idade)
VALUES 
    ('João da Silva', '11999999999', 'Masculino', 35),
    ('Maria Pereira', '11888888888', 'Feminino', 28),
    ('Pedro Santos', '11777777777', 'Masculino', 42),
    ('Ana Oliveira', '11666666666', 'Feminino', 50),
    ('Carlos Rodrigues', '11555555555', 'Masculino', 25),
    ('Fernanda Souza', '11444444444', 'Feminino', 32),
    ('Gustavo Almeida', '11333333333', 'Masculino', 48),
    ('Luiza Santos', '11222222222', 'Feminino', 21),
    ('Rafael Costa', '11111111111', 'Masculino', 38),
    ('Beatriz Silva', '11000000000', 'Feminino', 29)
;

INSERT INTO medico (nome, telefone, crm, especialidade)
VALUES 
    ('Dr. José da Silva', '11999999999', 123456, 'Cardiologia'),
    ('Dra. Maria Pereira', '11888888888', 789012, 'Pediatria'),
    ('Dr. Pedro Santos', '11777777777', 345678, 'Ortopedia'),
    ('Dra. Ana Oliveira', '11666666666', 901234, 'Ginecologia'),
    ('Dr. Carlos Rodrigues', '11555555555', 567890, 'Neurologia'),
    ('Dra. Fernanda Souza', '11444444444', 123456, 'Dermatologia'),
    ('Dr. Gustavo Almeida', '11333333333', 789012, 'Oftalmologia'),
    ('Dra. Luiza Santos', '11222222222', 345678, 'Psiquiatria'),
    ('Dr. Rafael Costa', '11111111111', 901234, 'Urologia'),
    ('Dra. Beatriz Silva', '11000000000', 567890, 'Endocrinologia')
;

INSERT INTO consulta (data, medico_id, paciente_id, historico, status)
VALUES 
    ('2023-03-15 10:00:00', 1, 1, 'Paciente relata dor no peito.', 'Agendada'),
    ('2023-03-16 14:30:00', 2, 2, 'Criança com febre alta.', 'Concluída'),
    ('2023-03-17 16:00:00', 3, 3, 'Queixa de dor no joelho.', 'Cancelada'),
    ('2023-03-18 09:00:00', 4, 4, 'Consulta de rotina.', 'Agendada'),
    ('2023-03-19 11:30:00', 5, 5, 'Dor de cabeça constante.', 'Concluída'),
    ('2023-03-20 15:00:00', 6, 6, 'Problemas de pele.', 'Agendada'),
    ('2023-03-21 17:00:00', 7, 7, 'Consulta de acompanhamento.', 'Concluída'),
    ('2023-03-22 10:30:00', 8, 8, 'Ansiedade e depressão.', 'Agendada'),
    ('2023-03-23 14:00:00', 9, 9, 'Problemas urinários.', 'Concluída'),
    ('2023-03-24 16:30:00', 10, 10, 'Controle de diabetes.', 'Agendada')
;

INSERT INTO receita (consulta_id, data, desconto)
VALUES 
    (1, '2023-03-15', 0.10),
    (2, '2023-03-16', 0.05),
    (3, '2023-03-17', 0.00),
    (4, '2023-03-18', 0.15),
    (5, '2021-06-19', 0.08),
    (6, '2021-06-20', 0.02),
    (7, '2021-06-21', 0.12),
    (8, '2021-06-22', 0.07),
    (9, '2021-06-23', 0.04),
    (10, '2021-06-24', 0.09)
;

CREATE INDEX idx_nome ON paciente (nome);
CREATE INDEX idx_data ON consulta (data);

SELECT * FROM consulta WHERE data BETWEEN '2023-03-14 10:00:00' AND '2023-03-19 10:00:00';

SELECT * FROM paciente WHERE nome like '%SILVA%';

CREATE VIEW vw_consultas AS
	SELECT p.nome AS 'paciente', m.nome AS 'medico', c.* 
	FROM consulta AS c
    LEFT JOIN paciente AS p 
		ON p.codigo = c.paciente_id
    INNER JOIN medico as m
		ON m.codigo = c.medico_id;