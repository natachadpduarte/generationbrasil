/*Atividade 6
Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco
deverá ter o seguinte nome db_cursoDaMinhaVida, onde o sistema trabalhará com as
informações dos produtos desta empresa.*/

CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;


/*O sistema trabalhará com 2 tabelas tb_curso e tb_categoria. Siga exatamente esse passo a passo:
Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste site de cursos onlines.*/

CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT NOT NULL,
categoria VARCHAR(100),
nivel VARCHAR(20),
area VARCHAR(100),
PRIMARY KEY (id_categoria));


/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de um site de cursos
onlines(não esqueça de criar a foreign key de tb_categoria nesta tabela).*/

CREATE TABLE  tb_produtos(
id_produto INT AUTO_INCREMENT NOT NULL,
nome_curso VARCHAR(500),
preco decimal (4,2),
idioma_curso VARCHAR(20),
duracao VARCHAR(10),
certificado_conclusao VARCHAR(3),
categoria_id INT NOT NULL,

PRIMARY KEY (id_produto),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id_categoria));


/*Popule esta tabela Categoria com até 5 dados.*/
INSERT INTO tb_categoria (categoria, nivel, area) VALUES 
('Lógica de programação','Básico', 'Desenvolvimento de sistemas'),
('Programação orientada a objeto','Avançado', 'Desenvolvimento de sistemas'),
('SQL e banco de dados','intermediário', 'Data Science'),
('Machine Learning','Básico', 'Data Science'),
('Métodos àgeis','Básico', 'Inovação e gestão');


/*Popule esta tabela Produto com até 8 dados.*/
INSERT INTO tb_produtos (nome_curso, preco, idioma_curso, duracao, certificado_conclusao, categoria_id) VALUES
('Começando na lógica de programação',18.00,'Português','4 horas', 'Sim', 1),
('Lógica de programação primeiros passos',20.00,'Português','5 horas', 'Sim', 1),
('Lógica de programação I: Os primeiros programas com Javascript e HTML',55.00,'Português','9 horas', 'Sim', 1),
('Lógica de programação II: pratique com desenhos, animações e um jogo',60.00, 'Português','8 horas', 'Sim', 1),
('Minecraft: Estruturas lógicas com redstone', 55.00, 'Português','8 horas', 'Não', 1),
('Java OO: Introdução à Orientação a Objetos',60.00,'Português','8 horas', 'Sim', 2),
('Java Polimorfismo: Entenda herança e interfaces',70.00,'Português','16 horas', 'Sim',2),
('Scraping com Python: Coleta de dados na web',45.00,'Inglês','10 horas', 'Sim',3),
('Machine Learning: Introdução a classificação com SKLearn',70.00,'Inglês','8 horas','Não',4),
('Kanban parte 1: Fundamentos Essenciais',80.00,'Inglês','6 horas','Sim',5);

SELECT * FROM tb_produtos;


/*Faça um select que retorne os Produtos com o valor maior do que 50 reais.*/
SELECT * FROM tb_produtos
WHERE preco> 50.00
ORDER BY preco ASC;


/*Faça um select trazendo os Produtos com valor entre 3 e 60 reais.*/
SELECT DISTINCT nome_curso, preco, idioma_curso, duracao, certificado_conclusao FROM tb_produto
WHERE preco BETWEEN 3.00 AND 60.00 
ORDER BY preco ASC;

/*Faça um select utilizando LIKE buscando os Produtos com a letra C.*/
SELECT * FROM tb_produto
WHERE nome_curso LIKE "C%";


/*Faça um um select com Inner join entre tabela categoria e produto.*/
SELECT DISTINCT t.nome_curso, t.preco, t.idioma_curso, t.duracao, t.certificado_conclusao, c.nivel, c.area, c.categoria
FROM tb_produto t
INNER JOIN tb_categoria c ON (t.categoria_id=c.id_categoria)
ORDER BY nome_curso ASC;

/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria Java).*/

SELECT * FROM tb_produtos t
INNER JOIN tb_categoria c ON (t.categoria_id=c.id_categoria)
WHERE categoria IN ('Programação orientada a objeto');