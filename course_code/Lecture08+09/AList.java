import java.util.List;

public class AList<Item> implements List61B<Item> {

    private Item[] items;
    private int size;

    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
    }

    private void resize(int capacity){
        Item[] nitems = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, nitems, 0, size);
        items = nitems;
    }
    @Override
    public void addFirst(Item x) {
        if (size == items.length){
            resize(size * 2);
        }

        System.arraycopy(items, 0, items, 1, size());
        items[0] = x;
        size += 1;
    }

    @Override
    public void addLast(Item x) {
        if (size == items.length){
            resize(size * 2);
        }
        items[size] = x;
        size += 1;
    }

    @Override
    public Item getFirst() {
        if (size == 0) { return null;}
        return items[0];
    }

    @Override
    public Item getLast() {
        if (size == 0) {return null;}
        return items[size - 1];
    }

    @Override
    public Item removeLast() {
        if (size == 0) {return null;}
        Item x = getLast();
        size -= 1;
        return x;
    }

    @Override
    public Item get(int i) {
        if (i > size - 1){return null;}
        return items[i - 1];
    }

    @Override
    public void Insert(Item x, int position) {
        if (position > size - 1) { return; }
        if (position == size - 1) {resize(size * 2);}

        System.arraycopy(items, position, items, position + 1, size - position);
        items[position] = x;
        size += 1;
    }

    @Override
    public int size() {
        return size;
    }
}
