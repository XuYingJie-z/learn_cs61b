package lec1_intro1;

public class tmp2 {

    public class BinaryTree<key> {
        public key key; // This field is problematic; you should avoid having a field with the same name as the generic type.
    
        public static class BTree<key> {
            public key key;
            public BTree<key> left;
            public BTree<key> right;
    
            public BTree(key key) {
                this.key = key;
            }
    
            public BTree(key key, BTree<key> left, BTree<key> right) {
                this.key = key;
                this.left = left;
                this.right = right;
            }
    
            // Use equals() for comparing objects
            public boolean equals(key otherkey) {
                return this.key.equals(otherkey);
            }
        }
    
        public static <key> BTree<key> find(BTree<key> tree, key searchKey) {
            if (tree == null) {
                return null;
            }
    
            if (tree.equals(searchKey)) {
                return tree;
            }
    
            BTree<key> leftResult = find(tree.left, searchKey);
            if (leftResult != null) {
                return leftResult;
            }
    
            return find(tree.right, searchKey);
        }
    }
    

}