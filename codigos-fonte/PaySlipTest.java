public class PaySlipTest {
    public static void main(String[] args){
        PaySlip paySlip = new PaySlip();
        Funcionario funcionario = new Funcionario();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.quantidadeHoras = 10;
        contratoTrabalho.valorHora = 10;
        contratoTrabalho.quantidadeHorasExtra = 5;
        contratoTrabalho.valorHoraExtra = 15;
//        contratoTrabalho.resultado = (contratoTrabalho.quantidadeHoras * contratoTrabalho.valorHora) +
//                                        (contratoTrabalho.quantidadeHorasExtra * contratoTrabalho.valorHoraExtra);
//        double n = paySlip.calcularSalario();
        ContratoTrabalho ct = paySlip.calcularSalario(funcionario);


        System.out.println(contratoTrabalho.resultado);
    }
}
