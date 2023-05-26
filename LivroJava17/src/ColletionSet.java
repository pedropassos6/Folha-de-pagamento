import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ColletionSet {
    public static void main(String[] args) {

        //Collection<String> coll
        // = List.of("s1", null); //does not allow null

        Collection<String> coll = List.of("s1", "s1", "s2");

        //coll.add("s3"); //does not allow add element
        //coll.remove("s1"); //does not allow remove element
        //((List<String>) coll).set(1, "s3");
        //does not allow modify element

        System.out.println(coll); //prints: [s1, s1, s2]

        //coll = Set.of("s3", "s3", "s4");
        //does not allow duplicate
        //coll = Set.of("s2", "s3", null);
        //does not allow null

        coll = Set.of("s3", "s4");
        System.out.println(coll);

        //prints: [s3, s4] or [s4, s3]
        //coll.add("s5"); //does not allow add element
        //coll.remove("s2"); //does not allow remove element
    }
}
