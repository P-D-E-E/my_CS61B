public class FindUnionSet implements DisjointSets{
    private int[] id;

    public FindUnionSet(int N){
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    @Override
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public void connect(int p, int q) {
        if (id[p] == id[q]){return;}
        int goal = id[p];
        for (int i = 0; i < id.length; i++){
            if (id[i] == goal){
                id[i] = goal;
            }
        }
    }
}
