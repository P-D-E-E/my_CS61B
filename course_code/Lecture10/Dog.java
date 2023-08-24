import java.util.Comparator;
public class Dog implements Comparable<Dog>{

    private int size;
    private String name;

    public Dog(String n, int s){
       name = n;
       size = s;
    }

    public void bark(){
        System.out.println(name + " says: bark!");
    }
    public int compareTo(Dog UddaDog){
        return this.size - UddaDog.size;
    }

    /** The static class means, we can instantiate a NameComparator before an instance*
     * is instantiated.*/
    public static class NameComparator implements Comparator<Dog>{
        public int compare(Dog a, Dog b){
            return a.name.compareTo(b.name);
        }
    }
    public static class SizeComparator implements Comparator<Dog>{
        public int compare(Dog a, Dog b){
            return a.size - b.size;
        }
    }
    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }
    public static Comparator<Dog> getSizeComparator(){
        return new SizeComparator();
    }
}
