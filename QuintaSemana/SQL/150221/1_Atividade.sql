/*Atividade 1
Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.*/

CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

/*O sistema trabalhará com 2 tabelas tb_personagem e tb_classe. Siga exatamente esse passo a passo:
Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes do Cargos para se trabalhar com o serviço desse game Online.*/

CREATE TABLE tb_classe (
id_classe int AUTO_INCREMENT NOT NULL,
poder_de_ataque double,
poder_de_defesa double,
habilidade VARCHAR(30),
PRIMARY KEY(id_classe));


/*Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_cargo nesta tabela).*/

CREATE TABLE tb_personagens (
id_personagens int AUTO_INCREMENT NOT NULL,
nome_personagem VARCHAR(30),
idade int,
sexo VARCHAR(10),
velocidade decimal(4,1),
dificuldade VARCHAR(15),
classe_id int NOT NULL,

PRIMARY KEY (id_personagens),
FOREIGN KEY (classe_id) REFERENCES tb_classe (id_classe));


/*Popule esta tabela classe com até 5 dados.*/
INSERT INTO tb_classe (poder_de_ataque,poder_de_defesa,habilidade) VALUES 
('1500','1200','Arqueiro'),
('2200','2000','Velocidade'),
('1900','2000','Invisibilidade'),
('2100','2100','Arqueiro'),
('1000','1300','Invisibilidade');

select * from tb_classe;

/*Popule esta tabela personagem com até 8 dados.*/
INSERT INTO tb_personagens (nome_personagem,idade,sexo,velocidade,dificuldade,classe_id) VALUES
('Charles','23','M','40.2','Hard', '2'),
('Bill','25','M','30.1','Medium', '1'),
('Ed','28','M','35.2','Hard', '1'),
('MiDory','20','F','25.2','Medium', '3'),
('Pandora','21','F','20.2','Easy', '5'),
('Halley','24','M','28.2','Medium', '3'),
('Charlote','26','F','35.2','Hard', '4'),
('Frank','19','M','22.2','Easy', '1');

select * from tb_personagens;

/*Faça um select que retorne os funcionários com o poder de ataque maior do que 2000.*/

SELECT p.id_personagens, p.nome_personagem, p.idade, p.sexo, p.dificuldade,c.id_classe,c.poder_de_ataque FROM tb_personagens p
INNER JOIN tb_classe c ON (p.classe_id=c.id_classe)
WHERE c.poder_de_ataque > 2000;

/*Faça um select trazendo os funcionários com poder de defesa entre 1000 e 2000.*/
SELECT * FROM tb_personagens p
INNER JOIN tb_classe c ON (p.classe_id=c.id_classe)
WHERE c.poder_de_defesa BETWEEN '1000' AND '2000'
ORDER BY c.poder_de_defesa ASC;


/*Faça um select utilizando LIKE buscando os personagens com a letra C.*/
SELECT p.nome_personagem FROM tb_personagens p
INNER JOIN tb_classe c ON (p.classe_id=c.id_classe)
WHERE p.nome_personagem LIKE "C%";

/*Faça um um select com Inner join entre tabela classe e personagem.*/
SELECT * FROM tb_personagens p
INNER JOIN tb_classe c ON (p.classe_id=c.id_classe)
ORDER BY nome_personagem;


/*Faça um select onde traga todos os personagem de uma classe específica (exemplo todos
os personagens que são arqueiros).*/

SELECT * FROM tb_personagens p
INNER JOIN tb_classe c ON (p.classe_id=c.id_classe)
WHERE c.habilidade IN ("Arqueiro")
ORDER BY nome_personagem;