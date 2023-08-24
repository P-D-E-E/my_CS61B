public class Sort {
    /**Sort the string destructively.*/
    public static void sort(String[] x){
        Sort.sort(x, 0);
    }

    private static void sort(String[] x, int start){
        if (start == x.length) {return;}
        int smallestIndex = start;
        smallestIndex = findSmallest(x,start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }
    /** Return the smallest String in x.*/
    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for (int i = start; i < x.length; i++){
            if (x[i].compareTo(x[smallestIndex]) < 0){
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(String[] x, int a, int b){
        String temp = x[b];
        x[b] = x[a];
        x[a] = temp;
    }
}
