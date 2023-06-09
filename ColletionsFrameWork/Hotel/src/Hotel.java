import java.util.Objects;

public class Hotel implements Comparable<Hotel>{

    private String cidade;
    private String nome;
    private double precoDiaria;

    public Hotel(String cidade, String nome, double precoDiaria) {
        this.cidade = cidade;
        this.nome = nome;
        this.precoDiaria = precoDiaria;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if(precoDiaria < 0){
            throw new IllegalArgumentException("Preço Invalido");
        }
        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cidade='" + cidade + '\'' +
                ", nome='" + nome + '\'' +
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

//        if(this.getPrecoDiaria() < o.getPrecoDiaria()){
//            return -1;
//        }else if(this.getPrecoDiaria() > o.getPrecoDiaria()){
//            return 1;
//        }
//        return 0;
    }
}
