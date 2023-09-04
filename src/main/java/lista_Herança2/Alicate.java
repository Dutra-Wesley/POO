package lista_Herança2;

public class Alicate extends Ferramentas{

	private String tipo;
	private double tamanhoPolegadas;
	
	public Alicate(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, String tipo,
			double tamanhoPolegadas) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste);
		this.tipo = tipo;
		this.tamanhoPolegadas = tamanhoPolegadas;
	}
	
	public Alicate () {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamanhoPolegadas() {
		return tamanhoPolegadas;
	}

	public void setTamanhoPolegadas(double tamanhoPolegadas) {
		this.tamanhoPolegadas = tamanhoPolegadas;
	}
	
	
}
