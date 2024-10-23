import org.ProjetoBridge.EntregaQRCode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntregaQRCodeTest {
    @Test
    public void testGetMensagemEntrega() {
        EntregaQRCode entregaQRCode = new EntregaQRCode();
        String mensagem = entregaQRCode.getMensagemEntrega("Ingresso para Show de Rock");
        assertEquals("Enviando QR Code: Ingresso para Show de Rock", mensagem);
    }
}
