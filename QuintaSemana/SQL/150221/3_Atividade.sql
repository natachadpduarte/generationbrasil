/*Atividade 3
Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco
deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as
informações dos produtos desta empresa.*/

CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;


/*O sistema trabalhará com 2 tabelas tb_produto e tb_categoria. Siga exatamente esse passo a passo:
Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desta farmacia.*/

CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT NOT NULL,
nome_categoria VARCHAR(100),
tipo VARCHAR(100),
tratamento VARCHAR(100),
PRIMARY KEY(id_categoria));


/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não
esqueça de criar a foreign key de tb_categoria nesta tabela).*/


CREATE TABLE tb_produtos (
id_produto INT AUTO_INCREMENT NOT NULL,
nome_produto VARCHAR(55) NOT NULL,
marca VARCHAR(55) NOT NULL,
validade DATE NOT NULL,
qtd_disponivel INT NOT NULL,
uso_indicado VARCHAR(100) NOT NULL,
preco float,
categoria_id INT NOT NULL,

PRIMARY KEY(id_produto),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id_categoria));


/*Popule esta tabela Categoria com até 5 dados.*/
INSERT INTO tb_categoria (nome_categoria, tipo, tratamento) VALUES
('Medicamentos','Comprimido','Dor e colica'),
('Medicamentos','Comprimido','Dor de cabeça'),
('Medicamentos','Comprimido','Dor muscular'),
('Genéricos','Comprimido','Dor muscular'),
('Genéricos','xarope','Tosse'),
('Medicamentos','xarope','Tosse');

SELECT * FROM tb_categoria;


/*Popule esta tabela Produto com até 8 dados.*/
INSERT INTO tb_produtos(nome_produto, marca, validade, qtd_disponivel, uso_indicado, preco, categoria_id) VALUES
('Buscopan', 'Buscopan', '2021-12-19', '500', 'Adulto', 18.50, 2),
('ExpectoVita', 'Nutriativa', '2021-12-13', '20', 'Adulto', 172.50, 2),
('Dorflex Uno', 'Sanofi', '2022-02-15', '20', 'Adulto', 10.00, 2),
('Neosaldina', 'Neosaldina', '2022-01-19', '50', 'Adulto', 5.00, 1),
('Flanax', 'Bayer', '2021-12-18', '15', 'Adulto', 8.00, 2),
('Doril', 'Hypera Pharma', '2021-08-10', '25', 'Adulto', 5.00, 2),
('Paracetamol', 'Germed', '2021-09-11', '10', 'Adulto e pediátrico', 5.00, 3),
('Stodal', 'Boiron', '2022-03-11', '100', 'Adulto e pediátrico', 53.00, 5),
('Cloridrato de bromexina', 'Medley', '2022-04-16', '250', 'Adulto', 16.89, 4),
('Alivium', 'Alivium', '2021-04-13', '100', 'Adulto', 33.21, 1);


SELECT * FROM tb_produtos
order by nome_produto;

/*Faça um select que retorne os Produtos com o valor maior do que 50 reais.*/
SELECT * FROM tb_produtos
WHERE preco > 50.00;

/*Faça um select trazendo os Produtos com valor entre 3 e 60 reais.*/
SELECT * FROM tb_produtos
WHERE preco BETWEEN '3.00' AND '60.00'
ORDER BY nome_produto ASC;

/*Faça um select utilizando LIKE buscando os Produtos com a letra B.*/
SELECT * FROM tb_produtos
WHERE nome_produto LIKE 'B%';


/*Faça um um select com Inner join entre tabela categoria e produto.*/
SELECT * FROM tb_produtos p
INNER JOIN tb_categoria c ON (p.categoria_id=c.id_categoria)
ORDER BY nome_produto;


/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).*/
SELECT * FROM tb_produtos p
INNER JOIN tb_categoria c ON (p.categoria_id=c.id_categoria)
WHERE c.nome_categoria IN ('Medicamentos')
ORDER BY nome_produto;