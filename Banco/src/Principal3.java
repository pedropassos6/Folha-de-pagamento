public class Principal3 {
    public static void main(String[] args) {

//        Titular titular = new Titular("Pedro", "039.432.456-98");
//
//        ContaInvestimento conta1 = new ContaInvestimento(titular, 35718, 889712);

        Titular titular = new Titular("Pedro", "039.432.456-98");

        ContaEspecial conta1 = new ContaEspecial(titular, 35718, 889712, 50);
        conta1.setLimiteChequeEspecial(1000);

        System.out.println(conta1);
    }
}
