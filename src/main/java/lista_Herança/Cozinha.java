package lista_Herança;

public class Cozinha {

	public static void main(String[] args) {
		
		Geladeira geladeira = new Geladeira ("TF39S", "Electrolux", 40.5, 310);
		Fogao fogao = new Fogao ("BFS5NCR", "Brastemp", 60.2, 4);
		Lava_Louca lava_louca = new Lava_Louca("LE08S", "Elextrolux", 30.3, 8);
		Microondas microondas = new Microondas("MI41S", "Electrolux", 15.5, 31);
		Forno_Eletrico forno = new Forno_Eletrico("PFE48IP", "Philco", 50, 46);
		
		double consumoForno = forno.calcularConsumoDeEnergia(10);
		double consumoMes = calcularConsumoMes(geladeira, fogao, lava_louca, microondas, consumoForno);
		double consumoDia = calcularConsumoDia(geladeira, fogao, lava_louca, microondas, consumoForno);
		
		System.out.println("Seu consumo mensal foi: " + consumoMes + " kilowatts");
		System.out.println("Seu consumo em 10 dias foi: " + consumoDia + " kilowatts");
		
	}

	private static double calcularConsumoDia(Geladeira geladeira, Fogao fogao, Lava_Louca lava_louca,
			Microondas microondas, double consumoForno) {
		
		geladeira.calcularConsumoDeEnergia(10);
		fogao.calcularConsumoDeEnergia(10);
		lava_louca.calcularConsumoDeEnergia(10);
		microondas.calcularConsumoDeEnergia(10);
		
		double consumoDia = geladeira.getKilowatt() + fogao.getKilowatt() + lava_louca.getKilowatt() + microondas.getKilowatt() + consumoForno;
		
		return consumoDia;
	}

	private static double calcularConsumoMes(Geladeira geladeira, Fogao fogao, Lava_Louca lava_louca,
			Microondas microondas, double consumoForno) {
		
		geladeira.calcularConsumoDeEnergia();
		fogao.calcularConsumoDeEnergia();
		lava_louca.calcularConsumoDeEnergia();
		microondas.calcularConsumoDeEnergia();
		
		double consumoMes = geladeira.getKilowatt() + fogao.getKilowatt() + lava_louca.getKilowatt() + microondas.getKilowatt() + consumoForno;
		
		return consumoMes;
	}

}
