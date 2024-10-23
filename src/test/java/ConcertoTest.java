import org.ProjetoBridge.Concerto;
import org.ProjetoBridge.EntregaQRCode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcertoTest {
    @Test
    public void testGerarIngresso() {
        EntregaQRCode entregaMock = new EntregaQRCode();
        Concerto concerto = new Concerto(entregaMock);
        assertEquals("Enviando QR Code: Ingresso para Concerto de Música Clássica",
                entregaMock.getMensagemEntrega("Ingresso para Concerto de Música Clássica"));
    }
}
