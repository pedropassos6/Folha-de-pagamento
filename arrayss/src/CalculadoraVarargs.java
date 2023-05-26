import java.util.Arrays;

public class CalculadoraVarargs {

    static double calcular(double numero1, double numero2, double...numeros){

        double[] todosNumeros = Arrays.copyOf(numeros, numeros.length + 2);

        todosNumeros[todosNumeros.length - 2] = numero1;
        todosNumeros[todosNumeros.length - 1] = numero2;

        double soma = 0;

        for (double calculo : todosNumeros){
            soma += calculo;
        }

        return soma / todosNumeros.length;
    }

    public static void main(String[] args) {

        double resultado = calcular(23, 37, 120);
        System.out.printf("%.2f", resultado);

    }
}
