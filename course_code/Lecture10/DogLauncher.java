import javax.management.MXBean;
import java.util.Comparator;
public class DogLauncher {
    public static void main(String[] args){
        Dog d1 = new Dog("Elyse", 5);
        Dog d2 = new Dog("Bufflo", 15);
        Dog d3 = new Dog("Dot", 14);
        Dog[] dogs = {d1, d2, d3};

        Comparator<Dog> nc = Dog.getNameComparator();
        Comparator<Dog> sc = Dog.getSizeComparator();
        Dog maxNameDog = Maximizer.max(dogs, nc);
        maxNameDog.bark();
        Dog maxSizeDog = Maximizer.max(dogs, sc);
        maxSizeDog.bark();
    }
}
