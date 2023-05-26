import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        // TODO implementar inclusão de item do cardápio

        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;

    }

    void removerItem(int indice) {
        // TODO implementar exclusão de item do cardápio da posição informada

        // indice 3
        //carne, coca, agua, leite, computador, fone
        //  0     1      2     3       4         5
        //novo array
        //  0     1      2     4         5

        ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];
        System.arraycopy(itens, 0, novosItens, 0, indice);
        System.arraycopy(itens, indice + 1, novosItens, indice, novosItens.length - indice);

        itens = novosItens;



    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo

        for (ItemCardapio item : itens){
            if(item.possuiPrecoEntre(precoMinimo, precoMaximo)){
                item.imprimir();
            }
        }

    }

}