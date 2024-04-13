use biblioteca;
insert into categorialeitor(codigo, nome, dias)
values(1,'Alunos', 14);
insert into categorialeitor(codigo, nome, dias)
values(2,'Professor', 21);
insert into categorialeitor(codigo, nome, dias)
values(3,'Visitante', 7);

insert into categoriaobra(codigo, nome)
values(1, 'Livros'), (2, 'Revistas'), (3, 'Artigos');

insert into funcionario(nome, documento, email, telefone,
cidade, logradouro, cep, senha)
values('Maria da silva', '345345435','maria@norton.net.br',
'2344-2344', 'São Paulo', 'Rua Frei joao, 59', '3453345',
md5('123456')),
('João souza', '345345435','joao@norton.net.br',
'2345-2344', 'São Paulo', 'Av. Vergueiro 2344', '3456745',
md5('654321')),
('Maria Antonieta', '378935','ma.antonieta@norton.net.br',
'2678-2344', 'São Paulo', 'rua bom pastor, 345', '34534',
md5('abcd'));

insert into leitor(nome, documento, email, telefone,
cidade, logradouro, cep, senha, categoriaLeitor)
values('Mariana Lima', '345345435','mariana@norton.net.br',
'2344-2344', 'São Paulo', 'Rua Frei joao, 59', '3453345',
md5('123456'),1),
('Joana suzi', '345345435','joana@norton.net.br',
'2345-2344', 'São Paulo', 'Av. Vergueiro 2344', '3456745',
md5('654321'),2),
('Mario Antonio', '378935','ma.antonio@norton.net.br',
'2678-2344', 'São Paulo', 'rua bom pastor, 345', '34534',
md5('abcd'),3);


insert into obra(titulo, autor, isbn, editora, categoriaObra)
values('Java', 'peters', '345345345', 'Fatec', 1),
('Oracle', 'Vijay', '3343345', 'Fatec', 1),
('Mysql', 'Mary Jane', '67995345', 'Fatec', 1);
 
 insert into copia(descritivo, obra) 
 values('', 1), ('', 1), ('', 1),
 ('', 2), ('', 2), 
 ('', 3), ('', 3), ('', 3);
 

insert into reserva(dataReserva, dataRetirada, leitor, obra)
values(now(), now()+7,1,1),
(now(), now()+7,2,2),
(now(), now()+7,3,3);

insert into emprestimo(dataEmprestimo, dataPrevista, leitor, 
copia, funcionario) 
values('2024-03-12', '2024-04-01', 1, 1, 1),
('2024-03-20', '2024-04-10', 2, 2, 2),
('2024-03-25', '2024-04-15', 2, 3, 3);

select date_add(now(),interval 7 day) from dual;