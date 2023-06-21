import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Estado mg = new Estado("MG", "Minas Gerais");
        Estado ce = new Estado("CE", "Ceará");
        Estado ro = new Estado("RO", "Rondônia");
        Estado sp = new Estado("SP", "São Paulo");

        Cidade saoPaulo = new Cidade(3550308, "São Paulo", 12_396_372);
        Cidade beloHorizonte = new Cidade(3106200, "Belo Horizonte", 2_530_701);
        Cidade fortaleza = new Cidade(2304400, "Fortaleza", 2_703_391);
        Cidade portoVelho = new Cidade(1100205, "Porto Velho", 548_952);

        //Performance é mais importante (não garante a ordem das chaves)
//        Map<Estado, Cidade> capitais = new HashMap<>();

        //Performance é importante, mas precisa manter ordem de inserção das chaves
//        Map<Estado, Cidade> capitais = new LinkedHashMap<>();

        //Performance é menos importante e precisa manter a ordem natural das chaves
        Map<Estado, Cidade> capitais = new TreeMap<>();

        capitais.put(sp, saoPaulo);
        capitais.put(mg, beloHorizonte);
        capitais.put(ce, fortaleza);
        capitais.put(ro, portoVelho);

//        System.out.println(capitais.get(new Estado("SP", "São Paulo")));

        //Iteração nas entradas do mapa (chave/valor)
//        for (Estado estados : capitais.keySet()){
//            System.out.println(estados);
////            System.out.println(estados.getNome() +" - "+ estados.getSigla());
//        }
            //Map.Entry<Estado, Cidade>
        for (var entry : capitais.entrySet()){
            System.out.printf("%s = %s (%d habitantes)%n", entry.getKey().getSigla(), entry.getValue().getNome(),
                    entry.getValue().getTotalHabitantes());

        }


    }

}