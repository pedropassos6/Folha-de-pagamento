package cartaoBeneficio;

import servico.ServicoDeDepositoPix;
import servico.ServicoDePagamentoOnline;

public class Principal {
    public static void main(String[] args) {

        var supermecado = new Estabelecimento("Peg Pag Avenidão");
        var cartao = new Cartao("Anakin Skywalker");

        var servisoDepositoPix = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servisoDepositoPix.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoPagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoPagamento.efetuarPagamento(supermecado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("%s%n", cartao.getTitular());
        System.out.printf("%.2f%n", cartao.getSaldo());

    }
}
