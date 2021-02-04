/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
String telefone;*/

package Heranca;

public class ApresentacaoPessoa {

		public static void main (String args[]) {
			
			Pessoa pessoaTeste = new Pessoa("Natacha",28,"Rua: Java n°10 / Bairro: Desenvolvimento / Estado: POO","1128763546");
			
			pessoaTeste.infoPessoa(); 
			pessoaTeste.valTelefone();
			
			
			
		}
}
