package POO;

public class ApresentacaoPaciente {

	public static void main (String args[]) {
		
		Paciente paciente1 = new Paciente ();
		
		paciente1.setNomePaciente("Maria");
		paciente1.setIdadePaciente(30);
		paciente1.setSexoPaciente("Feminino");
		paciente1.setAlturaPaciente(1.65);
		paciente1.setPesoPaciente(63);
		paciente1.setPatologiaPaciente("Cefaléia");
		
		System.out.println("Nome: "+paciente1.getNomePaciente());
		System.out.println("Idade: "+paciente1.getIdadePaciente());
		System.out.println("Sexo: "+paciente1.getSexoPaciente());
		System.out.println("Altura: "+paciente1.getAlturaPaciente());
		System.out.println("Peso: "+paciente1.getPesoPaciente());
		System.out.println("Patologia: "+paciente1.getPatologiaPaciente());
	}
}
