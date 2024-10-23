package org.ProjetoBridge;

public class EntregaQRCode implements MetodoEntrega {
    @Override
    public void entregarIngresso(String detalhes) {
        getMensagemEntrega(detalhes);
    }

    public String getMensagemEntrega(String detalhes) {
        return "Enviando QR Code: " + detalhes;
    }
}