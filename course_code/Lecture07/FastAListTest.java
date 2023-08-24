public class FastAListTest {
    public static void main(String[] args){
        AList<Integer> alst = new AList<>();

        for (int i = 0; i < 1000000; i++){
            alst.addLast(i);
        }
    }
}
