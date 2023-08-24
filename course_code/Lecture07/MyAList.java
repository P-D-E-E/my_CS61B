public class MyAList<Item> {
    private Item[] items;
    private int size;

    public MyAList(){
        items = (Item[]) new Object[100];
        size = 0;
    }

    public int size(){
        return size;
    }

    public void addLast(Item x){
        if (size == items.length){
            Item[] nitems = (Item[]) new Object[size * 2];
            System.arraycopy(items, 0, nitems, 0, size);
            items = nitems;
        }
        items[size] = x;
        size += 1;
    }

    public Item getLast(){
        return items[size - 1];
    }

    public Item get(int i){
        return items[i];
    }

    public Item removeLast(){
        Item x = getLast();
        size -= 1;
        return x;
    }



}
