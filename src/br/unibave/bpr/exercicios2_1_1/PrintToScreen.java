package br.unibave.bpr.exercicios2_1_1;

public class PrintToScreen implements Print {

    public void print(final String content) {
        System.out.println("Impressão em tela: " + content);
    }
}
