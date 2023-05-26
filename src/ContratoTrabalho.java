public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean adicionalParaFilho(){
        return funcionario.temFilho();
    }


}
