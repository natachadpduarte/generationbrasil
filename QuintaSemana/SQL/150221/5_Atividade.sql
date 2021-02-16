/*Atividade 5
Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome
do banco deverá ter o seguinte nome db_construindo_a_nossa_vida, onde o sistema
trabalhará com as informações dos produtos desta empresa.*/

CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

/*O sistema trabalhará com 2 tabelas tb_produto e tb_categoria. Siga exatamente esse passo a passo:
Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.*/

CREATE TABLE tb_categoria (
id INT AUTO_INCREMENT NOT NULL,
categoria VARCHAR(110),
marca VARCHAR(50),

PRIMARY KEY (id));


/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos
(não esqueça de criar a foreign key de tb_categoria nesta tabela).*/

CREATE TABLE tb_produto (
id_produto INT AUTO_INCREMENT NOT NULL,
nome_produto VARCHAR(50),
preco real,
quantidade VARCHAR(50),
categoria_id INT,

PRIMARY KEY (id_produto),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id));


/*Popule esta tabela Categoria com até 5 dados.*/

INSERT INTO tb_categoria (categoria, marca) VALUES
('Areia','Jacuzzi'),
('Pedra','Brita'),
('Tijolo envelhecido','Portobello'),
('Cimento','Votoram'),
('Martelo','Tramontina');


/*Popule esta tabela Produto com até 8 dados.*/

INSERT INTO tb_produto (nome_produto,preco,quantidade,categoria_id) VALUES
('Cimento Aditivado Pozolânico','26.79','50Kg','4'),
('Cimento de Alto Forno','22.40','20Kg','4'),
('Ardósia','60.65','25Kg','2'),
('Tijolo','45.32','15Kg','3'),
('Martelo pena','28.32','5','5'),
('Martelo Unha com cabo de fibra','29.32','12','5'),
('Martelo Unha com cabo fibra de vidro','50.32','20','5'),
('Martelo Unha Petróleo ','52.32','22','5');


/*Faça um select que retorne os Produtos com o valor maior do que 50 reais.*/
SELECT * FROM tb_produto
WHERE preco> 50.00
ORDER BY preco ASC;


/*Faça um select trazendo os Produtos com valor entre 3 e 60 reais.*/
SELECT * FROM tb_produto
WHERE preco BETWEEN '3.00' AND '60.00'
ORDER BY preco ASC;


/*Faça um select utilizando LIKE buscando os Produtos com a letra C.*/

SELECT * FROM tb_produto
WHERE nome_produto LIKE 'C%'
ORDER BY nome_produto ASC;

/*Faça um um select com Inner join entre tabela categoria e produto.*/

SELECT * FROM tb_produto b
INNER JOIN tb_categoria c ON (c.id=b.categoria_id);


/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria hidráulica).*/
SELECT * FROM tb_produto b
INNER JOIN tb_categoria c ON (c.id=b.categoria_id)
WHERE c.categoria IN ('Martelo')
ORDER BY b.nome_produto;