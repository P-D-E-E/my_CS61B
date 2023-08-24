public interface List61B<Item> {
    void addFirst(Item x);
    void addLast(Item x);
    Item getFirst();
    Item getLast();
    Item removeLast();
    Item get(int i);
    void Insert(Item x, int position);
    int size();

    default void print(){
        for (int i = 0; i < size(); i++){
            System.out.print(get(i) + " -> ");
        }
        System.out.println();
    }

}
