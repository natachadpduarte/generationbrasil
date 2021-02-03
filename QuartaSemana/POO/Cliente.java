/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class Cliente {

	/* Atributos */

	private String nomeCliente;
	private int idadeCliente;
	private String perfilCliente;
	private String ruaCliente;
	private int numeroCliente;
	private String bairroCliente;
	private String estadoCliente;
	private String emailCliente;

	
	/*Constructor*/
	
	public Cliente(String nome, int idade, String perfil, String rua, int numero, String bairro, String estado,
			String email) {
		nomeCliente = nome;
		idadeCliente = idade;
		perfilCliente = perfil;
		ruaCliente = rua;
		numeroCliente = numero;
		bairroCliente = bairro;
		estadoCliente = estado;
		emailCliente = email;

	}

	public String getEnderecoCliente() {

		String enderecoCliente = "Rua: " + ruaCliente + " n°: " + numeroCliente + " Bairro: " + bairroCliente
				+ " Estado: " + estadoCliente;
		return enderecoCliente;

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	public String getPerfilCliente() {
		return perfilCliente;
	}

	public void setPerfilCliente(String perfilCliente) {
		this.perfilCliente = perfilCliente;
	}

	public String getRuaCliente() {
		return ruaCliente;
	}

	public void setRuaCliente(String ruaCliente) {
		this.ruaCliente = ruaCliente;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getBairroCliente() {
		return bairroCliente;
	}

	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

}
