package Polimorfismo1;

public class Cavalo1 extends Animal1 {

	public Cavalo1() {
		super("Willy", 4, "hinn in in", "correr");
		
	}


	@Override
	public void emitirSom() {
		System.out.println("hinn in in");		
	}

}