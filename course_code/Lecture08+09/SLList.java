import java.util.List;

public class SLList<Item> implements List61B<Item> {

    private class Node{
        public Item item;
        public Node next;
        public Node(Item i, Node n){
            item = i;
            next = n;
        }
    }
    private Node sentinel;
    private int size;
    private Node last;
    public SLList(){
        sentinel = new Node(null, null);
        size = 0;
        last = sentinel;
    }
    public SLList(Item x){
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
        size = 1;
        last = sentinel.next;
    }
    @Override
    public void addFirst(Item x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
        if (size == 1) {last = sentinel.next;}
    }

    @Override
    public void addLast(Item x) {
        last.next = new Node(x, null);
        last = last.next;
        size += 1;
    }

    @Override
    public Item getFirst() {
        if (size == 0) {return null;}
        return sentinel.next.item;
    }

    @Override
    public Item getLast() {
        return last.item;
    }

    @Override
    public Item removeLast() {
        if (size == 0) {return null;}
        Node p = sentinel;
        while (p.next.next != null){
            p = p.next;
        }
        Item x = p.next.item;
        p.next = null;
        last = p;
        return x;
    }

    @Override
    public Item get(int i) {
        if (i > size - 1) {return null;}
        if (i == size - 1) {return getLast();}
        Node p = sentinel;
        int idx = 0;
        while (idx < i){
            idx += 1;
            p = p.next;
        }
        return p.next.item;
    }

    @Override
    public void Insert(Item x, int position) {
        if (position > size) {return;}

        if (sentinel.next == null || position == 0){
            addFirst(x);
            return;
        }

        Node curr = sentinel.next.next;
        while (position > 1){
            curr = curr.next;
            position -= 1;
        }
        Node newNode = new Node(x, curr.next);
        curr.next = newNode;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print(){
        for (Node p = sentinel.next; p != null; p = p.next){
            System.out.print(p.item + " ");
        }
        System.out.println();
    }
}
