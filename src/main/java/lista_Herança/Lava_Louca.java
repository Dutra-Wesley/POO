package lista_Herança;

public class Lava_Louca extends Eletrodomesticos {

	private double capacidadeLitros;
	
	public Lava_Louca(String modelo, String fabricante, double capacidadeLitros) {
		super();
		this.capacidadeLitros = capacidadeLitros;
	}
	
	public Lava_Louca () {
		super();
		
	}

	public double getCapacidade() {
		return capacidadeLitros;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeLitros = capacidade;
	}

}
