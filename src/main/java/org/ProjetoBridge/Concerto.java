package org.ProjetoBridge;

public class Concerto extends Evento {
    public Concerto(MetodoEntrega metodoEntrega) {
        super(metodoEntrega);
    }

    @Override
    public void gerarIngresso() {
        metodoEntrega.entregarIngresso("Ingresso para Concerto de Música Clássica");
    }
}