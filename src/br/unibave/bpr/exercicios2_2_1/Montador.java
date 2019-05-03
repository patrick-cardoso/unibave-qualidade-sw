package br.unibave.bpr.exercicios2_2_1;

public class Montador implements IMontador {

    private Pedido pedido = new Pedido();

    public void addSanduiche(String sanduiche) {
        pedido.adicionarDentroDaCaixa(sanduiche);
    }

    public void addBatata(String batata) {
        pedido.adicionarDentroDaCaixa(batata);
    }

    public void addBrinquedo(String brinquedo) {
        pedido.adicionarDentroDaCaixa(brinquedo);
    }

    public void addRefrigerante(String refrigerante) {
        pedido.adicionarForaDaCaixa(refrigerante);
    }

    public Pedido getPedido() {
        return pedido;
    }
}
