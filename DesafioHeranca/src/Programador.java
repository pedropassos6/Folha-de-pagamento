public class Programador extends Funcionario{

    private double valorBonus;
    private int horasTrabalhadas;

    public Programador(){

    }

    public Programador(String nome, double valorHora, double valorBonus){
        super(nome, valorHora);
        this.valorBonus = valorBonus;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    protected final double calcularSalario(int horasTrabalhadas){
        return super.calcularSalario(horasTrabalhadas) + valorBonus;

    }
    protected final double calcularSalario(){
        return getValorHora() * horasTrabalhadas + valorBonus;

    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome=" + getNome() +
                ", valorBonus= " + getValorBonus() +
                ", valorTotal= " +calcularSalario(20)+
                '}';
    }

    public void imprimir(){
        System.out.printf("Valor salario: %.2f%n", calcularSalario());
    }


}
