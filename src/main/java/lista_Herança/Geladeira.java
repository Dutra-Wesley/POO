package lista_Herança;

public class Geladeira extends Eletrodomesticos {

	private double capacidadeLitros;
	
	public Geladeira(String modelo, String fabricante, double capacidadeLitros) {
		super();
		this.capacidadeLitros = capacidadeLitros;
	}
	
	public Geladeira () {
		super();
		
	}

	public double getCapacidade() {
		return capacidadeLitros;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeLitros = capacidade;
	}
	
}
