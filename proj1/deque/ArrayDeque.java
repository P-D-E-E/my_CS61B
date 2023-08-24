package deque;

import java.util.Arrays;

public class ArrayDeque<T> {
    private T[] items;
    private int size;
    private int front;
    private int back;

    public ArrayDeque(){
        items = (T[]) new Object[100];
        front = 0;
        back = -1;
        size = 0;
    }
    public ArrayDeque(ArrayDeque other){
        items = (T[]) new Object[other.size() * 2];
        front = other.front;
        back = other.back;
        size = other.size();
        System.arraycopy(other.items, 0, this.items, 0, size);
    }


    public int size(){ return size;}
}
