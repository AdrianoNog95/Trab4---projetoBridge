package org.ProjetoBridge;
public class EntregaEmail implements MetodoEntrega {
    @Override
    public void entregarIngresso(String detalhes) {
        getMensagemEntrega(detalhes);
    }

    public String getMensagemEntrega(String detalhes) {
        return "Enviando ingresso por e-mail: " + detalhes;
    }
}