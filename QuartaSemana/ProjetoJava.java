package Turma15;

import java.util.Scanner;
public class ProjetoJava1 {

	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int x;
		String nome;
		
		System.out.println("Bem-vinde ao Mundo Melhor!\n");
		System.out.print("Informe seu nome: ");
		nome= ler.nextLine();

		System.out.println("\n");
		
		System.out.println("Os Objetivos de Desenvolvimento Sustentável (ODS) da Organização das Nações Unidas (ONU)  \npertecem a uma agenda mundial de propósitos estabelecidos durante a Cúpula das Nações Unidas sobre\no Desenvolvimento Sustentável, em setembro de 2015.\r\n"
				+ "Os ODS são formados por  17 objetivos e 169 metas que tratam das mazelas sociais em três âmbitos do \ndesenvolvimento sustentável: econômico, ambiental e social.\r\n"
				+ "\r\n"
				+nome+", você pode achar que estes objetivos e metas são cabíveis apenas aos governos \ne empresas, mas dentro do objetivo 12, por exemplo, há algumas ações que você pode ajudar a \ncontribuir diretamente com suas ações diárias. O objetivo 12 foca na produção e consumo sustentáveis, \nonde pode-se destacar a  utilização dos 3 R's (Reduzir, Reutilizar e Reciclar). \r\n"
				+ "Pensando nisso, te pergunto: Você sabe quais materiais são ou não recicláveis e qual é o seu \ndescarte correto?\r\n"
				+ "Você sabia que além dos 3 R's existem outros objetivos e metas que você pode ajudar a atingir? \r\n"
				+ "\r\n"
				+ "Você também tem o poder de mudar o mundo!\r\n"
				+ "");
		
