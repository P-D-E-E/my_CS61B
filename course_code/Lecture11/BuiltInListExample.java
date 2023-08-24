import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BuiltInListExample {
    public static void main(String[] args){
        /*
        List<Integer> L = new ArrayList<>();
        L.add(5);
        L.add(10);
        L.add(15);
        System.out.println(L);
        */
        Set<String> S = new HashSet<>();
        S.add("Tokyo");
        S.add("Beijing");
        S.add("Taipei");
        S.add("Paris");
        System.out.print(S.contains("Tokyo"));
    }
}
