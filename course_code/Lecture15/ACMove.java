public class ACMove implements Move{
    @Override
    public void move(int[] src) {
        int[] dest = new int[src.length];
        System.arraycopy(src, 0, dest, 0, dest.length);
    }
}
