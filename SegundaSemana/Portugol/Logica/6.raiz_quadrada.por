/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: */

programa
{
	
	inclua biblioteca Matematica --> mat 
	
	inteiro d, x1, x2, y1, y2
	
	funcao inicio()
	{
		escreva("Digite o ponto1: ")
		leia(x1)
		escreva("Digite o ponto2: ")
		leia(x2)
		
		escreva("Digite o ponto3: ")
		leia(y1)		
		escreva("Digite o ponto4: ")
		leia(y2)		

	     d = (mat.potencia((x2-x1), 2)) + (mat.potencia((y2-y1), 2))

	     escreva("A distancia entre eles é de ",mat.arredondar(mat.raiz(d, 2),2))

	    
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 628; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */