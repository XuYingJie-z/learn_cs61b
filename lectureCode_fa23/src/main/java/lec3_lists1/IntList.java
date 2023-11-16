package lec3_lists1;

public class IntList {
	// IntList 是一个链表，也就是第二个元素 rest 永远是一个 IntList 或者 null (链表中止)
	public int first;
	public IntList rest;
	
	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! 
	 * Size 的递归实现方式
	*/
	public int size() {
		// giao 无处不见的递归
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}


	/** Size 的另一种实现方式 */
	public int iterativeSize() {
		IntList p = this; // 复制一个新的
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith item of this IntList. */
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}

	
	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.get(2));

		IntList lst = new IntList(1, new IntList(2, new IntList(3, null)));
		// IntList lst = IntList.of(1, 2, 3);
	}
} 