public class ContratoTrabalho {
    private Funcionario funcionario;
    private double valorHoraNormal;
    private double valorHoraExtra;

    public boolean adicionalParaFilho(){
        return funcionario.temFilho();

    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public void setValorHoraNormal(double valorHoraNormal) {
        this.valorHoraNormal = valorHoraNormal;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
}
