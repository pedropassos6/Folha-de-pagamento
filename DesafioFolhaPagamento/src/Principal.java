public class Principal {
    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.setQuantidadeFilhos(1);

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.setFuncionario(funcionario);
        contrato.setValorHoraNormal(20);
        contrato.setValorHoraExtra(30);

        Holerite holerite = folhaPagamento.calcularSalario(15, 5, contrato);

        holerite.imprimir();
    }
}
