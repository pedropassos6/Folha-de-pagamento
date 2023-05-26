import java.util.Arrays;

public class CopiandoArray {
    public static void main(String[] args) {

        int[] jogo = {3, 5, 7, 8};
        int[] jogo2 = Arrays.copyOf(jogo, jogo.length + 1);
        jogo2[jogo2.length - 1] = 1;

        System.out.println(Arrays.toString(jogo));
        System.out.println(Arrays.toString(jogo2));
    }
}
