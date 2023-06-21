import java.util.*;

public class CadastroHotel {

    private final List<Hotel> hoteis = new LinkedList<>();

    public void adicionar(String nome, String cidade, double precoDiaria){
        Hotel hotel = new Hotel(cidade, nome, precoDiaria);
        if(hoteis.contains(hotel)){
            throw new HotelJaExisteException("Hotel já adicionado");
        }

        hoteis.add(hotel);
    }

    public List<Hotel> obterTodos(){
        return hoteis;
    }

    public Hotel[] obterTodosComoArray(){
        return hoteis.toArray(new Hotel[0]);
    }

    public void ordenar(){
        Collections.sort(hoteis);
    }

    public void ordenarPorPreco(){
//        Collections.sort(hoteis, new PrecoHotelComparator());
        hoteis.sort(new PrecoHotelComparator().reversed().thenComparing(Comparator.naturalOrder()));
        // vc pode usar o .reversed() para mostrar do maior para o menor
        // metodo default da interface comparator implementada na classe PrecoHotelComparator
        // thenCoparing() vai invocar o metodo compareTo da classe Hotel
        // o Comparator.naturalOrder() é para ordenar por ordem crescente com base nos parametros configurados no metodo
        // nesse caso ele vai comparar pelo nome se o preço for o mesmo
    }

    public void removerPorCidade(String cidade){
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()){
            Hotel hotel = hotelIterator.next();
            if(hotel.getCidade().equals(cidade)){
                hotelIterator.remove();
            }
        }
//        for (int i = 0; i < hoteis.size(); i++){
//            Hotel hotel = hoteis.get(i);
//            if(hotel.getCidade().equals(cidade)){
//                hoteis.remove(i);
//                i--;
//            }
//        }
    }

    public void remover(Hotel hotel){
        boolean removido = hoteis.remove(hotel);

        if(!removido){
            throw new hotelNaoEncontradoException("Hotel não encontrado");
        }
    }

}
