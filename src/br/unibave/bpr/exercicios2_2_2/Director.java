package br.unibave.bpr.exercicios2_2_2;

public class Director {

    public void criarContato(Builder builder, String nome, String endereco, String telefone, String email) {
        builder.adicionarNome(nome);
        builder.adicionarEndereco(endereco);
        builder.adicionarTelefone(telefone);
        builder.adicionarEmail(email);
    }
}
