package lista_Herança2;

public class Martelo extends Ferramentas{

	private String tipo;
	private double tamanhoMilimetro;
	
	public Martelo(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, String tipo,
			double tamanhoMilimetro) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste);
		this.tipo = tipo;
		this.tamanhoMilimetro = tamanhoMilimetro;
	}
	
	public Martelo () {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamanhoMilimetro() {
		return tamanhoMilimetro;
	}

	public void setTamanhoMilimetro(double tamanhoMilimetro) {
		this.tamanhoMilimetro = tamanhoMilimetro;
	}
	
	
}
