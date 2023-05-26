public class Caminhao extends VeiculoAutomotor{

    private int quantidadeEixos;


    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    private double valorPorEixo(){
        return quantidadeEixos * 50;
    }

    @Override
    public double calcularValorPremio() {

        return getValorMercado() * 0.02 + valorPorEixo();
    }

    @Override
    public String descrever() {
        return String.format("Caminhão modelo %s com valor de mercado de R$:%.2f fabricado no ano %d%n",
                getModelo(), getValorMercado(), getAnoFabricacao());

    }
}
