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


        produtos.sort(Comparator.comparingInt(Produto::getQuantidade));
        produtos.forEach(Produto::inativar);

        produtos.forEach(produto -> System.out.println(produto));




    }
}
