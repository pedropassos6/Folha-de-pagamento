public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean adicionalPossuiFilho(){
        return funcionario.possuiFilho();
    }

}
