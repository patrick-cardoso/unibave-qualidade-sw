package br.unibave.bpr.exercicios2_2_2;

public class BuilderTelefone implements Builder {

    private ContatoTelefone contato = new ContatoTelefone();

    public void adicionarNome(String nome) {
        contato.setNome(nome);
    }

    public void adicionarEndereco(String endereco) {

    }

    public void adicionarTelefone(String telefone) {
        contato.setTelefone(telefone);
    }

    public void adicionarEmail(String email) {

    }

    public ContatoTelefone getContato() {
        return contato;
    }
}
