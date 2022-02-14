package br.com.destroreame.escola.aplicacao.aluno.matricular;

import br.com.destroreame.escola.dominio.aluno.Aluno;
import br.com.destroreame.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    // COMMAND
    public void executa(MatricularAlunoDto dados) {
        Aluno alunoNovo = dados.criarAluno();
        repositorio.matricular(alunoNovo);
    }
}
