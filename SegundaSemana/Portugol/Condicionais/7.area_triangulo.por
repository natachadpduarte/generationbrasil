/*7) Receber valores de base e altura de um triângulo e verificar se são 
valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/

programa
{
	
	funcao inicio()
	{

		real base, altura, t

		escreva("Digite a base e a altura do triângulo")
		escreva("\nBase: ")
		leia(base)
		escreva("\nAltura: ")
		leia(altura)

		se(base>0 e altura>0){
			t = (base * altura)/2
			escreva("A área do triângulo é de ",t)
		}

		senao escreva("Valor inválido! Digite um valor de base e altura válidos (ambos positivos maiores que zero)")
	
     }
	 

	 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */