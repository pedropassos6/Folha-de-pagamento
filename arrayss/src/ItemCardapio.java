public class ItemCardapio {

    String descricao;
    double preco;

    boolean precoMinimoMaximo(double precoMinimo, double precoMaximo){

        return preco > precoMinimo && preco < precoMaximo;
    }

    void imprimir(){

            System.out.println(descricao);
    }

}