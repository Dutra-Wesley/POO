package prova;

import java.time.Period;

public class Operadora {
	
	private String nome;
	private String cnpj;
	private Endereco enderecoOperadora;
	private Chamado[] chamados;
	
	public Operadora(String nome, String cnpj, Endereco enderecoOperadora, Chamado[] chamados) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.enderecoOperadora = enderecoOperadora;
		this.chamados = chamados;
	}

	public Operadora() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEnderecoOperadora() {
		return enderecoOperadora;
	}

	public void setEnderecoOperadora(Endereco enderecoOperadora) {
		this.enderecoOperadora = enderecoOperadora;
	}

	public Chamado[] getChamados() {
		return chamados;
	}

	public void setChamados(Chamado[] chamados) {
		this.chamados = chamados;
	}

	
	public int identificarQuantidadeChamadosAbertos() {
		
		int contador = 0;
		for (Chamado chamado : chamados) {
			if (chamado.getDataFechamento() ==  null) {
				contador++;
			}
		}
		return contador;
	}

	public void identificarTecnicoMaisIdoso() {
		
		Tecnico tecnicoMaisIdoso = chamados[0].getTecnico();
		
		for (int i = 0; i < chamados.length; i++) {
			
			if (chamados[i].getTecnico().getDataNascimento().isBefore(tecnicoMaisIdoso.getDataNascimento())) {
				
				tecnicoMaisIdoso = chamados[i].getTecnico();
			}
			
		}
		System.out.println(tecnicoMaisIdoso);
	}

	public void identificarClienteMaisNovo() {
		
		Cliente clienteMaisNovo = chamados[0].getCliente();
		
		for (int i = 0; i < chamados.length; i++) {
			
			if (chamados[i].getCliente().getDataNascimento().isAfter(clienteMaisNovo.getDataNascimento())) {
				
				
				clienteMaisNovo = chamados[i].getCliente();
			}
			
		}
		System.out.println(clienteMaisNovo);
	}

	public Period identificarDiferecaIdadeClienteMaisNovoMaisIdoso() {
		
		Cliente clienteMaisNovo = chamados[0].getCliente();
		
		for (int i = 0; i < chamados.length; i++) {
			
			if (chamados[i].getCliente().getDataNascimento().isAfter(clienteMaisNovo.getDataNascimento())) {
				
				
				clienteMaisNovo = chamados[i].getCliente();
			}
			
		}
		
		Cliente clienteMaisVelho = chamados[0].getCliente();
		
		for (int i = 0; i < chamados.length; i++) {
			
			if (chamados[i].getCliente().getDataNascimento().isBefore(clienteMaisVelho.getDataNascimento())) {
				
				
				clienteMaisVelho = chamados[i].getCliente();
			}
			
		}
		
		Period diferenca = Period.between(clienteMaisVelho.getDataNascimento(), clienteMaisNovo.getDataNascimento());
		
		return diferenca;
	}

	public void calcularPercentualClientesHomensMulheres() {
		
		double qtdeHomens = 0;
		double qtdeMulheres = 0;
		
		for (Chamado chamado : chamados) {
			
			if (chamado.getCliente().getSexo() == 'M') {
				
				qtdeHomens++;
				
			} else if (chamado.getCliente().getSexo() == 'F') {
				
				qtdeMulheres++;
			}
			
		}
		
		System.out.println(qtdeHomens/100 + "% são homens");
		System.out.println(qtdeMulheres/100 + "% são mulheres");
	}

	public void listarContatoClientePorNome(String string) {
		
		for (Chamado chamado : chamados) {
			
			if (chamado.getCliente().getNome().equalsIgnoreCase(string)) {
				
				System.out.println(chamado.getCliente().getContato());
			}
		}
		
	}

	public void listarEnderecoTecnicoPorNome(String string) {

		for (Chamado chamado : chamados) {
			
			if (chamado.getTecnico().getNome().equalsIgnoreCase(string)) {
				
				System.out.println(chamado.getTecnico().getEndereco());
			}
		}
		
	}

	public void listarClientesPorProblema(String string) {
		
		for (Chamado chamado : chamados) {
			
			if (chamado.getProblema().getDefeito().equalsIgnoreCase(string)) {
				
				System.out.println(chamado.getCliente().getNome());
			}
		}
		
	}

	public void contabilizarProblemasPorDificuldade(String string) {
		
		int contador = 0;
		
		for (Chamado chamado : chamados) {
			
			if (chamado.getProblema().getDificuldade().equalsIgnoreCase(string)) {
				
				contador++;
			}
		}
		
		System.out.println("No total existem " + contador + " clientes com o problema " + string);
	}

	public void identificarTecnicoComMaiorTempoContratacao() {
		
		Tecnico tecnicoMaisTempoDeCasa = chamados[0].getTecnico();
		
		for (Chamado chamado : chamados) {
			
			if (chamado.getTecnico().getDataContratacao().isBefore(tecnicoMaisTempoDeCasa.getDataContratacao())) {
				
				System.out.println(chamado.getTecnico());
			}
		}
		
	}
	
}
