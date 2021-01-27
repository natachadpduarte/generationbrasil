/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: D = (R + S)/2
, onde  R = (A+B)^2 e S =(B+C)^2
*/

programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro A,B,C, D, R, S

		escreva("Informe o primeiro numero: ")
		leia(A)

		escreva("Informe o segundo número: " )
		leia(B)

		escreva("Informe o terceiro número: " )
		leia(C)

		R = A+B
		S = B+C
		
		D = (mat.potencia(R, 2) + mat.potencia(S, 2))/2

		escreva(D)
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */