public class ServicoDeLocacao {

    public void confirmarLocacao(Locacao locacao){
//            double totalDiarias = locacao.getValorDiaria() * locacao.getQuantidadeDiarias();

        double totalDiarias = locacao.calcularTotalDiarias();

//        locacao.getVeiculo().setDisponivel(false);

        locacao.reservarVeiculo();
    }
}
