package br.com.destroreame.escola.dominio.aluno;

public class Telefone {

    // VALUE OBJECT - Não importa a identificação

    private final String ddd;
    private final String numero;

    public Telefone(String ddd, String numero) {

        validaTelefone(ddd, numero);

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    private void validaTelefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e número são obrigatórios!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD inválido");
        }

        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Número inválido");
        }
    }

}
