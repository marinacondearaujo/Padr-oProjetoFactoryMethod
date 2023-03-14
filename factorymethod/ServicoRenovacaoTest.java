package padroescriacaoteste_exercicios.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.factorymethod.IServico;
import padroescriacao_exercicios.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoRenovacaoTest {
    @Test
    void deveExecutarRenovacao() {
        IServico servico = ServicoFactory.obterServico("Renovacao");
        assertEquals("Renovação efetivada", servico.executar());
    }

    @Test
    void deveCancelarLocacao() {
        IServico servico = ServicoFactory.obterServico("Renovacao");
        assertEquals("Renovação cancelada", servico.cancelar());
    }
}
