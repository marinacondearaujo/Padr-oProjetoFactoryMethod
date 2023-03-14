package padroescriacao_exercicios.factorymethod;

public class ServicoLocacao implements IServico{
    public String executar() {
        return "Locação efetivada";
    }

    public String cancelar() {
        return "Locação cancelada";
    }
}
