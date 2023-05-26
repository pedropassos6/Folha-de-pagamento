class Estoque {

    Produto[] produtos;

    void listarProdutos() {
        System.out.println("\nProdutos em estoque");
        System.out.println("------------------------");

        for (int i = 0; i < produtos.length; i++) {
            produtos[i].descrever();
        }
    }

    void quantidadeTotal(){
        int total =  0;
        for (Produto produto : produtos){
            total += produto.quantidade;
        }
        System.out.println(total);
    }

}