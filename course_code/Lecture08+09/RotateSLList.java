public class RotateSLList<Item> extends SLList<Item>{

    /** Rotates the list to the right.*/
    public void rotateRight(){
        Item x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args){
        RotateSLList<Integer> rsl = new RotateSLList<Integer>();
        rsl.addLast(10);
        rsl.addLast(20);
        rsl.addLast(114);
        rsl.rotateRight();
        rsl.print();
    }
}
