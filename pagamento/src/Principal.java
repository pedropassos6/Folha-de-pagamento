public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Pedro";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 20;
        contratoTrabalho.valorHoraExtra = 30;

        Holerite holerite = folhaPagamento.calcularSalario(10, 5, contratoTrabalho);
        Holerite holerite2 = folhaPagamento.calcularSalario(40, 12, contratoTrabalho);
        Holerite holerite3 = folhaPagamento.calcularSalario(160, 20, contratoTrabalho);


//        double calculoTotal = folhaPagamento.calcularSalario(10, 5, contratoTrabalho);

//        System.out.printf("Nome: %s%n", funcionario.nome);
        holerite.imprimir();
        holerite2.imprimir();
        holerite3.imprimir();
    }
}
