public class Holerite {

    private Funcionario funcionario;
    private double valorTotalHorasNormais;
    private double valorTotalHorasExtras;
    private double valorTotalAdicionalFilho;

    public double calculoTotal(){
        return getValorTotalHorasNormais() + getValorTotalHorasExtras() + getValorTotalAdicionalFilho();
    }


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorTotalHorasNormais() {
        return valorTotalHorasNormais;
    }

    public void setValorTotalHorasNormais(double valorTotalHorasNormais) {
        this.valorTotalHorasNormais = valorTotalHorasNormais;
    }

    public double getValorTotalHorasExtras() {
        return valorTotalHorasExtras;
    }

    public void setValorTotalHorasExtras(double valorTotalHorasExtras) {
        this.valorTotalHorasExtras = valorTotalHorasExtras;
    }

    public double getValorTotalAdicionalFilho() {
        return valorTotalAdicionalFilho;
    }

    public void setValorTotalAdicionalFilho(double valorTotalAdicionalFilho) {
        this.valorTotalAdicionalFilho = valorTotalAdicionalFilho;
    }

    public void imprimir(){
        System.out.printf("Nome: %s%n", funcionario.getNome());
        System.out.printf("Valor Total das Horas Normais: R$%.2f%n", getValorTotalHorasNormais());
        System.out.printf("Valor Total das Horas Extras: R$%.2f%n", getValorTotalHorasExtras());
        System.out.printf("Adicional para filho: R$%.2f%n", getValorTotalAdicionalFilho());
        System.out.printf("Valor Total: R$%.2f", calculoTotal());
        System.out.println();
        System.out.println();
    }
}
