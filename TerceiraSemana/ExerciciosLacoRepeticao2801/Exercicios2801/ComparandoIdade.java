/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package LacosRepeticao;

import java.util.Scanner;

public class ComparandoIdade {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		int x = 0, n, mais = 0, menos = 0;

		while (x != -99) {
			System.out.println("Informe sua idade: ");
			x = ler.nextInt();

			if (x >= 0 && x < 21) {
				menos++;
			}

			else if (x > 50) {
				mais++;
			}
		}

		System.out.println("Temos aqui " + menos + " com menos de 21 anos e " + mais + " com mais de 50 anos.");

	}
}
