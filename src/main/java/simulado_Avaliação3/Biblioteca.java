package simulado_Avaliação3;

import java.time.Period;
import java.util.HashSet;

public class Biblioteca {

	private String nome;
	private Obra[] listaObras;
	private Endereco enderecoBiblioteca;
	
	public Biblioteca(String nome, Obra[] listaObras, Endereco enderecoBiblioteca) {
		super();
		this.nome = nome;
		this.listaObras = listaObras;
		this.enderecoBiblioteca = enderecoBiblioteca;
	}
	
	public Biblioteca() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Obra[] getListaObras() {
		return listaObras;
	}

	public void setListaObras(Obra[] listaObras) {
		this.listaObras = listaObras;
	}

	public Endereco getEnderecoBiblioteca() {
		return enderecoBiblioteca;
	}

	public void setEnderecoBiblioteca(Endereco enderecoBiblioteca) {
		this.enderecoBiblioteca = enderecoBiblioteca;
	}
	
	@SuppressWarnings("unused")
	public void contabilizarObras () {
		
		int totalObras = 0;
		for (Obra obra : listaObras) {
			totalObras++;
		}
		
		System.out.println("O total de obras é: " + totalObras);
	}
	
	public void identificarObraMaisAntiga() {
		
		Obra obraMaisAntiga = listaObras[0];
		for (Obra obra : listaObras) {
			
			if (obra.getDataPublicacao().isBefore(obraMaisAntiga.getDataPublicacao())) {
				obraMaisAntiga = obra;
			}
		}
		System.out.println(obraMaisAntiga);
	}
	
	public void identificarAutorMaisNovo() {
		
		Autor autorMaisNovo = listaObras[0].getAutor();
		for (Obra obra : listaObras) {
			
			if (obra.getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
				
				autorMaisNovo = obra.getAutor();
			}
		}
		
		System.out.println(autorMaisNovo);
	}
	
	public void identificarDiferencaIdadeDosAutores() {
		
		Autor autorMaisNovo = listaObras[0].getAutor();
		for (Obra obra : listaObras) {
			
			if (obra.getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
				
				autorMaisNovo = obra.getAutor();
			}
		}
		
		Autor autorMaisVelho = listaObras[0].getAutor();
		for (Obra obra : listaObras) {
			
			if (obra.getAutor().getDataNascimento().isBefore(autorMaisVelho.getDataNascimento())) {
				
				autorMaisVelho = obra.getAutor();
			}
		}
		
		Period diferencaAutores = Period.between(autorMaisVelho.getDataNascimento(), autorMaisNovo.getDataNascimento());
		System.out.println("Autor mais novo: " + autorMaisNovo);
		System.out.println("Autor mais velho: " + autorMaisVelho);
		System.out.println("Sua diferença de idade é: " + diferencaAutores.getDays() + "DIAS " + diferencaAutores.getMonths() + "MESES " + diferencaAutores.getYears() + "ANOS");
	}
	
	public void localizarEnderecoAutor (String nomeAutor) {
		
		for (Obra obra : listaObras) {
			
			if (obra.getAutor().getNome().equalsIgnoreCase(nomeAutor)) {
				
				System.out.println(obra.getAutor().getEnderecoAutor());
				break;
			}
		}
	}
	
	public void identificarAutoresDaCidade (String cidade) {
		
		HashSet<String> listaNomes = new HashSet<String>();
		for (Obra obra : listaObras) {
			
			if (obra.getAutor().getEnderecoAutor().getCidade().equalsIgnoreCase(cidade)) {
				
				listaNomes.add(obra.getAutor().getNome());
			}
		}
		
		for (String nome : listaNomes) {
			
			System.out.println(nome);
		}
	}
	
}
