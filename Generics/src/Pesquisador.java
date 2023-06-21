public class Pesquisador {

    public static <T extends Nomeavel> T obterPorNome(T[] itens, String nome){
        for(T item : itens){
            if(item.getNome().equals(nome)){
                return item;
            }

        }
        throw new RuntimeException("Funcionario não encontrado");
    }
}
