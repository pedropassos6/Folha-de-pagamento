import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {

        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("sabão", new BigDecimal("9.9"), 5));
        produtos.add(new Produto("queijo", new BigDecimal("20"), 10));
        produtos.add(new Produto("bolo", new BigDecimal("7"), 12));
        produtos.add(new Produto("calça", new BigDecimal("30"), 30));
        produtos.add(new Produto("abobora", new BigDecimal("3"), 0));
        produtos.add(new Produto("mouse", new BigDecimal("100"), 9, Produto.Status.INATIVO));

//        Iterator<Produto> produtoIterator = produtos.iterator();
//        while(produtoIterator.hasNext()){
//            Produto produtoRemocao = produtoIterator.next();
//            if(produtoRemocao.getQuantidade() < 1 || produtoRemocao.getStatus().equals(Produto.Status.INATIVO)){
//                produtoIterator.remove();
//            }
//        }

//        produtos.removeIf(produto -> produto.getQuantidade() < 1);

        Predicate<Produto> produtoSemEstoque = (produto -> produto.getQuantidade() < 1);
        Predicate<Produto> produtoInativo = (produto -> produto.getStatus().equals(Produto.Status.INATIVO));

//        produtos.removeIf(produtoSemEstoque.or(produtoInativo));
//        produtos.removeIf(produtoSemEstoque.negate());
        produtos.removeIf(Predicate.not(produto -> produto.getQuantidade() > 0));

        for (Produto produto : produtos){
            System.out.println(produto);
        }





    }
}
