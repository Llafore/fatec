DROP DATABASE IF EXISTS loja;
CREATE DATABASE loja;
USE loja;

CREATE TABLE cliente (
	id INT PRIMARY KEY,
    nome VARCHAR(80),
    data_nascimento DATE,
    cpf VARCHAR(11),
    cep VARCHAR(8),
    endereco VARCHAR(200)
);

CREATE TABLE pedido(
	id INT PRIMARY KEY,
    data_pedido DATE,
    id_cliente INT,
    v_pedido FLOAT,
    v_desconto FLOAT,
    v_frete FLOAT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

CREATE TABLE item(
	id INT PRIMARY KEY,
    nome VARCHAR(30),
    descricao VARCHAR(250)
);

CREATE TABLE itemPedido(
	id INT PRIMARY KEY,
	id_pedido INT,
    id_item INT,
    valor_itens float,
    FOREIGN KEY (id_pedido) REFERENCES pedido(id),
    FOREIGN KEY (id_item) REFERENCES item(id)
);

INSERT INTO cliente (id, nome, data_nascimento, cpf, cep, endereco) VALUES 
(1, 'Maria Silva', '1980-05-15', '12345678901', '12345678', 'Rua das Flores, 123'),
(2, 'João Oliveira', '1975-10-20', '23456789012', '23456789', 'Avenida Central, 456'),
(3, 'Ana Sousa', '1990-03-25', '34567890123', '34567890', 'Praça da Liberdade, 789');

INSERT INTO pedido (id, data_pedido, id_cliente, v_pedido, v_desconto, v_frete) VALUES 
(1, '2024-04-01', 1, 100.00, 10.00, 5.00),
(2, '2024-04-02', 2, 150.00, 15.00, 7.50),
(3, '2024-04-03', 3, 200.00, 20.00, 10.00);

INSERT INTO item (id, nome, descricao) VALUES 
(1, 'Camisa', 'Camisa de algodão, tamanho M'),
(2, 'Calça', 'Calça jeans, tamanho 36'),
(3, 'Tênis', 'Tênis esportivo, número 40');

INSERT INTO itemPedido (id, id_pedido, id_item, valor_itens) VALUES 
(1, 1, 1, 50.00),
(2, 1, 2, 30.00),
(3, 2, 2, 40.00),
(4, 2, 3, 60.00),
(5, 3, 1, 70.00);

