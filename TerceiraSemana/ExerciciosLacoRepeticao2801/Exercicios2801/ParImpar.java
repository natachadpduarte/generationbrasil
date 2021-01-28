/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package LacosRepeticao;

import java.util.Scanner;
public class ParImpar {

		public static void main (String args[]) {
			
			Scanner ler = new Scanner(System.in);
			int numero,x,par=0,impar=0;
			
			for(x=0;x<10;x++) {
				
				System.out.println("Informe um número: ");
				numero = ler.nextInt();
				
				if(numero%2==0) {
					par++;
				}
				
				else {
					impar++;
				}
				

			}
			
			System.out.println("Temos "+par+" números pares e "+impar+" números impares");
		}
}
