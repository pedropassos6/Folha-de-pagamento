import java.util.ArrayList;
import java.util.Objects;

public class Principal1 {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Supermecado boapraça", 45000));
        clientes.add(new Cliente("Borracharia 2 irmãos", 13000));

        double totalFaturamento = 0;

        for (Cliente cliente : clientes){

            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }
}
