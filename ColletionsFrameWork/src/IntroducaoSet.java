import java.util.HashSet;
import java.util.Set;

public class IntroducaoSet {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(23);
        numeros.add(653);
        numeros.add(65);
        numeros.add(43);
        numeros.add(267);

        for (Integer numero : numeros){
            System.out.println(numero);
        }

    }
}
