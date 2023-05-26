public class Holerite {

    public Funcionario funcionario;
    public double valorHorasNormais;
    public double valorHorasExtras;
    public double AdicionalFilhos;

    public double valorTotal(){
        return valorHorasNormais + valorHorasExtras + AdicionalFilhos;
    }

    public void imprimir(){
        System.out.printf("Valor total horas normais: R$%.2f%n", valorHorasNormais);
        System.out.printf("Valor total horas extras: R$%.2f%n", valorHorasExtras);
        System.out.printf("Adicional para filhos: R$%.2f%n", AdicionalFilhos);
        System.out.printf("Valor total: R$%.2f", valorTotal());
    }




}
