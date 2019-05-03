package br.unibave.bpr.exercicios2_2_1;

public class Atendente {

    private IMontador montador;

    public Atendente(IMontador montador) {
        this.montador = montador;
    }

    public void efetuarPedido(String sanduiche, String batata, String brinquedo, String refrigerante) {
        montador.addSanduiche(sanduiche);
        montador.addBatata(batata);
        montador.addBrinquedo(brinquedo);
        montador.addRefrigerante(refrigerante);
    }
}
