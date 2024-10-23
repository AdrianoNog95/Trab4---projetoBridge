import org.ProjetoBridge.EntregaImpressao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntregaImpressaoTest {
    @Test
    public void testGetMensagemEntrega() {
        EntregaImpressao entregaImpressao = new EntregaImpressao();
        String mensagem = entregaImpressao.getMensagemEntrega("Ingresso para Jogo de Futebol");
        assertEquals("Imprimindo ingresso: Ingresso para Jogo de Futebol", mensagem);
    }
}
