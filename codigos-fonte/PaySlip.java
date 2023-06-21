public class PaySlip {

    ContratoTrabalho calcularSalario(Funcionario funcionario){
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

//        int quantidadeHoras = 10;
//        int quantidadeHorasExtra = 5;
//        double valorHora = 10.00;
//        double valorHoraExtra = 15.00;

        double calculoHora = contratoTrabalho.quantidadeHoras * contratoTrabalho.valorHora;
        double calculoHoraExtra = contratoTrabalho.quantidadeHorasExtra * contratoTrabalho.valorHoraExtra;

        contratoTrabalho.resultado = calculoHora + calculoHoraExtra;

        return contratoTrabalho;
    }
}
