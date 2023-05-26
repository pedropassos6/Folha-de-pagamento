public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Jamelão", 30);
        Holerite holerite = funcionario.gerarHolerite(10, "ago/2023");

        System.out.println(funcionario);
        holerite.imprimir();


    }
}
