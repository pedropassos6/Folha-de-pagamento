public class Principal2 {
    public static void main(String[] args) {

        Programador programador = new Programador("Astroudo", 40);
        programador.setValorBonus(100);
        System.out.println(programador);
        Holerite holerite = programador.gerarHolerite(20, "dez/2023");

        holerite.imprimir();
    }
}
