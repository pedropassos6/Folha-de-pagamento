public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada){
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        System.out.printf("DEBUG: Bônus pago no valor de %.2f%n", valorBonus);
    }
}
