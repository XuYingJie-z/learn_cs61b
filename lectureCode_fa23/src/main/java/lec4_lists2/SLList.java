package lec4_lists2;

/**
 * An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within.
 * SLL list 也是一个链表，但是它内部嵌套了 IntList ，比直接使用 IntList 更加优雅
 */
public class SLList {
	
	/**
	 * IntNode 其实就是一个裸链表，不希望从外面操作这个类，所以用了 private 关键字！！！
	 */
	private static class IntNode {
		public int item;
		public IntNode next;

		/**
		 * 裸链表类的实例化方法
		 * 
		 * @param i 链表的第一个元素
		 * @param n 链表的第二个元素，null 或者 IntNode 类型
		 */
		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
			// System.out.println(size);
		}
	}

	/**
	 * sentinel 是 SLList 的第一个元素
	 * size ：是一个类属性，每次添加元素的时候都会 +1，比之前的 size 方法要好，因为 size 方法需要遍历整个链表
	 */
	private IntNode sentinel;
	private int size;

	// private static void lectureQuestion() {
	// SLList L = new SLList();
	// IntNode n = new IntNode(5, null);
	// }

	/**
	 * 两种构造方法：
	 * 一种是输入参数为空的默认方法，返回 (63, null) 链表
	 * 另外一个是传入 x 参数，返回一个 (63, (x, null)) 的链表
	 * 我的理解是 63 是一个占位的元素，事实上并不会被访问到
	 */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	/**
	 * Adds x to the front of the list.
	 * 在最前面插入元素的方法
	 */
	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size = size + 1; // !! 类属性 +1
	}

	/** 获取第一个元素的方法 */
	public int getFirst() {
		return sentinel.next.item;
	}

	/** 把 x 添加到最后面的方法，需要遍历链表 */
	public void addLast(int x) {
		size = size + 1;

		IntNode p = sentinel;

		/* Advance p to the end of the list. */
		while (p.next != null) {
			p = p.next;
		}

		p.next = new IntNode(x, null);
	}

	/** Returns the size of the list. */
	// public int size() {
	// return size;
	// }

	/** private 方法，无法直接访问， */
	private int size(IntNode p) {
		if (p.next == null)
			return 1;
		return 1 + size(p.next);
	}

	/** 这个实例方法 (没有 static 的是实例方法) 调用的是上面的 private 方法 */
	public int size() {
		return size(sentinel);
	}


	public void print_SLList() {
		System.out.println("begein print" + sentinel);
		while ( sentinel.next != null ) {
			System.out.println(sentinel.item);
			sentinel = sentinel.next;
		}
		System.out.println(sentinel.item); // 打印最后一个
		System.out.println("complete print" + sentinel);
	}
	public static void main(String[] args) {
		/* Creates a list of one integer, namely 10 */
		SLList L = new SLList();
		L.addLast(20); L.addLast(20);

		System.out.println(L.size());
		L.print_SLList();
	}
}