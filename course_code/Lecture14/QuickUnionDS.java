public class QuickUnionDS implements DisjointSets{
    private int[] parent;
    //private int[] size;
    public QuickUnionDS(int N){
        parent = new int[N];

        for (int i = 0; i < N; i++){
            parent[i] = i;
        }
    }
    private int find(int p){
        while (parent[p] != p){
            parent[p] = find(parent[p]);

        }
        return parent[p];
    }
    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public void connect(int p, int q) {
        parent[find(p)] = find(q);
    }
}
