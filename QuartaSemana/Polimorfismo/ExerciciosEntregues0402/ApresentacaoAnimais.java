package Polimorfismo1;

import java.util.Scanner;

import Polimorfismo.Animal;

public class ApresentacaoAnimais {

	public static void main (String args[]) {
		
		int x;
		Scanner ler = new Scanner(System.in);
		
		Cachorro1 cachorro = new Cachorro1();
		Cavalo1 cavalo = new Cavalo1();
		Preguica1 preguica = new Preguica1();
		
		
		System.out.println("Olá, tudo bem? Vamos escolher um animal para emitir seu som? Escolha abaixo:\n\n"
				+ " 1 - Cachorro\n 2 - Cavalo \n 3 - Preguiça\n");
		x = ler.nextInt();
		
		if (x==1) {
			System.out.println("\nSom emitido:\n");
			cachorro.emitirSom();
		}
		
		else if (x==2) {
			
			System.out.println("\nSom emitido:\n");
			cavalo.emitirSom();
		}
		
		else {
			
			System.out.println("\nSom emitido:\n");
			preguica.emitirSom();
		}
		
	}
}

