import java.lang.reflect.Array;
import java.util.Arrays;

public class CopiandoUmArray {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 16, 23, 42};
        int[] numero2 = Arrays.copyOf(numeros, numeros.length + 1); // isso copia um array  e atriu a outro
        numero2[numero2.length - 1] = 44; // aqui voce atribui um novo valor a uma nova posição,
                        // sempre pegando o tamanho do array e subtraindo por 1 para acessar a ultima pocisão


        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numero2));
    }
}
