package servico;

import cartaoBeneficio.Cartao;
import cartaoBeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "deposito", valorDeposito);
    }
}
