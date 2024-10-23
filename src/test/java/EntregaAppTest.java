import org.ProjetoBridge.EntregaApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntregaAppTest {
    @Test
    public void testGetMensagemEntrega() {
        EntregaApp entregaApp = new EntregaApp();
        String mensagem = entregaApp.getMensagemEntrega("Ingresso para Show de Rock");
        assertEquals("Enviando ingresso via aplicativo móvel: Ingresso para Show de Rock", mensagem);
    }
}

