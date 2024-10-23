package org.ProjetoBridge;

public class EntregaApp implements MetodoEntrega {
    @Override
    public void entregarIngresso(String detalhes) {
        getMensagemEntrega(detalhes);
    }

    public String getMensagemEntrega(String detalhes) {
        return "Enviando ingresso via aplicativo móvel: " + detalhes;
    }
}