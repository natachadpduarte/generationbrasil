/*Atividade 4
Crie um banco de dados para um serviço de um açougue, o nome do banco deverá ter o
seguinte nome db_cidade_das_carnes, onde o sistema trabalhará com as informações dos
produtos desta empresa.*/

CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;


/*O sistema trabalhará com 2 tabelas tb_produto e tb_categoria. Siga exatamente esse passo a passo:
Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desse açougue.*/

CREATE TABLE tb_categorias (
id INT AUTO_INCREMENT NOT NULL,
categoria VARCHAR(100),
tipo VARCHAR(50),
marca VARCHAR(100),
PRIMARY KEY (id));


/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não
esqueça de criar a foreign key de tb_categoria nesta tabela).*/


CREATE TABLE tb_produto (
id_produto INT AUTO_INCREMENT NOT NULL,
tipo_de_corte VARCHAR(100),
preco real,
kg decimal(3,2),
ideal_para VARCHAR(100),
categoria_id INT,

PRIMARY KEY (id_produto),
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id));


/*Popule esta tabela Categoria com até 5 dados.*/

INSERT INTO tb_categorias (categoria,tipo,marca) VALUES
('Premium','Carne bovina','Friboi'),
('Especial','Carne Suina','Marmoreio'),
('Tradicional','Avina','Swift'),
('Especial','Suina','Celeiro'),
('Tradicional', 'Suina', 'Sadia');


/*Popule esta tabela Produto com até 8 dados.*/

INSERT INTO tb_produto (tipo_de_corte, preco, kg,ideal_para, categoria_id) VALUES
('Filé Mignon','60.00','1','Assados','1'),
('Fraldinha',37.55,'1','Cozidos',1),
('Maminha',38.55,'1','Churrasco',2),
('Contra filé',40.45,'1','Assado',2),
('Bisteca Suina',35.48,'1','Assado',5),
('Sobrecoxa',25.48,'1','Cozidos',3),
('Costela',30.48,'1','Assados',4),
('Asa',18.48,'0.5','Assados',3);



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
WHERE tipo_de_corte LIKE 'C%'
ORDER BY preco ASC;

/*Faça um um select com Inner join entre tabela categoria e produto.*/
SELECT * FROM tb_produto p
INNER JOIN tb_categorias c ON (p.categoria_id=c.id);


/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).*/

SELECT * FROM tb_produto p
INNER JOIN tb_categorias c ON (p.categoria_id=c.id)
WHERE c.categoria IN ('Premium')
ORDER BY c.categoria ASC;