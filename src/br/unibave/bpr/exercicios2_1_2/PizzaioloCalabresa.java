package br.unibave.bpr.exercicios2_1_2;

public class PizzaioloCalabresa implements Pizzaiolo {

    public Pizza fazerPizza() {
        return new PizzaCalabresa();
    }

    @Override
    public Calzone fazerCalzone() {
        return new CalzoneCalabresa();
    }
}
