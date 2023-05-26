public class Principal2 {
    public static void main(String[] args) {

        Titular titular = new Titular("Pedro", "039.432.456-98");

        ContaEspecial conta1 = new ContaEspecial(titular, 35718, 889712, 50);
        conta1.setLimiteChequeEspecial(1000);

        conta1.imprimir();

        conta1.depositar(350);

        conta1.imprimir();

        conta1.sacar(400);
        conta1.debitarTarifaMensal();

        conta1.imprimir();

//        conta1.creditarInvestimentos(5);
    }
}
