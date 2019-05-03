package br.unibave.bpr.exercicios2_2_2;

public class ContatoTelefone {

    private String nome;

    private String telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return nome + ": " + telefone;
    }
}
