package br.unibave.bpr.exercicios2_1_1;

class Client {

    private AbstractPrintFactory factory;

    public Client() {
        double rand = Math.random();

        if (rand <= 0.5) {
            factory = new PrintToScreenFactory();
        } else {
            factory = new PrintToFileFactory();
        }
    }

    public void printHelloWorld() {
        final Print print = factory.createPrint();
        print.print("Hello, World");
    }
}
