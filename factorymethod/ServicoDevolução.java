package padroescriacao_exercicios.factorymethod;

public class ServicoDevolução implements IServico{
    public String executar() {
        return "Devolução efetivada";
    }

    public String cancelar() {
        return "Devolução cancelada";
    }
}
