package cartaoBeneficio;

import java.io.Serializable;

public class Cartao implements Serializable {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao(){

    }

    public Cartao(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void debitar(double valorDebito){

        if(getSaldo() < valorDebito){
            throw new RuntimeException("Saldo insuficiente");
        }

        saldo -= valorDebito;

    }

    public void depositar(double valorDeposito){

        if (valorDeposito < VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(String.format
                    ("Valor do deposito deve ser maior que %.2f", VALOR_MINIMO_DEPOSITO));

        }

        saldo += valorDeposito - TARIFA_DEPOSITO;

    }
}
