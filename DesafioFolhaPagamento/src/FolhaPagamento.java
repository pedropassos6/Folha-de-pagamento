public class FolhaPagamento {

    public Holerite calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato){
        Holerite holerite = new Holerite();
        holerite.setFuncionario(contrato.getFuncionario());
        holerite.setValorTotalHorasNormais(contrato.getValorHoraNormal() * horasNormais);
        holerite.setValorTotalHorasExtras(contrato.getValorHoraNormal() * horasExtras);
        double valorTotal = holerite.getValorTotalHorasNormais() + holerite.getValorTotalHorasExtras();


        if(contrato.adicionalParaFilho()){
            holerite.setValorTotalAdicionalFilho(valorTotal * 0.10);
        }

        return holerite;
    }
}
