import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    public enum Status {
        ATIVO, INATIVO
    }

    private String nome;
    private BigDecimal valor;
    private int quantidade;
    private Status status = Status.ATIVO;

    public Produto(String nome, BigDecimal valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Produto(String nome, BigDecimal valor, int quantidade, Status status) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                ", status=" + status +
                '}';
    }
}
