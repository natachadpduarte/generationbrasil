/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
String telefone;*/

package Heranca;

public class Pessoa {

	private String nome;
	private int idade;
	private String endereco;
	private String telefone;
	
	/*Constructor*/
	public Pessoa(String nome, int idade, String endereco, String telefone) {
		
		this.nome=nome;
		this.idade=idade;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void infoPessoa() {
		
		System.out.println("**************************************************************************************");
		System.out.println("Informações pessoais:\n");
		System.out.println("Nome: " + nome +"\nIdade: " + idade + " anos" + " \nEndereço: " + endereco + "\nTelefone: " +  telefone);
		
	}
	

	public void valTelefone() {
		
		if (getTelefone().length()>10) {
			
			System.out.println("\nTelefone inválido!!!\n\n***********************************************************************************\n");
			
		}
		else
		{
			System.out.println("\nTelefone válido!!!\n\n**************************************************************************************\n");
			
		

			
		}
	}
	
}
