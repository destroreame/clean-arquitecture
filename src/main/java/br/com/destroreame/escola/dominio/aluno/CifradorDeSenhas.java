package br.com.destroreame.escola.dominio.aluno;

public interface CifradorDeSenhas {

    String cifrarSenhas(String senha);

    boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
