import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Pedro", 30));
        clientes.add(new Cliente("Carlos", 25));
        clientes.add(new Cliente("João", 35));

//        Cliente.ordenarPorIdade(clientes);

        System.out.println(clientes);


    }
}
