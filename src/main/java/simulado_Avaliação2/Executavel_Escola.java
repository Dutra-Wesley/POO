package simulado_Avaliação2;

public class Executavel_Escola {

	public static void main(String[] args) {

		// ALUNOS TURMA A
		Endereco enderecoJuliana = new Endereco("Jujubas", 100, "Campeche","Florianópolis", "Santa Catarina");
		Aluno alunoJuliana = new Aluno("Juliana Silva", 15, enderecoJuliana);
		Endereco enderecoDaniele = new Endereco("Gomas", 200, "Pedra Branca","Palhoça", "Santa Catarina");
		Aluno alunoDaniele = new Aluno("Daniele Veiga", 14, enderecoDaniele);
		Endereco enderecoBruna = new Endereco("Caramelos", 300, "Kobrasol","São José", "Santa Catarina");
		Aluno alunoBruna = new Aluno("Bruna Andrade", 13, enderecoBruna);
		Endereco enderecoHelena = new Endereco("Pirulitos", 400, "Estreito","Florianópolis", "Santa Catarina");
		Aluno alunoHelena = new Aluno("Helena de Andrade", 16, enderecoHelena);
		Endereco enderecoMary = new Endereco("Chicletes", 500, "Aririú","Palhoça", "Santa Catarina");
		Aluno alunoMary = new Aluno("Mary Souza", 15, enderecoMary);
		
		// ALUNOS TURMA B
		Endereco enderecoPaula = new Endereco("Bombons", 600, "Forquilinhas","São José", "Santa Catarina");
		Aluno alunoPaula = new Aluno("Paula Vieira", 14, enderecoPaula);
		Endereco enderecoRenata = new Endereco("Balas", 700, "Capoeiras","Florianópolis", "Santa Catarina");
		Aluno alunoRenata = new Aluno("Renata Augusta", 15, enderecoRenata);
		Endereco enderecoLuiza = new Endereco("Trufas", 800, "Centro","Biguaçu", "Santa Catarina");
		Aluno alunoLuiza = new Aluno("Luiza Piris", 15, enderecoLuiza);
		Endereco enderecoBeatriz = new Endereco("Doces", 900, "Campinas","São José", "Santa Catarina");
		Aluno alunoBeatriz = new Aluno("Beatriz Santos", 14, enderecoBeatriz);
		Endereco enderecoSuellen = new Endereco("Confetes", 1000, "Capoeiras","Florianópolis", "Santa Catarina");
		Aluno alunoSuellen = new Aluno("Suellen Lima", 17, enderecoSuellen);
		
		// PROFESSORES
		Endereco enderecoZeca = new Endereco("Enciclopédias", 500, "Centro", "Florianópolis", "Santa Catarina");
		Professor professorZeca = new Professor("Zeca", 45, enderecoZeca, "Matemática");
		Endereco enderecoPires = new Endereco("Dicionários", 750, "Centro", "Florianópolis", "Santa Catarina");
		Professor professorPires = new Professor("Pires", 40, enderecoPires, "Português");
		
		Aluno[] alunosTurmaA = {alunoJuliana,alunoDaniele,alunoBruna,alunoHelena,alunoMary};
		Aluno[] alunosTurmaB = {alunoPaula,alunoRenata,alunoLuiza,alunoBeatriz,alunoSuellen};
		Turma turmaA = new Turma(7, alunosTurmaA, professorZeca);
		Turma turmaB = new Turma(8, alunosTurmaB, professorPires);
		Turma[] turmas = {turmaA, turmaB};
		
		Endereco enderecoEscola = new Endereco("Rua dos Estudos", 1000, "Centro", "Florianópolis", "Santa Catarina");
		Escola escola = new Escola("Escola Básica das Meninas de Florianópolis", "32323232", enderecoEscola, turmas);
		
		// 3 - A
		escola.contabilizarAlunos();
		
		// 3 - B
		escola.localizarEnderecoRegente("Zeca");
		
		//3 - C
		escola.listarNomeAlunas(7);
		
		//3 - D
		escola.identificarRegenteMaisNovo();
		
		//3 - E
		escola.listarAlunosPorCidade(7);
		
		
	}

}
