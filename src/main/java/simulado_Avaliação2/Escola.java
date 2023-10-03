package simulado_Avaliação2;

public class Escola {

	private String nome;
	private String telefone;
	private Endereco enderecoEscola;
	private Turma[] turmas;
	
	public Escola(String nome, String telefone, Endereco enderecoEscola, Turma[] turmas) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.enderecoEscola = enderecoEscola;
		this.turmas = turmas;
	}
	
	public Escola() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(Endereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}
	
	public void contabilizarAlunos() {
		
		int totalAlunos = 0;
		for (Turma turma : turmas) {
			
			totalAlunos += turma.contabilizarAlunos();
		}
		System.out.println("Total de alunos na escola é: " + totalAlunos);
	}
	
	public void localizarEnderecoRegente(String professor) {
		
		for (Turma turma : turmas) {
			turma.localizarEnderecoRegente(professor);
		}
	}
	
	public void listarNomeAlunas(int serie) {
		
		for (Turma turma : turmas) {
			turma.listarNomeAlunas(serie);
		}
	}
	
	public void identificarRegenteMaisNovo() {
			
		Professor regenteMaisNovo = this.turmas[0].getRegente();
		
		for (int i = 0; i < turmas.length; i++) {
			if (this.turmas[i].getRegente().getIdade() < regenteMaisNovo.getIdade()) {
				
				regenteMaisNovo = this.turmas[i].getRegente();
			}
		}
		System.out.println(regenteMaisNovo.getNome());
	}
	
	public void listarAlunosPorCidade(String cidade) {
		
		
	}
	
	
}
