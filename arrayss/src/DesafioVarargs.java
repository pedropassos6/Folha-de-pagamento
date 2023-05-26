import java.util.Arrays;

public class DesafioVarargs {

    public static double calculo(double numero1, double numero2, double...numeros){
        double[] todosNumeros = Arrays.copyOf(numeros, numeros.length + 2);
        todosNumeros[todosNumeros.length - 2] = numero1;
        todosNumeros[todosNumeros.length - 1] = numero2;

        double calculoTotal = 0;

        for(double soma : todosNumeros){
            calculoTotal += soma;
        }

        return calculoTotal / todosNumeros.length;

    }

    public static void main(String[] args) {
        double valorTotal = calculo(45, 25, 10, 59);
        System.out.println(valorTotal);

    }
}
