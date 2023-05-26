public class Principal {
    public static void main(String[] args) {

        FolhaDePagamento folha = new FolhaDePagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Adalberto";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 30;
        contratoTrabalho.valorHoraExtra = 45;



        Holerite holerite = folha.calcularSalario(180, 25, contratoTrabalho);

        holerite.imprimir();


    }
}
