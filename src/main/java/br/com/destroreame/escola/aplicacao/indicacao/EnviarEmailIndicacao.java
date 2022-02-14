package br.com.destroreame.escola.aplicacao.indicacao;

import br.com.destroreame.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
