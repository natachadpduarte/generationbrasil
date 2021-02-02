/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

package VetoresMatrizes;

import java.util.Scanner;

public class DuasMatrizes {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1[][] = new int [4][6], n2[][] = new int [4][6], m1[][] = new int[4][6], m2[][] = new int[4][6], l,c, soma=0, diferenca=0;
		
		for(l=0;l<4;l++) {			
			for(c=0;c<6;c++) {
				
				System.out.println("Informe os números da primeira matriz: ");
				n1[l][c] = ler.nextInt();				
				
			}
		}
			
			for (l=0;l<4;l++) {
				for(c=0;c<6;c++) {
				
				System.out.println("Informe os números da segunda matriz: ");
				n2[l][c] = ler.nextInt();				
						
			
		}
	}
			
			for (l=0;l<4;l++) {
				for (c=0;c<6;c++) {
					
					m1[l][c] = n1[l][c]+n2[l][c];
					
					System.out.println("Soma das matrizes N1 e N2 --> "+ n1[l][c]+ " + "+ n2[l][c] +" = "+  m1[l][c]);
				}
			}
	
			
			for (l=0;l<4;l++) {
				for(c=0;c<6;c++) {
					
					m2[l][c] = n1[l][c] - n2[l][c];
					
					System.out.println("A diferença das matrizes N1 e N2 --> "+ n1[l][c]+ " - "+ n2[l][c] +" = "+  m2[l][c]);
				}
			}
			
			
  }
}
