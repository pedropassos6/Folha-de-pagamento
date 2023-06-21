import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        Proprietario maria = new Proprietario("Maria", "890879787");
        Proprietario joao = new Proprietario("João", "647568768");
        Proprietario carlos = new Proprietario("Carlos", "24523423");
        Proprietario jose = new Proprietario("Jose", "6467586798");

        Carro bmw = new Carro("JVM-8765", "M2 Competition");
        Carro audi = new Carro("JDK-9879", "RS6 Avant");
        Carro mercedes = new Carro("PTK-3244", "C63 AMG");
        Carro volks = new Carro("PED-0612", "Golf R MK8");

        Map<Carro, Proprietario> proprietarios = new HashMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(audi, joao);
        proprietarios.put(mercedes, carlos);
        proprietarios.put(volks, jose);

//        System.out.println(proprietarios);

//        System.out.println(proprietarios.get(bmw));
//        System.out.println(proprietarios.get(new Carro("JVM-8765", "Pedro")));

//        Set<Carro> chaves = proprietarios.keySet();
//        for (Carro carro : chaves){
//            System.out.println(carro);
//        }

//        for (Carro carro : proprietarios.keySet()){
//            System.out.println(carro);
//        }

//        Collection<Proprietario> proprietariosColletion = proprietarios.values();
//        for (Proprietario proprietario : proprietariosColletion){
//            System.out.println(proprietario);
//        }

//        for (Proprietario proprietario : proprietarios.values()){
//            System.out.println(proprietario);
//        }

//        for (Carro carro : proprietarios.keySet()){
//            Proprietario proprietario = proprietarios.get(carro);
//            System.out.printf("%s (%s) : %s%n", carro.getPlaca(), carro.getDescricao(), proprietario.getNome());
//        }

        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()){
            System.out.printf("%s (%s) : %s%n", entry.getKey().getPlaca(), entry.getKey().getDescricao(),
                    entry.getValue().getNome());
        }

    }
}
