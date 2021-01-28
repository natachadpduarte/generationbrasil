/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package LacosRepeticao;

import java.util.Scanner;
public class MediaMultiplosTres {

	
		public static void main (String args[]) {
			
			Scanner ler = new Scanner(System.in);
			
			float numero,soma=0,cont=0,media;
			
			do {
				
				System.out.println("Informe um número: ");
				numero = ler.nextFloat();
				
				
				
				if(numero!=0) {
					
					
				if(numero%3 == 0) {
					
					 cont++;
					 soma = soma + numero;
				}
			}
		}
			
			while(numero!=0);
			
			media = soma/cont;
			
			System.out.println("A média dos números múltiplos de 3 é "+media);
		}
}
