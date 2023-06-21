public class PrincipalImc {
    public static void main(String[] args){

        CalculadoraImc calculadoraImc = new CalculadoraImc();

        calculadoraImc.altura = 1.80;
        calculadoraImc.peso = 80;

        System.out.printf("%.1f", calculadoraImc.Calculo());

    }
}
