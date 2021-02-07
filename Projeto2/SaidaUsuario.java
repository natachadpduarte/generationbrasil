package empresa;

import java.util.List;

public class SaidaUsuario {
	//static Scanner = new Sc
	public static void qualAnexo() {
		String menuAnexo = "1- Anexo I - Comércio\r\n"
				  + "2- Anexo II - Industria\r\n"
				  + "3- Anexo III - Serviço\r\n"
				  + "4- Anexo IV – Construção Civil\r\n"
				  + "5- Anexo  V –– Serviços de cunho intelectual\r\n";
		System.out.println(menuAnexo);
	}
	
	public static void relatorio(List<Float> pagamento, float total, float imposto) {
		for (int i = 0; i <= 11; i++) {
			System.out.printf("Faturamento mes %d foi de: %.2f\n", i+1, pagamento.get(i) );	
		}
		System.out.println("\nSeu faturamento total dos ultimos 12 meses foi de: "+total + " reais");
		System.out.println("\nSeu imposto do mês é de: "+imposto + " reais");
		
		if (total < 0)
		{
			System.out.println("Erro! O sistema não aceita valores negativos! Tente novamente");			
		}
		

		else if (pagamento.get(11)<=0)
		{
			System.out.printf("\nNão houve faturamento nesse mês. Você não terá imposto à pagar!");
		}
		else if (total > 4800000)
		{
			System.out.printf("\nUhul! Parece que você está voando!!! \r\n"
					+ " Você excedeu seu limite de faturamento para o Simples Nacional. Fique atento e converse com seu contador!  Pois precisa se enquadrar direitinho!\r\n"
					+ "");
		}
		else if (total <=81000)
		{
			System.out.printf("\nUhul! Parece que você está crescendo!!! \r\n"
					+ " Mas sabia que talvez você esteja pagando mais imposto do que deveria?! Converse com seu contador, pois você pode ser um Microempreendedor individual e pagar menos imposto! ");
		}
		
		
		

	}
	
}