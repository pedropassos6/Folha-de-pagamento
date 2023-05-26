import java.util.Arrays;

public class ExcluindoDados {
    public static void main(String[] args) {

        int[] jogo = {12, 3, 4, 6, 7, 9, 5};
        int[] jogoNovo = new int[jogo.length - 1];

        int indice = 4;

        System.arraycopy(jogo, 0, jogoNovo, 0, indice);
        System.arraycopy(jogo, indice + 1, jogoNovo, indice, jogoNovo.length - indice);

        System.out.println(Arrays.toString(jogo));
        System.out.println(Arrays.toString(jogoNovo));
    }
}
