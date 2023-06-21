import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImprimindoPorOrdem {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(23);
        numeros.add(12);
        numeros.add(4);
        numeros.add(5);

//        Collections.sort(numeros); // faz com que fique em ordem crescente
        Collections.sort(numeros, Comparator.reverseOrder()); // faz com que fique em ordem decrecente

        System.out.println(numeros);
    }
}
