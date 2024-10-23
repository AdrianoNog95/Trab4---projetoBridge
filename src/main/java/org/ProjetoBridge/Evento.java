package org.ProjetoBridge;

public abstract class Evento {
    public MetodoEntrega metodoEntrega;

    public Evento(MetodoEntrega metodoEntrega) {
        this.metodoEntrega = metodoEntrega;
    }

    public abstract void gerarIngresso();
}