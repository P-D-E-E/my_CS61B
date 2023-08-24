public class DLList {
    private static class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;
    private IntNode last;
    public DLList(){
        sentinel = new IntNode(-1, null);
        last = sentinel;
        size = 0;
    }
    public DLList(int x){
        sentinel = new IntNode(-1, null);
        sentinel.next = new IntNode(x, null);
        last = sentinel.next;
        size = 1;
    }

    public int size(){
        return size;
    }
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public int getFirst(){
        return this.sentinel.item;
    }

    public void addLast(int x){
        last.next = new IntNode(x, null);
        last = last.next;
        size += 1;
    }

    public void addAt(int x, int position){
        if (position > size + 1) {
            System.out.println("This position is out of the SLList.");
            return;
        }
        IntNode p = sentinel;
        int pos = 0;
        while (pos < position - 1){
            p = p.next;
            pos += 1;
        }
        p.next = new IntNode(x, p.next);
        size += 1;
    }
    public void printList(){
        IntNode p = sentinel;
        while (p.next != null) {
            System.out.print(p.next.item);
            p = p.next;
            if (p.next != null) {System.out.print(" -> ");}

        }
    }

    public static void main(String[] args){
        DLList lst = new DLList();
        lst.addFirst(4);
        lst.addFirst(3);
        lst.addFirst(2);
        lst.addFirst(1);
        lst.addAt(5, 5);
        lst.printList();
        System.out.println("\n" + lst.size());
    }
}
