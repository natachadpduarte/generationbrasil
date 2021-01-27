/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

programa
{
	
	funcao inicio()
	{

		inteiro n,par=0,impar=0,x,r


		para(x=0;x<11;x++){

			se(x%2==0){
				par++

			}
			senao impar++
		}

		escreva(par, " são pares e ",impar," impares")
     }
	 

	 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */