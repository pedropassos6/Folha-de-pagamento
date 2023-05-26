public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("Pedro", "039.432.456-98");
        Conta conta1 = new Conta(titular, 35718, 889712);
        Conta conta2 = new Conta(titular, 35718, 889712);

        System.out.println(conta1.equals(conta1));

//        conta1.imprimir();
//
//        conta1.depositar(350);
//
//        conta1.imprimir();
//
//        conta1.sacar(23);
//
//        conta1.imprimir();

    }
}
