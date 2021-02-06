/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class v4Estoque {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoqueRacao = new ArrayList();
		ArrayList<String> estoquePetisco = new ArrayList();
		
		int x,y=0,w,qtdRacao=0,qtdPetisco=0,qtdEstoqueRacao=0,qtdEstoquePetisco, somaRacao=0, somaPetisco=0,retirar=0,retirarEstoqueRacao=0,somaSub=0,n,nn,retirarEstoquePetisco,subtracaoRacao,somaSubtracaoRacao,subtracaoPetisco,somaSubtracaoPetisco;
		String l,la,racao,petisco,za ;
		
		
		
do {
		System.out.println("\n========================================ESTOQUE DE ALIMENTOS PETWORLD=============================\n\nOlá, bem vindo ao sistema de estoque. Informe o que deseja fazer"
				+ " conforme abaixo:\n\n 1 - Adicionar novo produto\n 2 - Atualizar produto\n 3 - Deletar produto\n 4 - Verificar marcas cadastradas no estoque\n 0 - Sair do sistema\n\n\n========================================== ©Copyright ============================================================\n================================= Todos os direitos reservados ===================================================");		
		x = ler.nextInt();
		

		//Se opção for igual a 1
		if(x==1) {
			
			System.out.println("\nInforme o produto que deseja adicionar \n\n 1 - Ração\n 2 - Petiscos e ossos\n");
			y = ler.nextInt();
		
		
			//Adicionando produtos
			
					if (y == 1) {
				
					    	qtdRacao++;
							ler.nextLine();
							System.out.println("\nDigite a marca que deseja incluir no estoque:\n ");
							racao = ler.nextLine();
							
							
							System.out.println("\nDigite a quantidade que irá incluir para este produto: \n");
							qtdEstoqueRacao = ler.nextInt();
							estoqueRacao.add(racao);
							
							if(qtdEstoqueRacao!=0) {
								
								somaRacao = somaRacao+ qtdEstoqueRacao;
								//System.out.println(somaRacao);
							}
							
							System.out.println("\nRação adicionada com sucesso!\n "); 
							System.out.println("Você possui "+somaRacao+" produtos da categoria Ração, cadastrados em seu estoque!\n\n"); 
							
								}
						
					
					else if (y == 2) {
						
						
						ler.nextLine();
						System.out.println("\nDigite a marca que deseja incluir no estoque:\n ");
						petisco = ler.nextLine();
						
						
						System.out.println("\nDigite a quantidade que irá incluir no estoque:");
						qtdEstoquePetisco = ler.nextInt();
						estoquePetisco.add(petisco);
						
						if(qtdEstoquePetisco!=0) {
							
							somaPetisco = somaPetisco + qtdEstoquePetisco;
							//System.out.println(somaPetisco);
						}
						
						
						System.out.println("\nPetisco adicionado com sucesso!\n ");
						
						
						
						System.out.println("Você possui "+somaPetisco+" produtos na categoria Petisco, cadastrados em seu estoque!\n\n"); 
						
							}
						
		}
		
			//Atualizando dados
		if(x==2) {
			
							ler.nextLine();
							System.out.println("\nInforme qual produto deseja atualizar (abaixo segue a lista das marcas em seu estoque)\n");
							System.out.println("Marcas de ração no estoque: "+estoqueRacao);
							System.out.println("Marcas de petisco no estoque: "+estoquePetisco);
							String atualizar = ler.nextLine();
							System.out.println("\nDigite o nome do produto que entrará no lugar de "+atualizar+":");
							String novoValor = ler.nextLine();
							System.out.println("\n");
			
							if(estoqueRacao.contains(atualizar)){
			
															estoqueRacao.remove(atualizar);
															estoqueRacao.add(novoValor);
															
															}
							else if(estoquePetisco.contains(atualizar)) {
								
															estoquePetisco.remove(atualizar);
															estoquePetisco.add(novoValor);
								
							}
							else
									{
										System.out.println("\nO produto não está cadastrado no estoque!\n");
									}
						
		}
		
		
		
		//Remover Produto
		
		if(x==3) {
			
			
			ler.nextLine();
			System.out.println("\nEscolha uma das opções\n 1 - Deletar todo o estoque do produto\n 2 - Deletar apenas uma quantidade\n");
			n = ler.nextInt();
			
			
				if (n==1) {
				
				
					System.out.println("\nDe qual categoria deseja remover?\n\n 1 - Ração\n 2 - Petiscos e ossos");
					nn = ler.nextInt();
			
					if(nn==1) {
						
						ler.nextLine();
						System.out.println("\nAbaixo segue os produtos cadastrados, digite o que deseja excluir:\n");
						System.out.println("\n"+estoqueRacao);
						l = ler.nextLine();
						estoqueRacao.remove(l);
						System.out.println("\nProduto removido com sucesso! ");
					}
					
					else if (nn==2) {
						
						ler.nextLine();
						System.out.println("\nAbaixo segue os produtos cadastrados, digite o que deseja excluir:\n");
						System.out.println("\n"+estoquePetisco);
						l = ler.nextLine();
						estoquePetisco.remove(l);
						System.out.println("\nProduto removido com sucesso! ");
					}

					
				}
				
				
			if (n==2) {
				
				
			System.out.println("\nDe qual categoria deseja remover?\n\n 1 - Ração\n 2 - Petiscos e ossos");
			w = ler.nextInt();
			
			
			if(w==1) {
				
				ler.nextLine();
				System.out.println("\nAbaixo temos os produtos em estoque. Digite qual deseja remover: ");
				System.out.println("\n"+estoqueRacao+"\n");
				String z = ler.nextLine();
				
				System.out.println("\nDigite a quantidade que irá retirar do estoque:");
				retirarEstoqueRacao = ler.nextInt();

				retirar++;
					
					
					somaSubtracaoRacao = somaRacao-retirarEstoqueRacao;
				
			System.out.println("\n"+somaSubtracaoRacao+" produtos restantes no estoque da categoria Ração");
			}
			
			else if(w==2) {
				
				ler.nextLine();
				System.out.println("\nAbaixo temos os produtos em estoque. Digite qual deseja remover: ");
				System.out.println("\n"+estoquePetisco+"\n");
				za = ler.nextLine();
				
				System.out.println("\nDigite a quantidade que irá retirar do estoque:");
				retirarEstoquePetisco = ler.nextInt();

				retirar++;
					
					
					somaSubtracaoPetisco = somaPetisco-retirarEstoquePetisco;
				
			System.out.println("\n"+somaSubtracaoPetisco+" produtos restantes no estoque da categoria Petisco");
			}
		
		}
		}
					if(x==4) {
			
			System.out.println("Produtos em seu estoque: \n\n");
			System.out.println("Rações: "+estoqueRacao); 
			System.out.println("Petiscos: "+estoquePetisco+"\n");} 
					
					
		}while (x!=0);
			
}
	
	
}