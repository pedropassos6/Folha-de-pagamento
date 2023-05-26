public class Principal {
    public static void main(String[] args) {
        ImovelResidencial imovel = new ImovelResidencial(2300000, 320);


        CarroParticular carro = new CarroParticular("BMW", 50000, 1999);
        Caminhao caminhao = new Caminhao("Scannia 442", 780000, 2005, 4);

        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();
        servico.emitir(carro);
        servico.emitir(caminhao);
        servico.emitir(imovel);


    }
}
