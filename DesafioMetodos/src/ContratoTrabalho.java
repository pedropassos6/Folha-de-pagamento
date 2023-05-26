public class ContratoTrabalho {
    public Funcionario funcionario;
    public double valorHoraNormal;
    public double valorHoraExtra;

    public boolean temFilho(){
        return funcionario.possuiFilho();
    }


}
