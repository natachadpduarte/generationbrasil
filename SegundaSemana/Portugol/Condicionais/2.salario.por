/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um 
 operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 
 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
 No final do processamento imprimir o salário total e o salário excedente.
*/

programa
{
	
	funcao inicio()
	{

		real C, N, ht=10.0, limite=50.0, he=20.0, h, EE=0,t

		escreva("Olá, informe a quantidade de horas trabalhadas: ")
		leia(h)

		t = h*ht

		se(h>limite){
			EE = (h-limite)*he 
		}

		escreva("Olá, seu salário será de ",t, " e o excedente será de R$",EE, " resultando a um salário total de R$",t+EE)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */