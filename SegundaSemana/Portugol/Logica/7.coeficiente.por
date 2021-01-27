programa
{
	
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{

		real x, y, a, b, c , d, ee, f
		
		escreva("Olá, entre com o primeiro número: ")
		leia(a)
		escreva("Olá, entre com o segundo número: ")
		leia(b)
		escreva("Olá, entre com o terceiro número: ")
		leia(c)
		escreva("Olá, entre com o quarto número: ")
		leia(d)
		escreva("Olá, entre com o quinto número: ")
		leia(ee)
		escreva("Olá, entre com o sexto número: ")
		leia(f)								


		x = ((c*ee)-(b*f))/((a*ee)-(b*d))
		y = ((a*f)-(c*d))/((a*ee)-(b*d))

		
		escreva("\nO valor de X: ",mat.arredondar(x,2)," e o valor de Y: ",y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 83; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */