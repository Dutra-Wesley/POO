package lista_Herança;

public class Fogao {

	private String modelo;
	private String fabricante;
	private int bocas;
	
	public Fogao(String modelo, String fabricante, int bocas) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.bocas = bocas;
	}
	
	public Fogao () {
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

	public int getBocas() {
		return bocas;
	}

	public void setBocas(int bocas) {
		this.bocas = bocas;
	}
	
}
