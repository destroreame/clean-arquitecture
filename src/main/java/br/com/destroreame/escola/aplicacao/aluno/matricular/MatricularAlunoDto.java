package br.com.destroreame.escola.aplicacao.aluno.matricular;

import br.com.destroreame.escola.dominio.aluno.Aluno;
import br.com.destroreame.escola.dominio.aluno.Cpf;
import br.com.destroreame.escola.dominio.aluno.Email;

public class MatricularAlunoDto {

    private String nome;
    private String cpf;
    private String email;

    public MatricularAlunoDto(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Aluno criarAluno() {
        return new Aluno(nome, new Cpf(cpf), new Email(email));
    }
}
