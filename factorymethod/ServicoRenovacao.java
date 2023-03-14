package padroescriacao_exercicios.factorymethod;

public class ServicoRenovacao implements IServico{
    public String executar() {
        return "Renovação efetivada";
    }

    public String cancelar() {
        return "Renovação cancelada";
    }
}
