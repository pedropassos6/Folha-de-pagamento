public class ParceiroFinanceiro extends Empresa{

    private double valorTotalAplicado;


    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public double getValorTotalAplicado() {
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorAplicacao){
        valorTotalAplicado += valorAplicacao;
    }
}
