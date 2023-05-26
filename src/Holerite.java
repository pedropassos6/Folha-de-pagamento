public class Holerite {
    Funcionario funcionario;
    double valorTotalHoraExtra;
    double valorTotalHoraNormal;
    double adicionalParaFilhos;

    double calcularValorTotal(){
       return valorTotalHoraExtra + valorTotalHoraNormal + adicionalParaFilhos;
    }

    void imprimir(){
        System.out.println("HOLERITE");
        System.out.println("-----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor das horas normais: R$ %.2f%n", valorTotalHoraNormal);
        System.out.printf("Valor das horas extras: R$ %.2f%n", valorTotalHoraExtra);
        System.out.printf("Adicional para filhos: R$ %.2f%n", adicionalParaFilhos);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }
}
