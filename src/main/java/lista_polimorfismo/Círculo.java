package lista_polimorfismo;

public class Círculo extends Forma_Geométrica {

	private double raio;
	
	public Círculo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public Círculo() {
		super();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public void calcularArea() {
		
	}

	@Override
	public void calcularPerimetro() {
		
	}
	
	
}
