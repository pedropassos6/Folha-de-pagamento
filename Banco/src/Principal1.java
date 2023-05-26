public class Principal1 {
    public static void main(String[] args) {

        Titular titular = new Titular("Pedro", "039.432.456-98");

        ContaInvestimento conta1 = new ContaInvestimento(titular, 35718, 889712);
        conta1.imprimir();

        conta1.depositar(350);

        conta1.imprimir();

//        conta1.sacar(23);



        conta1.creditarInvestimentos(10);
        conta1.imprimir();
    }
}
