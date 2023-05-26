public class Pix implements MetodoPagamento{


    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiChavePix()){
            throw new RuntimeException("Beneficiario não possui chave pix");
        }

        System.out.printf("DEBUG: Efetuando pix para %s no valor de R$: %.2f com a chave: %s", beneficiario.getNome(),
                documento.getValorTotal(), beneficiario.getChavePix());

    }
}
