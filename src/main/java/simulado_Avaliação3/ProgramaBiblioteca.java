package simulado_Avaliação3;

import java.time.LocalDate;

public class ProgramaBiblioteca {

	public static void main(String[] args) {

		Endereco enderecoCarlos = new Endereco("Rua das Maças", 100, "Ingleses", "Florianópolis", "Santa Catarina");
		Endereco enderecoMachado = new Endereco("Rua das Laranjas", 200, "Aririu", "Palhoça", "Santa Catarina");
		Endereco enderecoCecilia = new Endereco("Rua das Uvas", 300, "Pedra Branca", "Palhoça", "Santa Catarina");
		Endereco enderecoOsvald = new Endereco("Rua das Melancias", 400, "Estreito", "Florianópolis", "Santa Catarina");
		
		LocalDate dataCarlos = LocalDate.of(1946, 10, 9);
		Autor carlos = new Autor("Carlos Dummond", dataCarlos, enderecoCarlos);
		LocalDate dataMachado = LocalDate.of(1915, 03, 15);
		Autor machado = new Autor("Machado de Assis", dataMachado, enderecoMachado);
		LocalDate dataCecilia = LocalDate.of(1927, 05, 21);
		Autor cecilia = new Autor("Cecilia Meireles", dataCecilia, enderecoCecilia);
		LocalDate dataOsvald = LocalDate.of(1934, 06, 04);
		Autor osvald = new Autor("Osvald Andrade", dataOsvald, enderecoOsvald);
		
		LocalDate dataVeja = LocalDate.of(2012, 12, 01);
		LocalDate dataBrejo = LocalDate.of(1983, 01, 30);
		LocalDate dataIsto = LocalDate.of(2013, 06, 01);
		LocalDate dataQuincas = LocalDate.of(1892, 05, 13);
		LocalDate dataAuto = LocalDate.of(2011, 9, 01);
		LocalDate dataColar = LocalDate.of(1934, 11, 20);
		LocalDate dataSuper = LocalDate.of(2010, 04, 01);
		LocalDate dataCondenados = LocalDate.of(1941, 07, 28);
		
		Revista veja = new Revista("Veja", 60, dataVeja, carlos);
		Livro brejo = new Livro("Brejo das Almas", 8, dataBrejo, carlos);
		
		Revista isto = new Revista("IstoÉ", 80, dataIsto, machado);
		Livro quincas = new Livro("Quincas Borba", 1, dataQuincas, machado);
		
		Revista auto = new Revista("Auto Esporte", 20, dataAuto, cecilia);
		Livro colar = new Livro("Colar de Carolina", 3, dataColar, cecilia);
		
		Revista superInteressante = new Revista("Super Interessante", 100, dataSuper, osvald);
		Livro condeandos = new Livro("Os Condenados", 7, dataCondenados, osvald);
		
		Obra[] obras = {veja, brejo, isto, quincas, auto, colar, superInteressante, condeandos};
		
		Endereco enderecoBiblioteca = new Endereco("Rua das Mangas", 600, "Centro", "Florianópolis", "Santa Catarina");
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central", obras, enderecoBiblioteca);
		
		// 3 - A
		biblioteca.contabilizarObras();
		
		// 3 - B
		biblioteca.identificarObraMaisAntiga();
		
		// 3 - C
		biblioteca.identificarAutorMaisNovo();
		
		// 3 - D
		biblioteca.identificarDiferencaIdadeDosAutores();
		
		// 3 - E
		biblioteca.localizarEnderecoAutor("Cecilia Meireles");
		
		// 3 - F
		biblioteca.identificarAutoresDaCidade("Florianópolis");
		
	}

}
