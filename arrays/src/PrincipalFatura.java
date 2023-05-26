public class PrincipalFatura {
    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        fatura.numero = 3425543;
        fatura.valorTotal = 1250.00;

        ServicoCobranca cobranca = new ServicoCobranca();
        cobranca.pagar(fatura, "pedro@google.com");
    }
}
