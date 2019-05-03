package br.unibave.bpr.exercicios2_2_2;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        BuilderContato builderCompleto = new BuilderContato();
        BuilderInternet builderInternet = new BuilderInternet();
        BuilderTelefone builderTelefone = new BuilderTelefone();

        director.criarContato(builderCompleto, "Bruno Kurzawe", "Rua Tall", "048 99908940", "teste01@gmail.com");
        director.criarContato(builderInternet, "Patrick Cardoso", "Rua Tall", "048 99908940", "teste02@gmail.com");
        director.criarContato(builderTelefone, "Romulo Pereira", "Rua Tall", "048 99908940", "teste03@gmail.com");

        System.out.println(builderCompleto.getContato());
        System.out.println(builderInternet.getContato());
        System.out.println(builderTelefone.getContato());
    }
}
