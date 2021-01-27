/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
escreva a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz quadrada de (x2-x2)^2 + (y2-y1)^2 */


package ProjetoJava;

import java.util.Scanner;

public class Media {
	
	
		public static void main(String args[]) {
			
			Scanner ler = new Scanner(System.in);
			
			double d, x1, x2, y1, y2;
			
			System.out.println("Digite o ponto x1: ");
			x1 = ler.nextDouble();
			
			System.out.println("Digite o ponto x2: ");
			x2 = ler.nextDouble();
			
			System.out.println("Digite o ponto y1: ");
			y1 = ler.nextDouble();
			
			System.out.println("Digite o ponto y2: ");
			y2 = ler.nextDouble();
			
			d = Math.sqrt(Math.pow((x2-x1),2) + (Math.pow((y1-y2),2)));
			
			System.out.printf("A distancia entre eles é de %2.2f",d);
			
		} 
		
}
			
