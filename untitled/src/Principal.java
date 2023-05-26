public class Principal {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Pedro";
        funcionario.quantidadeFilhos = 1;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 20;
        contratoTrabalho.valorHoraExtra = 25;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(10, 5, contratoTrabalho);
        holerite.imprimir();
//        double calculoTotal = folhaPagamento.calcularSalario(10, 5, contratoTrabalho);

//        System.out.printf("%.2f", calculoTotal);
    }
}
