import org.ProjetoBridge.EntregaEmail;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntregaEmailTest {
    @Test
    public void testGetMensagemEntrega() {
        EntregaEmail entregaEmail = new EntregaEmail();
        String mensagem = entregaEmail.getMensagemEntrega("Ingresso para Concerto de Música Clássica");
        assertEquals("Enviando ingresso por e-mail: Ingresso para Concerto de Música Clássica", mensagem);
    }
}
