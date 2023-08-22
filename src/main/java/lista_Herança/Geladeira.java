package lista_Herança;

public class Geladeira {

	private String modelo;
	private String fabricante;
	private double capacidadeLitros;
	
	public Geladeira(String modelo, String fabricante, double capacidade) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.capacidadeLitros = capacidade;
	}
	
	public Geladeira () {
		super();
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getCapacidade() {
		return capacidadeLitros;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeLitros = capacidade;
	}
	
}
