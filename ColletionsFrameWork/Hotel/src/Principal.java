import java.util.*;

public class Principal {
    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Hotel Focus", "Curitiba", 320);
        cadastro.adicionar("Hotel Madagascar", "São Paulo", 250);
        cadastro.adicionar("Hotel BonaVentura", "Curitiba", 250);
        cadastro.adicionar("Hotel Foursquare", "Leeds", 1200);
        cadastro.adicionar("Hotel Innin", "Edinburgh", 1500);
//        cadastro.adicionar("Hotel Innin", "Edinburgh", 1500);

        cadastro.removerPorCidade("Leeds");


//        cadastro.ordenar();
        cadastro.ordenarPorPreco();

        List<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);


//        Hotel[] hotel = cadastro.obterTodosComoArray();
//        System.out.println(Arrays.toString(hotel));
    }

    private static void imprimirHoteis(List<Hotel> hoteis){
        for (Hotel hotel : hoteis){
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
//        ListIterator<Hotel> hotelListIterator = hoteis.listIterator(hoteis.size());
//        while (hotelListIterator.hasPrevious()){
//            Hotel hotel = hotelListIterator.previous();
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }
//        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        while (hotelIterator.hasNext()){
//            Hotel hotel = hotelIterator.next();
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//
//        }

//        for (int i = 0; i < hoteis.size(); i++){
//            Hotel hotel = hoteis.get(i);
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }
    }


}
