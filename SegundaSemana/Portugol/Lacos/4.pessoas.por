/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que
permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/

programa
{
	
	funcao inicio()
	{

		inteiro idade,sexo,fp,numpessoas=1,numpc=0,nummn=0,numha=0,numoc=0,numpn40=0,numpc18=0,x=0



		enquanto(numpessoas<=2){

			escreva("Informe sua idade: ")
			leia(idade)

			escreva("Informe seu sexo (1-feminino / 2-masculino / 3-Outros): ")
			leia(sexo)

			escreva("Informe seu perfil (1-calma / 2-nervosa / 3-agressiva) ")
			leia(fp)


			se(fp==1)
			{
				numpc++
			}
			se(sexo==1 e fp==2)
			{
				nummn++
			}
			se(sexo==2 e fp==3)
			{
				numha++
			}
			se(sexo==3 e fp==1)
			{
				numoc++
			}
			se(fp==2 e idade>40)
			{
				numpn40++
			}
			se(fp==1 e idade<18)
			{
				numpc18++
			}
			numpessoas++
			limpa()
		}
		escreva("\nNúmero de pessoas calmas: ",numpc)
		escreva("\nNúmero de mulheres nervosas: ",nummn)
		escreva("\nNúmero de homens agressivos: ",numha)
		escreva("\nNúmero de outros calmos: ",numoc)
		escreva("\nNúmero de pessoas nervosas com mais de 40 anos: ",numpn40)
		escreva("\nNúmero de pessoas calmas com menos de 18 anos: ",numpc18)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 795; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */