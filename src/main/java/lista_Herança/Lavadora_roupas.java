package lista_Herança;

public class Lavadora_roupas {

	private String modelo;
	private String fabricante;
	private double capacidadeQuilos;
	
	public Lavadora_roupas(String modelo, String fabricante, double capacidade) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.capacidadeQuilos = capacidade;
	}
	
	public Lavadora_roupas () {
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
		return capacidadeQuilos;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeQuilos = capacidade;
	}
	
}
