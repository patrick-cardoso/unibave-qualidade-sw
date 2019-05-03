package br.unibave.bpr.exercicios2_2_2;

public class BuilderContato implements Builder {

    private ContatoCompleto contato = new ContatoCompleto();

    public void adicionarNome(String nome) {
        contato.setNome(nome);
    }

    public void adicionarEndereco(String endereco) {
        contato.setEndereco(endereco);
    }

    public void adicionarTelefone(String telefone) {
        contato.setTelefone(telefone);
    }

    public void adicionarEmail(String email) {
        contato.setEmail(email);
    }

    public ContatoCompleto getContato() {
        return contato;
    }
}
