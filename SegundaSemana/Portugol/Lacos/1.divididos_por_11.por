/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/

programa
{
	
	funcao inicio()
	{

		inteiro x,ap=0

		para(x=1000;x<=1999;x++){

			se(x%11==5){
				escreva("\nOs número divididos por 11, onde o restante é 5 são: ",x)
			}
		}
     }
	 

	 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */