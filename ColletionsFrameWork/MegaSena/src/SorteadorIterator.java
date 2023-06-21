import java.util.*;

public class SorteadorIterator implements Iterator<Integer> {

    private static final Random RANDOM = new Random();
    private int quantidadeSorteada;

    @Override
    public boolean hasNext() {
        return quantidadeSorteada < 6;
    }

    @Override
    public Integer next() {


        if(!hasNext()){
            throw new NoSuchElementException("Todos os numeros já foram sorteados");
        }

        quantidadeSorteada++;


        Set<Integer> numeros = new HashSet<>();
        Integer numero = RANDOM.nextInt(60);

//        if(numeros.contains(numero)){
//            numeros.add(numero);
//        }
//        for (Integer i : numeros){
//            i = RANDOM.nextInt(60);
//            i.compareTo(i);
//            if(true){
//                RANDOM.nextInt(60);
//            }
//        }
        return numero;
    }
}
