package POO;

public class ApresentacaoCliente {

	public static void main (String args[]) {
		
		Cliente cliente1 = new Cliente("Ricardo",28,"Analitico","Java",2021,"Desenvolvimento","POO","ricardo@java.com.br");
		System.out.println("Nome: "+cliente1.getNomeCliente());
		System.out.println("Idade: "+cliente1.getIdadeCliente());
		System.out.println("Perfil: "+cliente1.getPerfilCliente());
		System.out.println("Endereco: "+cliente1.getEnderecoCliente());
		System.out.println("Email: "+cliente1.getEmailCliente());

	}
}
