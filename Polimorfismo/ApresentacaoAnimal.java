package Polimorfismo1;

import Polimorfismo.Animal;

public class ApresentacaoAnimal_ver {

	public static void main (String args[]) {
		
		Cachorro1 cachorro = new Cachorro1();
		Cavalo1 cavalo = new Cavalo1();
		Preguica1 preguica = new Preguica1();
		
		
		Animal1[] animais = new Animal1[3];
		animais[0]=cachorro;
		animais[1]=cavalo;
		animais[2]=preguica;
		
		for(Animal1 animale:animais) {
			
			animale.emitirSom();
		}
	}
}
