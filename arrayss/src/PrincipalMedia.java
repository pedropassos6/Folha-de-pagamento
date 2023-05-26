import java.util.Arrays;
import java.util.Comparator;

public class PrincipalMedia {
    public static void main(String[] args) {

        Integer[] notas = {8, 6,  7, 9};

        // ordena o array por ordem natural
        Arrays.sort(notas);

        //ordena o array por ordem decrecente, porém só aceita arrays do tipo classe não tipo primitivo
        Arrays.sort(notas, Comparator.reverseOrder());

        // permite imprimir um array
        String string = Arrays.toString(notas);
        System.out.println(string);

//        Media media = new Media();
//        double mediaNotas = media.media(notas);
//        System.out.println(mediaNotas);
    }
}
