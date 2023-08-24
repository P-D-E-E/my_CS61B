import java.util.Comparator;

public class Maximizer {
    public static Dog max(Dog[] items, Comparator<Dog> comp){
        int maxDex = 0;
        for (int i = 0; i < items.length; i++){
            if (comp.compare(items[i], items[maxDex]) > 0){
                maxDex = i;
            }
        }
        return items[maxDex];
    }
}
