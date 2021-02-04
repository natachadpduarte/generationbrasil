/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/

package Heranca;

import java.text.NumberFormat;

public class Administrador extends Pessoa{

	private double ajudaDeCusto;
	private String segmento;
		
		public Administrador(String nome, int idade, String endereco, String telefone, String segmento, double ajudaDeCusto) {
			
			super(nome,idade,endereco,telefone);
			this.segmento=segmento;
			this.ajudaDeCusto=ajudaDeCusto;
		}

		
		public double getAjudaDeCusto() {
			return ajudaDeCusto;
		}

		public void setAjudaDeCusto(double ajudaDeCusto) {
			this.ajudaDeCusto = ajudaDeCusto;
		}

		public String getSegmento() {
			return segmento;
		}

		public void setSegmento(String segmento) {
			this.segmento = segmento;
		}
		
		
		public void info() {
			
			System.out.println("******************************************************************\n"
					+ "Administrador: " + getNome() + "\nIdade: " + getIdade() + " anos \n" + "Endereço: " + getEndereco() + "\n"+ "Telefone: " + getTelefone() +
					"\nSegmento: " + getSegmento() + "\nAjuda de custo: " + this.Moeda() + "\n*******************************************************************");
		}
		
		
		public String Moeda()
		{
			NumberFormat format = NumberFormat.getCurrencyInstance();
			format.setMinimumFractionDigits(2);
			String Moeda = format.format(ajudaDeCusto);
			return Moeda;
		}

		
		
}
