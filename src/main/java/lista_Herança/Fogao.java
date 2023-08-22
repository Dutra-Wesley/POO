package lista_Herança;

public class Fogao extends Eletrodomesticos {

	private int bocas;
	
	public Fogao(String modelo, String fabricante, int bocas) {
		super();
		this.bocas = bocas;
	}
	
	public Fogao () {
		super();
		
	}

	public int getBocas() {
		return bocas;
	}

	public void setBocas(int bocas) {
		this.bocas = bocas;
	}
	
}
