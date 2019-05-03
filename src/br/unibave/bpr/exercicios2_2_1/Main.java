package br.unibave.bpr.exercicios2_2_1;

public class Main {

    private static final String COLA_COLA = "cola-cola";
    private static final String JEEP = "jeepzinho";
    private static final String BATATA_MEDIA = "batata média";
    private static final String CHEESEBURGER = "cheeseburger";
    private static final String SUKITA = "sukita";
    private static final String BONECA = "boneca suzi";
    private static final String BATATA_PEQUENA = "batata pequena";
    private static final String HAMBURGUER = "hamburguer";

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.realizarPedido(HAMBURGUER, BATATA_PEQUENA, BONECA, SUKITA);

        Cliente cliente2 = new Cliente();
        cliente2.realizarPedido(CHEESEBURGER, BATATA_MEDIA, JEEP, COLA_COLA);

    }

}
