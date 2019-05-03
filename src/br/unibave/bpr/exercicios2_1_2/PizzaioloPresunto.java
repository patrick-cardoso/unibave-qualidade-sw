package br.unibave.bpr.exercicios2_1_2;

public class PizzaioloPresunto implements Pizzaiolo {

    public Pizza fazerPizza() {
        return new PizzaPresunto();
    }

    @Override
    public Calzone fazerCalzone() {
        return new CalzonePresunto();
    }
}
