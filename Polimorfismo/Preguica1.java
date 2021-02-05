package Polimorfismo1;

public class Preguica1 extends Animal1 {

	public Preguica1() {
		super("Flash", 3, "Não emite som", "subir em árvores");
		
	}


	@Override
	public void emitirSom() {
		System.out.println("Este animal não emite som");		
	}

}
