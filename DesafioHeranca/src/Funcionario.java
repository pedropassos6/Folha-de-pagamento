public class Funcionario {

    Holerite holerite;
    private String nome;
    private double valorHora;

    public Funcionario() {

    }

    public Funcionario(String nome, double valorHora){

        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas){
        return valorHora * horasTrabalhadas;
    }

//    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
//        double resultado = calcularSalario(horasTrabalhadas);
////        return calcularSalario(horasTrabalhadas) = new Holerite("Pedro", "Jan/2023", 35);
//
//
//        return new Holerite(this.nome, mesAno, resultado);
//    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                ", valorSalario= " + calcularSalario(10) +
                '}';
    }
}
