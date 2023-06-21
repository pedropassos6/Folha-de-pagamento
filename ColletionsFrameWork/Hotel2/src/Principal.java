import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Hotel da praia", "Floripa", 4200);
        cadastro.adicionar("Omarra beach hotel", "Omaha", 1400);
        cadastro.adicionar("Hotel California", "Omaha", 1400);
        cadastro.adicionar("Budapeste Hotel", "Omaha", 1400);
        cadastro.adicionar("Hotel candeias", "Praia do Rosa", 3400);
        cadastro.adicionar("VilaMon Hotel", "Blumenau", 2400);
//        cadastro.adicionar("VilaMon Hotel", "Blumenau", 2400);

//        System.out.println(cadastro.listarTodos());

//        Hotel hotel = (Hotel) cadastro.listarTodos().get(1);
//        System.out.println(hotel.getNome());

//        cadastro.removerPoCidade("Floripa");

//        Hotel[] hoteisArray = cadastro.hoteisComArray();
//        System.out.println(Arrays.toString(hoteisArray));
        cadastro.ordenarPorPreco();



        ArrayList<Hotel> hotel = cadastro.listarTodos();

//        int indice = hotel.indexOf(new Hotel("VilaMon Hotel", "Blumenau", 0)); // vc tambem pode usar o lastIndexOf pra procurar da direita pra esquerda
//        System.out.println(indice);
//        System.out.println(hotel.get(indice));
        imprimir(hotel);
    }

    public static void imprimir(ArrayList<Hotel> hoteis){
        for (Hotel hotel : hoteis){
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
//        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        while(hotelIterator.hasNext()){ //hasNext diz se tem o proximo elemento
//            Hotel hotel = hotelIterator.next(); // e o next  pega o elemento propriamente selecionado pelo next
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }
//        for(int i = 0; i < hoteis.size(); i++){
//            Hotel hotel = hoteis.get(i);
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }
    }
}
