/*Escrever um programa que receba vários números inteiros no teclado. 
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/

programa
{
	
	funcao inicio()
	{

		inteiro n,soma=0,x=0,cont=0

		faca {
			escreva("Digite um número: ")
			leia(n)

			cont++

		     se(n%3==0){
		     	soma=soma+n
		     	
		     }
			
			
		}

		enquanto(n!=0)

		escreva("A média dos números múltiplos de 3 é ",soma/cont)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */