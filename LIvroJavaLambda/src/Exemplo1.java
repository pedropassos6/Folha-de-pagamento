import java.util.ArrayList;

public class Exemplo1 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("New York");
        cities.add("Curitiba");

//        boolean found = false;
//
//        for (String city : cities){
//            if(city.equals("Chicago")){
//                found = true;
//                break;
//            }
//        }
//
//        System.out.println(found);
        System.out.println(cities.contains("Chicago"));


    }
}
