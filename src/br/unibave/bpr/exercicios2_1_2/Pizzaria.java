package br.unibave.bpr.exercicios2_1_2;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pizzaria {

    private Pizzaiolo pizzaiolo;

    private Date data;

    private Pizzaiolo getPizzaiolo(int diaSemana) {
        if (diaSemana == MONDAY || diaSemana == WEDNESDAY || diaSemana == FRIDAY) {
            return new PizzaioloCalabresa();
        }
        if (diaSemana == TUESDAY || diaSemana == THURSDAY || diaSemana == SATURDAY) {
            return new PizzaioloPresunto();
        }
        throw new RuntimeException("A pizzaria é fechada no domingo!");
    }

    public Pizzaria(final Date data) {
        this.data = data;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        pizzaiolo = getPizzaiolo(calendar.get(DAY_OF_WEEK));
    }

    public void pedirPizza() {
        Pizza pizza = pizzaiolo.fazerPizza();
        System.out.println("A pizza  de hoje é " + pizza);
    }

    public void pedirCalzone() {
        Calzone calzone = pizzaiolo.fazerCalzone();
        System.out.println("O calzone de hoje é " + calzone);
    }
}
