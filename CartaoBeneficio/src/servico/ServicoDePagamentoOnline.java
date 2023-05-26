package servico;

import cartaoBeneficio.Cartao;
import cartaoBeneficio.Estabelecimento;
import cartaoBeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){

        cartao.debitar(valor);

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
