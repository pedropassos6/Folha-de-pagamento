import java.util.List;

public class Principal {
    public static void main(String[] args) {

        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("pedro", 60));
        cadastroCliente.adicionar(new Cliente("carlos", 33));
        cadastroCliente.adicionar(new Cliente("henrique", 39));
        cadastroCliente.adicionar(new Cliente("josé", 55));
        cadastroCliente.adicionar(new Cliente("asdrubal", 90));

//        Filtro<Cliente> filtro = new Filtro<Cliente>() {
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                return cliente.getIdade() > 35;
//            }
//        };

//        Filtro<Cliente> filtro = (Cliente cliente) -> {
//            boolean resultado = cliente.getIdade() > 40;
//            return resultado;
//        };

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        clientes.sort((cliente1, cliente2) -> Integer.compare(cliente1.getIdade(), cliente2.getIdade())) ;
//        List<Cliente> clientes = cadastroCliente.consultar(filtro);

        for (Cliente cliente : clientes){
            System.out.printf("Nome: %s idade: %d%n", cliente.getNome(), cliente.getIdade());
        }

    }
}
