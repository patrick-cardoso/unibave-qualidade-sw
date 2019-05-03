package br.unibave.bpr.exercicios2_1_2;

public abstract class Calzone {

    private String nome;
    private String ingredientes;

    Calzone(String nome, String ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Calzone de " + getNome() + " (" + getIngredientes() + ")";
    }
}
