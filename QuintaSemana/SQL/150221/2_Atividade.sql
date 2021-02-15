/*Atividade 2
Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco
deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as
informações dos produtos desta empresa.*/

CREATE DATABASE pizzaria;
USE pizzaria;

/*O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.
siga exatamente esse passo a passo:
Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.*/

CREATE TABLE tb_categorias (
id int AUTO_INCREMENT NOT NULL,
categoria VARCHAR(20),
tipo VARCHAR(10),
tamanho VARCHAR(10),
PRIMARY KEY (id));

/*Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de
criar a foreign key de tb_categoria nesta tabela).*/

CREATE TABLE tb_pizza(
id_pizza int AUTO_INCREMENT NOT NULL,
sabor VARCHAR(100),
borda_recheada VARCHAR(10),
valor decimal(4,2),
refrigerante VARCHAR(3),
forma_pagamento VARCHAR(50),
id_categoria int,

PRIMARY KEY (id_pizza),
FOREIGN KEY (id_categoria) REFERENCES tb_categorias (id));


/*Popule esta tabela Categoria com até 5 dados.*/
INSERT INTO tb_categorias(categoria, tipo, tamanho) VALUES
('Pizzas especiais', 'Salgada', 'Grande'),
('Pizzas tradicionais', 'Salgada', 'Brotinho'),
('Pizzas tradicionais', 'Salgada', 'Grande'),
('Pizzas doces', 'Doce', 'Grande'),
('Pizzas de Frango', 'Salgada', 'Grande');

select * from tb_categorias;

/*Popule esta tabela pizza com até 8 dados.*/
INSERT INTO tb_pizza (sabor, borda_recheada, valor, refrigerante, forma_pagamento, id_categoria) VALUES
('Calabresa', 'Sim', '47.00','Sim','Cartão Crédito','1'),
('Moda da casa', 'Sim', '50.00','Sim','Cartão Crédito','1'),
('Moda do chefe', 'Não', '45.00','Não','Cartão Débito','2'),
('Frango catupiry', 'Sim', '43.00','Não','Dinheiro','5'),
('Quatro queijos', 'Não', '40.00','Sim','Dinheiro','3'),
('FranBacon', 'Sim', '39.00','Sim','Cartão Débito','5'),
('Prestigio', 'Sim', '50.00','Sim','Cartão Débito','4'),
('Doce de leite', 'Não', '48.00','Sim','Dinheiro','4'),
('Banana com canela', 'Sim', '29.00','Sim','Cartão Crédito','4');

select * from tb_pizza;

/*Faça um select que retorne os Produtos com o valor maior do que 45 reais.*/

SELECT * FROM tb_pizza
WHERE valor > 45.00;

/*Faça um select trazendo os Produtos com valor entre 29 e 60 reais.*/
SELECT * FROM tb_pizza
WHERE valor BETWEEN '29.00' AND '60.00';


/*Faça um select utilizando LIKE buscando os Produtos com a letra C.*/
SELECT * FROM tb_pizza
WHERE sabor LIKE "C%";


/*Faça um um select com Inner join entre tabela categoria e pizza.*/

SELECT * FROM td_categorias c
INNER JOIN tb_pizza p ON (c.id=p.id_categoria);


/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são pizza doce).*/
SELECT * FROM tb_categorias c
INNER JOIN tb_pizza p ON (c.id=p.id_categoria)
WHERE c.tipo IN ("doce");
