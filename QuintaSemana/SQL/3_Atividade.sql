/*Atividade 3
Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos alunos deste registro dessa escola. 
*/
CREATE DATABASE escola;

USE escola;

/*Crie uma tabela alunos/a e utilizando a habilidade de abstração e determine 5 atributos relevantes dos alunos/a para se trabalhar 
com o serviço dessa escola.
*/
CREATE TABLE alunos  (
     id_aluno int NOT NULL AUTO_INCREMENT NOT NULL,
	 nome VARCHAR(40) NOT NULL,
	 sobrenome VARCHAR(40) NOT NULL,
	 idade int NOT NULL,
	 sala int NOT NULL,
	 professor VARCHAR(10) NOT NULL,
     nota int NOT NULL,
     PRIMARY KEY (id_aluno));
     
     
/*Popule esta tabela com até 8 dados;*/ 

INSERT INTO alunos (nome, sobrenome, idade, sala, professor,nota) VALUES 
('Reginaldo', 'Trajano','14','7','Renata','4' ),
('Lucas','Silva e Silva','12','4','Maria','9'),
('Reginaldo', 'Bastos','14','8','Renata','5' ),
('Marina','Chaves', '16','5','Luis','4'),
('Suelen','Trajano','10','2','Bianca','7'),
('Margareth','Dias','17','15','Debora','10'),
('Mateus','Gouvea','13','1','Rebeca',7),
('Aurelio','Santos','12','4','Maria','3'),
('Luiza','Silva','17','15','Debora','8');


/*SELECIONANDO TODA TABELA*/
SELECT * FROM alunos;


/*Faça um select que retorne o/as alunos/a com a nota maior do que 7.*/
SELECT * FROM alunos
WHERE nota > 7;


/*Faça um select que retorne o/as alunos/a com a nota menor do que 7.*/
SELECT * FROM alunos
WHERE nota < 7;


/*Ao término atualize um dado desta tabela através de uma query de atualização.(mudei a nota do Reginaldo Trajano de 4 para 8)*/
UPDATE alunos
SET nota = '8'
WHERE nome = 'Reginaldo'
AND sobrenome = 'Trajano'