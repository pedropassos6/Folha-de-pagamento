public class Principal {
    public static void main(String[] args) {

        var pessoa1 = new PessoaFisica("Pedro", 138000);
        var pessoa2 = new PessoaFisica("Joao", 80000);


        var gestor = new GestorImpostos();
        gestor.adicionar(pessoa1);
        gestor.adicionar(pessoa2);

        System.out.printf("Total de impostos: R$:%.2f%n", gestor.getValorTotalImpostos());

    }
}
