/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

*/

programa
{

	inclua biblioteca Matematica --> mat
	funcao inicio()
	{


	inteiro v1, v2, v3, v4, q1, q2, q3, q4
		
	escreva("Digite o primeiro valor: ")
	leia(v1)
	escreva("Digite o segundo valor: ")
	leia(v2)
	escreva("Digite o terceiro valor: ")
	leia(v3)	
	escreva("Digite o quarto valor: ")
	leia(v4)

	q1= mat.potencia(v1,2)
	q2= mat.potencia(v2,2)
	q3= mat.potencia(v3,2)
	q4= mat.potencia(v4,2)
	
	se(q3>=1000){
		escreva("O quadrado do terceiro valor é de: ",q3)
	} senao {
		escreva("O quadrado do primeiro valor é de: ",q1)
		escreva("\nO quadrado do segundo valor é de: ",q2)
		escreva("\nO quadrado do terceiro valor é de: ",q3)
		escreva("\nO quadrado do quarto valor é de: ",q4)
		
	}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */