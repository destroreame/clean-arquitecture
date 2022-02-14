package br.com.destroreame.escola.dominio.aluno;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCpfEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(nome, new Cpf(cpf), new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }

    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaDeAluno();
        Aluno aluno = fabrica
                .comNomeCpfEmail("Fernando", "292.540.378-68", "destroream@gmail.com")
                .comTelefone("19","99256437")
                .criar();
    }
}
