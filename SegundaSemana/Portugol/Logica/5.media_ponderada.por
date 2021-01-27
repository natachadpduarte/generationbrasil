/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é 
ponderada e que o peso das notas é: 2,3 e 5, respectivamente*/

programa
{
	
	funcao inicio()
	{

		real nota1, nota2, nota3, mp1, mp2, mp3, calculo
		
		escreva("Olá, vamos calcular a média. Digite a primeira nota: ")
		leia(nota1)
		
		escreva("Digite a segunda nota: ")
		leia(nota2)

		escreva("Digite a terceira nota: ")
		leia(nota3)


		mp1 = nota1*2
		mp2 = nota2*3
		mp3 = nota3*5

		calculo = (mp1+mp2+mp3)/3

		escreva("A media das notas é ",calculo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */