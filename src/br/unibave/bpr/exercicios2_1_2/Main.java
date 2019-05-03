package br.unibave.bpr.exercicios2_1_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        try {
            args = new String[]{"04/05/2019"};

            if (args.length == 1) {
                final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                final Date data = df.parse(args[0]);
                final Pizzaria pizzaria = new Pizzaria(data);
                final Consumidor consumidor = new Consumidor();
                consumidor.pedirPizza(pizzaria);
                consumidor.pedirCalzone(pizzaria);
            } else {
                System.out.println("Passe a data por parâmetro no formato: dd/mm/yyyy");
            }
        } catch (ParseException e) {
            System.out.println("A data passada não está no formato Fdd/mm/yyyy");
            System.exit(1);
        }
    }

}
