package br.unibave.bpr.exercicios2_2_2;

public class ContatoInternet {

    private String nome;

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome + ": " + email;
    }

    void setEndereco(String endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTelefone(String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
