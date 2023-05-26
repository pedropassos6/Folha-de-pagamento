public class FolhaPagamento {

    Holerite calcularSalario(int quantidadeHorasNormais,int quantidadeHorasExtras, ContratoTrabalho contratoTrabalho){
        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorTotalHoraNormal = quantidadeHorasNormais * contratoTrabalho.valorHoraNormal;
        holerite.valorTotalHoraExtra = quantidadeHorasExtras * contratoTrabalho.valorHoraExtra;

        double total = holerite.valorTotalHoraNormal + holerite.valorTotalHoraExtra;

        if(contratoTrabalho.adicionalParaFilho()){
            holerite.adicionalParaFilhos = total * 1.10;
        }

        return holerite;
    }
}
