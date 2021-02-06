package Empresa;

import java.util.Scanner;
public class Anexos {

		public static void main (String args[]) {
			
			
			Scanner ler = new Scanner(System.in);
			
			int x = 0, y=0;
			
			System.out.println("Olá empresário!\n\n"
					+ "Bem vindo! Vamos planejar seu futuro?\n"
					+ "Como posso te ajudar hoje?\n"
					+ "\n1 - Planejamento tributário e trabalhista"
					+ "\n"
					+ "2 - Informações\r\n"
					 );
			x = ler.nextInt();
			
			while(x>0 && x<6) {
			if (x==2) {
				
				System.out.println("\nQual a atividade da sua empresa? (Escolha um número)\n"
						+"\n1 - Anexo I - Comércio\n2 - Anexo II - Indústria\n3 - AnexoIII - Serviço\n4 - Anexo IV - Construção civil\n5 - Anexo V - Serviços de cunho intelectual\n");
				y = ler.nextInt();
			}
			
			String lista[] = {"\nAnexoI\n"
								+ "","\nAnexoII\n"
									+ "","\nAnexoIII \n"
										+ "","\nAnexo IV\n"
											+ "","\nAnexoV" };
							
					System.out.println(lista[y-1]);
			} }
		
}

