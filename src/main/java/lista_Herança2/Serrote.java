package lista_Herança2;

public class Serrote extends Ferramentas{

	private String tipo;
	private double tamanhoPolegadas;
	private int quantidadeDentes;
	
	public Serrote(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, String tipo,
			double tamanhoPolegadas, int quantidadeDentes) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste);
		this.tipo = tipo;
		this.tamanhoPolegadas = tamanhoPolegadas;
		this.quantidadeDentes = quantidadeDentes;
	}
	
	public Serrote ( ) {
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

	public int getQuantidadeDentes() {
		return quantidadeDentes;
	}

	public void setQuantidadeDentes(int quantidadeDentes) {
		this.quantidadeDentes = quantidadeDentes;
	}
	
	
}
