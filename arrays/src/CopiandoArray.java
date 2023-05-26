
import java.util.Arrays;

public class CopiandoArray {
    public static void main(String[] args) {

        int[] numerosJogo = new int[]{4, 8, 15, 16, 23, 42, 56};
        int[] novosNumeros = new int[numerosJogo.length - 1];

        int indiceExclusao = 2;

        System.arraycopy(numerosJogo, 0, novosNumeros, 0, 2);
        System.arraycopy(numerosJogo, indiceExclusao + 1, novosNumeros, indiceExclusao, novosNumeros.length - indiceExclusao);


        System.out.println(Arrays.toString(numerosJogo));
        System.out.println(Arrays.toString(novosNumeros));
    }
}
