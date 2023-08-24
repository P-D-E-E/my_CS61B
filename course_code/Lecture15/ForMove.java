public class ForMove implements Move{
    @Override
    public void move(int[] src){
        int[] dest = new int[src.length];
        for (int i = 0; i < src.length; i++){
            dest[i] = src[i];
        }
    }
}
