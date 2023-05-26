import java.util.ArrayList;
import java.util.Arrays;

public class CalculoArray {


    double calcular(double numero1, double numero2, double... numeros){
        double[] novoArray = Arrays.copyOf(numeros, numeros.length + 2);
        novoArray[novoArray.length - 2] = numero1;
        novoArray[novoArray.length - 1] = numero2;

        double soma = 0;

        for (double numero : novoArray){
            soma += numero;

        }

        return soma / novoArray.length;
    }

    public static void main(String[] args) {
        CalculoArray calculo = new CalculoArray();
        double resultado = calculo.calcular(23, 43, 10, 10);
        System.out.println(resultado);
    }
}
