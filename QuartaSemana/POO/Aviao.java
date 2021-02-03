/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class Aviao {

	/* Atributos */

	String modeloAviao;
	int capacidadeAviao;
	double velocidadeAviao;

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public int getCapacidadeAviao() {
		return capacidadeAviao;
	}

	public void setCapacidadeAviao(int capacidadeAviao) {
		this.capacidadeAviao = capacidadeAviao;
	}

	public double getVelocidadeAviao() {
		return velocidadeAviao;
	}

	public void setVelocidadeAviao(double velocidadeAviao) {
		this.velocidadeAviao = velocidadeAviao;
	}

}
