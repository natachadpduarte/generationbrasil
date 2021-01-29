/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package LacosRepeticao;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		float n, soma = 0;

		do {
			System.out.println("Digite um número: ");
			n = ler.nextFloat();

			soma = soma + n;
		}

		while (n != 0);
		System.out.println("Digite um número: " + soma);
	}

}