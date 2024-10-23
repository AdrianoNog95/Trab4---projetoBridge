package org.ProjetoBridge;

public class Show extends Evento {
    public Show(MetodoEntrega metodoEntrega) {
        super(metodoEntrega);
    }

    @Override
    public void gerarIngresso() {
        metodoEntrega.entregarIngresso("Ingresso para Show de Rock");
    }
}

