public class Principal4 {
    public static void main(String[] args) {

        Colecao<Produto> pilha = new Pilha<>();
        pilha.colocar(new Produto("arroz"));
        pilha.colocar(new Produto("feijão"));
        pilha.colocar(new Produto("água de coco"));

        retirarTodos(pilha);

        Colecao<String> nomes = new Pilha<>();
        nomes.colocar("Joao");
        nomes.colocar("Pedro");
        nomes.colocar("jose");

        retirarTodos(nomes);

    }

    private static void retirarTodos(Colecao<?> objetos){
        try{
            int i = 1;
            while (true){
                Object objeto = objetos.retirar();
                System.out.printf("%d %s%n", i, objeto);
                i++;
            }
        }catch (ColecaoVaziaException e){
            System.out.println("Coleção vazia");
        }
    }
}
