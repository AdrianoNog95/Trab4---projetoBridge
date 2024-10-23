import org.ProjetoBridge.EntregaImpressao;
import org.ProjetoBridge.JogoFutebol;
import org.ProjetoBridge.MetodoEntrega;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogoFutebolTest {
    @Test
    public void testGerarIngresso() {
        MetodoEntrega entregaMock = new EntregaImpressao();
        JogoFutebol jogoFutebol = new JogoFutebol(entregaMock);
        assertEquals("Imprimindo ingresso: Ingresso para Jogo de Futebol",
                ((EntregaImpressao) entregaMock).getMensagemEntrega("Ingresso para Jogo de Futebol"));
    }
}
