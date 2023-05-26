public class ImovelResidencial implements BemSeguravel{

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    private double valorAreaConstruida(){
        return areaConstruida * 0.30;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return valorMercado * 0.001 + valorAreaConstruida();
    }

    @Override
    public String descrever() {
        return String.format("Residencia com area total construida de %dm2, availado em R$:%.2f%n",
                getAreaConstruida(), getValorMercado());

    }
}
