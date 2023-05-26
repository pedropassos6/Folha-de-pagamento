public class Transferencia implements MetodoPagamento{

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiContaBancaria()){
            throw new RuntimeException("Beneficiario não possui conta bancaria");
        }

        System.out.printf("DEBUG: Efetuando transferencia para %s no valor de R$: %.2f para conta: %s", beneficiario.getNome(),
                documento.getValorTotal(), beneficiario.getContaBancaria());
    }
}
