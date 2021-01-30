/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/



package VetoresMatrizes;

import java.util.Scanner;

public class MatrizDiagonal {

	public static void main(String[] args) {
		
		int limite =3;
		int mat[][] = new int[limite][limite],l,c,somageral=0,somadiagonal=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(l=0;l<limite;l++)
		{
			for(c=0;c<limite;c++)
			{
				System.out.printf("\nEntre com os valores para a Matriz [%d] [%d]: ",(l+1),(c+1));
				mat[l][c] = ler.nextInt();
				
				somageral = somageral + mat[l][c];
				
				if(l==c)
				{
					somadiagonal = somadiagonal + mat[l][c];
				}
			}
			
		}
		System.out.println("\nA soma geral da matriz é: "+somageral);
		System.out.println("\nSoma dos valores da diagonal principal: "+somadiagonal);
	}

}

