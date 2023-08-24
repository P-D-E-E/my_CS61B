public class VengefulSLList<Item> extends SLList<Item> {
    private SLList<Item> deletedItems;
    /** Print deleted items.*/
    public void printLostItems(){
        deletedItems.print();
    }

    public VengefulSLList(){
        super();
        deletedItems = new SLList<Item>();
    }

    public VengefulSLList(Item x){
        super(x);//It should be explicitly super(x).
        deletedItems = new SLList<Item>();
    }
    @Override
    public Item removeLast() {
        if (size() == 0) {return null;}
        Item x = super.removeLast();

        deletedItems.addLast(x);
        return x;
    }

    public static void main(String[] args){
        VengefulSLList<Integer> vsl = new VengefulSLList<>(10);
        SLList<Integer> sl = new SLList<Integer>(23);
        //engefulSLList<Integer> nvsl = sl;
        VengefulSLList<Integer> nnvsl = (VengefulSLList<Integer>) sl;
        vsl.addLast(1);
        vsl.addLast(2);
        vsl.addLast(3);
        vsl.addLast(4);
        vsl.removeLast();
        vsl.removeLast();

        vsl.printLostItems();
    }

}
