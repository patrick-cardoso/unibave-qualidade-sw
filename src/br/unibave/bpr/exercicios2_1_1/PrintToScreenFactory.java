package br.unibave.bpr.exercicios2_1_1;

public class PrintToScreenFactory implements AbstractPrintFactory {

    private static final Print print = new PrintToScreen();

    public Print createPrint() {
        return print;
    }
}
