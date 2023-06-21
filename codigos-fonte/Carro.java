public class Carro {
    String modelo;
    String fabricante;
    String cor;
    int anoFabricacao;
    Double valorVeiculo;
    Pessoa proprietario;

    int calculaTempoDeUsoEmAnos(){
        return 2023 - anoFabricacao;
    }

    double calcularValorRevenda(){
        int anosEmUso = calculaTempoDeUsoEmAnos();
       // System.out.printf("%d", anosEmUso);
        Double depreciacaoCalculo = (valorVeiculo / 20) * (20 - anosEmUso);
        //System.out.printf("%6.2f", depreciacaoCalculo);

        if(depreciacaoCalculo < 0){
            depreciacaoCalculo = 0.0;
        }

        return depreciacaoCalculo;
    }

    double calcularIpva(){
        if (calculaTempoDeUsoEmAnos() > 10){
            return 0.0;
        }
        return calcularValorRevenda() * 0.04;
    }
}
