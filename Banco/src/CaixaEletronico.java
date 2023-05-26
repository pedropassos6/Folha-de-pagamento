public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor){

        System.out.printf("Transferindo: R$%.2f da conta %d%d para %d%d%n", valor, contaOrigem.getNumero(),
                contaOrigem.getAgencia(), contaDestino.getNumero(), contaDestino.getAgencia());

        contaOrigem.sacar(valor + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valor);
    }

    public void imprimir(Conta conta){
        if (conta.possuiGratuidade()){
            System.out.println("Impressão é gratis");
        }else{
            debitarTarifa(conta);
        }
        conta.imprimir();
        System.out.println("------------------------------------");
    }

//    public void imprimir(Conta conta){
//        if (conta instanceof ContaInvestimento contaInvestimento && contaInvestimento.getValorTotalInvestimentos() > 0){
//                System.out.println("Impressão é gratis");
//        }else{
//            debitarTarifa(conta);
//        }
//        conta.imprimir();
//        System.out.println("------------------------------------");
//    }

    private void debitarTarifa(Conta conta){
        System.out.printf("Custo da impressão: R$:%.2f%n", TARIFA_IMPRESSAO);
        conta.sacar(TARIFA_IMPRESSAO);

    }
}
