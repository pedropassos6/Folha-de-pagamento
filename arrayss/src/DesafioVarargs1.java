import java.util.Arrays;

public class DesafioVarargs1 {

    public static double calculo(double numero1, double numero2, double...numeros){
        double[] novoArray = Arrays.copyOf(numeros, numeros.length + 2);
        novoArray[novoArray.length - 2] = numero1;
        novoArray[novoArray.length - 1] = numero2;
        double resultado = 0;

        for (double novo : novoArray){
            resultado += novo;
        }

        return resultado / novoArray.length;
    }

    public static void main(String[] args) {

//        DesafioVarargs1 desafio = new DesafioVarargs1();
        double resultado = calculo(20, 30, 80);
        System.out.printf("%.2f", resultado);

    }
}
