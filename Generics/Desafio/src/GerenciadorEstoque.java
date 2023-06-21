public class GerenciadorEstoque <T extends Estocavel>{

    private int quantidadeTotal;

    public void adicinar(T estocavel){
        quantidadeTotal += estocavel.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }
}
