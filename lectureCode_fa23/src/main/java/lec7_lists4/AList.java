package lec7_lists4;

/** Array based list.
 *  @author Josh Hug
 */

//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5

/* Invariants:
 addLast: The next item we want to add, will go into position size
 getLast: The item we want to return is in position size - 1
 size: The number of items in the list should be size.
*/

/**
 *  Item 这个单词可以更改，意思是一个 generic Array List ，可以创建为各种类型
 */
public class AList<Item> {
    private Item[] items;
    private int size;

    /** 构造方法在实例化时先创建一个 size 100 的 Array */
    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    /** resize 方法是 ArrayList 的关键，在 addLast 方法 size == items.length 时调用
     * size == items.length
     */
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size + 1);
        }

        items[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** 从列表后面删除项目并返回被删除的的那个元素
      * 删除方法其实就是把最后那个元素指向 null */
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null; // 删除元素
        size = size - 1;
        return x;
    }
} 