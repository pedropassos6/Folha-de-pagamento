public class ServicoCobranca {

    void pagar(Fatura fatura, String... emailCobranca){
        System.out.printf("Numero da fatura: %d%nValor Total: R$%.2f%n", fatura.numero, fatura.valorTotal);

        for (String email : emailCobranca){
            System.out.println("Confirmação de recebimento enviado para: " +email);
        }
    }
}
