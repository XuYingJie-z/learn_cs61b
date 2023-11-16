package lec1_intro1;

public class tmp1 {
    
    public static class BinaryTree<key> {
        public key key;
        public BinaryTree left;
        public BinaryTree right;


        public BinaryTree(key key, BinaryTree left, BinaryTree right) {

            this.key = key;
            this.left = left;
            this.right = right;
        
        }

        public BinaryTree(key key){
            this.key = key;

        }

        public static BinaryTree add(BinaryTree tree, key key) {
            
            
        }

    
        
    }



    public static void main(String[] args) {

    }


}