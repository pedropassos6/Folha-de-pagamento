public class ContaInvestimento extends Conta{

    private double valorTotalInvestimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public boolean possuiGratuidade(){
        return getValorTotalInvestimentos() > 0;

    }

    public double getValorTotalInvestimentos(){
        return valorTotalInvestimentos;
    }

    public void creditarInvestimentos(double percentualJuros){
            double valorInvestimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalInvestimentos += valorInvestimentos;
            depositar(valorInvestimentos);
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "Titular: " + getTitular() +
                ", Agencia: " + getAgencia() +
                ", Numero: " + getNumero() +
                ", valorTotalInvestimentos= " + valorTotalInvestimentos +
                '}';
    }
}
