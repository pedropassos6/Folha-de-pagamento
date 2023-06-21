import java.util.*;

public class CadastroHotel {

    private ArrayList<Hotel> hoteis = new ArrayList<>();



    public void adicionar(String nome, String cidade, double precoDiaria){
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if(hoteis.contains(hotel)){
            throw new HotelExistenteException("Hotel já existe");
        }
        hoteis.add(hotel);
    }

    public ArrayList<Hotel> listarTodos(){
        return hoteis;
    }

    public Hotel[] hoteisComArray(){
        return hoteis.toArray(new Hotel[0]);
//        Hotel[] hoteis2 = new Hotel[hoteis.size()];
//        for (int i = 0; i < hoteis.size(); i++){
//            hoteis2[i] = hoteis.get(i);
//        }
//        return hoteis2;
    }

    public void ordenar(){
        Collections.sort(hoteis);
    }

    public void ordenarPorPreco(){
//        Collections.sort(hoteis, new PrecoHotelComparator());
        hoteis.sort(new PrecoHotelComparator().reversed().thenComparing(Comparator.naturalOrder()));
    }

    public void removerPoCidade(String cidade){
//        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while(hotelIterator.hasNext()){ //hasNext diz se tem o proximo elemento
            Hotel hotel = hotelIterator.next(); // e o next  pega o elemento propriamente selecionado pelo next
            if (hotel.getCidade().equals(cidade)){
                hotelIterator.remove();
            }
        }
//        for (int i = 0; i < hoteis.size(); i++){
//            Hotel hotel = hoteis.get(i);
//            if(hotel.getCidade().equals(cidade)){
//                hoteisParaRemocao.add(hotel);
////                hoteis.remove(i);
//                i--;
//            }
//        }
//        hoteis.removeAll(hoteisParaRemocao);
    }

    public void remover(Hotel hotel){
        boolean removido = hoteis.remove(hotel);

        if(!removido){
            throw new HotelNaoExistenteException("Hotel não existe");
        }
    }

    public void removerTodos(){
        hoteis.clear();;
    }


}
