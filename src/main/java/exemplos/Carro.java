package exemplos;

public class Carro extends Veiculo {

	private double potenciaHP;

	public Carro(String modelo, String fabricante, int ano, double valor, double potenciaHP) {
		super(modelo, fabricante, ano, valor);
		this.potenciaHP = potenciaHP;
	}

	public Carro() {
		super();
		
	}

	public double getPotenciaHP() {
		return potenciaHP;
	}

	public void setPotenciaHP(double potenciaHP) {
		this.potenciaHP = potenciaHP;
	} 
	
}
