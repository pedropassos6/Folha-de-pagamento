public class CarroParticular extends VeiculoAutomotor{


    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        if(getAnoFabricacao() < 2000){
            double calculo = getValorMercado() * 0.04;
            calculo += calculo * 1.05;
            return calculo;
        }

        return getValorMercado() * 0.04;

    }

    @Override
    public String descrever() {
        return String.format("Veiculo modelo %s com valor de mercado de R$:%.2f fabricado no ano %d%n",
                getModelo(), getValorMercado(), getAnoFabricacao());

    }
}
