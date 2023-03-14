package padroescriacaoteste_exercicios.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.factorymethod.IServico;
import padroescriacao_exercicios.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCadastroTest {
    @Test
    void deveExecutarCadastro() {
        IServico servico = ServicoFactory.obterServico("Cadastro");
        assertEquals("Cadastro efetivada", servico.executar());
    }

    @Test
    void deveCancelarCadastro() {
         IServico servico = ServicoFactory.obterServico("Cadastro");
        assertEquals("Cadastro cancelada", servico.cancelar());
    }
}
