package lista_polimorfismo;

public class Triângulo_Retângulo extends Triângulo {

	private double base;
	private double altura;
	
	public Triângulo_Retângulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Triângulo_Retângulo() {
		super();
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		
	}

	@Override
	public void calcularPerimetro() {
		
	}

	
}
