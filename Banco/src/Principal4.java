public class Principal4 {
    public static void main(String[] args) {

        CaixaEletronico caixa = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("pedro", "039832387"), 35718, 889712, 50);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(500);
        conta1.creditarInvestimentos(10);

        ContaInvestimento conta3 = new ContaInvestimento(new Titular("Francisco Souza", "78978978955"),
                3333, 777777);

        conta3.depositar(100);

//        caixa.transferir(conta3, conta1, 50);

        ContaSalario contaSalario = new ContaSalario(new Titular("Asdrubal", "123.432.545-98"), 556, 98888, 18000);
        contaSalario.depositar(300);

        caixa.imprimir(contaSalario);
        caixa.imprimir(conta1);

//        conta1.imprimir();
        conta3.imprimir();
    }
}
