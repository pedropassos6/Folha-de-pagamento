public class Principal2 {
    public static void main(String[] args) {

//        Holerite holerite = new Holerite("Pedro", "05/2023", 45);

        Programador programador = new Programador("Joseph", 50, 100);
        Programador programador2 = new Programador();
        programador2.setValorHora(45);
        programador2.setValorBonus(100);
        programador2.setHorasTrabalhadas(10);
        programador2.calcularSalario(10);

        programador2.imprimir();

        System.out.println(programador);
//        Funcionario funcionario = new Funcionario(holerite, "Madasgascar", 30);
//
////        System.out.println(holerite);
//        System.out.println(funcionario);
//
////        funcionario.calcularSalario(10);
//
//        System.out.println(funcionario);
    }
}
