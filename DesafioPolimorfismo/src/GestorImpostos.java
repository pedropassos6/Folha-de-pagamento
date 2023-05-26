public class GestorImpostos {
    private double valorTotalImpostos;

    public double getValorTotalImpostos(){
        return valorTotalImpostos;
    }

    public void adicionar(Pessoa pessoa){
//        for (Pessoa pessoas : pessoa)
        valorTotalImpostos += pessoa.calcularImpostos();

        System.out.printf("Impostos devido de %s R$:%.2f%n", pessoa.getNome(), pessoa.calcularImpostos());
    }
}
