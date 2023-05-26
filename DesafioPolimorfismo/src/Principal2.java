public class Principal2 {
    public static void main(String[] args) {

        var pessoa1 = new PessoaFisica("Pedro", 138000);
        var pessoa2 = new PessoaFisica("Joao", 80000);

        var restaurante = new EmpresaSimples("Churrascaria do Gaucho", 300000, 80000);
        var softwareHouse = new EmpresaLucroReal("StepsHouse", 450000, 40000);

        var gestor = new GestorImpostos();
        gestor.adicionar(pessoa1);
        gestor.adicionar(pessoa2);
        gestor.adicionar(restaurante);
        gestor.adicionar(softwareHouse);

        System.out.printf("Total de impostos: R$:%.2f%n", gestor.getValorTotalImpostos());
    }
}
