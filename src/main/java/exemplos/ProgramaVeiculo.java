package exemplos;

public class ProgramaVeiculo {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Focus", "Ford", 2020, 45000.00, 170);
		System.out.println("Modelo: " + c1.getModelo());
		
		Carro c2 = new Carro("Golf", "Volks", 2000, 15000.00, 120);
		Carro c3 = new Carro("Fusca", "Volks", 1980, 35000.00, 190);
		
		Moto m1 = new Moto("CG-15", "Honda", 2022, 8000.00, 300);
		Moto m2 = new Moto("Ninja", "Kawalsaki", 2011, 18000.00, 1000);
		Moto m3 = new Moto("Halley", "Halley", 1995, 50000.00, 1200);
		
		Carro[] listaCarros = {c1, c2, c3};
		Moto[] listaMotos = {m1, m2, m3};
		
		//1 CALCULAR O VALOR TOTAL DOS CARROS.
		calcularValorTotalCarros(listaCarros);
		
		//2 INFORMAR O MODELO DO CARRO COM MAIOR POTÊNCIA
		informarModeloCarroMaiorPotencia(listaCarros);
		
		//3 INFORMAR O VALOR TOTAL DAS MOTOS
		calcularValorTotalMotos(listaMotos);
		
		//4 INFORMAR O MODELO E O FABRICANTE DA MOTO MAIS ANTIGA
		informarModeloEFabricanteMaisAntigo(listaMotos);
		
		//5 CONTABILIZAR O VALOR DE TODOS OS VEÍCULOS
		contabilizarValorTotalVeiculos(listaCarros, listaMotos);
		
	}

	private static void contabilizarValorTotalVeiculos(Carro[] listaCarros, Moto[] listaMotos) {
		
		double valorTotalVeiculos = 0;
		
		for (int i = 0; i < listaCarros.length; i++) {
			
			valorTotalVeiculos += listaCarros[i].getValor();
			
		}
		
		for (int i = 0; i < listaMotos.length; i++) {
			
			valorTotalVeiculos += listaMotos[i].getValor();
			
		}
		
		System.out.println("O valor total dos veiculos é: R$" + valorTotalVeiculos);
		
	}

	private static void informarModeloEFabricanteMaisAntigo(Moto[] listaMotos) {
		
		String[] modeloEFabricanteMaisAntigo = new String[2];
		int motoMaisAntiga = 9999;
		for (int i = 0; i < listaMotos.length; i++) {
			
			if (listaMotos[i].getAno() < motoMaisAntiga) {
				
				motoMaisAntiga = listaMotos[i].getAno();
				modeloEFabricanteMaisAntigo[0] = listaMotos[i].getModelo();
				modeloEFabricanteMaisAntigo[1] = listaMotos[i].getFabricante();
				
			}
			
		}
		
		System.out.println("A moto mais antiga é: " + modeloEFabricanteMaisAntigo[0] + " " + modeloEFabricanteMaisAntigo[1]);
		
	}

	private static void calcularValorTotalMotos(Moto[] listaMotos) {
		
		double valorTotalMotos = 0;
		for (int i = 0; i < listaMotos.length; i++) {
			
			valorTotalMotos += listaMotos[i].getValor();
			
		}
		
		System.out.println("O valor total das motos é R$" + valorTotalMotos);
		
	}

	private static void informarModeloCarroMaiorPotencia(Carro[] listaCarros) {
		
		Carro carroMaiorPotencia = listaCarros[0];
		for (int i = 0; i < listaCarros.length; i++) {
			
			if (listaCarros[i].getPotenciaHP() > carroMaiorPotencia.getPotenciaHP()) {
				
				carroMaiorPotencia = listaCarros[i];				
			}
			
		}
		
		System.out.println("O carro com maior potência é o " + carroMaiorPotencia.getModelo());
		
	}

	private static void calcularValorTotalCarros(Carro[] listaCarros) {
		
		double valorTotalCarros = 0;
		for (int i = 0; i < listaCarros.length; i++) {
			valorTotalCarros += listaCarros[i].getValor();
			
		}
		
		System.out.println("O valor total dos carros é: R$" + valorTotalCarros);
		
	}
	
}
