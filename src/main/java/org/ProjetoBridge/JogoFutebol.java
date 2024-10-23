package org.ProjetoBridge;

public class JogoFutebol extends Evento {
    public JogoFutebol(MetodoEntrega metodoEntrega) {
        super(metodoEntrega);
    }

    @Override
    public void gerarIngresso() {
        metodoEntrega.entregarIngresso("Ingresso para Jogo de Futebol");
    }
}