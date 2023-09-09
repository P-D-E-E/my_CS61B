package bstmap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V> {
    private BSTNode root;

    private class BSTNode{
        private K key;
        private V value;
        private int size;
        private BSTNode left = null, right = null;

        public BSTNode(K k, V v, int size){
            this.key = k;
            this.value = v;
            this.size = size;
        }
    }
    private Set<K> keySet;
    /** Initiate the BSTMap, which is BSTMap with no BSTNode.*/
    public BSTMap(){
        keySet = new HashSet<>();
    }

    public BSTMap(K k, V v){
        BSTNode bstnode = new BSTNode(k, v, 1);
        root = bstnode;
    }

    @Override
    public void clear() {
        root = null;
    }


    @Override
    public boolean containsKey(K key) {
        return containsKey(root, key);
    }


    private boolean containsKey(BSTNode node, K key){
        if (node == null){
            return false;
        }
        if (node.key.compareTo(key) > 0){
            return containsKey(node.left, key);
        }else if (node.key.compareTo(key) < 0){
            return containsKey(node.right, key);
        }else{
            return true;
        }
    }

    @Override
    public V get(K key) {
        return get(root, key);
    }

    private V get(BSTNode node, K key){
        if (node == null){
            return null;
        }
        if (node.key.compareTo(key) > 0){
            return get(node.left, key);
        }else if (node.key.compareTo(key) < 0){
            return get(node.right, key);
        }else{
            return node.value;
        }
    }
    @Override
    public int size() {
        return size(root);
    }

    private int size(BSTNode node){
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    @Override
    public void put(K key, V value) {
        keySet.add(key);
        if (root == null){
            root = new BSTNode(key, value,1);
            return;
        }
        put(root, key, value);
    }

    private BSTNode put(BSTNode node, K key, V value) {
        if (node == null){
            return new BSTNode(key, value, 1);
        }
        if (node.key.compareTo(key) > 0){
            node.left = put(node.left, key, value);
        }else if (node.key.compareTo(key) < 0){
            node.right = put(node.right, key, value);
        }else{
            node.value = value;
        }
        node.size = 1 + size(node.left)+ size(node.right);
        return node;
    }

    @Override
    public Set<K> keySet() {
        return keySet;
    }

    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException();
    }

    /*
    @Override
    public V remove(K key) {
        BSTNode rm = remove(root, key);
        if (rm == null){
            return null;
        }
        return remove(root, key);
    }*/
    /*
    private BSTNode remove(BSTNode node, K key){
        if (node == null){
            return null;
        }
        int cmp = node.key.compareTo(key);
        if (cmp > 0){
            node.left = remove(node.left, key);
        }else if(cmp < 0){
            node.right = remove(node.right, key);
        }else{
            if (node.left == null && node.right == null){
                return null;
            }else if (node.right == null){
                BSTNode ln = node.left;
                node.left = null;
                return ln;
            }else if (node.left == null){
                BSTNode rn = node.right;
                node.right = null;
                return rn;
            }else{

            }
        }
        return node;
    }*/
    @Override
    public V remove(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<K> iterator() {
        throw new UnsupportedOperationException();
    }
}