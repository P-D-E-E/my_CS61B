import java.io.ObjectStreamException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
/* If you want to implements for(T i : ADT), then the class have to implements Iterable*
 * to tell the java that the class can use foreach method.*/
public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public Iterator<T> iterator(){
        return new ArraySetIterator();
    }

    /** ArraySetIterator implements the built-in interface Iterator
     *  we have two things to implement*
     *  A wizPos represents current iteration position, next() and hasNext()*/

    private class ArraySetIterator implements Iterator<T>{
        private int wizPos;

        public ArraySetIterator(){
            wizPos = 0;
        }

        @Override
        public boolean hasNext(){
            return wizPos < size();
        }

        public T next(){
            if (hasNext()){
                T item = items[wizPos];
                wizPos += 1;
                return item;
            }
            return null;
        }

    }
    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i++){
            if (x.equals(items[i])){
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map. 
       Throws an IllegalArgumentException if the key is null. */
    private void resize(int capacity){
        T[] nitems = (T[]) new Object[capacity];
        System.arraycopy(items,0, nitems, 0, size);
        items = nitems;
    }
    public void add(T x) {
        if (x == null){
            throw new IllegalArgumentException("Null cannot be added to the ArraySet.");
        }
        if (contains(x)){
            return;
        }
        if (size() == items.length){
            resize(size() * 2);
        }
        items[size] = x;
        size += 1;
    }

    /* If you make String concatenation in a for loop, it is too slow for Java to do that.*
     * Because everytime you add something to a String, Java will create a new String in*
     * in the Stringpool. Instead of using String, we can use Stringbuilder.*/
    /*@Override
    public String toString(){
        StringBuilder returnSB = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++){
            returnSB.append(items[i].toString());
            returnSB.append(", ");
        }
        returnSB.append(items[size - 1]);
        returnSB.append(']');
        return returnSB.toString();
    }*/

    /* Static method cannot get the generic type of the class, therefore, we have to*
     * add a <T> in front of the return type to declare that it's a generic method.*/
    public static <T> ArraySet<T> of(T... stuff){
        ArraySet<T> returnSet = new ArraySet<>();
        for (T x: stuff){
            returnSet.add(x);
        }
        return returnSet;
    }
    @Override
    public String toString(){
        List<String> listOfItems = new ArrayList<>();
        for (T x : this){
            listOfItems.add(x.toString());
        }
        return "[" + String.join(", ",listOfItems) + "]";
    }

    /* Here, if we want to Override the equals function, we have the same Signature with*
     * the method in the interface, which is Object other.*
     * The purpose is for generic, when we pass in different types, we can also make judgement.*/
    @Override
    public boolean equals(Object other){
        if (this == other) { return true; }
        if (other == null) { return false; }
        if (this.getClass() != other.getClass()) { return false; }
        ArraySet<T> o = (ArraySet<T>) other;
        if (this.size() != o.size()){
            return false;
        }

        for (T item : this){
            if (!o.contains(item)){
                return false;
            }
        }
        return true;
    }
    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        ArraySet<String> b = new ArraySet<>();
        //s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
        //System.out.println(s.contains("horse"));
        //System.out.println(s.size());
        //Iterator<String> seer = s.iterator();
        b.add("horse");
        b.add("fish");
        b.add("house");
        // vhb.add("abandon");
        System.out.println(s.equals(b));
//        for (String word : s){
//            System.out.println(word);
//        }
        System.out.println(ArraySet.of(1, 2, 3, 4, 5));
//        while(seer.hasNext()){
//            System.out.println(seer.next());
//        }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
    }
}
