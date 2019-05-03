package br.unibave.bpr.exercicios2_2_2;

public class ContatoCompleto {

    private String nome;

    private String endereco;

    private String telefone;

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return nome + ": " + endereco + " / " + telefone + " / " + email;
    }
}
