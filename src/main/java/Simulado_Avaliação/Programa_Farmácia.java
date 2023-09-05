package Simulado_Avaliação;

public class Programa_Farmácia {

	public static void main(String[] args) {
		
		Endereco enderecoLegrand = new Endereco("Rua dos Remédios", 100, "Centro", "Palhoça", "Santa Catarina");
		Laboratorio legrand = new Laboratorio("Legrand", "12.345.678/0001-11", enderecoLegrand);
		
		Endereco enderecoMedley = new Endereco("Rua da medicação", 200, "Estreito", "Florianópolis", "Santa Catarina");
		Laboratorio medley = new Laboratorio("Medley", "12.345.678/0001-22", enderecoMedley);
		
		Remedio rosuva = new Remedio("Rosuva", 55.00, legrand);
		Remedio glifage = new Remedio("Glifage", 35.00, legrand);
		Remedio aradois_H = new Remedio("Aradois_H", 50.00, legrand);
		Remedio trandilax = new Remedio("Trandilax", 10.00, legrand);
		
		Remedio rosuvastatina = new Remedio("Rosuvastatina", 50.00, medley);
		Remedio lexotan = new Remedio("Lexotan", 40.00, medley);
		Remedio losartana = new Remedio("Losartana", 45.00, medley);
		Remedio torsilax = new Remedio("Torsilax", 15.00, medley);
		
		Remedio[] remediosFarmaciaSenac = {rosuva, rosuva, rosuva,rosuva, glifage, glifage, glifage, aradois_H, aradois_H, trandilax, 
				rosuvastatina, lexotan, lexotan, losartana, losartana, losartana, torsilax, torsilax, torsilax, torsilax};
		Estoque estoqueFarmaciaSenac = new Estoque("Luciano", remediosFarmaciaSenac);
		
		Endereco enderecoFarmaciaSenac = new Endereco("Rua Jardim Silva", 360, "Centro", "Florianópolis", "Santa Catarina");
		Farmacia farmaciaSenac = new Farmacia("Farmácia do Senac","12.345.678/0001-33", enderecoFarmaciaSenac, estoqueFarmaciaSenac);
		
	}

	
}
