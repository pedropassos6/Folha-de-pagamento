public class Principal2 {
    public static void main(String[] args) {

        String[] nomes = {"Jose", "joao", "maria"};
        String nomeSorteado = Sorteador.<String>sortear(nomes);
        System.out.println(nomeSorteado);

        Funcionario[] funcionario = {
                new Funcionario("Pedro", 30),
                new Funcionario("Henrique", 35),
                new Funcionario("Passos", 40)
        };

        Funcionario funcionarioSorteado = Sorteador.<Funcionario>sortear(funcionario);
        System.out.println(funcionarioSorteado.getNome());

        Cliente[] clientes = {
                new Cliente("PegPag", 50000),
                new Cliente("LifeCiecly", 56000),
                new Cliente("Vidros e Vidros", 30000)
        };

        Cliente clienteSorteado = Sorteador.<Cliente>sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}
