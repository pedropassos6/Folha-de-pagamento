public class Principal3 {
    public static void main(String[] args) {

        Funcionario[] funcionarios = {
                new Funcionario("Pedro", 30),
                new Funcionario("Henrique", 35),
                new Funcionario("Passos", 40)
        };

        Cliente[] clientes = {
                new Cliente("PegPag", 30000),
                new Cliente("Açougue", 40000),
                new Cliente("Loja Lojas", 20000)
        };

        Funcionario funcionarioEncontrado = Pesquisador.obterPorNome(funcionarios, "Pedro");
        System.out.println(funcionarioEncontrado);

        Cliente clienteEncontrado = Pesquisador.obterPorNome(clientes, "PegPag");
        System.out.println(clienteEncontrado);



    }
}
