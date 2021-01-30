/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

package VetoresMatrizes;

import java.util.Scanner;

public class Dado {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		int limite = 10, vezes[] = new int[limite], x, maior=0;
		double lanc = 0, soma = 0, media;

		System.out.println("Um dado foi lançado 10 vezes, vamos anotar seus valores ");

		for (x = 0; x < limite; x++) {

			System.out.printf("Informe o valor do %d° lançamento: ", (x + 1));
			vezes[x] = ler.nextInt();
				
			if(vezes[x]==6) {
				maior++;
			}
			
			soma = soma + vezes[x];
			lanc++;
		}

		for (x = 0; x < limite; x++) {

			System.out.printf("\nO valor anotado no primeiro %d° lançamento foi: %d ", (x + 1), vezes[x], "\n");

		}
		

		
		media = soma / lanc;
		System.out.println("\n\nA média dos lançamentos foi: " + media);
		System.out.println("\n\nA maior pontuação teve: " + maior+" ocorrências!");
	}
}
