// 为什么要更现代的写法
package lec2_intro2;



// !!! 更现代的写法，限制 list 中的类型

public class Point {
    public static class Walrus {
        public int weight;
        public double tuskSize;
        
        public Walrus(int w, double ts) {
              weight = w;
              tuskSize = ts;
        }

        public void print_weight(String weight) {
            System.out.println(weight);
            System.out.println(this.weight);
            System.out.println(weight);
        }

        public void print_inner_weight() {
            System.out.println(weight);
            System.out.println(this.weight);
        }
    
    }


    public static void doStuff(Walrus W, int x) {
        W.weight = W.weight - 100;
        x = x - 5;
    }


    public static void main(String[] args) {
        // Walrus walrus = new Walrus(3500, 10.5);
        // Walrus walrus_2 = walrus;
        
        // int x = 9;
        // doStuff(walrus, x);
        // System.out.println(walrus.weight);
        // System.out.println(x);
        // System.out.println(walrus_2.weight);





    }


}
    

