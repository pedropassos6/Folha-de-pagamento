public class ContaEspecial extends ContaInvestimento{

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void debitarTarifaMensal(){
            sacar(getTarifaMensal());
    }

    public double getSaldoDisponivel(){
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    protected void validarSaldoParaSaque(double valorSaque){
        if(getSaldoDisponivel() < valorSaque){
            throw new IllegalArgumentException("Valor insuficiente");
        }
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
//        System.out.println("------------------------------------");
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "Titular: " + getTitular() +
                ", Agencia: " + getAgencia() +
                ", Numero: " + getNumero() +
                ", valorTotalInvestimentos: " + getValorTotalInvestimentos() +
                ", tarifa mensal: " + tarifaMensal +
                ", limiteChequeEspecial: " + limiteChequeEspecial +
                '}';
    }

}
