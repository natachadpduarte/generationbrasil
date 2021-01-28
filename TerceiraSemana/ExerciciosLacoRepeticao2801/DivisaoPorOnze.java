/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

package LacosRepeticao;

import java.util.Scanner;

public class DivisaoPorOnze {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int x, y, res;

		for (x = 1000; x <= 1999; x++) {

			res = x % 11;

			if (res == 5) {
				System.out.println("O resto da divisão " + x + " por 11 é 5");
			}
		}

	}
}
