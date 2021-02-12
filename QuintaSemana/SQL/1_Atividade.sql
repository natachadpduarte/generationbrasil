/*Atividade 1
Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos funcionários desta empresa. 
*/
CREATE DATABASE minha_empresa;

USE minha_empresa;

/*Crie uma tabela de funcionários e utilizando a habilidade de abstração e determine 5 atributos relevantes dos funcionários 
para se trabalhar com o serviço deste RH.*/
CREATE TABLE funcionarios (

id int NOT NULL AUTO_INCREMENT,
nome VARCHAR(40) NOT NULL,
sobrenome VARCHAR(40) NOT NULL,
idade int NOT NULL,
endereco VARCHAR (50) NOT NULL,
departamento VARCHAR (20) NOT NULL,
salario real NOT NULL,
PRIMARY KEY (id));

/*Popule esta tabela com até 5 dados;*/
INSERT INTO funcionarios (nome, sobrenome, idade, endereco, departamento, salario) VALUES 
('Bruno','Cardoso','40','Rua das pedras n°06 Bairro Pedreira','RH','1800'),
('Renata','Soares','35','Rua das flores n°09 Bairro Laranjeira','RH','1900'),
('Stevan','Drumond','28','Rua Java n°01 Bairro POO','Desenvolvimento','3500'),
('Giovana','Camargo','26','Rua Dev n°100 Bairro POO','Desenvolvimento','1800'),
('Clarice','Santos','28','Rua da programação n°240 Bairro POO','Desenvolvimento','5000');


/*SELECIONANDO TODA TABELA*/
SELECT * FROM funcionarios;


/*Faça um select que retorne os funcionários com o salário maior do que 2000.*/
SELECT * FROM funcionarios
WHERE salario>2000;

/*Faça um select que retorne os funcionários com o salário menor do que 2000.*/
SELECT * FROM funcionarios
WHERE salario<2000;


SET SQL_SAFE_UPDATES = 0;

/*Ao término atualize um dado desta tabela através de uma query de atualização. (Mudei o salário da Giovana)*/
UPDATE funcionarios
SET salario = '4000'
WHERE nome ="Giovana";