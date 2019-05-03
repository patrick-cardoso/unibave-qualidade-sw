package br.unibave.bpr.exercicios2_2_2;

public class BuilderInternet implements Builder {

    private ContatoInternet contato = new ContatoInternet();

    public void adicionarNome(final String nome) {
        contato.setNome(nome);
    }

    public void adicionarEmail(final String email) {
        contato.setEmail(email);
    }

    @Override
    public void adicionarEndereco(String endereco) {

    }

    @Override
    public void adicionarTelefone(String telefone) {

    }

    public ContatoInternet getContato() {
        return contato;
    }

}
