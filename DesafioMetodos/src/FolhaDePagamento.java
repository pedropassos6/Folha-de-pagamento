public class FolhaDePagamento {

    public Holerite calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato){
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;

        double totalHorasExtras = horasExtras * contrato.valorHoraExtra;
        double totalHorasNormais = horasNormais * contrato.valorHoraNormal;

        holerite.valorHorasNormais = totalHorasNormais;
        holerite.valorHorasExtras = totalHorasExtras;

        double valorTotal = totalHorasExtras + totalHorasNormais;

        if (contrato.temFilho()){
            holerite.AdicionalFilhos = valorTotal * 0.10;
        }

        return holerite;
    }
}
