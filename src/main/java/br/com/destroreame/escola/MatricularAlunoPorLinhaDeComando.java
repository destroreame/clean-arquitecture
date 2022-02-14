package br.com.destroreame.escola;

import br.com.destroreame.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.destroreame.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.destroreame.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));
    }

}
