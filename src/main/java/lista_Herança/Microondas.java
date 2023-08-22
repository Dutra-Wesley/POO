package lista_Herança;

public class Microondas extends Eletrodomesticos {

	private double capacidadeLitros;
	
	public Microondas(String modelo, String fabricante, double capacidadeLitros) {
		super();
		this.capacidadeLitros = capacidadeLitros;
	}
	
	public Microondas () {
		super();
		
	}

	public double getCapacidade() {
		return capacidadeLitros;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeLitros = capacidade;
	}
	
}
