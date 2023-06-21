import java.util.Objects;

public class Hotel implements Comparable<Hotel>{

    private String nome;
    private String cidade;
    private double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        this.nome = nome;
        this.cidade = cidade;
        this.precoDiaria = precoDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(nome, hotel.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Hotel o) {
        return getNome().compareTo(o.getNome());

//        return Double.compare(getPrecoDiaria(), o.getPrecoDiaria());

//        return Double.valueOf(getPrecoDiaria()).compareTo(Double.valueOf(o.getPrecoDiaria()));

//        if(this.precoDiaria < o.getPrecoDiaria()){
//            return -1;
//        }else if(this.precoDiaria > getPrecoDiaria()){
//            return 1;
//        }
//        return 0;
    }
}
