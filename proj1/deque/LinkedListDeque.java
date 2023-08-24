package deque;
public class LinkedListDeque<T> {
    private class LLNode{
        public LLNode prev;
        public T item;
        public LLNode next;

        public LLNode(T i,LLNode p, LLNode n){
            prev = p;
            item = i;
            next = n;
        }
        public LLNode(T i){
            item = i;
        }
        public void addPN(LLNode p, LLNode n){
            prev = p;
            next = n;
        }
        public void modifyNext(LLNode n){next = n;}
        public void modifyPrev(LLNode p){prev = p;}
    }

    private LLNode sentfront;
    private LLNode sentback;
    private int size;

    public LinkedListDeque(){
        sentback = new LLNode(null);
        sentfront = new LLNode(null);
        sentfront.addPN(null, sentback);
        sentback.addPN(sentfront, null);
        size = 0;
    }

    public LinkedListDeque(LinkedListDeque other){
        sentback = new LLNode(null);
        sentfront = new LLNode(null);
        sentfront.addPN(null, sentback);
        sentback.addPN(sentfront, null);
        size = 0;

        LLNode p = other.sentfront;
        while (p.next.next != null){
            LLNode temp = new LLNode(p.next.item, p, p.next);
            p.modifyNext(temp);
            temp.next.modifyPrev(temp);
            p = temp;
            size += 1;
        }
    }
    public int size(){
        return size;
    }

    public void addFirst(T item){
        LLNode temp = new LLNode(item, sentfront, sentfront.next);
        sentfront.next = temp;
        temp.next.prev = temp;
        size += 1;
    }
    public void addLast(T item){
        LLNode temp = new LLNode(item, sentback.prev, sentback);
        sentback.prev = temp;
        temp.prev.next = temp;
        size += 1;
    }

    public boolean isEmpty(){
        return sentfront.next.next == null;
    }

    public void printDeque(){
        LLNode p = sentfront.next;
        while (p.next != null){
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

    public T removeFirst(){
        LLNode p = sentfront.next;
        if (p.next == null){ return null;}
        T x = p.item;
        sentfront.next = p.next;
        p.next.prev = sentfront;
        size -= 1;
        return x;
    }

    public T removeLast(){
        LLNode p = sentback.prev;
        if (p.prev == null) { return null; }
        T x = p.item;
        sentback.prev = p.prev;
        p.prev.next = sentback;
        size -= 1;
        return x;
    }

    public T get(int index){
        if (index >= size) {return null;}
        LLNode p = sentfront;
        int i = 0;
        while (i < index){
            p = p.next;
        }
        return p.next.item;
    }
    private T getRecursive(int index, LLNode p){
        if (index == 0){
            return p.next.item;
        }
        return getRecursive(index - 1, p.next);
    }
    public T getRecursive(int index){
        if (index >= size){return null;}
        return getRecursive(index, sentfront.next);
    }

    public static void main(String[] args){
        LinkedListDeque<Integer> lld = new LinkedListDeque<>();
        lld.addFirst(10);
        lld.addLast(20);
        lld.printDeque();
    }
}
