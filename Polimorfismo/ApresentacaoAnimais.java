package Polimorfismo;

public class ApresentacaoAnimais {

	public static void main (String args[]) {
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Atilla");
		cachorro1.setIdade(11);
		cachorro1.setSom("Au au");
		cachorro1.setAcao("Corre");
		cachorro1.setRaca("YorkShire\n\n");
		
		
		
		Cavalo cavalo1 = new Cavalo();
		cavalo1.setNome("Willy");
		cavalo1.setIdade(3);
		cavalo1.setSom("hinn in in");
		cavalo1.setAcao("Corre");
		cavalo1.setPorte("Grande");
		
		
		
		Preguica preguica1 = new Preguica();
		
		preguica1.setNome("Flash");
		preguica1.setIdade(4);
		preguica1.setSom("xiiii");
		preguica1.setAcao("Sobe em árvores");
		preguica1.setPeso(7);
		
		
		Animal[] animais = new Animal[3];
		animais[0]=cachorro1;
		animais[1]=cavalo1;
		animais[2]=preguica1;
		
		for(Animal animale:animais) {
			
			System.out.println(animale.getSom());
		}
		
		
	}
}
