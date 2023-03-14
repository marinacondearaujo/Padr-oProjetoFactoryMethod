package padroescriacaoteste_exercicios.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.factorymethod.IServico;
import padroescriacao_exercicios.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoDevolucaoTest {
    @Test
    void deveExecutarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolução");
        assertEquals("Devolução efetivada", servico.executar());
    }

    @Test
    void deveCancelarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolução");
        assertEquals("Devolução cancelada", servico.cancelar());
    }
}
