import org.ProjetoBridge.EntregaApp;
import org.ProjetoBridge.MetodoEntrega;
import org.ProjetoBridge.Show;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowTest {
    @Test
    public void testGerarIngresso() {
        MetodoEntrega entregaMock = new EntregaApp();
        Show show = new Show(entregaMock);
        assertEquals("Enviando ingresso via aplicativo móvel: Ingresso para Show de Rock",
                ((EntregaApp) entregaMock).getMensagemEntrega("Ingresso para Show de Rock"));
    }
}
