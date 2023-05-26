public class Holerite {
    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilho;

    double valorTotal(){
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilho;
    }

    void imprimir(){
        System.out.printf("Nome: %s%n", funcionario.nome);
        System.out.printf("Valor horas normais R$: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor horas extras R$: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor adicional para filho R$: %.2f%n", valorAdicionalFilho);
        System.out.printf("Valor Total R$: %.2f%n", valorTotal());
    }

}
