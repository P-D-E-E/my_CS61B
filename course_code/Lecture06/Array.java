public class Array {

    public static void printArray(int[] x){
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(String[] x){
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] x = new int[3];
        int[] y = new int[] {1, 2, 3, 4, 5};
        int[] z = y;

        y[4] = 10086;

        printArray(x);
        printArray(y);
        printArray(z);
        x = new int[]{2, 2, 2};
        System.arraycopy(x, 0, y, 2, x.length);
        printArray(y);
//        String[] s = new String[2];
//        String str = "this";
//        s[0] = "ketchup";
//        s[1] = "array";
//        str += "aha";
//        printArray(s);
//        System.out.print(str);
    }
}
