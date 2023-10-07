package simulado_Avaliação2;

public class Turma {

	private int serie;
	private Aluno[] alunos;
	private Professor regente;
	
	public Turma(int serie, Aluno[] alunos, Professor regente) {
		super();
		this.serie = serie;
		this.alunos = alunos;
		this.regente = regente;
	}
	
	public Turma( ) {
		super();
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getRegente() {
		return regente;
	}

	public void setRegente(Professor regente) {
		this.regente = regente;
	}
	
	@SuppressWarnings("unused")
	public int contabilizarAlunos() {
		
		int contador = 0;
		for (Aluno aluno : alunos) {
			
			contador++;
		}
		return contador;
	}
	
	public void localizarEnderecoRegente(String professor) {
		
		if (this.regente.getNome().equalsIgnoreCase(professor)) {
			System.out.println(this.regente.getEndereco());
		}
	}
	
	public void listarNomeAlunas(int serie) {
		
		for (Aluno aluno : alunos) {
			if (this.serie == serie) {
				System.out.println(aluno.getNome());
			}
		}
	}
	
	public void listarAlunosPorCidade(String cidade) {
		
		for (Aluno aluno : alunos) {
			
			if (aluno.getEndereco().getCidade().equalsIgnoreCase(cidade)) {
				System.out.println(aluno.getNome());
			}
		}
	}
	
	
}
