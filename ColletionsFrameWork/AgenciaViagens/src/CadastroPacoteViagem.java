import java.util.*;

public class CadastroPacoteViagem{

    List<PacoteViagem> pacoteViagens = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);
        if(pacoteViagens.contains(pacote)){
            throw new PacoteExistenteException("Pacote já exite");
        }
        pacoteViagens.add(pacote);
    }

    public List<PacoteViagem> obterTodos() {
        return pacoteViagens;
    }

    public void ordenar() {
        Collections.sort(pacoteViagens);
    }

    public void ordenarPorPrecoDecrescente() {
        pacoteViagens.sort(new PrecoPacoteComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {
        boolean pacoteEncontrado = false;
        Iterator<PacoteViagem> pacoteViagemIterator = pacoteViagens.iterator();
        while(pacoteViagemIterator.hasNext()){
            PacoteViagem pacoteViagem = pacoteViagemIterator.next();
            if(pacoteViagem.getDescricao().equals(descricao)){
                pacoteViagemIterator.remove();
                pacoteEncontrado = true;
            }
        }
        if(!pacoteEncontrado){
            throw new PacoteNaoEncontradoException("Pacote não encontrado");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacoteViagens){
            if(pacote.getDescricao().equals(descricao)){
                return pacote;
            }
        }
        throw new PacoteNaoEncontradoException("Pacote não Encontrado");
    }

}