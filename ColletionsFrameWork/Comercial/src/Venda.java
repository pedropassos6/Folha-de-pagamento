import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private Cliente cliente;
    private double valorTotal;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens);
//        return itens;
    }

    public void adicionarItem(ItemVenda item){
        if(excedeLimite(item)){
            throw new IllegalArgumentException(String.format("Limite atual: %.2f", cliente.getLimiteCompras()));
        }
        valorTotal += item.getValor();

        this.itens.add(item);
    }

    private boolean excedeLimite(ItemVenda item){
        return getValorTotal() + item.getValor() > cliente.getLimiteCompras();
    }
}
