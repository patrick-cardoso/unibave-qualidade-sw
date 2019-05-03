package br.unibave.bpr.exercicios2_1_1;

public class PrintToFileFactory implements AbstractPrintFactory {

    private static final Print print = new PrintToFile("output.txt");

    public Print createPrint() {
        return print;
    }
}
