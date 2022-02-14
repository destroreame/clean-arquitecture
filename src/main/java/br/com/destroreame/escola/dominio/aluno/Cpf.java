package br.com.destroreame.escola.dominio.aluno;

public class Cpf {

    // VALUE OBJECT - Não importa a identificação

    private String numero;

    public Cpf(String numero) {
        if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF invalido!");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
