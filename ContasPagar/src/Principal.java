public class Principal {
    public static void main(String[] args) {

        MetodoPagamento metodoPagamento = new Pix();

        ServicoContasPagar servicoContasPagar = new ServicoContasPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Pedro", "5700684", "87889");

        Holerite holerite = new Holerite(funcionario, 60, 120);

        servicoContasPagar.pagar(holerite);
    }
}
