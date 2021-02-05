package Polimorfismo1;

public class Cachorro1 extends Animal1 {


	public Cachorro1() {
		super("Atila", 11, "AuAu", "correr");
		
	}


	@Override
	public void emitirSom() {
		System.out.println("Au Au");		
	}
	

}
