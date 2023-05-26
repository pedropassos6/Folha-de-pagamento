public class EmpresaLucroReal extends PessoaJuridica{

    private static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesasAnual){
        super(nome, faturamentoAnual, despesasAnual);
    }

    @Override
    public double calcularImpostos(){
        return getLucroAnual() * ALIQUOTA_IMPOSTO_LUCRO;
    }
}
