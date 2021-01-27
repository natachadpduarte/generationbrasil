/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package LacosRepeticao;

import java.util.Scanner;
public class ParImpar {

		public static void main (String args[]) {
			
			Scanner ler = new Scanner(System.in);
			
			double numero, raiz, elevado;
			
			System.out.println("Olá, informe um número: ");
			numero = ler.nextDouble();
			
			if (numero%2==0) {
				
				raiz = Math.sqrt(numero);
				System.out.printf("O número informado é par e sua raiz quadrada é %2.2f",raiz);
			}
			else {
				
				elevado = Math.pow(numero, 2);
				System.out.printf("O número informado é impar e elevado ao quadrado temo %2.2f ",elevado);
			
		}
	}  
} 
		
