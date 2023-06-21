import java.util.*;

public class CadastroPacoteViagem {


    List<PacoteViagem> pacote = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);
        if (this.pacote.contains(pacote)){
            throw new JaExisteException ("Já existe esse pacote");
        }
        this.pacote.add(pacote);
    }

    public List<PacoteViagem> obterTodos() {
        return pacote;
    }

    public void ordenar() {
        Collections.sort(pacote);
    }

    public void ordenarPorPrecoDecrescente() {
        Collections.sort(pacote, new PrecoPacoteComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {
        Iterator<PacoteViagem> pacoteIterator = pacote.iterator();
        boolean removido = false;
        while(pacoteIterator.hasNext()){
            PacoteViagem pacote = pacoteIterator.next();
            if(pacote.getDescricao().equals(descricao)){
                pacoteIterator.remove();
                removido = true;
            }
        }if(!removido)
        throw new PacoteNaoEncontradoException("Pacote não encontrado");
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : this.pacote){
            if(pacote.getDescricao().equals(descricao)){
                return pacote;
            }
        }
        throw new PacoteNaoEncontradoException("Pacote não encontrado");
    }

}