import java.util.Objects;

public class Conta {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean possuiGratuidade(){
        return false;
    }

    protected void validarSaldoParaSaque(double valorSaque){
        if(getSaldo() < valorSaque){
            throw new IllegalArgumentException("Valor insuficiente");
        }
    }

    public void sacar(double valorSaque){
        if(valorSaque <= 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("valor invalido");
        }

        saldo += valorDeposito;
    }

    public void imprimir(){

        System.out.printf("Nome Titular: %s%n", titular.getNome());
        System.out.printf("Numero da Conta: %d%n", getNumero());
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Saldo: %.2f%n", getSaldo());
//        System.out.println("------------------------------------");
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + (titular != null ? titular.getNome() : null) +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null) return false;
        if (this.getClass() != obj.getClass()) return false; //isso é para comparar se o objeto que está sendo passado como paramtro é o mesmo tipo da classe, this.getClass pega a classe que está sendo implantada, e obj.getClass pega o objeto que está sendo passado

        Conta conta = (Conta) obj; // isso faz um cast do objeto passado como parametro para a classe Conta, joga em uma variavel conta para usar no if
        if(this.agencia != conta.agencia) return false;
        if(this.numero != conta.numero) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia,  numero);
    }
}
