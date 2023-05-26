import java.util.Arrays;

public class CalculoVarargs {

    double calcular(double numero1, double numero2, double...numeros){
        double[] calculo = Arrays.copyOf(numeros, numeros.length + 2);
        calculo[calculo.length - 2] = numero1;
        calculo[calculo.length - 1] = numero2;

        double soma = 0;

        for (double novoArray : calculo){
            soma += novoArray;
        }

        return soma / calculo.length;
    }

    public static void main(String[] args) {

        CalculoVarargs calculo = new CalculoVarargs();
        double resultado = calculo.calcular(34, 26, 10, 20, 40);
        System.out.printf("%.2f", resultado);

    }
}
