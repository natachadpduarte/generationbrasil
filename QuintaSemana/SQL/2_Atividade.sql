/*Atividade 2
Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações dos produtos deste ecommerce. 
*/
CREATE DATABASE e_commerce;

USE e_commerce;

/*Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos relevantes dos produtos para 
se trabalhar com o serviço deste ecommerce.
*/
CREATE TABLE produtos (

id_produto int NOT NULL AUTO_INCREMENT,
produto VARCHAR(40) NOT NULL,
marca VARCHAR(40) NOT NULL,
modelo VARCHAR (20) NOT NULL,
cor VARCHAR (50) NOT NULL,
preco real NOT NULL,
PRIMARY KEY (id_produto));

/*Popule esta tabela com até 8 dados;*/
INSERT INTO produtos (produto, marca, modelo, cor, preco) VALUES 
('Celular','Asus','Zenfone 5','Prata','1300'),
('Celular', 'Xiaomi','Redmi Note 8','Azul','1274' ),
('Celular','Motorla', 'G9 Plus','Marrom','1799'),
('Celular','Samsung','Galaxy Note20','Preto','1169.79'),
('Celular','Iphone','12 Pro Max','Prata','8459'),
('MacBook','Apple','Air Led','Prata','5509.05'),
('Notebook','Asus','VivoBook 15','Preto','2652.44'),
('Notebook','Lenovo','Ideapad','Preto','3419'),
('Celular','Galaxy','Granduos','Branco','600');


/*SELECIONANDO TODA TABELA*/
SELECT * FROM produtos;


/*Faça um select que retorne os produtos com o valor maior do que 500.*/
SELECT * FROM produtos
WHERE preco > 500;

/*Faça um select que retorne os produtos com o valor menor do que 500.*/
SELECT * FROM produtos
WHERE preco < 500;


/*Ao término atualize um dado desta tabela através de uma query de atualização.(Mudei o preço do Galaxy GranDuos)*/
UPDATE produtos
SET preco = '450'
WHERE modelo ="GranDuos";