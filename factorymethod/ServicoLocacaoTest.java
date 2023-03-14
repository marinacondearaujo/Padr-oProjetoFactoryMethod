package padroescriacaoteste_exercicios.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.factorymethod.IServico;
import padroescriacao_exercicios.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoLocacaoTest {
    @Test
    void deveExecutarLocacao() {
        IServico servico = ServicoFactory.obterServico("Locacao");
        assertEquals("Locação efetivada", servico.executar());
    }

    @Test
    void deveCancelarLocacao() {
        IServico servico = ServicoFactory.obterServico("Locacao");
        assertEquals("Locação cancelada", servico.cancelar());
    }
}
