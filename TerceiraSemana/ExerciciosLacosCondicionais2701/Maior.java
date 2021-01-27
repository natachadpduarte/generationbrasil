/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package LacosRepeticao;

import java.util.Scanner;

public class Maior {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in)
				;
		int n1,n2,n3;
		
		System.out.println("Olá, informe três números");
		System.out.println("Informe o primeiro: ");
		n1 = ler.nextInt();
		System.out.println("Informe o segundo: ");
		n2 = ler.nextInt();
		System.out.println("Informe o terceiro: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("Dos números digitados o maior é "+n1);
			
		}
		
		else if (n2>n1 && n2>n3) {
			System.out.println("Dos números digitados o maior é "+n2);
		}
		
		else if (n3>n1 && n3>n2) {
			System.out.println("Dos números digitados o maior é "+n3);
		}
	}
}
