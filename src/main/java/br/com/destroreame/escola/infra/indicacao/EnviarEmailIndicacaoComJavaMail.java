package br.com.destroreame.escola.infra.indicacao;

import br.com.destroreame.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.destroreame.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
