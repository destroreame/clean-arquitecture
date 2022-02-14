package br.com.destroreame.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // ENTIDADE - Classes que possuem uma identificação única (CPF)

    private String nome;
    private Cpf cpf;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();
    private String senha;

    public Aluno(String nome, Cpf cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
