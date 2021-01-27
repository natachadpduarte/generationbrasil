/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: D = (R + S)/2
, onde  R = (A+B)^2 e S = (B+C)^2 */


package ProjetoJava;

import java.util.Scanner;

public class CalculeExpressao {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		double A,B,C,D,R,S;
		
		System.out.println("Olá, informe o primeiro número: ");
		A = ler.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		B = ler.nextDouble();		

		System.out.println("Informe o terceiro número: ");
		C = ler.nextDouble();
		
		R = A+B;
		S = B+C;
		
		D = (Math.pow(R, 2) + Math.pow(S, 2))/2;
		
		System.out.printf("O resultado é %2.2f",D);
	}
}
