/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/


programa
{
	
	funcao inicio()
	{
	     const inteiro limite = 6
		inteiro n[6],x,par=0, impar=0,v=0

		para(x=0;x<limite;x++) {
			escreva("Digite um número: ")
			leia(n[x])


			se(n[x]%2==0){

				par = par + n[x]
			
	
			}
			senao {
		
				impar++

			}

			
		}

		para(x=0;x<limite;x++) {

			se(n[x]%2==0) {
				escreva("\nO número ",n[x]," é par")
			}
			senao {
				escreva("\nO número ",n[x], " é impar" )
			}
		}
		escreva("\nA soma dos números pares é de ",par)
		escreva("\nA quantidade de números impares é de ",impar)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */