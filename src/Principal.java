public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();


        Funcionario funcionario = new Funcionario();
        funcionario.nome = "pedro";
        funcionario.quantidadeFilhos = 1;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraExtra = 20;
        contratoTrabalho.valorHoraNormal = 15;

        Holerite holerite = folhaPagamento.calcularSalario(
                20, 10, contratoTrabalho);

        holerite.imprimir();

    }
}
