/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

package VetoresMatrizes;

import java.util.Scanner;

public class Pontuacao {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		int limite = 5;
		int vet[] = new int[limite], x;

		for (x = 0; x < limite; x++) {

			System.out.printf("Informe a %2d° primeira pontuação de %d: ", (x + 1), limite); 
			
			vet[x] = ler.nextInt();

		}


		int maior = vet[0];
		for (x = 0; x < limite; x++) {

			if (vet[x] > maior) {

				maior = vet[x];

			}
		}

		for (x = 0; x < limite; x++) {

			if (vet[x] == maior) {

				System.out.printf("A %2d° pontuaçao informada foi a de maior valor: %d\n", (x + 1), vet[x]);
			}

			else {
				
				System.out.printf("A %2d° pontuação informada foi: %d \n", (x + 1), vet[x]);
			}
		}

	}
}
