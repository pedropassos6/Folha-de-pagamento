import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {

        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("sabão", new BigDecimal("9.9"), 5));
        produtos.add(new Produto("queijo", new BigDecimal("20"), 10));
        produtos.add(new Produto("bolo", new BigDecimal("7"), 0));
        produtos.add(new Produto("calça", new BigDecimal("30"), 30));
        produtos.add(new Produto("abobora", new BigDecimal("3"), 0));
        produtos.add(new Produto("mouse", new BigDecimal("100"), 9, Produto.Status.INATIVO));


//        Function<Produto, Integer> function1 = produto -> produto.getQuantidade();
//        Function<Produto, String> function2 = produto -> produto.getNome();
//        produtos.sort(Comparator.comparing(function1).thenComparing(function2));

        //para trabalhar com atributos do tipo classe, como Integer, Double, BigDecimal
//        produtos.sort(Comparator.comparing(produto -> produto.getQuantidade()));

        //para trabalhar com atributos do tipo primitivo como int, double, float
        produtos.sort(Comparator.comparingInt(produto -> produto.getQuantidade()));

//        for(Produto todosProdutos : produtos){
//            System.out.println(todosProdutos);
//        }

        produtos.forEach(produto -> System.out.println(produto));




    }
}
