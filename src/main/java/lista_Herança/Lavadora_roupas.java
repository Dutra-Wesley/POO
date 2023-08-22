package lista_Herança;

public class Lavadora_roupas extends Eletrodomesticos {

	private double capacidadeQuilos;
	
	public Lavadora_roupas(String modelo, String fabricante, double capacidadeQuilos) {
		super();
		this.capacidadeQuilos = capacidadeQuilos;
	}
	
	public Lavadora_roupas () {
		super();
		
	}

	public double getCapacidade() {
		return capacidadeQuilos;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeQuilos = capacidade;
	}
	
}
