package br.unibave.bpr.exercicios2_2_1;

public class Cliente {

    private Montador montador = new Montador();

    public void realizarPedido(final String sanduiche, final String batata, final String brinquedo, final String refrigerante) {

        Atendente atendente = new Atendente(montador);
        atendente.efetuarPedido(sanduiche, batata, brinquedo, refrigerante);

        Pedido pedido = montador.getPedido();

        System.out.println(pedido);
    }
}
