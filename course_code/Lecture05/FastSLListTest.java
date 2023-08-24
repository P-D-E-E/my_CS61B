public class FastSLListTest {
    public static void main(String[] args){
        SLList slst = new SLList();
        for (int i = 0; i < 100000; i++){
            slst.addLast(i);
        }
    }
}
