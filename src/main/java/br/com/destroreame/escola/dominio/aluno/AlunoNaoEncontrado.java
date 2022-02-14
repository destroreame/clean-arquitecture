package br.com.destroreame.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontrado(Cpf cpf) {
		super("Aluno nao encontrado com CPF: " + cpf.getNumero());
	}

}