		do {
		System.out.print(nome + ", por favor, escolha abaixo sobre o que você mais gostaria de saber: \n"
				           +"1 - ODS \n"
						   +"2 - Coleta seletiva\n"
				           +"0 - Sair\nR:");
		x = ler.nextInt();
		
		
		while(x<0  || x>3) {
			System.out.print(nome+", você digitou uma opção inválida! \nEscolha abaixo sobre o que você mais gostaria de saber: \n"
			           +"1 - ODS \n"
					   +"2 - Coleta seletiva\n"
					   +"0 - Sair\nR:");
			x = ler.nextInt();
		}
		
		if(x==1){
		
		System.out.println("\nMenu ODS \n\n1 - Erradicação da Pobreza \n"
				+ "2 - Fome Zero e Agricultura Sustentável \n"
				+ "3 - Saúde e Bem-Estar \n"
				+ "4 - Educação de Qualidade \n"
				+ "5 - Igualdade de Gênero \n"
				+ "6 - Água Potável e Saneamento\r\n"
				+ "7 - Energia Acessível e Limpa \n"
				+ "8 - Trabalho Decente e Crescimento Econômico\r\n"
				+ "9 - Indústria, Inovação e Infraestrutura\r\n"
				+ "10 - Redução da Desigualdades\n"
				+"11 - Cidades e Comunidades Sustentáveis\r\n"
				+ "12 - Consumo e Produção Responsáveis\r\n"
				+ "13 - Ação Contra a Mudança Global do Clima\r\n"
				+ "14 - Vida na Água\r\n"
				+ "15 - Vida Terrestre\r\n"
				+ "16 - Paz, Justiça e Instituições Eficazes\r\n"
				+ "17 - Parcerias e Meios de Implementação\r\n");
		
		System.out.print(nome+", digite sua opção: ");
		x= ler.nextInt();
		
		while (x<1 || x>17) {
			
			System.out.println(nome+", você digitou uma opção inválida! Escolha algumas das opções abaixo:\nMenu ODS \n\n1 - Erradicação da Pobreza \n"
					+ "2 - Fome Zero e Agricultura Sustentável \n"
					+ "3 - Saúde e Bem-Estar \n"
					+ "4 - Educação de Qualidade \n"
					+ "5 - Igualdade de Gênero \n"
					+ "6 - Água Potável e Saneamento\r\n"
					+ "7 - Energia Acessível e Limpa \n"
					+ "8 - Trabalho Decente e Crescimento Econômico\r\n"
					+ "9 - Indústria, Inovação e Infraestrutura\r\n"
					+ "10 - Redução da Desigualdades\n"
					+"11 - Cidades e Comunidades Sustentáveis\r\n"
					+ "12 - Consumo e Produção Responsáveis\r\n"
					+ "13 - Ação Contra a Mudança Global do Clima\r\n"
					+ "14 - Vida na Água\r\n"
					+ "15 - Vida Terrestre\r\n"
					+ "16 - Paz, Justiça e Instituições Eficazes\r\n"
					+ "17 - Parcerias e Meios de Implementação\r\n");
			
			System.out.print(nome+ ", digite sua opção: ");
			x= ler.nextInt();
		}
		
		String vetA[]= { "","1- Acabar com a pobreza em todas as suas formas, em todos os lugares\r\n"
				+ "\r\n"
				+ "Em 2000, o mundo comprometeu-se em reduzir pela metade o número de pessoas vivendo em extrema pobreza e alcançou ganhos notáveis no desenvolvimento humano. Até 2015, a pobreza havia sido reduzida significativamente, o acesso ao ensino básico e os resultados da saúde melhoraram, bem como foram realizados progressos na promoção da igualdade de gênero e no empoderamento das mulheres e meninas. No entanto, a erradicação da pobreza extrema continua a ser um desafio, com mais de 700 milhões de pessoas vivendo, globalmente, com menos de US$ 1,90 (PPP) por dia e mais da metade da população global vivendo com menos de US$ 8,00 por dia.\r\n"
				+ "\r\n"
				+ "Em um mundo confrontado pelos crescentes desafios para o desenvolvimento, a Agenda 2030 reconhece que a erradicação da pobreza, em todas as suas formas, é o maior desafio global para atingirmos o desenvolvimento sustentável. Por isso, a grande prioridade do desenvolvimento sustentável deve ser os mais pobres e vulneráveis: ninguém será deixado para trás!\r\n"
				+ "","2- Acabar com a fome, alcançar a segurança alimentar e melhoria da nutrição e promover a agricultura sustentável\r\n"
						+ "Durante as duas últimas décadas, o rápido crescimento econômico e o desenvolvimento da agricultura foram responsáveis pela redução pela metade da proporção de pessoas subnutridas no mundo. Entretanto, ainda há 795 milhões de pessoas no mundo que, em 2014, viviam sob o espectro da desnutrição crônica. O ODS 2 pretende acabar com todas as formas de fome e má-nutrição até 2030, de modo a garantir que todas as pessoas - especialmente as crianças - tenham acesso suficiente a alimentos nutritivos durante todos os anos.\r\n"
						+ "\r\n"
						+ "Para alcançar este objetivo, é necessário promover práticas agrícolas sustentáveis, por meio do apoio à agricultura familiar, do acesso equitativo à terra, à tecnologia e ao mercado.\r\n"
						+ "\r\n"
						+ "ODMs relacionados: 1\r\n"
						+ "","3- Assegurar uma vida saudável e promover o bem-estar para todos, em todas as idades\r\n"
								+ "Desde os ODM foram registrados progressos históricos na redução da mortalidade infantil, na melhoria da saúde materna e na luta contra o HIV/Aids, a tuberculose, a malária e outras doenças. Em 15 anos, o número de pessoas infectadas pelo HIV anualmente caiu de 3,1 milhões para 2 milhões e mais de 6,2 milhões de vidas foram salvas da malária.\r\n"
								+ "\r\n"
								+ "Apesar do progresso, as doenças crônicas e aquelas resultantes de desastres continuam a ser os principais fatores que contribuem para a pobreza e para a privação dos mais vulneráveis. Atualmente, 63% de todas as mortes do mundo provêm de doenças não transmissíveis, principalmente cardiovasculares, respiratórias, câncer e diabetes. Estima-se que as perdas econômicas para os países de renda média e baixa provenientes destas doenças ultrapassaram US$ 7 trilhões até 2025.\r\n"
								+ "\r\n"
								+ "Os ODS propõem metas integradas que abordam a promoção da saúde e bem estar como essenciais ao fomento das capacidades humanas.\r\n"
								+ "\r\n"
								+ "ODMs relacionados: 4, 5, 6\r\n"
								+ "","4- Assegurar a educação inclusiva e equitativa de qualidade, e promover oportunidades de aprendizagem ao longo da vida para todos\r\n"
										+ "Desde 2000, houve enorme progresso na promoção do acesso universal à educação primária para as crianças ao redor do mundo. Para além do foco na educação básica, todos os níveis de educação estão contemplados no objetivo de desenvolvimento sustentável 4, que enxerga como fundamental a promoção de uma educação inclusiva, igualitária e baseada nos princípios de direitos humanos e desenvolvimento sustentável. A promoção da capacitação e empoderamento dos indivíduos é o centro deste objetivo, que visa ampliar as oportunidades das pessoas mais vulneráveis no caminho do desenvolvimento.\r\n"
										+ "\r\n"
										+ "ODMs relacionados: 2\r\n"
										+ "","5- Alcançar a igualdade de gênero e empoderar todas as mulheres e meninas\r\n"
												+ "A igualdade de gênero não é apenas um direito humano fundamental, mas a base necessária para a construção de um mundo pacífico, próspero e sustentável. O esforço de alcance do ODS 5 é transversal à toda Agenda 2030 e reflete a crescente evidência de que a igualdade de gênero tem efeitos multiplicadores no desenvolvimento sustentável.\r\n"
												+ "\r\n"
												+ "Muitos avanços em termos de assegurar melhores condições de vida a mulheres e meninas são um importante legado dos ODM. Os Objetivos de Desenvolvimento Sustentável visam intensificar estas realizações, não apenas nas áreas de saúde, educação e trabalho, mas especialmente no combate às discriminações e violências baseadas no gênero e na promoção do empoderamento de mulheres e meninas para que possam atuar enfaticamente na promoção do desenvolvimento sustentável, por meio da participação na política, na economia, e em diversas áreas de tomada de decisão.\r\n"
												+ "\r\n"
												+ "O desenvolvimento sustentável não será alcançado se as barreiras tangíveis e intangíveis que impedem o pleno desenvolvimento e exercício das capacidades de metade da população não forem eliminadas.\r\n"
												+ "\r\n"
												+ "ODMs relacionados: 3\r\n"
												+ "","6- Assegurar a disponibilidade e a gestão sustentável da água e saneamento para todos\r\n"
														+ "A água está no centro do desenvolvimento sustentável e das suas três dimensões - ambiental, \neconômica e social. Os recursos hídricos, bem como os serviços a eles associados, sustentam os \nesforços de erradicação da pobreza, de crescimento econômico e da sustentabilidade ambiental. \nO acesso à água e ao saneamento importa para todos os aspectos da dignidade humana: da segurança \nalimentar e energética à saúde humana e ambiental.\r\n"
														+ "\r\n"
														+ "A escassez de água afeta mais de 40% da população mundial, número que deverá subir ainda mais como \nresultado da mudança do clima e da gestão inadequada dos recursos naturais. É possível trilhar um \nnovo caminho que nos leve à realização deste objetivo, por meio da cooperação internacional, \nproteção às nascentes, rios e bacias e compartilhamento de tecnologias de tratamento de água.\r\n"
														+ "\r\n"
														+ "ODMs relacionados: 7\r\n"
														+ "","7- Assegurar o acesso confiável, sustentável, moderno e a preço acessível à energia para todos\r\n"
																+ "\r\n"
																+ "De 2000 a 2013, mais de 5% da população mundial obteve acesso à eletricidade (de 79,313% para 84,58%). Para os próximos anos a tendência é aumentar a demanda por energia barata. Contudo, combustíveis fósseis e suas emissões de gases de efeito estufa provocam mudanças drásticas no clima. Atender às necessidades da economia e proteger o meio ambiente é um dos grandes desafios para o desenvolvimento sustentável. Nesse sentido, o ODS 7 reconhece a importância e traça metas focadas na transição energética, de fontes não renováveis e poluidoras, para fontes renováveis limpas, com especial atenção às necessidades das pessoas e países em situação de maior vulnerabilidade.\r\n"
																+ "\r\n"
																+ "ODMs relacionados: 7\r\n"
																+ "","8- Promover o crescimento econômico sustentado, inclusivo e sustentável, o emprego pleno e produtivo e o trabalho decente para todos\r\n"
																		+ "\r\n"
																		+ "No longo prazo, a desigualdade de renda e de oportunidades prejudica o crescimento econômico e o alcance do desenvolvimento sustentável. Os mais vulneráveis, muitas vezes, têm menores expectativas de vida e apresentam dificuldades de se libertarem de um círculo vicioso de insucesso escolar, baixas qualificações e poucas perspectivas de empregos de qualidade.\r\n"
																		+ "\r\n"
																		+ "A revitalização econômica contribui para criar melhores condições para a estabilidade e a sustentabilidade do país. É possível promover políticas que incentivem o empreendedorismo e a criação de empregos de forma sustentável e inclusiva. O ODS 8 reconhece a urgência de erradicar o trabalho forçado e formas análogas ao do trabalho escravo, bem como o tráfico de seres humanos, de modo a garantir a todos e todas o alcance pleno de seu potencial e capacidades.\r\n"
																		+ "\r\n"
																		+ "ODMs relacionados: 1\r\n"
																		+ "","9- Construir infraestruturas resilientes, promover a industrialização inclusiva e sustentável e fomentar a inovação\r\n"
																				+ "Investimentos em infraestrutura e em inovação são condições básicas para o crescimento econômico e para o desenvolvimento das nações. Garantir uma rede de transporte público e infraestrutura urbana de qualidade são condições necessárias para o desenvolvimento sustentável. Por meio da promoção de eficiência energética e inclusão social, o progresso tecnológico é também uma das chaves para as soluções dos desafios econômicos e ambientais. Garantir a igualdade de acesso à tecnologias é crucial para promover a informação e conhecimento para todos. O ODS 9 lista metas que visam à construção de estruturas resilientes e modernas, ao fortalecimento industrial de forma eficiente, ao fomento da inovação, com valorização da micro e pequena empresa e inclusão dos mais vulneráveis aos sistemas financeiros e produtivos.\r\n"
																				+ "\r\n"
																				+ "ODMs relacionados: 1, 7\r\n"
																				+ "","10- Reduzir a desigualdade dentro dos países e entre eles\r\n"
																						+ "O mundo é mais desigual hoje do que em qualquer momento da história desde 1940. A desigualdade de renda e na distribuição da riqueza dentro dos países têm disparado, incapacitando os esforços de alcance dos resultados do desenvolvimento e de expansão das oportunidades e habilidades das pessoas, especialmente dos mais vulneráveis.\r\n"
																						+ "\r\n"
																						+ "A desigualdade é um problema global que requer soluções integradas. A visão estratégica deste objetivo se constrói sob o objetivo da erradicação da pobreza em todas suas dimensões, na redução das desigualdades socioeconômicas e no combate às discriminações de todos os tipos.\r\n"
																						+ "\r\n"
																						+ "Seu alcance depende de todos os setores na busca pela promoção de oportunidades para as pessoas mais excluídas no caminho do desenvolvimento. Foco importante do ODS 10 é o desafio contemporâneo das migrações e fluxos de pessoas deslocadas entre países e regiões devido a conflitos, eventos climáticos extremos ou perseguições de quaisquer tipo. O alcance de suas metas é estruturante para a realização de todos os outros 16 Objetivos de Desenvolvimento Sustentável.\r\n"
																						+ "\r\n"
																						+ "ODMs relacionados: 1\r\n"
																						+ "","11- Tornar as cidades e os assentamentos humanos inclusivos, seguros, resilientes e sustentáveis\r\n"
																								+ "Em 2014, 54% da população mundial vivia em áreas urbanas, com projeção de crescimento para 66% em 2050. Em 2030, são estimadas 41 megalópoles com mais de 10 milhões de habitantes. Considerando que a pobreza extrema muitas vezes se concentra nestes espaços urbanos, as desigualdades sociais acabam sendo mais acentuadas e a violência se torna uma consequência das discrepâncias no acesso pleno à cidade. Transformar significativamente a construção e a gestão dos espaços urbanos é essencial para que o desenvolvimento sustentável seja alcançado. Temas intrinsecamente relacionados à urbanização, como mobilidade, gestão de resíduos sólidos e saneamento, estão incluídos nas metas do ODS 11, bem como o planejamento e aumento de resiliência dos assentamentos humanos, levando em conta as necessidades diferenciadas das áreas rurais, periurbanas e urbanas. O objetivo 11 está alinhado à Nova Agenda Urbana, acordada em outubro de 2016, durante a III Conferência das Nações Unidas sobre Moradia e Desenvolvimento Urbano Sustentável.\r\n"
																								+ "\r\n"
																								+ "ODMs relacionados: 7\r\n"
																								+ "","12- Assegurar padrões de produção e de consumo sustentáveis\r\n"
																										+ "Para alcançar as metas deste ODS, a mudança nos padrões de consumo e produção se configuram como medidas indispensáveis na redução da pegada ecológica sobre o meio ambiente. Essas medidas são a base do desenvolvimento econômico e social sustentável. As metas do ODS 12 visam a promoção da eficiência do uso de recursos energéticos e naturais, da infraestrutura sustentável, do acesso a serviços básicos. Além disso, o objetivo prioriza a informação, a gestão coordenada, a transparência e a responsabilização dos atores consumidores de recursos naturais como ferramentas chave para o alcance de padrões mais sustentáveis de produção e consumo.\r\n"
																										+ "\r\n"
																										+ "ODMs relacionados: 7\r\n"
																										+ "","13- Tomar medidas urgentes para combater a mudança do clima e seus impactos*\r\n"
																												+ "A mudança do clima é um evento transnacional, cujos impactos estão desregulando economias nacionais e afetando pessoas em todos os lugares, principalmente aquelas em situação de maior vulnerabilidade nos países em desenvolvimento. Sem a ação imediata frente à mudança do clima, a temperatura terrestre está projetada para aumentar mais de 3 ºC até o final do século XXI. Uma das metas para esse objetivo é mobilizar 100 milhões de dólares por ano até 2020 para ajudar os países em desenvolvimento no plano de mitigação de desastres relacionados ao clima. O estabelecimento do ODS 13 apenas para lidar com a questão do clima é encarado como estratégico para a mobilização dos atores capazes de promover as mudanças necessárias para impedir estas projeções de se tornarem realidade.\r\n"
																												+ "Metas do Objetivo 13\r\n"
																												+ "","14- Conservar e promover o uso sustentável dos oceanos, dos mares e dos recursos marinhos para o desenvolvimento sustentável\r\n"
																														+ "Os oceanos tornam a vida humana possível por meio da provisão de segurança alimentar, transporte, fornecimento de energia, turismo, dentre outros. Além, por meio da regulação da sua temperatura, química, correntes e formas de vida, os oceanos regulam muitos dos dos serviços ecossistêmicos mais críticos do planeta, como ciclo do carbono e nitrogênio, regulação do clima, e produção de oxigênio. Além, os oceanos representam aproximadamente US$ 3 trilhões da economia global por ano, ou 5% do PIB global.\r\n"
																														+ "\r\n"
																														+ "40% dos oceanos estão sendo afetados incisiva e diretamente por atividades humanas, como poluição e pesca predatória, o que resulta, principalmente, em perda de habitat, introdução de espécies invasoras e acidificação. Nosso lixo também ajuda na degradação dos oceanos – há 13.000 pedaços de lixo plástico em cada quilômetro quadrado. É frente a esses desafios que os Objetivos de Desenvolvimento Sustentável indicam metas para gerenciar e proteger a vida na água.\r\n"
																														+ "","15- Proteger, recuperar e promover o uso sustentável dos ecossistemas terrestres, gerir de forma sustentável as florestas, combater a desertificação, deter e reverter a degradação da terra e deter a perda\r\n"
																																+ "Os seres humanos e outros animais dependem da natureza para terem alimento, ar puro, água limpa e também como um meio de combate à mudança do clima. As florestas, que cobrem 30% da superfície da Terra, ajudam a manter o ar e a água limpa e o clima da Terra em equilíbrio – sem mencionar que são o lar de milhões de espécies. Promover o manejo sustentável das florestas, o combate à desertificação, parar e reverter a degradação da terra, interromper o processo de perda de biodiversidade são algumas das metas que o ODS 15 promove. Usar sustentavelmente os recursos naturais em cadeias produtivas e em atividades de subsistência de comunidades, e integrá-los em políticas públicas é tarefa central para o atingimento destas metas e a promoção de todos os outros ODS.\r\n"
																																+ "","16- Promover sociedades pacíficas e inclusivas para o desenvolvimento sustentável, proporcionar o acesso à justiça para todos e construir instituições eficazes, responsáveis e inclusivas em todos os nívei\r\n"
																																		+ "Promover instituições fortes, inclusivas e transparentes, a manutenção da paz e o respeito aos direitos humanos baseados no Estado de direito são a base para o desenvolvimento humano sustentável. Estes são alguns dos princípios que sustentam as metas do ODS 16, que também inclui temas sensíveis, como o combate à exploração sexual, ao tráfico de pessoas e à tortura. Outros temas incluídos nas metas do ODS 16 são o enfrentamento à corrupção, ao terrorismo, a práticas criminosas, especialmente aquelas que ferem os direitos humanos.\r\n"
																																		+ "","17- Fortalecer os meios de implementação e revitalizar a parceria global para o desenvolvimento sustentável\r\n"
																																				+ "Os ODS só serão realizados mediante um compromisso renovado de cooperação entre a comunidade internacional e uma parceria global ampla que inclua todos os setores interessados e as pessoas afetadas pelos processos de desenvolvimento. Os meios de implementação e as parcerias para o desenvolvimento sustentável são vitais para o crescimento sustentado e para o desenvolvimento sustentável das nações. O ODS 17 propõe o caminho para a realização efetiva da Agenda 2030 por todos os países, e a coordenação de esforços na arena internacional é essencial para isso. A Cooperação Sul-Sul e triangular, a transferência de tecnologia, o intercâmbio de dados e capital humano, bem como a assistência oficial ao desenvolvimento são alguns dos principais meios para o alcance dos ODS."};

		
		System.out.println(vetA[x]);
			
	
		System.out.println("\nObrigado "+nome+", por aprender conosco sobre um Mundo Melhor!\n");
		}
		
		else if(x==2){
			System.out.println(nome+", por favor, escolha um tipo de resíduo:\n1 - Papel\r\n"
					+ "2 - Plástico\r\n"
					+ "3 - Madeira\r\n"
					+ "4 - Metal\r\n"
					+ "5 - Orgânico\r\n"
					+ "6 - Vidro\r\n"
					+ "7 - Resíduos Perigosos\r\n"
					+ "8 - Não Reciclável\r\n"
					+ "");
			
			x=ler.nextInt();
			
			while(x<1 || x>8) {
			
				System.out.println(nome+", você digitou uma opção invalida! \nEscolha um tipo de resíduo:\n1 - Papel\r\n"
						+ "2 - Plástico\r\n"
						+ "3 - Madeira\r\n"
						+ "4 - Metal\r\n"
						+ "5 - Orgânico\r\n"
						+ "6 - Vidro\r\n"
						+ "7 - Resíduos Perigosos\r\n"
						+ "8 - Não Reciclável\r\n"
						+ "R: ");
				
				x=ler.nextInt();
			}
			
			if(x==1){
				System.out.println("= AZUL =\r\n"
						+ "Olá,"+nome+", se você escolheu a opção PAPÉIS, é na minha lixeira que você deve dispensá-los: A Azul!\r\n"
						+ "Por aqui você pode jogar: jornais, revistas, sulfite, rascunhos, folhas de caderno, formulários, caixas de papelão, aparas de papel, envelopes, cartazes, panfletos etc.\r\n"
						+ "Se liga, aqui eu não aceito: adesivos, papel carbono, celofane, guardanapos, bitucas de cigarro, papéis plastificados, metalizados, papéis sanitários, etc\r\n"
						+ "");
			}
			else if(x==2) {
				System.out.println("= VERMELHA =\r\n"
						+ "Olá,"+nome+", se você escolheu a opção PLÁSTICOS, é na minha lixeira que você deve dispensá-los: A Vermelha!\r\n"
						+ "Aqui nós aceitamos sacolinhas, embalagens, copos, frascos, potes, tampinhas, tubos de PVC, embalagens PET (que são aquelas embalagens de refrigerantes, sucos, água, etc..).\r\n"
						+ "Mas fique esperto, aqui eu não engulo: cabos de panelas, adesivos, espuma, acrílico, embalagens metalizadas (Biscoitos e Salgadinhos)!\r\n"
						+ "");
			}
			else if(x==3) {
				System.out.println("= PRETO = \r\n"
						+ "Olá,"+nome+", se você escolheu a opção MADEIRA, é na minha lixeira que você deve dispensá-los: A PRETA!\r\n"
						+ "\r\n"
						+ "Aqui vão: galhos de árvores, caixas, restos de construção, móveis, artefatos e objetos, palitos de \ndente ou sorvete, resíduos industriais, etc.\r\n"
						+ "Ao descartar madeira, é necessário retirar todos os pregos, parafusos ou metais cortantes.\r\n"
						+ "Se liga, os outros tipos de resíduos não podem ser dispensados aqui.\r\n"
						+ "");
			}
			else if(x==4) {
				System.out.println("= AMARELO =\r\n"
						+ "Olá,"+nome+", se você escolheu a opção METAIS, é na minha lixeira que você deve dispensá-los: A Amarela!\r\n"
						+ "Aqui a gente aceita: tampinhas de garrafas, lacres de latinhas, latas, ferragens, arames, chapas, canos, pregos, parafusos, porcas, ferramentas, etc.\r\n"
						+ "Mas não esquece, por aqui não valo jogar: clipes, grampos, esponjas de aço, aerossóis, latas de tinta ou verniz, solventes ou químicos, latas de inseticida, etc.\r\n"
						+ "");
			}
			else if(x==5) {
				System.out.println("= MARROM =\r\n"
						+ "Olá,"+nome+", se você escolheu a opção ORGÂNICO, é na minha lixeira que você deve dispensá-los: A Marrom!\r\n"
						+ "Eu engulo quase tudo, se liga: cascas e restos de frutas, legumes e verduras, saquinhos de chá, restos de pães, biscoitos, pó e coador de café, esterco de animais herbívoros (Galinhas, Gado, Cavalos).\r\n"
						+ "Só que tem umas paradas que não descem, de jeito nenhum: produtos químicos, remédios, poeira, papéis higiênicos, guardanapos sujos, gorduras, óleos, graxa, leite e derivados, ossos, restos de carne, etc.\r\n"
						+ "");
			}
			else if(x==6) {
				System.out.println("= VERDE =\r\n"
						+ "Olá,"+nome+", se você escolheu a opção VIDRO, é na minha lixeira que você deve dispensá-los: A Verde!\r\n"
						+ "Tudo o que for garrafas, potes de conserva, embalagens, frascos vazios de remédios, copos, cacos dos resíduos citados, eu aceito por aqui.\r\n"
						+ "Mas se liga nisso, aqui não podem ser descartados os seguintes itens: espelhos, óculos, boxes temperados, pirex, cerâmicas, porcelanas, tubos de TV, tampas de forno, etc.\r\n"
						+ "");
			}
			else if(x==7) {
				System.out.println("= LARANJA =\r\n"
						+ "Olá,"+nome+", se você escolheu a opção RESÍDUOS PERIGOSOS, é na minha lixeira que você deve dispensá-los: A LARANJA!\r\n"
						+ "Aqui vão os seguintes itens: pilhas e baterias, pneus, óleos lubrificantes, produtos eletrônicos, lâmpadas fluorescentes, de vapor, de sódio / mercúrio ou de luz mista, tintas, produtos químicos, etc.\r\n"
						+ "Lembrete: Todos os resíduos perigosos necessitam de tratamento e destinação final especiais.\r\n"
						+ "Se liga, os outros tipos de resíduos não podem ser dispensados aqui.\r\n"
						+ "");
			}
			else if(x==8) {
				System.out.println("= CINZA =\r\n"
						+ "Olá,"+nome+", se você escolheu a opção NÃO RECICLÁVEIS, é na minha lixeira que você deve dispensá-los: A CINZA!\r\n"
						+ "Aqui são colocados os produtos que não podem ser reciclados... e são eles: papéis higiênicos, guardanapos sujos, papéis metalizados ou parafinados, adesivos, papel carbono, fraldas, absorventes, fotografias, espelhos, esponjas de aço, itens de cerâmica, isopor, EVA, vidro temperado, vidros de carro, cortiça, ampolas de remédio, lentes de óculos, etc.\r\n"
						+ "O que não descartar: resíduos que podem ser reciclados conforme orientação de descarte desse app\r\n"
						+ "");
			}
			
			System.out.println("\nObrigado "+nome+", por aprender conosco sobre um Mundo Melhor!\n");
		
		}
		} while(x!=0);
		
		System.out.println("\nObrigado "+nome+", por aprender conosco sobre um Mundo Melhor!\n");
		
	}
}
