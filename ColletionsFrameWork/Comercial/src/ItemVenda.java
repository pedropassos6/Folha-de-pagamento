import java.util.Objects;

public class ItemVenda {

    private String descricao;
    private double valor;

    public ItemVenda(String descricao, double valor) {
        Objects.requireNonNull(descricao);

        if(valor < 0){
            throw new IllegalArgumentException("Valor não valido");
        }

        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
