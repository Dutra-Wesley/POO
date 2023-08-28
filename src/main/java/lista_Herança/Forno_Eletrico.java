package lista_Herança;

public class Forno_Eletrico extends Eletrodomesticos{

	private double capacidadeLitros;

	public Forno_Eletrico(String modelo, String fabricante, double kilowatt, double capacidadeLitros) {
		super(modelo, fabricante, kilowatt);
		this.capacidadeLitros = capacidadeLitros;
	}
	
	public Forno_Eletrico () {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

	@Override
	public double calcularConsumoDeEnergia(int dias) {
	
		double consumoCozinhar = this.getKilowatt() * (dias * 0.75); 
		
		return consumoCozinhar;
	}
	
}
