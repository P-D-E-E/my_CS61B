public class twoDArray {
    public static void printArray(int[] x){
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] pasc = new int[4][];
        pasc[0] = new int[]{1};
        pasc[1] = new int[]{1, 1};
        pasc[2] = new int[]{1, 2, 1};
        pasc[3] = new int[]{1, 3, 3, 1};

        int[] copyguy = pasc[3];
        copyguy[2] = 1004;
        printArray(pasc[3]);
    }
}
