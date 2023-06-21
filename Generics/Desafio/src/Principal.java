public class Principal {
    public static void main(String[] args) {

        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque<>();
//        estoqueRoupas.adicinar(new Carro("Audi TT RS", 10));
        estoqueRoupas.adicinar(new Roupa("Jaqueta Moncler", 5));
        estoqueRoupas.adicinar(new Roupa("Camiseta Nike", 10));
        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque<Carro> estoqueCarros = new GerenciadorEstoque();
        estoqueCarros.adicinar(new Carro("Golf R", 5));
//        estoqueCarros.adicinar(new Roupa("Golf R", 5));
        estoqueCarros.adicinar(new Carro("Mercedes C63S", 3));
        estoqueCarros.adicinar(new Carro("Audi RS6 Avant", 2));
        imprimirEstoque(estoqueCarros);



    }

    private static void imprimirEstoque(GerenciadorEstoque<?> gerenciadorEstoque){
        System.out.println(gerenciadorEstoque.getQuantidadeTotal());
    }
}
