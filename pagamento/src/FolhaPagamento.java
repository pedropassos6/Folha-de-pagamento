public class FolhaPagamento {


    Holerite calcularSalario(int horaNormal, int horaExtra, ContratoTrabalho contratoTrabalho){
        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorTotalHorasNormais = horaNormal * contratoTrabalho.valorHoraNormal;
        holerite.valorTotalHorasExtras = horaExtra * contratoTrabalho.valorHoraExtra;
        double valorTotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;


        if(contratoTrabalho.adicionalPossuiFilho())
            holerite.adicionalFilho = valorTotal * 0.10;

        return holerite;
    }
}
