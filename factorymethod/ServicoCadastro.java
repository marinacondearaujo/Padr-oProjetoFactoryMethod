package padroescriacao_exercicios.factorymethod;

public class ServicoCadastro implements IServico{
    public String executar() {
        return "Cadastro efetivada";
    }

    public String cancelar() {
        return "Cadastro cancelada";
    }
}
