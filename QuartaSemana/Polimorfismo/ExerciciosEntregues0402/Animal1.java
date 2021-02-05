package Polimorfismo1;

public abstract class Animal1 {

	private String nome;
	private int idade;
	private String emitirSom;
	private String acao;

	
	public Animal1(String nome, int idade, String som, String acao) {
		
		this.nome=nome;
		this.idade=idade;
		this.emitirSom=emitirSom;
		this.acao=acao;

	}
	
	
	abstract public void emitirSom();
	
	
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

	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	
	
	
}

