package lec11_inheritance4;

import java.util.HashSet;
import java.util.Set;

public class Iterater {
    /**这个就是 python 的 set，不允许重复值出现 */
    public class ArraySet<T> {
        private T[] items;
        private int size;

        /**构造方法 */
        public ArraySet() {
            items = (T[]) new Object[100];
            size = 0;
        }

        public boolean contains(T x) {
            for (int i = 0; i < size; i += 1) {
                if (items[i].equals(x)) {
                    return true;
                }
            }
            return false;
        }

        public void add(T x) {
            if (!contains(x)) {
                items[size] = x;
                size += 1;
            }
        }

    }

    public static void main(String[] args) {

        Set<Integer> javaset = new HashSet<>();
        javaset.add(5);
        javaset.add(23);
        javaset.add(42);
        for (int i : javaset) {
            System.out.println(i);
        }

        Object[] object1 = new Object[3];
        object1[0] = 1;
        object1[2] = "string";
        for (Object i:object1) {
            System.out.println(i);
        }
        
    }
}