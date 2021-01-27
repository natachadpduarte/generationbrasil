/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */

programa
{
	
	funcao inicio()
	{

		inteiro dias, anos, meses, qtdanos, qtdmeses, qtddias
		
		escreva("Informe sua idade em anos, meses e dias\n")
		escreva("Anos: ")
		leia(anos)
		escreva("Meses")
		leia(meses)
		escreva("Dias:")
		leia(dias)

		qtdanos = anos*365
		qtdmeses = (anos%365)*30
		qtddias = (anos%365)%30

		escreva(qtdanos+qtdmeses+qtddias)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */