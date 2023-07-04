import java.util.*;
import java.util.stream.Collectors;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<List<Integer>> lines = new ArrayList<>();
        int numberOfLines = Integer.parseInt(input.nextLine());

        for(int i = 0; i < numberOfLines; i++){
            lines.add(Arrays.stream(
                    input.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList())
            );
        }
        int numberOfQueries = Integer.parseInt(input.nextLine());
        List<Coordinate> coordinates = new ArrayList<>();
        for(int i = 0; i < numberOfQueries; i++){
            int x = input.nextInt() - 1;
            int y = input.nextInt();
            coordinates.add(new Coordinate(x, y));
        }
        coordinates.forEach(c -> {
            if(c.x() >= numberOfLines || c.y() >= lines.get(c.x()).size()){
                System.out.println("ERROR!");
            }else
                System.out.println(lines.get(c.x()).get(c.y()));
        });
    }
}

record Coordinate(int x, int y){}