public class Holerite {
    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double adicionalFilho;

    public double valorTotal(){
        return valorTotalHorasNormais + valorTotalHorasExtras + adicionalFilho;
    }

    void imprimir(){
        System.out.printf("Nome: %s%n", funcionario.nome);
        System.out.printf("Valor Total das Horas Normais: R$%.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor Total das Horas Extras: R$%.2f%n", valorTotalHorasExtras);
        System.out.printf("Adicional para filho: R$%.2f%n", adicionalFilho);
        System.out.printf("Valor Total: R$%.2f", valorTotal());
        System.out.println();
        System.out.println();
    }
}
