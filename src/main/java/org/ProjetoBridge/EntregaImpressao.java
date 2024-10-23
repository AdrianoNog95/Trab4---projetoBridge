package org.ProjetoBridge;

public class EntregaImpressao implements MetodoEntrega {
    @Override
    public void entregarIngresso(String detalhes) {
        getMensagemEntrega(detalhes);
    }

    public String getMensagemEntrega(String detalhes) {
        return "Imprimindo ingresso: " + detalhes;
    }
}