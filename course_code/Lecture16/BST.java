public class BST{

    private int item;
    private BST left;
    private BST right;
    public BST(int i){
        item = i;
    }

    public BST Insert(BST T, int i){
        if (T == null) {
            return new BST(i);
        }
        if (i < T.item){
            T.left = Insert(T.left, i);
        }else {
            T.right = Insert(T.right, i);
        }
        return T;
    }
    public boolean Find(BST T,int i){
        if (T == null){
            return false;
        }
        if (i < T.item){
            return Find(T.left, i);
        }else if (i > T.item){
            return Find(T.right, i);
        }else{
            return true;
        }
    }
    public void Delete(BST T, int i){
        if (T == null){return;}

        if (i < T.item){
            Delete(T.left, i);
        }else if(i > T.item){
            Delete(T.right, i);
        }else{
            if (T.left == null && T.right == null){

            }
        }
    }

}
