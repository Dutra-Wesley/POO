package lista_polimorfismo;

public class Triângulo_Equilátero extends Triângulo{

	private double lado;
	
	public Triângulo_Equilátero(double lado) {
		super();
		this.lado = lado;
	}

	public Triângulo_Equilátero() {
		super();
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		
	}

	@Override
	public void calcularPerimetro() {
		
	}

	
}
